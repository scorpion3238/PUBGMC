package com.toma.pubgmc.init;

import com.toma.pubgmc.Pubgmc;
import com.toma.pubgmc.api.games.GameBattleRoyale;
import com.toma.pubgmc.api.games.GameBombDefuse;
import com.toma.pubgmc.api.games.GameInactive;
import com.toma.pubgmc.client.models.BakedModelGun;
import com.toma.pubgmc.client.renderer.WeaponTEISR;
import com.toma.pubgmc.common.BlockBuilder;
import com.toma.pubgmc.common.HorizontalBlockBuilder;
import com.toma.pubgmc.common.blocks.*;
import com.toma.pubgmc.common.entity.*;
import com.toma.pubgmc.common.entity.bot.EntityAIPlayer;
import com.toma.pubgmc.common.entity.throwables.EntityFlashBang;
import com.toma.pubgmc.common.entity.throwables.EntityFragGrenade;
import com.toma.pubgmc.common.entity.throwables.EntityMolotov;
import com.toma.pubgmc.common.entity.throwables.EntitySmokeGrenade;
import com.toma.pubgmc.common.entity.vehicles.EntityVehicleDacia;
import com.toma.pubgmc.common.entity.vehicles.EntityVehicleUAZ;
import com.toma.pubgmc.common.items.*;
import com.toma.pubgmc.common.items.ItemVehicleSpawner.Vehicles;
import com.toma.pubgmc.common.items.armor.ArmorBase;
import com.toma.pubgmc.common.items.armor.ArmorBase.ArmorLevel;
import com.toma.pubgmc.common.items.armor.ItemGhillie;
import com.toma.pubgmc.common.items.armor.ItemNVGoggles;
import com.toma.pubgmc.common.items.game.GameControlItem;
import com.toma.pubgmc.common.items.guns.AmmoType;
import com.toma.pubgmc.common.items.guns.FlareGun;
import com.toma.pubgmc.common.items.guns.GunBase;
import com.toma.pubgmc.common.items.guns.GunBase.Firemode;
import com.toma.pubgmc.common.items.guns.GunBase.GunType;
import com.toma.pubgmc.common.items.guns.GunBase.ReloadType;
import com.toma.pubgmc.common.items.guns.GunBuilder;
import com.toma.pubgmc.common.items.guns.attachments.IAttachment.Type;
import com.toma.pubgmc.common.items.guns.attachments.ItemAttachment;
import com.toma.pubgmc.common.items.heal.*;
import com.toma.pubgmc.common.tileentity.*;
import com.toma.pubgmc.config.ConfigPMC;
import com.toma.pubgmc.config.common.CFGWeapons;
import com.toma.pubgmc.event.GunModelAttachEvent;
import com.toma.pubgmc.event.GunPostInitializeEvent;
import com.toma.pubgmc.util.helper.AttachmentHelper;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.entity.Entity;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSword;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.client.event.ModelBakeEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;

import java.util.ArrayList;
import java.util.List;

public class PMCRegistry {
    @ObjectHolder(Pubgmc.MOD_ID)
    public static final class PMCItems {
        public static final Item BACKPACK1 = null;
        public static final Item BACKPACK2 = null;
        public static final Item BACKPACK3 = null;
        public static final ItemBandage BANDAGE = null;
        public static final ItemFirstAidKit FIRSTAIDKIT = null;
        public static final ItemMedkit MEDKIT = null;
        public static final ItemEnergyDrink ENERGYDRINK = null;
        public static final ItemPainkiller PAINKILLERS = null;
        public static final ItemAdrenalineSyringe ADRENALINESYRINGE = null;
        public static final Item IBLOCK = null;
        public static final Item GHILLIE_SUIT = null;
        public static final ItemNVGoggles NV_GOGGLES = null;
        public static final FlareGun FLARE_GUN = null;
        public static final GunBase P92 = null;
        public static final GunBase P1911 = null;
        public static final GunBase R1895 = null;
        public static final GunBase R45 = null;
        public static final GunBase P18C = null;
        public static final GunBase SCORPION = null;
        public static final GunBase DEAGLE = null;
        public static final GunBase WIN94 = null;
        public static final GunBase SAWED_OFF = null;
        public static final GunBase S1897 = null;
        public static final GunBase S686 = null;
        public static final GunBase S12K = null;
        public static final GunBase MICROUZI = null;
        public static final GunBase UMP45 = null;
        public static final GunBase VECTOR = null;
        public static final GunBase TOMMY_GUN = null;
        public static final GunBase BIZON = null;
        public static final GunBase MP5K = null;
        public static final GunBase M16A4 = null;
        public static final GunBase M416 = null;
        public static final GunBase SCAR_L = null;
        public static final GunBase G36C = null;
        public static final GunBase QBZ = null;
        public static final GunBase AUG = null;
        public static final GunBase AKM = null;
        public static final GunBase BERYL_M762 = null;
        public static final GunBase MK47_MUTANT = null;
        public static final GunBase GROZA = null;
        public static final GunBase DP28 = null;
        public static final GunBase M249 = null;
        public static final GunBase VSS = null;
        public static final GunBase MINI14 = null;
        public static final GunBase QBU = null;
        public static final GunBase SKS = null;
        public static final GunBase SLR = null;
        public static final GunBase MK14 = null;
        public static final GunBase KAR98K = null;
        public static final GunBase M24 = null;
        public static final GunBase AWM = null;
        public static final ItemExplodeable GRENADE = null;
        public static final ItemExplodeable SMOKE = null;
        public static final ItemExplodeable MOLOTOV = null;
        public static final ItemExplodeable FLASHBANG = null;
        public static final Item AMMO_9MM = null;
        public static final Item AMMO_45ACP = null;
        public static final Item AMMO_SHOTGUN = null;
        public static final Item AMMO_556 = null;
        public static final Item AMMO_762 = null;
        public static final Item AMMO_300M = null;
        public static final Item AMMO_FLARE = null;
        public static final ItemSword PAN = null;
        public static final ItemSword CROWBAR = null;
        public static final ItemSword MACHETE = null;
        public static final ItemSword SICKLE = null;
        public static final Item ARMOR1HELMET = null;
        public static final Item ARMOR1BODY = null;
        public static final Item ARMOR2HELMET = null;
        public static final Item ARMOR2BODY = null;
        public static final Item ARMOR3HELMET = null;
        public static final Item ARMOR3BODY = null;
        public static final ItemAttachment SILENCER_PISTOL = null;
        public static final ItemAttachment SILENCER_SMG = null;
        public static final ItemAttachment SILENCER_AR = null;
        public static final ItemAttachment SILENCER_SNIPER = null;
        public static final ItemAttachment COMPENSATOR_SMG = null;
        public static final ItemAttachment COMPENSATOR_AR = null;
        public static final ItemAttachment COMPENSATOR_SNIPER = null;
        public static final ItemAttachment RED_DOT = null;
        public static final ItemAttachment HOLOGRAPHIC = null;
        public static final ItemAttachment SCOPE2X = null;
        public static final ItemAttachment SCOPE4X = null;
        public static final ItemAttachment SCOPE8X = null;
        public static final ItemAttachment SCOPE15X = null;
        public static final ItemAttachment GRIP_VERTICAL = null;
        public static final ItemAttachment GRIP_ANGLED = null;
        public static final ItemAttachment QUICKDRAW_MAG_PISTOL = null;
        public static final ItemAttachment EXTENDED_MAG_PISTOL = null;
        public static final ItemAttachment EXTENDED_QUICKDRAW_MAG_PISTOL = null;
        public static final ItemAttachment QUICKDRAW_MAG_SMG = null;
        public static final ItemAttachment EXTENDED_MAG_SMG = null;
        public static final ItemAttachment EXTENDED_QUICKDRAW_MAG_SMG = null;
        public static final ItemAttachment QUICKDRAW_MAG_AR = null;
        public static final ItemAttachment EXTENDED_MAG_AR = null;
        public static final ItemAttachment EXTENDED_QUICKDRAW_MAG_AR = null;
        public static final ItemAttachment QUICKDRAW_MAG_SNIPER = null;
        public static final ItemAttachment EXTENDED_MAG_SNIPER = null;
        public static final ItemAttachment EXTENDED_QUICKDRAW_MAG_SNIPER = null;
        public static final ItemAttachment BULLET_LOOPS_SHOTGUN = null;
        public static final ItemAttachment BULLET_LOOPS_SNIPER = null;
        public static final ItemAttachment CHEEKPAD = null;
        public static final Item PARACHUTE = null;
        public static final Item STEEL_DUST = null;
        public static final Item STEEL_INGOT = null;
        public static final Item COPPER_INGOT = null;
        public static final Item FUELCAN = null;
        public static final Item VEHICLE_UAZ = null;
        public static final Item VEHICLE_DACIA = null;
        public static PMCRegistry.PMCItems instance;
    }

    @ObjectHolder(Pubgmc.MOD_ID)
    public static final class PMCBlocks {
        public static final Block ROADASPHALT = null;
        public static final Block SCHOOLWALL = null;
        public static final Block SCHOOLROOF = null;
        public static final Block SCHOOLWINDOW = null;
        public static final Block AIRDROP = null;
        public static final Block BIG_AIRDROP = null;
        public static final Block DARKWOOD = null;
        public static final Block RUINSWALL = null;
        public static final Block BLUEGLASS = null;
        public static final Block TARGET = null;
        public static final Block LAMPBOTTOM = null;
        public static final Block LAMPPOST = null;
        public static final Block LAMPTOP = null;
        public static final Block LIGHT = null;
        public static final Block CRATE = null;
        public static final Block CRATES = null;
        public static final Block BUSH = null;
        public static final Block WHEAT = null;
        public static final Block PROP1 = null;
        public static final Block PROP2 = null;
        public static final Block PROP3 = null;
        public static final Block PROP4 = null;
        public static final Block PROP5 = null;
        public static final Block PROP6 = null;
        public static final Block FENCE = null;
        public static final Block CONCRETE = null;
        public static final Block ELECTRICPOLE = null;
        public static final Block ELECTRICPOLETOP = null;
        public static final Block ELECTRICCABLE = null;
        public static final Block RADIOTOWER = null;
        public static final Block RADIOTOWERTOP = null;
        public static final Block LOOT_SPAWNER = null;
        public static final Block PLAYER_CRATE = null;
        public static final Block LANDMINE = null;
        public static final Block GUN_WORKBENCH = null;
        public static final Block CHAIR = null;
        public static final Block TABLE = null;
        public static final Block COPPER_ORE = null;
        public static final Block WINDOW1X1 = null;
        public static final Block WINDOW1X2 = null;
        public static final Block WINDOW2X1 = null;
        public static final Block WINDOW2X2 = null;

        /**
         * Props by OfficialMajonaise
         **/
        public static final PMCBlockHorizontal DESK = null;
        public static final PMCBlockHorizontal CHAIR1 = null;
        public static final PMCBlockHorizontal STORAGEBASE = null;
        public static final PMCBlockHorizontal STORAGETOP = null;
        public static final PMCBlockHorizontal LOCKER = null;
        public static final PMCBlockHorizontal SCREEN = null;
        public static final PMCBlockHorizontal BOX_SINGLE = null;
        public static final PMCBlockHorizontal BOX_DOUBLE = null;
        public static final PMCBlock SANDBAG = null;
        public static final PMCBlock WOODEN_CRATE = null;
        public static final PMCBlockHorizontal VENT = null;
        public static final BlockLootCrate BIG_CRATE_EMPTY = null;
        public static final BlockLootCrate BIG_CRATE_AMMO = null;
        public static final BlockLootCrate BIG_CRATE_GUN = null;
    }

    public static final class ToolMaterials {
        public static final ToolMaterial MATERIAL_PAN = EnumHelper.addToolMaterial("material_pan", 0, -1, 0.0F, 15.0F, 0);
        public static final ArmorMaterial GHILLIE_SUIT = EnumHelper.addArmorMaterial("ghillie_suit", Pubgmc.MOD_ID + ":ghillie_suit", -1, new int[]{0, 0, 0, 0}, 0, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 0);
        public static final ArmorMaterial LVL1 = EnumHelper.addArmorMaterial("lvl1", Pubgmc.MOD_ID + ":lvl1", 1, new int[]{0, 0, 3, 3}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
        public static final ArmorMaterial LVL2 = EnumHelper.addArmorMaterial("lvl2", Pubgmc.MOD_ID + ":lvl2", 1, new int[]{0, 0, 6, 6}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
        public static final ArmorMaterial LVL3 = EnumHelper.addArmorMaterial("lvl3", Pubgmc.MOD_ID + ":lvl3", 1, new int[]{0, 0, 10, 10}, 0, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 0);
    }

    @Mod.EventBusSubscriber
    public static class Registry {
        private static int entityID = -1;
        private static List<ItemBlock> ITEM_BLOCKS = new ArrayList<>();

        @SubscribeEvent
        public static void registerBlocks(Register<Block> event) {
            final Block[] BLOCKS = {
                    BlockBuilder.create("roadasphalt", Material.ROCK).soundType(SoundType.STONE).build(),
                    BlockBuilder.create("schoolwall", Material.ROCK).soundType(SoundType.STONE).build(),
                    BlockBuilder.create("schoolroof", Material.ROCK).soundType(SoundType.STONE).build(),
                    BlockBuilder.create("schoolwindow", Material.GLASS).soundType(SoundType.GLASS).setGlass().build(),
                    new BlockAirdrop("airdrop", Material.IRON),
                    BlockBuilder.create("darkwood", Material.WOOD).soundType(SoundType.WOOD).build(),
                    new BlockLootSpawner("loot_spawner", Material.ROCK, SoundType.STONE, MapColor.BLACK),
                    new BlockPlayerCrate("player_crate", Material.WOOD, SoundType.WOOD, MapColor.BROWN),
                    HorizontalBlockBuilder.create("chair", Material.WOOD).soundType(SoundType.WOOD).setTransparent().build(),
                    HorizontalBlockBuilder.create("table", Material.WOOD).soundType(SoundType.WOOD).setTransparent().build(),
                    BlockBuilder.create("ruinswall", Material.ROCK).soundType(SoundType.STONE).mapColor(MapColor.WHITE_STAINED_HARDENED_CLAY).build(),
                    BlockBuilder.create("blueglass", Material.GLASS).setGlass().soundType(SoundType.GLASS).build(),
                    new BlockTarget("target"),
                    BlockBuilder.create("light", Material.IRON).soundType(SoundType.METAL).setTransparent().light(1f)
                            .aabb(new AxisAlignedBB(0.1, 0.75, 0.1, 0.9, 1.0, 0.9), Block.NULL_AABB).build(),
                    BlockBuilder.create("crate", Material.WOOD).soundType(SoundType.WOOD).transparency(false, true).build(),
                    BlockBuilder.create("crates", Material.IRON).soundType(SoundType.METAL).transparency(false, true).build(),
                    HorizontalBlockBuilder.create("bush", Material.PLANTS).soundType(SoundType.PLANT).aabb(Block.FULL_BLOCK_AABB, Block.NULL_AABB)
                            .renderType(BlockRenderLayer.CUTOUT).setTransparent().build(),
                    new BlockPlant("wheat", Material.PLANTS, SoundType.PLANT, MapColor.YELLOW),
                    HorizontalBlockBuilder.create("prop1", Material.PLANTS).soundType(SoundType.PLANT).setProp().build(),
                    HorizontalBlockBuilder.create("prop2", Material.PLANTS).soundType(SoundType.PLANT).setProp().description("My own prop.. For making the mod I guess").build(),
                    HorizontalBlockBuilder.create("prop3", Material.PLANTS).soundType(SoundType.PLANT).setProp().build(),
                    HorizontalBlockBuilder.create("prop4", Material.IRON).soundType(SoundType.METAL).setProp().build(),
                    HorizontalBlockBuilder.create("prop5", Material.CLOTH).soundType(SoundType.CLOTH).setProp().build(),
                    BlockBuilder.create("prop6", Material.ROCK).soundType(SoundType.GLASS).aabb(Block.FULL_BLOCK_AABB, Block.NULL_AABB).transparency(false, false).description("OfficialMajonaise's prop for doing great models").renderType(BlockRenderLayer.CUTOUT).build(),
                    HorizontalBlockBuilder.create("fence", Material.IRON).soundType(SoundType.METAL).setTransparent()
                            .aabb(new AxisAlignedBB(0.4, 0, 0, 0.6, 1, 1), new AxisAlignedBB(0, 0, 0.4, 1, 1, 0.6), new AxisAlignedBB(0.4, 0, 0, 0.6, 1, 1), new AxisAlignedBB(0, 0, 0.4, 1, 1, 0.6))
                            .build(),
                    HorizontalBlockBuilder.create("concrete", Material.ROCK).soundType(SoundType.STONE).setTransparent().build(),
                    BlockBuilder.create("electricpole", Material.WOOD).soundType(SoundType.WOOD)
                            .aabb(new AxisAlignedBB(0.2, 0, 0.2, 0.8, 1, 0.8)).setTransparent().build(),
                    HorizontalBlockBuilder.create("electricpoletop", Material.WOOD).soundType(SoundType.WOOD).setTransparent().build(),
                    HorizontalBlockBuilder.create("electriccable", Material.IRON).soundType(SoundType.METAL).setTransparent()
                            .setPassable().build(),
                    BlockBuilder.create("radiotower", Material.IRON).soundType(SoundType.METAL).setTransparent().build(),
                    BlockBuilder.create("radiotowertop", Material.IRON).soundType(SoundType.METAL).setTransparent().build(),
                    new BlockGunWorkbench("gun_workbench"),
                    new BlockBigAirdrop("big_airdrop"),
                    new BlockOre("copper_ore"),
                    new BlockLandMine("landmine"),
                    HorizontalBlockBuilder.create("desk", Material.WOOD)
                            .soundType(SoundType.WOOD).transparency(false, false)
                            .build(),
                    HorizontalBlockBuilder.create("chair1", Material.WOOD)
                            .soundType(SoundType.WOOD).transparency(false, false)
                            .build(),
                    HorizontalBlockBuilder.create("storagebase", Material.WOOD).aabb(new AxisAlignedBB(0, 0, 0, 1, 1, 0.85), new AxisAlignedBB(0.15, 0, 0, 1, 1, 1), new AxisAlignedBB(0, 0, 0.15, 1, 1, 1), new AxisAlignedBB(0, 0, 0, 0.85, 1, 1))
                            .soundType(SoundType.WOOD).transparency(false, false)
                            .build(),
                    HorizontalBlockBuilder.create("storagetop", Material.WOOD).aabb(new AxisAlignedBB(0, 0, 0, 1, 0.8, 0.85), new AxisAlignedBB(0.15, 0, 0, 1, 0.8, 1), new AxisAlignedBB(0, 0, 0.15, 1, 0.8, 1), new AxisAlignedBB(0, 0, 0, 0.85, 0.8, 1))
                            .soundType(SoundType.WOOD).transparency(false, false)
                            .build(),
                    new BlockWindow("window1x1", BlockWindow.WindowType.WINDOW_1X1),
                    new BlockWindow("window1x2", BlockWindow.WindowType.WINDOW_1X2),
                    new BlockWindow("window2x1", BlockWindow.WindowType.WINDOW_2X1),
                    new BlockWindow("window2x2", BlockWindow.WindowType.WINDOW_2X2),
                    HorizontalBlockBuilder.create("locker", Material.IRON)
                            .soundType(SoundType.METAL).transparency(false, false).aabb(new AxisAlignedBB(0, 0, 0, 1, 1.5, 1))
                            .build(),
                    HorizontalBlockBuilder.create("screen", Material.ROCK).soundType(SoundType.STONE)
                            .aabb(Block.FULL_BLOCK_AABB, Block.NULL_AABB)
                            .transparency(false, false).build(),
                    HorizontalBlockBuilder.create("box_single", Material.IRON).aabb(new AxisAlignedBB(0, 0, 0, 1, 0.5, 1))
                            .soundType(SoundType.METAL).transparency(false, false)
                            .build(),
                    HorizontalBlockBuilder.create("box_double", Material.IRON)
                            .soundType(SoundType.METAL).transparency(false, false)
                            .build(),
                    BlockBuilder.create("sandbag", Material.SAND).soundType(SoundType.SAND).setTransparent().renderType(BlockRenderLayer.CUTOUT).build(),
                    BlockBuilder.create("wooden_crate", Material.WOOD).soundType(SoundType.WOOD).setTransparent().build(),
                    HorizontalBlockBuilder.create("vent", Material.IRON).soundType(SoundType.METAL).setTransparent()
                            .aabb(new AxisAlignedBB(0, 0, 0.8, 1, 1, 1), new AxisAlignedBB(0, 0, 0, 0.2, 1, 1), new AxisAlignedBB(0, 0, 0, 1, 1, 0.2), new AxisAlignedBB(0.8, 0, 0, 1, 1, 1))
                            .nullAABB().build(),
                    new BlockLootCrate("big_crate_empty", BlockLootCrate.EnumCrateType.EMPTY),
                    new BlockLootCrate("big_crate_ammo", BlockLootCrate.EnumCrateType.AMMO),
                    new BlockLootCrate("big_crate_gun", BlockLootCrate.EnumCrateType.WEAPON),
                    new BlockSimpleStairs("wood_stairs", Material.WOOD),
                    BlockBuilder.create("clean_metal", Material.IRON).soundType(SoundType.METAL).build(),
                    BlockBuilder.create("dark_wood", Material.WOOD).soundType(SoundType.WOOD).build(),
                    BlockBuilder.create("wood_tile", Material.WOOD).soundType(SoundType.WOOD).build(),
                    BlockBuilder.create("sandbag_sand", Material.SAND).soundType(SoundType.SAND).build(),
                    new BlockTire(),
                    new BlockTireStack(),
                    BlockBuilder.create("metal_table", Material.IRON).soundType(SoundType.METAL).setTransparent().build(),
                    BlockBuilder.create("road_blocker", Material.IRON).soundType(SoundType.METAL).setTransparent().aabb(new AxisAlignedBB(0.4, 0, 0.4, 0.6, 1, 0.6)).build(),
                    BlockBuilder.create("modern_lamp", Material.ROCK).soundType(SoundType.GLASS).light(1.0F).build(),
                    BlockBuilder.create("lamp_base", Material.IRON).soundType(SoundType.METAL).setTransparent().build(),
                    BlockBuilder.create("lamp_post", Material.IRON).soundType(SoundType.METAL).setTransparent().build(),
                    HorizontalBlockBuilder.create("lamp_top", Material.IRON).soundType(SoundType.METAL).setTransparent().light(1.0F).build(),
                    HorizontalBlockBuilder.create("radiator", Material.IRON).soundType(SoundType.METAL).setTransparent().nullAABB().build(),
                    new BlockSmallChest()
            };

            event.getRegistry().registerAll(BLOCKS);
        }

        @SubscribeEvent
        public static void registerItems(Register<Item> event) {
            final Item[] ITEMS = {
                    new ItemBackpack("backpack1").addDescription("Right Click to equip"),
                    new ItemBackpack("backpack2").addDescription("Right Click to equip"),
                    new ItemBackpack("backpack3").addDescription("Right Click to equip"),
                    new ItemBandage("bandage"),
                    new ItemFirstAidKit("firstaidkit"),
                    new ItemMedkit("medkit"),
                    new ItemEnergyDrink("energydrink"),
                    new ItemPainkiller("painkillers"),
                    new ItemAdrenalineSyringe("adrenalinesyringe"),
                    new PMCItem("iblock").setMaxStackSize(1),
                    new ItemGhillie("ghillie_suit"),
                    new ItemNVGoggles("nv_goggles").addDescription("Right Click to equip"),
                    new FlareGun("flare_gun"),
                    new ItemExplodeable("grenade", 110, ItemExplodeable.Helper::onFragRemoved),
                    new ItemExplodeable("smoke", 110, ItemExplodeable.Helper::onSmokeRemoved).addAditionalDescription("Effect duration: 20s", TextFormatting.RED + "Water will cancel the effect!"),
                    new ItemExplodeable("molotov", -1, ItemExplodeable.Helper::onMolotovRemoved).addAditionalDescription("Effect duration: 10s", TextFormatting.RED + "Water will cancel the effect!"),
                    new ItemExplodeable("flashbang", 60, ItemExplodeable.Helper::onFlashBangRemoved),
                    new ItemAmmo("ammo_9mm", AmmoType.AMMO9MM),
                    new ItemAmmo("ammo_45acp", AmmoType.AMMO45ACP),
                    new ItemAmmo("ammo_shotgun", AmmoType.AMMO12G),
                    new ItemAmmo("ammo_556", AmmoType.AMMO556),
                    new ItemAmmo("ammo_762", AmmoType.AMMO762),
                    new ItemAmmo("ammo_300m", AmmoType.AMMO300M),
                    new ItemAmmo("ammo_flare", AmmoType.FLARE),
                    MeleeItemBuilder.create("pan").materialName("material_pan").damage(15.0F).build(),
                    MeleeItemBuilder.create("machete").materialName("material_machete").damage(11.0F).build(),
                    MeleeItemBuilder.create("crowbar").materialName("material_crowbar").damage(9.0F).build(),
                    MeleeItemBuilder.create("sickle").materialName("material_sickle").damage(10.0F).build(),
                    new ArmorBase("armor1helmet", PMCRegistry.ToolMaterials.LVL1, 1, EntityEquipmentSlot.HEAD, ArmorLevel.LEVEL_ONE),
                    new ArmorBase("armor1body", PMCRegistry.ToolMaterials.LVL1, 1, EntityEquipmentSlot.CHEST, ArmorLevel.LEVEL_ONE),
                    new ArmorBase("armor2helmet", PMCRegistry.ToolMaterials.LVL2, 1, EntityEquipmentSlot.HEAD, ArmorLevel.LEVEL_TWO),
                    new ArmorBase("armor2body", PMCRegistry.ToolMaterials.LVL2, 1, EntityEquipmentSlot.CHEST, ArmorLevel.LEVEL_TWO),
                    new ArmorBase("armor3helmet", PMCRegistry.ToolMaterials.LVL3, 1, EntityEquipmentSlot.HEAD, ArmorLevel.LEVEL_THREE),
                    new ArmorBase("armor3body", PMCRegistry.ToolMaterials.LVL3, 1, EntityEquipmentSlot.CHEST, ArmorLevel.LEVEL_THREE),
                    new ItemAttachment("silencer_pistol", Type.BARREL),
                    new ItemAttachment("silencer_smg", Type.BARREL),
                    new ItemAttachment("silencer_ar", Type.BARREL),
                    new ItemAttachment("silencer_sniper", Type.BARREL),
                    new ItemAttachment("compensator_smg", Type.BARREL),
                    new ItemAttachment("compensator_ar", Type.BARREL),
                    new ItemAttachment("compensator_sniper", Type.BARREL),
                    new ItemAttachment("red_dot", Type.SCOPE),
                    new ItemAttachment("holographic", Type.SCOPE),
                    new ItemAttachment("scope2x", Type.SCOPE),
                    new ItemAttachment("scope4x", Type.SCOPE),
                    new ItemAttachment("scope8x", Type.SCOPE),
                    new ItemAttachment("scope15x", Type.SCOPE),
                    new ItemAttachment("grip_vertical", Type.GRIP),
                    new ItemAttachment("grip_angled", Type.GRIP),
                    new ItemAttachment("quickdraw_mag_pistol", Type.MAGAZINE),
                    new ItemAttachment("extended_mag_pistol", Type.MAGAZINE),
                    new ItemAttachment("extended_quickdraw_mag_pistol", Type.MAGAZINE),
                    new ItemAttachment("quickdraw_mag_smg", Type.MAGAZINE),
                    new ItemAttachment("extended_mag_smg", Type.MAGAZINE),
                    new ItemAttachment("extended_quickdraw_mag_smg", Type.MAGAZINE),
                    new ItemAttachment("quickdraw_mag_ar", Type.MAGAZINE),
                    new ItemAttachment("extended_mag_ar", Type.MAGAZINE),
                    new ItemAttachment("extended_quickdraw_mag_ar", Type.MAGAZINE),
                    new ItemAttachment("quickdraw_mag_sniper", Type.MAGAZINE),
                    new ItemAttachment("extended_mag_sniper", Type.MAGAZINE),
                    new ItemAttachment("extended_quickdraw_mag_sniper", Type.MAGAZINE),
                    new ItemAttachment("bullet_loops_shotgun", Type.STOCK),
                    new ItemAttachment("bullet_loops_sniper", Type.STOCK),
                    new ItemAttachment("cheekpad", Type.STOCK),
                    new ItemParachute("parachute"),
                    new PMCItem("steel_dust"),
                    new PMCItem("steel_ingot"),
                    new PMCItem("copper_ingot"),
                    new ItemFuelCan().addDescription("Hold right click while driving vehicle", "Vehicle must be stationary!"),
                    new ItemVehicleSpawner("vehicle_uaz", Vehicles.UAZ),
                    new ItemVehicleSpawner("vehicle_dacia", Vehicles.DACIA),
                    new GameControlItem("debug_switch", GameControlItem.Actions.DEBUG),
                    new GameControlItem("objective_add", GameControlItem.Actions.OBJECTIVE_ADD),
                    new GameControlItem("objective_remove", GameControlItem.Actions.OBJECTIVE_REMOVE),
                    new GameControlItem("objective_change_size", GameControlItem.Actions.OBJECTIVE_CHANGE_SIZE)
            };

            event.getRegistry().registerAll(ITEMS);
            event.getRegistry().registerAll(ITEM_BLOCKS.toArray(new ItemBlock[0]));
            event.getRegistry().registerAll(getInitializedGuns());
            ITEM_BLOCKS = null;
        }

        @SubscribeEvent
        public static void registerEntities(Register<EntityEntry> e) {
            final EntityEntry[] entries =
                    {
                            registerEntity("bullet", EntityBullet.class, 64, 40),
                            registerEntity("flare", EntityFlare.class, 64, 20),
                            registerEntity("parachute", EntityParachute.class, 256, 1),
                            registerEntity("plane", EntityPlane.class, 128, 25),
                            registerEntity("dropEntity", EntityAirdrop.class, 256, 4),
                            registerVehicle("uaz", EntityVehicleUAZ.class),
                            registerVehicle("dacia", EntityVehicleDacia.class),
                            registerEntity("enemyai", EntityAIPlayer.class, 256, 3, true, 0x000000, 0xFFFFFF),
                            registerEntity("frag_grenade", EntityFragGrenade.class, 64, 1),
                            registerEntity("molotov", EntityMolotov.class, 64, 1),
                            registerEntity("smoke_grenade", EntitySmokeGrenade.class, 256, 1),
                            registerEntity("flashbang", EntityFlashBang.class, 64, 1)
                    };

            e.getRegistry().registerAll(entries);
        }

        @SubscribeEvent
        public static void registerGameModes(com.toma.pubgmc.init.GameRegistry.GameRegisterEvent e) {
            e.registerAll(
                    new GameInactive("inactive"),
                    new GameBattleRoyale("battleroyale"),
                    new GameBombDefuse("bombDefuse")
            );
        }

        public static void registerItemBlock(Block block) {
            ItemBlock itemBlock = new ItemBlock(block);
            itemBlock.setRegistryName(block.getRegistryName());
            try {
                ITEM_BLOCKS.add(itemBlock);
            } catch (NullPointerException e) {
                Pubgmc.logger.fatal("Attempted to register itemblock for {} after PMC registration was complete!", block.getRegistryName());
            }
        }

        private static EntityEntry registerEntity(String name, Class<? extends Entity> cl, int trackRange, int frequency) {
            return createEntityBuilder(name).entity(cl).tracker(trackRange, frequency, true).build();
        }

        private static EntityEntry registerEntity(String name, Class<? extends Entity> entityClass, int trackingRange, int updateFrequency, boolean sendVelocityUpdates, int eggPrimary, int eggSecondary) {
            return createEntityBuilder(name).entity(entityClass).tracker(trackingRange, updateFrequency, sendVelocityUpdates).egg(eggPrimary, eggSecondary).build();
        }

        private static EntityEntry registerVehicle(String name, Class<? extends EntityVehicle> vehicleClass) {
            return registerEntity(name, vehicleClass, 256, 1);
        }

        private static <E extends Entity> EntityEntryBuilder<E> createEntityBuilder(String name) {
            EntityEntryBuilder<E> builder = EntityEntryBuilder.create();
            ResourceLocation regName = new ResourceLocation(Pubgmc.MOD_ID, name);
            return builder.id(regName, ID()).name(regName.toString());
        }

        private static int ID() {
            ++entityID;
            return entityID;
        }

        private static GunBase[] getInitializedGuns() {
            CFGWeapons cfg = ConfigPMC.common.weapons;

            GunBase p92 = GunBuilder.create("p92")
                    .stats(cfg.p92)
                    .firerate(2)
                    .recoil(2f, 0.5f)
                    .reload(ReloadType.MAGAZINE, 25, PMCSounds.reload_p92)
                    .ammo(AmmoType.AMMO9MM, 15, 20)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_p92, 12f, PMCSounds.gun_p92_silenced, 8f)
                    .build();

            GunBase p1911 = GunBuilder.create("p1911")
                    .stats(cfg.p1911)
                    .firerate(2)
                    .recoil(2f, 0.5f)
                    .reload(ReloadType.MAGAZINE, 25, PMCSounds.reload_p1911)
                    .ammo(AmmoType.AMMO45ACP, 7, 12)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_p1911, 12f, PMCSounds.gun_p1911_silenced, 8f)
                    .build();

            GunBase p18c = GunBuilder.create("p18c")
                    .stats(cfg.p18c)
                    .firerate(1)
                    .recoil(1.5f, 0.75f)
                    .reload(ReloadType.MAGAZINE, 34, PMCSounds.reload_p18c)
                    .ammo(AmmoType.AMMO9MM, 17, 25)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_p18c, 12f, PMCSounds.gun_p18c_silenced, 8f)
                    .build();

            GunBase r1895 = GunBuilder.create("r1895")
                    .stats(cfg.r1895)
                    .firerate(13)
                    .recoil(2.5f, 1.5f)
                    .reload(ReloadType.SINGLE, 14, PMCSounds.reload_r1895)
                    .ammo(AmmoType.AMMO762, 7)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_r1895, 12f, PMCSounds.gun_r1895_silenced, 8f)
                    .build();

            GunBase r45 = GunBuilder.create("r45")
                    .stats(cfg.r45)
                    .firerate(12)
                    .recoil(2f, 1.5f)
                    .reload(ReloadType.MAGAZINE, 40, PMCSounds.reload_r45)
                    .ammo(AmmoType.AMMO45ACP, 6)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_r45, 12f)
                    .build();

            GunBase scorpion = GunBuilder.create("scorpion")
                    .stats(cfg.scorpion)
                    .firerate(1)
                    .recoil(1.3f, 0.3f)
                    .reload(ReloadType.MAGAZINE, 57, PMCSounds.reload_scorpion)
                    .ammo(AmmoType.AMMO9MM, 20, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_scorpion, 12f, PMCSounds.gun_scorpion_silenced, 8f)
                    .build();

            GunBase deagle = GunBuilder.create("deagle")
                    .stats(cfg.deagle)
                    .firerate(4)
                    .recoil(4.5f, 3f)
                    .reload(ReloadType.MAGAZINE, 50, PMCSounds.reload_deagle)
                    .ammo(AmmoType.AMMO45ACP, 7, 10)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_deagle, 14f)
                    .build();

            GunBase win94 = GunBuilder.create("win94")
                    .stats(cfg.win94)
                    .firerate(25)
                    .recoil(5.5f, 3.5f)
                    .reload(ReloadType.SINGLE, 15, PMCSounds.reload_win94)
                    .ammo(AmmoType.AMMO45ACP, 8)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.PISTOL)
                    .sound(PMCSounds.gun_win94, 20f)
                    .addBoltAction(() -> PMCSounds.bolt_win94)
                    .build();

            GunBase sawedoff = GunBuilder.create("sawed_off")
                    .stats(cfg.sawedoff)
                    .firerate(10)
                    .recoil(3.5f, 2f)
                    .reload(ReloadType.MAGAZINE, 70, PMCSounds.reload_sawedoff)
                    .ammo(AmmoType.AMMO12G, 2)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.SHOTGUN)
                    .sound(PMCSounds.gun_sawed_off, 16f)
                    .build();

            GunBase s1897 = GunBuilder.create("s1897")
                    .stats(cfg.s1897)
                    .firerate(15)
                    .recoil(3.5f, 2f)
                    .reload(ReloadType.SINGLE, 10, PMCSounds.reload_s1897)
                    .ammo(AmmoType.AMMO12G, 5)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.SHOTGUN)
                    .sound(PMCSounds.gun_s1897, 16f)
                    .build();

            GunBase s686 = GunBuilder.create("s686")
                    .stats(cfg.s686)
                    .firerate(5)
                    .recoil(3.5f, 2f)
                    .reload(ReloadType.MAGAZINE, 48, PMCSounds.reload_s686)
                    .ammo(AmmoType.AMMO12G, 2)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.SHOTGUN)
                    .sound(PMCSounds.gun_s686, 16f)
                    .build();

            GunBase s12k = GunBuilder.create("s12k")
                    .stats(cfg.s12k)
                    .firerate(7)
                    .recoil(6f, 2f)
                    .reload(ReloadType.MAGAZINE, 65, PMCSounds.reload_s12k)
                    .ammo(AmmoType.AMMO12G, 5)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.SHOTGUN)
                    .sound(PMCSounds.gun_s12k, 16f)
                    .build();

            GunBase uzi = GunBuilder.create("microuzi")
                    .stats(cfg.microuzi)
                    .firerate(1)
                    .recoil(2f, 0.5f)
                    .reload(ReloadType.MAGAZINE, 56, PMCSounds.reload_microuzi)
                    .ammo(AmmoType.AMMO9MM, 25, 35)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.SMG)
                    .sound(PMCSounds.gun_micro_uzi, 16f, PMCSounds.gun_micro_uzi_silenced, 8f)
                    .build();

            GunBase vector = GunBuilder.create("vector")
                    .stats(cfg.vector)
                    .firerate(1)
                    .recoil(2f, 0.6f)
                    .reload(ReloadType.MAGAZINE, 30, PMCSounds.reload_vector)
                    .ammo(AmmoType.AMMO9MM, 19, 33)
                    .firemode(Firemode.AUTO, Firemode.all())
                    .weaponType(GunType.SMG)
                    .setTwoRoundBurst()
                    .sound(PMCSounds.gun_vector, 16f, PMCSounds.gun_vector_silenced, 8f)
                    .build();

            GunBase bizon = GunBuilder.create("bizon")
                    .stats(cfg.bizon)
                    .firerate(2)
                    .recoil(2.0f, 0.7f)
                    .reload(ReloadType.MAGAZINE, 62, PMCSounds.reload_bizon)
                    .ammo(AmmoType.AMMO9MM, 53)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.SMG)
                    .sound(PMCSounds.gun_bizon, 16f, PMCSounds.gun_bizon_silenced, 8f)
                    .build();

            GunBase mp5k = GunBuilder.create("mp5k")
                    .stats(cfg.mp5k)
                    .firerate(2)
                    .recoil(2f, 0.7f)
                    .reload(ReloadType.MAGAZINE, 64, PMCSounds.reload_mp5k)
                    .ammo(AmmoType.AMMO9MM, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.SMG)
                    .sound(PMCSounds.gun_mp5k, 16f, PMCSounds.gun_mp5k_silenced, 8f)
                    .build();

            GunBase tommy = GunBuilder.create("tommy_gun")
                    .stats(cfg.tommygun)
                    .firerate(2)
                    .recoil(2f, 0.75f)
                    .reload(ReloadType.MAGAZINE, 60, PMCSounds.reload_tommygun)
                    .ammo(AmmoType.AMMO45ACP, 30, 50)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.SMG)
                    .sound(PMCSounds.gun_tommy_gun, 16f, PMCSounds.gun_tommy_gun_silenced, 8f)
                    .build();

            GunBase ump = GunBuilder.create("ump45")
                    .stats(cfg.ump45)
                    .firerate(2)
                    .recoil(1.9f, 0.5f)
                    .reload(ReloadType.MAGAZINE, 52, PMCSounds.reload_ump9)
                    .ammo(AmmoType.AMMO45ACP, 25, 35)
                    .firemode(Firemode.AUTO, Firemode.all())
                    .weaponType(GunType.SMG)
                    .setTwoRoundBurst()
                    .sound(PMCSounds.gun_ump9, 16f, PMCSounds.gun_ump9_silenced, 8f)
                    .build();

            GunBase m16a4 = GunBuilder.create("m16a4")
                    .stats(cfg.m16a4)
                    .firerate(2)
                    .recoil(2.0f, 1f)
                    .reload(ReloadType.MAGAZINE, 66, PMCSounds.reload_m16a4)
                    .ammo(AmmoType.AMMO556, 30, 40)
                    .firemode(Firemode.SINGLE, Firemode.noAuto())
                    .weaponType(GunType.AR)
                    .sound(PMCSounds.gun_m16a4, 20f, PMCSounds.gun_m16a4_silenced, 14f)
                    .build();

            GunBase m416 = GunBuilder.create("m416")
                    .stats(cfg.m416)
                    .firerate(2)
                    .recoil(2.25f, 1.0f)
                    .reload(ReloadType.MAGAZINE, 66, PMCSounds.reload_m416)
                    .ammo(AmmoType.AMMO556, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.AR)
                    .sound(PMCSounds.gun_m416, 20f, PMCSounds.gun_m416_silenced, 14f)
                    .build();

            GunBase scarl = GunBuilder.create("scar_l")
                    .stats(cfg.scarl)
                    .firerate(2)
                    .recoil(2.0f, 1.0f)
                    .reload(ReloadType.MAGAZINE, 65, PMCSounds.reload_scarl)
                    .ammo(AmmoType.AMMO556, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.AR)
                    .sound(PMCSounds.gun_scarl, 20f, PMCSounds.gun_scarl_silenced, 14f)
                    .build();

            GunBase qbz = GunBuilder.create("qbz")
                    .stats(cfg.qbz)
                    .firerate(2)
                    .recoil(2.0f, 1.0f)
                    .reload(ReloadType.MAGAZINE, 70, PMCSounds.reload_qbz)
                    .ammo(AmmoType.AMMO556, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.AR)
                    .sound(PMCSounds.gun_qbz, 20f, PMCSounds.gun_qbz_silenced, 14f)
                    .build();

            GunBase g36c = GunBuilder.create("g36c")
                    .stats(cfg.g36c)
                    .firerate(2)
                    .recoil(2.25f, 0.8f)
                    .reload(ReloadType.MAGAZINE, 82, PMCSounds.reload_g36c)
                    .ammo(AmmoType.AMMO556, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.AR)
                    .sound(PMCSounds.gun_g36c, 20f, PMCSounds.gun_g36c_silenced, 14f)
                    .build();

            GunBase aug = GunBuilder.create("aug")
                    .stats(cfg.aug)
                    .firerate(2)
                    .recoil(2.3f, 0.75f)
                    .reload(ReloadType.MAGAZINE, 69, PMCSounds.reload_aug)
                    .ammo(AmmoType.AMMO556, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.AR)
                    .airdropOnly()
                    .sound(PMCSounds.gun_aug, 20f, PMCSounds.gun_aug_silenced, 14f)
                    .build();

            GunBase akm = GunBuilder.create("akm")
                    .stats(cfg.akm)
                    .firerate(2)
                    .recoil(2.7f, 1.3f)
                    .reload(ReloadType.MAGAZINE, 60, PMCSounds.reload_akm)
                    .ammo(AmmoType.AMMO762, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.AR)
                    .sound(PMCSounds.gun_akm, 20f, PMCSounds.gun_akm_silenced, 14f)
                    .build();

            GunBase m762 = GunBuilder.create("beryl_m762")
                    .stats(cfg.m762)
                    .firerate(2)
                    .recoil(2.9f, 1.5f)
                    .reload(ReloadType.MAGAZINE, 50, PMCSounds.reload_m762)
                    .ammo(AmmoType.AMMO762, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.all())
                    .weaponType(GunType.AR)
                    .sound(PMCSounds.gun_m762, 20f, PMCSounds.gun_m762_silenced, 14f)
                    .build();

            GunBase mk47 = GunBuilder.create("mk47_mutant")
                    .stats(cfg.mk47)
                    .firerate(2)
                    .recoil(2.7f, 1.5f)
                    .reload(ReloadType.MAGAZINE, 66, PMCSounds.reload_mk47)
                    .ammo(AmmoType.AMMO762, 20, 30)
                    .firemode(Firemode.SINGLE, Firemode.noAuto()).weaponType(GunType.AR)
                    .setTwoRoundBurst()
                    .sound(PMCSounds.gun_mk47, 20f, PMCSounds.gun_mk47_silenced, 14f)
                    .build();

            GunBase groza = GunBuilder.create("groza")
                    .stats(cfg.groza)
                    .firerate(2)
                    .recoil(2.5f, 1.2f)
                    .reload(ReloadType.MAGAZINE, 50, PMCSounds.reload_groza)
                    .ammo(AmmoType.AMMO762, 30, 40)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.AR)
                    .airdropOnly()
                    .sound(PMCSounds.gun_groza, 20f, PMCSounds.gun_groza_silenced, 14f)
                    .build();

            GunBase dp28 = GunBuilder.create("dp28")
                    .stats(cfg.dp28)
                    .firerate(2)
                    .recoil(2.5f, 1.5f)
                    .reload(ReloadType.MAGAZINE, 95, PMCSounds.reload_dp28)
                    .ammo(AmmoType.AMMO762, 47)
                    .firemode(Firemode.AUTO, Firemode.AUTO)
                    .weaponType(GunType.LMG)
                    .sound(PMCSounds.gun_dp28, 20f)
                    .build();

            GunBase m249 = GunBuilder.create("m249")
                    .stats(cfg.m249)
                    .firerate(2)
                    .recoil(2.0f, 0.9f)
                    .reload(ReloadType.MAGAZINE, 148, PMCSounds.reload_m249)
                    .ammo(AmmoType.AMMO556, 100)
                    .firemode(Firemode.AUTO, Firemode.AUTO)
                    .weaponType(GunType.LMG)
                    .airdropOnly()
                    .sound(PMCSounds.gun_m249, 20f)
                    .build();

            GunBase vss = GunBuilder.create("vss")
                    .stats(cfg.vss)
                    .firerate(2)
                    .recoil(1.5f, 0.5f)
                    .reload(ReloadType.MAGAZINE, 40, PMCSounds.reload_vss)
                    .ammo(AmmoType.AMMO9MM, 10, 20)
                    .firemode(Firemode.AUTO, Firemode.noBurst())
                    .weaponType(GunType.DMR)
                    .sound(PMCSounds.gun_vss, 5f)
                    .build();

            GunBase mini14 = GunBuilder.create("mini14")
                    .stats(cfg.mini14)
                    .firerate(1)
                    .recoil(3.5f, 2f)
                    .reload(ReloadType.MAGAZINE, 62, PMCSounds.reload_mini14)
                    .ammo(AmmoType.AMMO556, 20, 30)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.DMR)
                    .sound(PMCSounds.gun_mini14, 24f, PMCSounds.gun_mini14_silenced, 16f)
                    .build();

            GunBase qbu = GunBuilder.create("qbu")
                    .stats(cfg.qbu)
                    .firerate(1)
                    .recoil(3.5f, 2f)
                    .reload(ReloadType.MAGAZINE, 44, PMCSounds.reload_qbu)
                    .ammo(AmmoType.AMMO556, 10, 20)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.DMR)
                    .sound(PMCSounds.gun_qbu, 24f, PMCSounds.gun_qbu_silenced, 12f)
                    .build();

            GunBase sks = GunBuilder.create("sks")
                    .stats(cfg.sks)
                    .firerate(1)
                    .recoil(5.5f, 2.25f)
                    .reload(ReloadType.MAGAZINE, 32, PMCSounds.reload_sks)
                    .ammo(AmmoType.AMMO762, 10, 20)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.DMR)
                    .sound(PMCSounds.gun_sks, 24f, PMCSounds.gun_sks_silenced, 16f)
                    .build();

            GunBase slr = GunBuilder.create("slr")
                    .stats(cfg.slr)
                    .firerate(1)
                    .recoil(5.75f, 2.25f)
                    .reload(ReloadType.MAGAZINE, 53, PMCSounds.reload_slr)
                    .ammo(AmmoType.AMMO762, 10, 20)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.DMR)
                    .sound(PMCSounds.gun_slr, 24f, PMCSounds.gun_slr_silenced, 16f)
                    .build();

            GunBase mk14 = GunBuilder.create("mk14")
                    .stats(cfg.mk14)
                    .firerate(2)
                    .recoil(7.5f, 3.25f)
                    .reload(ReloadType.MAGAZINE, 39, PMCSounds.reload_mk14)
                    .ammo(AmmoType.AMMO762, 10, 20)
                    .firemode(Firemode.SINGLE, Firemode.noBurst())
                    .weaponType(GunType.DMR)
                    .airdropOnly()
                    .sound(PMCSounds.gun_mk14, 24f, PMCSounds.gun_mk14_silenced, 16f)
                    .build();

            GunBase kar98k = GunBuilder.create("kar98k")
                    .stats(cfg.kar98k)
                    .firerate(30)
                    .recoil(2.5f, 1.25f)
                    .reload(ReloadType.KAR98K, 63, PMCSounds.reload_kar98k)
                    .ammo(AmmoType.AMMO762, 5)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.SR)
                    .sound(PMCSounds.gun_kar98k, 30f, PMCSounds.gun_kar98k_silenced, 20f)
                    .addBoltAction(() -> PMCSounds.bolt_kar98k)
                    .build();

            GunBase m24 = GunBuilder.create("m24")
                    .stats(cfg.m24)
                    .firerate(35)
                    .recoil(2.5f, 1.25f)
                    .reload(ReloadType.MAGAZINE, 71, PMCSounds.reload_m24)
                    .ammo(AmmoType.AMMO762, 5, 7)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.SR)
                    .sound(PMCSounds.gun_m24, 30f, PMCSounds.gun_m24_silenced, 20f)
                    .addBoltAction(() -> PMCSounds.bolt_m24)
                    .build();

            GunBase awm = GunBuilder.create("awm")
                    .stats(cfg.awm)
                    .firerate(35)
                    .recoil(2.5f, 1.25f)
                    .reload(ReloadType.MAGAZINE, 78, PMCSounds.reload_awm)
                    .ammo(AmmoType.AMMO300M, 5, 7)
                    .firemode(Firemode.SINGLE, Firemode.SINGLE)
                    .weaponType(GunType.SR)
                    .airdropOnly()
                    .sound(PMCSounds.gun_awm, 30f, PMCSounds.gun_awm_silenced, 20f)
                    .addBoltAction(() -> PMCSounds.bolt_awm)
                    .build();

            return new GunBase[]{
                    p92, p1911, p18c, r1895, r45, scorpion, deagle, win94,
                    sawedoff, s1897, s686, s12k,
                    uzi, vector, bizon, mp5k, tommy, ump,
                    m16a4, m416, scarl, qbz, g36c, aug, akm, m762, mk47, groza,
                    dp28, m249,
                    vss, mini14, qbu, sks, slr, mk14,
                    kar98k, m24, awm
            };
        }

        public static void initTileEntities() {
            registerTileEntity(TileEntityAirdrop.class, "airdrop");
            registerTileEntity(TileEntityLootGenerator.class, "lootspawner");
            registerTileEntity(TileEntityPlayerCrate.class, "player_crate");
            registerTileEntity(TileEntityGunWorkbench.class, "gun_workbench");
            registerTileEntity(TileEntityLandMine.class, "landmine");
            registerTileEntity(TileEntityWindow.class, "window");
        }

        private static void registerTileEntity(Class<? extends TileEntity> tileEntityClass, String name) {
            GameRegistry.registerTileEntity(tileEntityClass, new ResourceLocation(Pubgmc.MOD_ID + ":" + name));
        }
    }

    @Mod.EventBusSubscriber(Side.CLIENT)
    public static class ModelRegistry {
        @SubscribeEvent
        public static void bakeModels(ModelBakeEvent e) {
            ModelResourceLocation location;

            for (int i = 0; i < GunBase.GUNS.size(); i++) {
                GunBase gun = GunBase.GUNS.get(i);
                location = new ModelResourceLocation(gun.getRegistryName(), "inventory");
                e.getModelRegistry().putObject(location, new BakedModelGun());
            }
        }

        @SubscribeEvent
        public static void onModelAttach(GunModelAttachEvent e) {
            GunBase g = e.getGun();

            switch (e.getName()) {
                case "flare_gun":
                    e.attachModel(e.getTEISR().flareGun);
                    break;
                case "p92":
                    e.attachModel(e.getTEISR().p92);
                    break;
                case "p1911":
                    e.attachModel(e.getTEISR().p1911);
                    break;
                case "p18c":
                    e.attachModel(e.getTEISR().p18c);
                    break;
                case "r1895":
                    e.attachModel(e.getTEISR().r1895);
                    break;
                case "r45":
                    e.attachModel(e.getTEISR().r45);
                    break;
                case "scorpion":
                    e.attachModel(e.getTEISR().scorpion);
                    break;
                case "deagle":
                    e.attachModel(e.getTEISR().deagle);
                    break;
                case "win94":
                    e.attachModel(e.getTEISR().win94);
                    break;
                case "sawed_off":
                    e.attachModel(e.getTEISR().sawedOff);
                    break;
                case "s1897":
                    e.attachModel(e.getTEISR().s1897);
                    break;
                case "s686":
                    e.attachModel(e.getTEISR().s686);
                    break;
                case "s12k":
                    e.attachModel(e.getTEISR().s12k);
                    break;
                case "microuzi":
                    e.attachModel(e.getTEISR().microuzi);
                    break;
                case "vector":
                    e.attachModel(e.getTEISR().vector);
                    break;
                case "bizon":
                    e.attachModel(e.getTEISR().bizon);
                    break;
                case "mp5k":
                    e.attachModel(e.getTEISR().mp5k);
                    break;
                case "tommy_gun":
                    e.attachModel(e.getTEISR().tommygun);
                    break;
                case "ump45":
                    e.attachModel(e.getTEISR().ump);
                    break;
                case "m16a4":
                    e.attachModel(e.getTEISR().m16a4);
                    break;
                case "m416":
                    e.attachModel(e.getTEISR().m416);
                    break;
                case "scar_l":
                    e.attachModel(e.getTEISR().scar);
                    break;
                case "qbz":
                    e.attachModel(e.getTEISR().qbz);
                    break;
                case "g36c":
                    e.attachModel(e.getTEISR().g36c);
                    break;
                case "aug":
                    e.attachModel(e.getTEISR().aug);
                    break;
                case "akm":
                    e.attachModel(e.getTEISR().akm);
                    break;
                case "beryl_m762":
                    e.attachModel(e.getTEISR().m762);
                    break;
                case "mk47_mutant":
                    e.attachModel(e.getTEISR().mk47);
                    break;
                case "groza":
                    e.attachModel(e.getTEISR().groza);
                    break;
                case "dp28":
                    e.attachModel(e.getTEISR().dp28);
                    break;
                case "m249":
                    e.attachModel(e.getTEISR().m249);
                    break;
                case "vss":
                    e.attachModel(e.getTEISR().vss);
                    break;
                case "mini14":
                    e.attachModel(e.getTEISR().mini14);
                    break;
                case "qbu":
                    e.attachModel(e.getTEISR().qbu);
                    break;
                case "sks":
                    e.attachModel(e.getTEISR().sks);
                    break;
                case "slr":
                    e.attachModel(e.getTEISR().slr);
                    break;
                case "mk14":
                    e.attachModel(e.getTEISR().mk14);
                    break;
                case "kar98k":
                    e.attachModel(e.getTEISR().kar98k);
                    break;
                case "m24":
                    e.attachModel(e.getTEISR().m24);
                    break;
                case "awm":
                    e.attachModel(e.getTEISR().awm);
                    break;
            }
        }

        @SubscribeEvent
        public static void registerModels(ModelRegistryEvent e) {
            for (ResourceLocation rl : ForgeRegistries.ITEMS.getKeys()) {
                if (rl.getResourceDomain().equals(Pubgmc.MOD_ID))
                    registerModel(ForgeRegistries.ITEMS.getValue(rl));
            }

            for (ResourceLocation rl : ForgeRegistries.BLOCKS.getKeys()) {
                if (rl.getResourceDomain().equals(Pubgmc.MOD_ID))
                    registerModel(ForgeRegistries.BLOCKS.getValue(rl));
            }
        }

        static final WeaponTEISR TEISR = new WeaponTEISR();

        private static void registerModel(Item item) {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));

            if (item instanceof GunBase) {
                item.setTileEntityItemStackRenderer(TEISR);
                MinecraftForge.EVENT_BUS.post(new GunModelAttachEvent((GunBase) item, item.getRegistryName()));
            }
        }

        private static void registerModel(Block block) {
            ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
        }
    }

    @Mod.EventBusSubscriber
    public static class GunInit {
        @SubscribeEvent
        public static void onGunInitialized(GunPostInitializeEvent e) {
            GunBase gun = e.getGun();
            if (gun == PMCItems.P92) {
                e.initBarrelAttachments(PMCItems.SILENCER_PISTOL);
                e.initMagazineAttachments(AttachmentHelper.getPistolMagazineAttachments());
                e.initScopeAttachments(PMCItems.RED_DOT);
            } else if (gun == PMCItems.P1911) {
                e.initBarrelAttachments(PMCItems.SILENCER_PISTOL);
                e.initMagazineAttachments(AttachmentHelper.getPistolMagazineAttachments());
                e.initScopeAttachments(PMCItems.RED_DOT);
            } else if (gun == PMCItems.P18C) {
                e.initBarrelAttachments(PMCItems.SILENCER_PISTOL);
                e.initMagazineAttachments(AttachmentHelper.getPistolMagazineAttachments());
                e.initScopeAttachments(PMCItems.RED_DOT);
            } else if (gun == PMCItems.R1895) {
                e.initBarrelAttachments(PMCItems.SILENCER_PISTOL);
            } else if (gun == PMCItems.R45) {
                e.initScopeAttachments(PMCItems.RED_DOT);
            } else if (gun == PMCItems.SCORPION) {
                e.initBarrelAttachments(PMCItems.SILENCER_PISTOL);
                e.initGripAttachments(PMCItems.GRIP_VERTICAL);
                e.initMagazineAttachments(PMCItems.EXTENDED_MAG_PISTOL);
                e.initScopeAttachments(PMCItems.RED_DOT);
            } else if (gun == PMCItems.DEAGLE) {
                e.initScopeAttachments(PMCItems.RED_DOT);
                e.initMagazineAttachments(AttachmentHelper.getPistolMagazineAttachments());
            } else if (gun == PMCItems.WIN94) {
                e.initStockAttachments(PMCItems.BULLET_LOOPS_SNIPER);
            } else if (gun == PMCItems.S1897) {
                e.initStockAttachments(PMCItems.BULLET_LOOPS_SHOTGUN);
            } else if (gun == PMCItems.S686) {
                e.initStockAttachments(PMCItems.BULLET_LOOPS_SHOTGUN);
            } else if (gun == PMCItems.S12K) {
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.MICROUZI) {
                e.initBarrelAttachments(AttachmentHelper.getSMGBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSMGMagazineAttachments());
                e.initScopeAttachments(PMCItems.RED_DOT, PMCItems.HOLOGRAPHIC);
            } else if (gun == PMCItems.VECTOR) {
                e.initBarrelAttachments(AttachmentHelper.getSMGBarrelAttachments());
                e.initGripAttachments(PMCItems.GRIP_VERTICAL);
                e.initMagazineAttachments(AttachmentHelper.getSMGMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.BIZON) {
                e.initBarrelAttachments(AttachmentHelper.getSMGBarrelAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.MP5K) {
                e.initBarrelAttachments(AttachmentHelper.getSMGBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSMGMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.TOMMY_GUN) {
                e.initBarrelAttachments(PMCItems.SILENCER_SMG);
                e.initGripAttachments(PMCItems.GRIP_VERTICAL);
                e.initMagazineAttachments(AttachmentHelper.getSMGMagazineAttachments());
            } else if (gun == PMCItems.UMP45) {
                e.initBarrelAttachments(AttachmentHelper.getSMGBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getSMGMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.M16A4) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.M416) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.SCAR_L) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.QBZ) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.G36C) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.AUG) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.AKM) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.BERYL_M762) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.MK47_MUTANT) {
                e.initBarrelAttachments(AttachmentHelper.getARBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.GROZA) {
                e.initBarrelAttachments(PMCItems.SILENCER_AR);
                e.initMagazineAttachments(AttachmentHelper.getARMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.DP28) {
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.M249) {
                e.initScopeAttachments(AttachmentHelper.getSmallScopes());
            } else if (gun == PMCItems.VSS) {
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initStockAttachments(PMCItems.CHEEKPAD);
            } else if (gun == PMCItems.MINI14) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
            } else if (gun == PMCItems.QBU) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
            } else if (gun == PMCItems.SKS) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initGripAttachments(AttachmentHelper.getGrips());
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
                e.initStockAttachments(PMCItems.CHEEKPAD);
            } else if (gun == PMCItems.SLR) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
                e.initStockAttachments(PMCItems.CHEEKPAD);
            } else if (gun == PMCItems.MK14) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
                e.initStockAttachments(PMCItems.CHEEKPAD);
            } else if (gun == PMCItems.KAR98K) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
                e.initStockAttachments(AttachmentHelper.getStock(true));
            } else if (gun == PMCItems.M24) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
                e.initStockAttachments(PMCItems.CHEEKPAD);
            } else if (gun == PMCItems.AWM) {
                e.initBarrelAttachments(AttachmentHelper.getSRBarrelAttachments());
                e.initMagazineAttachments(AttachmentHelper.getSRMagazineAttachments());
                e.initScopeAttachments(AttachmentHelper.getScopes());
                e.initStockAttachments(PMCItems.CHEEKPAD);
            }
        }
    }
}
