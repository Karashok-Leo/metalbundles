package fuzs.metalbundles.client;

import fuzs.metalbundles.MetalBundles;
import fuzs.metalbundles.init.ModRegistry;
import fuzs.metalbundles.world.item.MetalBundleItem;
import fuzs.puzzleslib.api.client.core.v1.ClientModConstructor;
import fuzs.puzzleslib.api.client.core.v1.context.ItemModelPropertiesContext;

public class MetalBundlesClient implements ClientModConstructor {

    @Override
    public void onRegisterItemModelProperties(ItemModelPropertiesContext context) {
        context.registerItemProperty(MetalBundles.id("filled"), (itemStack, clientLevel, livingEntity, i) -> {
            return (float) MetalBundleItem.getContentWeight(itemStack) / ((MetalBundleItem) itemStack.getItem()).capacity;
        }, ModRegistry.LEATHER_BUNDLE_ITEM.get(), ModRegistry.COPPER_BUNDLE_ITEM.get(), ModRegistry.IRON_BUNDLE_ITEM.get(), ModRegistry.GOLDEN_BUNDLE_ITEM.get(), ModRegistry.DIAMOND_BUNDLE_ITEM.get(), ModRegistry.NETHERITE_BUNDLE_ITEM.get());
    }
}
