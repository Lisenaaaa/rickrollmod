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

        Minecraft.getMinecraft().fontRendererObj.drawSplitString("We're no strangers to love\n" +
                "You know the rules and so do I\n" +
                "A full commitment's what I'm thinking of\n" +
                "You wouldn't get this from any other guy\n\n" +
                "I just wanna tell you how I'm feeling\n" +
                "Gotta make you understand\n\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but you're too shy to say it\n" +
                "Inside we both know what's been going on\n" +
                "We know the game and we're gonna play it\n\n" +
                "And if you ask me how I'm feeling\n" +
                "Don't tell me you're too blind to see\n\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n\n" +
                "No, I'm never gonna give you up\n" +
                "No, I'm never gonna let you down\n" +
                "No, I'll never run around and hurt you\n" +
                "Never, ever desert you\n\n" +
                "We've known each other for so long\n" +
                "Your heart's been aching but\n\n" +
                "Never gonna give you up\n" +
                "Never gonna let you down\n" +
                "Never gonna run around and desert you\n" +
                "Never gonna make you cry\n" +
                "Never gonna say goodbye\n" +
                "Never gonna tell a lie and hurt you\n\n" +
                "No, I'm never gonna give you up\n" +
                "No, I'm never gonna let you down\n" +
                "No, I'll never run around and hurt you\n" +
                "I'll never, ever desert you", 2, 2, 500, -1);

    }
}
