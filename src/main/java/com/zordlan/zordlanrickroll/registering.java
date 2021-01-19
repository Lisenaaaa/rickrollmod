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
        Minecraft.getMinecraft().fontRendererObj.drawString("We're no strangers to love", 2, 2, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("You know the rules and so do I", 2, 12, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("A full commitment's what I'm thinking of", 2, 22, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("You wouldn't get this from any other guy", 2, 32, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("I just wanna tell you how I'm feeling", 2, 44, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Gotta make you understand", 2, 54, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna give you up", 2, 66, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna let you down", 2, 76, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna run around and desert you", 2, 86, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna make you cry", 2, 96, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna say goodbye", 2, 106, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna tell a lie and hurt you", 2, 116, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("We've known each other for so long", 2, 128, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Your heart's been aching but you're too shy to say it", 2, 138, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Inside we both know what's been going on", 2, 148, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("We know the game and we're gonna play it", 2, 158, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("And if you ask me how I'm feeling", 2, 170, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Don't tell me you're too blind to see", 2, 180, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna give you up", 2, 192, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna let you down", 2, 202, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna run around and desert you", 2, 212, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna make you cry", 2, 222, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna say goodbye", 2, 232, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("Never gonna tell a lie and hurt you", 2, 242, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("No, I'm never gonna give you up", 2, 256, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("No, I'm never gonna let you down", 2, 266, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("No, I'll never run around and hurt you", 2, 276, -1 ,true);
        Minecraft.getMinecraft().fontRendererObj.drawString("I'll never, ever desert you", 2, 286, -1 ,true);
    }
}
