package your.package;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.util.ResourceLocation;

public class GuiButtonName extends GuiButton
{
	
    protected static final ResourceLocation CustomButtons = new ResourceLocation("directory/buttons.png");
	
    public GuiButtonName(int buttonID, int xPos, int yPos)
    {
        super(buttonID, xPos, yPos, 73, 20, "");
    }

    /**
     * Draws this button to the screen.
     */
    public void drawButton(Minecraft mc, int mouseX, int mouseY)
    {
        if (this.visible)
        {
            mc.getTextureManager().bindTexture(CustomButtons);
            GlStateManager.color(1.0F, 1.0F, 1.0F, 1.0F);
            boolean flag = mouseX >= this.xPosition && mouseY >= this.yPosition && mouseX < this.xPosition + this.width && mouseY < this.yPosition + this.height;
            // Y axis of image Location \|/
            int i = 0;

            if (flag)
            {
                i += this.height;
            }

            this.drawTexturedModalRect(this.xPosition, this.yPosition, 0, i, this.width, this.height);
        }
    }
}
