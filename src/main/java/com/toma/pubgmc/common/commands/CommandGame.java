package com.toma.pubgmc.common.commands;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.toma.pubgmc.Pubgmc;
import com.toma.pubgmc.common.capability.IGameData;
import com.toma.pubgmc.common.capability.IGameData.GameDataProvider;
import com.toma.pubgmc.util.PUBGMCUtil;

import net.minecraft.command.CommandBase;
import net.minecraft.command.CommandException;
import net.minecraft.command.ICommandSender;
import net.minecraft.command.WrongUsageException;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.world.World;
import net.minecraft.world.border.WorldBorder;

public class CommandGame extends CommandBase
{
	private static final String[] completions = {"help","stop","addLocation","clearLocations","setupMap","zones"};
	
	@Override
	public String getName()
	{
		return "game";
	}
	
	@Override
	public String getUsage(ICommandSender sender)
	{
		return "/game";
	}
	
	@Override
	public int getRequiredPermissionLevel()
	{
		return 2;
	}
	
	@Override
	public void execute(MinecraftServer server, ICommandSender sender, String[] args) throws CommandException
	{
		World world = sender.getEntityWorld();
		IGameData game = world.getCapability(GameDataProvider.GAMEDATA, null);
		
		if(args.length == 0) throw new WrongUsageException("Wrong command, use /game help", new Object[0]);
		
		String[] gamehelp = 
		{
			"start >> starts the game",
			"stop >> stops the game",
			"addLocation [X,Y,Z,name] >> this will add a new spawn location to your map",
			"clearLocations >> removes all spawn locations from your map",
			"setupMap [mapCenterX, mapCenterZ, mapSize, zoneCount] >> border will be calculated based on these values",
			"zones >> Prints all zone parameters"
		};
		
		if(args[0].equalsIgnoreCase("help"))
		{
			for(int i = 0; i < gamehelp.length; i++)
				sender.sendMessage(new TextComponentString(TextFormatting.GREEN + gamehelp[i]));
		}
		
		else if(args[0].equalsIgnoreCase("start"))
		{
			if(!game.isPlaying())
			{
				game.setPlaying(true);
				startGame(game, world);
			}
			
			else sendWarningTo(sender, "Game is already running!");
		}
		
		else if(args[0].equalsIgnoreCase("stop"))
		{
			if(game.isPlaying())
			{
				game.setPlaying(false);
				stopGame(game, world);
			}
			
			else sendWarningTo(sender, "Game haven't started yet!");
		}
		
		else if(args[0].equalsIgnoreCase("addLocation"))
		{
			if(args.length == 5 && PUBGMCUtil.isValidNumber(args[1]) && PUBGMCUtil.isValidNumber(args[2]) && PUBGMCUtil.isValidNumber(args[3]))
			{
				game.addSpawnLocation(new BlockPos(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3])), args[4]);
				sendFeedback(world, sender, "Added location " + args[4] + " [" + args[1] + ", " + args[2] + ", " + args[3] + "]!");
			}
			
			else throw new WrongUsageException("You must specify the location position and name! /game addLocation [x,y,z,name]", new Object[0]);
		}
		
		else if(args[0].equalsIgnoreCase("clearLocations"))
		{
			game.getSpawnLocations().clear();
			game.setSpawnLocationCount(0);
		}
		
		else if(args[0].equalsIgnoreCase("setupMap"))
		{
			if(args.length == 5 && PUBGMCUtil.isValidNumber(args[1]) && PUBGMCUtil.isValidNumber(args[2]) && PUBGMCUtil.isValidNumber(args[3]) && PUBGMCUtil.isValidNumber(args[4]))
			{
				game.setMapCenter(Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]), Integer.parseInt(args[4]));
				sendFeedback(world, sender, TextFormatting.BOLD + "New map setup:");
				sendFeedback(world, sender, "Center: [" + args[1] + ", " + args[2] + "]");
				sendFeedback(world, sender, "Map size: " + args[3]);
				sendFeedback(world, sender, "Zone count: " + args[4]);
			}
			
			else throw new WrongUsageException("You must specify mapCenter and size! /game setupMap [posX, posZ, size, zoneCount]", new Object[0]);
		}
		
		else if(args[0].equalsIgnoreCase("zone"))
		{
			getZoneConfiguration(sender, game, world);
		}
		
		else throw new WrongUsageException("Unknown operation! Try /game help for more info", new Object[0]);
	}
	
	private void getZoneConfiguration(ICommandSender sender, IGameData data, World world)
	{
		int zoneCount = data.getZonePhaseCount();
		int sizeMod = 100 / zoneCount;
		
		sendFeedback(world, sender, TextFormatting.GREEN + "Total zone phases: " + zoneCount);
		sendFeedback(world, sender, TextFormatting.GREEN + "====================================");
		
		for(int i = 1; i < zoneCount+1; i++)
		{
			double zoneArea = 100 - i*sizeMod + 5;
			sendFeedback(world, sender, TextFormatting.GREEN + "" + TextFormatting.BOLD + "Phase " + i + ":");
			sendFeedback(world, sender, TextFormatting.GREEN + "Final size : " + zoneArea + "%");
			sendFeedback(world, sender, TextFormatting.GREEN + "Map area: " + Math.abs(sqr(data.getMapSize()*2)) * (zoneArea/100) + " of " + sqr(data.getMapSize()*2) + " total blocks");
		}
	}
	
	private void sendWarningTo(ICommandSender commandSender, String message)
	{
		commandSender.sendMessage(new TextComponentString(TextFormatting.RED + "Error: " + message));
	}
	
	private void sendFeedback(World world, ICommandSender sender, String feedback)
	{
		if(PUBGMCUtil.shouldSendCommandFeedback(world))
			sender.sendMessage(new TextComponentString(TextFormatting.GRAY + feedback));
	}
	
	private void startGame(IGameData data, World world)
	{
		WorldBorder border = world.getWorldBorder();
		BlockPos center = data.getMapCenter();
		int size = data.getMapSize();
		
		BlockPos zoneCenter = new BlockPos(generateZoneCenterX(center, size - 5), 256, generateZoneCenterZ(center, size - 5));
		
		while(world.isAirBlock(zoneCenter))
		{
			zoneCenter = new BlockPos(zoneCenter.getX(), zoneCenter.getY() - 1, zoneCenter.getZ());
			if(world.getBlockState(zoneCenter).getMaterial().isLiquid())
			{
				Pubgmc.logger.info("Generating new zone center...");
				zoneCenter = new BlockPos(generateZoneCenterX(zoneCenter, size - 5), 256, generateZoneCenterZ(zoneCenter, size - 5));
			}
		}
		
		border.setCenter(zoneCenter.getX() + 0.5, zoneCenter.getZ() + 0.5);
		
		int zoneSize = size*2;
		int rx = Math.abs(center.getX() - zoneCenter.getX());
		int rz = Math.abs(center.getZ() - zoneCenter.getZ());
		int bonus = (int) (rx > rz ? rx : rz);
		
		border.setTransition(zoneSize + bonus*2);
		
		data.setTimer(0);
		
		for(EntityPlayer player : world.playerEntities)
		{
			player.sendMessage(new TextComponentString(TextFormatting.GREEN + "Available locations:"));
			if(data.getSpawnLocations().isEmpty()) player.sendMessage(new TextComponentString(TextFormatting.RED + "NONE"));
			for(int i = 0; i < data.getSpawnLocations().size(); i++)
			{
				BlockPos pos = data.getSpawnLocations().get(i);
				String locName = data.getLocationNames().get(i);
				
				player.sendMessage(new TextComponentString(TextFormatting.GREEN + " - " + TextFormatting.YELLOW + locName + TextFormatting.GREEN + "" + TextFormatting.ITALIC + " [" + pos.getX()+", "+pos.getY()+", "+pos.getZ() + "]"));
			}
			
			int id = getClosestLocation(data, world);
			BlockPos zonePos = data.getSpawnLocations().get(id);
			player.sendMessage(new TextComponentString(TextFormatting.YELLOW + "Zone is closest to the " + data.getLocationNames().get(id) + " [" + zonePos.getX() + ", " + zonePos.getZ() + "]"));
		}
	}
	
	private int generateZoneCenterX(BlockPos center, int size)
	{
		Random rand = new Random();
		int nX;
		if(rand.nextInt(2) == 1) nX = center.getX() - rand.nextInt(size);
		else nX = center.getX() + rand.nextInt(size);
		return nX;
	}
	
	private int generateZoneCenterZ(BlockPos center, int size)
	{
		Random rand = new Random();
		int nZ;
		if(rand.nextInt(2) == 1) nZ = center.getZ() - rand.nextInt(size);
		else nZ = center.getZ() + rand.nextInt(size);
		return nZ;
	}
	
	private void stopGame(IGameData data, World world)
	{
		WorldBorder border = world.getWorldBorder();
		border.setCenter(data.getMapCenter().getX() + 0.5, data.getMapCenter().getZ() + 0.5);
		border.setTransition(data.getMapSize()*2);
	}
	
	private int getClosestLocation(IGameData data, World world)
	{
		BlockPos center = new BlockPos(world.getWorldBorder().getCenterX(), 10, world.getWorldBorder().getCenterZ());

		int id = 0;
		double dist = 100000000d;
		for(int i = 0; i < data.getSpawnLocations().size(); i++)
		{
			BlockPos pos = data.getSpawnLocations().get(i);
			if(PUBGMCUtil.getDistanceToBlockPos(pos, center) < dist)
			{
				dist = PUBGMCUtil.getDistanceToBlockPos(pos, center);
				id = i;
			}
		}
		
		return id;
	}
	
	private double sqr(double num)
	{
		return num*num;
	}
	
	@Override
	public List<String> getTabCompletions(MinecraftServer server, ICommandSender sender, String[] args, BlockPos targetPos)
	{
		if(args.length == 1)
		{
			return getListOfStringsMatchingLastWord(args, completions);
		}
		
		return Collections.EMPTY_LIST;
	}
}