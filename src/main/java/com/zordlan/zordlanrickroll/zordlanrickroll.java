package com.zordlan.zordlanrickroll;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = zordlanrickroll.MODID, version = zordlanrickroll.VERSION)
public class zordlanrickroll
{
    public static final String MODID = "zordlanrickroll";
    public static final String VERSION = "1.0";
    @EventHandler
    public static void init(FMLInitializationEvent event){
        MinecraftForge.EVENT_BUS.register(new registering());
    }
}


