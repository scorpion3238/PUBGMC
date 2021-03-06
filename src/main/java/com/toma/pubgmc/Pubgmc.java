package com.toma.pubgmc;

import com.toma.pubgmc.common.CommonEvents;
import com.toma.pubgmc.common.capability.IGameData;
import com.toma.pubgmc.common.capability.IGameData.GameData;
import com.toma.pubgmc.common.capability.IGameData.GameDataStorage;
import com.toma.pubgmc.common.capability.IPlayerData;
import com.toma.pubgmc.common.capability.IPlayerData.PlayerData;
import com.toma.pubgmc.common.capability.IPlayerData.PlayerDataStorage;
import com.toma.pubgmc.common.capability.IWorldData;
import com.toma.pubgmc.common.capability.IWorldData.WorldData;
import com.toma.pubgmc.common.capability.IWorldData.WorldDataStorage;
import com.toma.pubgmc.common.commands.*;
import com.toma.pubgmc.common.items.guns.GunBase;
import com.toma.pubgmc.event.GunPostInitializeEvent;
import com.toma.pubgmc.init.PMCRegistry;
import com.toma.pubgmc.init.PMCSounds;
import com.toma.pubgmc.network.PacketHandler;
import com.toma.pubgmc.proxy.Proxy;
import com.toma.pubgmc.util.handlers.GuiHandler;
import com.toma.pubgmc.util.recipes.RecipeRegistry;
import com.toma.pubgmc.world.OreGen;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import net.minecraft.launchwrapper.Launch;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.GameRules;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.capabilities.CapabilityManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

@Mod(modid = Pubgmc.MOD_ID, name = Pubgmc.NAME, version = Pubgmc.VERSION, updateJSON = Pubgmc.UPDATEURL)
public class Pubgmc {
    /**
     * Some basic stuff
     **/
    public static final String MOD_ID = "pubgmc";
    public static final String NAME = "PUBGMC";
    public static final String VERSION = "1.6.0";
    public static final String ACCEPTED_VERSIONS = "[1.12.2]";
    public static final String CLIENT_PROXY_CLASS = "com.toma.pubgmc.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.toma.pubgmc.proxy.ServerProxy";
    public static final String UPDATEURL = "https://raw.githubusercontent.com/Toma1O6/PUBGMC/master/update.json";
    private static final Random RANDOM = new Random();
    public static final Logger logger = LogManager.getLogger("pubgmc");
    public static boolean isDevEnvironment;

    @Instance
    public static Pubgmc instance;

    @SidedProxy(clientSide = CLIENT_PROXY_CLASS, serverSide = SERVER_PROXY_CLASS)
    public static Proxy proxy;

    public static Random rng() {
        return RANDOM;
    }

    /**
     * Gamerule registry
     *
     * @param e - the event
     */
    private static void registerGamerules(FMLServerStartingEvent e) {
        GameRules gr = e.getServer().getWorld(0).getGameRules();

        if (!gr.hasRule("weaponCrafting")) {
            gr.addGameRule("weaponCrafting", "true", GameRules.ValueType.BOOLEAN_VALUE);
        }

        if (!gr.hasRule("weaponGriefing")) {
            gr.addGameRule("weaponGriefing", "true", GameRules.ValueType.BOOLEAN_VALUE);
        }

        logger.log(Level.INFO, "Registered gamerules");
    }

    private static void registerSmeltingRecipes() {
        FurnaceRecipes rec = FurnaceRecipes.instance();
        rec.addSmeltingRecipeForBlock(PMCRegistry.PMCBlocks.COPPER_ORE, new ItemStack(PMCRegistry.PMCItems.COPPER_INGOT, 1), 2f);
        rec.addSmelting(PMCRegistry.PMCItems.STEEL_DUST, new ItemStack(PMCRegistry.PMCItems.STEEL_INGOT, 1), 2f);
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        isDevEnvironment = (Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment");
        PMCSounds.registerSounds();
        PacketHandler.initialize();

        MinecraftForge.EVENT_BUS.register(new CommonEvents());

        CapabilityManager.INSTANCE.register(IWorldData.class, new WorldDataStorage(), WorldData::new);
        CapabilityManager.INSTANCE.register(IPlayerData.class, new PlayerDataStorage(), PlayerData::new);
        CapabilityManager.INSTANCE.register(IGameData.class, new GameDataStorage(), GameData::new);

        com.toma.pubgmc.init.GameRegistry.dispatchRegistryEvent();

        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        NetworkRegistry.INSTANCE.registerGuiHandler(Pubgmc.instance, new GuiHandler());
        PMCRegistry.Registry.initTileEntities();

        registerSmeltingRecipes();

        proxy.init(event);
        GameRegistry.registerWorldGenerator(new OreGen(), 4);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        for (ResourceLocation rl : ForgeRegistries.ITEMS.getKeys()) {
            if (rl.getResourceDomain().equals(MOD_ID)) {
                Item item = ForgeRegistries.ITEMS.getValue(rl);
                if (item instanceof GunBase) {
                    MinecraftForge.EVENT_BUS.post(new GunPostInitializeEvent((GunBase) item));
                }
            }
        }
        RecipeRegistry.registerWorkbenchRecipes();
        proxy.postInit(event);
    }

    @EventHandler
    public void serverInit(FMLServerStartingEvent event) {
        event.registerServerCommand(new CommandLeave());
        event.registerServerCommand(new CommandLootGenerate());
        event.registerServerCommand(new CommandClearPlayerCrates());
        event.registerServerCommand(new CommandAirdrop());
        event.registerServerCommand(new CommandGame());
        event.registerServerCommand(new CommandPlayerData());
        event.registerServerCommand(new CommandManageGhillieVariants());

        registerGamerules(event);

        logger.log(Level.INFO, "Registered commands");
    }
}
