package com.zordlan.zordlanrickroll;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.IOException;

public class registering {
    @SubscribeEvent
    public void onRenderGameOverlay(final RenderGameOverlayEvent event) throws IOException {
        // fixes crosshair becoming invisible and probably other stuff
        if (event.type != RenderGameOverlayEvent.ElementType.TEXT || event.isCancelable()) {
            return;
        }
        // renders when in chat but not in F3. to make it not render in chat either just remove the !
        if ((Minecraft.getMinecraft().currentScreen != null &&
                !Minecraft.getMinecraft().ingameGUI.getChatGUI().getChatOpen()) ||
                Minecraft.getMinecraft().gameSettings.showDebugInfo) {
            return;
        }
        // use drawStringWithShadow for shadowed text
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna give you up\n", 2, 2, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna let you down\n", 2, 2, -1 ,true);

    }
}
