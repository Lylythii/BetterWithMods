package betterwithmods.manual.api.prefab.manual;

import betterwithmods.manual.api.manual.TabIconRenderer;
import betterwithmods.manual.api.util.RenderUtil;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

/**
 * Simple implementation of a tab icon renderer using an item stack as its graphic.
 */
@SuppressWarnings("UnusedDeclaration")
public class ItemStackTabIconRenderer implements TabIconRenderer {
    private final ItemStack stack;

    public ItemStackTabIconRenderer(final ItemStack stack) {
        this.stack = stack;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public void render() {
        GlStateManager.enableRescaleNormal();
        RenderUtil.ignoreLighting();
        RenderHelper.enableGUIStandardItemLighting();
        Minecraft.getMinecraft().getRenderItem().renderItemAndEffectIntoGUI(stack, 0, 0);
        RenderHelper.disableStandardItemLighting();
    }
}
