package fuzs.metalbundles.neoforge;

import fuzs.metalbundles.MetalBundles;
import fuzs.metalbundles.data.ModItemContainerProvider;
import fuzs.metalbundles.data.ModRecipeProvider;
import fuzs.metalbundles.data.client.ModLanguageProvider;
import fuzs.metalbundles.data.client.ModModelProvider;
import fuzs.puzzleslib.api.core.v1.ModConstructor;
import fuzs.puzzleslib.neoforge.api.data.v2.core.DataProviderHelper;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;

@Mod(MetalBundles.MOD_ID)
@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class MetalBundlesNeoForge {

    @SubscribeEvent
    public static void onConstructMod(final FMLConstructModEvent evt) {
        ModConstructor.construct(MetalBundles.MOD_ID, MetalBundles::new);
        DataProviderHelper.registerDataProviders(MetalBundles.MOD_ID,
                ModItemContainerProvider::new,
                ModLanguageProvider::new,
                ModModelProvider::new,
                ModRecipeProvider::new
        );
    }
}
