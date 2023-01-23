package com.example.colortrees;

import com.example.colortrees.setup.Registration;
import com.example.colortrees.setup.ClientSetup;
import com.example.colortrees.setup.ModSetup;

import com.mojang.logging.LogUtils;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.api.distmarker.Dist;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("colortrees")
public class colortrees
{
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final String MODID = "colortrees";

    public colortrees()
    {
        
        Registration.init();

        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}
