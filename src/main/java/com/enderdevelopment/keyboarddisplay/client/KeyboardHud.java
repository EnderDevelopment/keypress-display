package com.enderdevelopment.keyboarddisplay.client;

import com.enderdevelopment.keyboarddisplay.keyboard.KeyboardKey;
import com.enderdevelopment.keyboarddisplay.keyboard.KeyboardLayout;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.text.Text;

/**
 * Renders the on-screen keyboard and highlights the currently pressed keys.
 */
public class KeyboardHud {

    private static final int CELL_SIZE = 16;
    private static final int GAP = 2;
    private static final int PADDING = 4;

    private static final int KEY_COLOR = 0xCC000000 | 0x333333;
    private static final int KEY_HIGHLIGHT_COLOR = 0xFF55FF55;
    private static final int KEY_BORDER_COLOR = 0xFF888888;
    private static final int TEXT_COLOR = 0xFFFFFFFF;
    private static final int HIGHLIGHT_TEXT_COLOR = 0xFF000000;

    private boolean visible = true;

    /**
     * Toggles visibility of the on-screen keyboard.
     */
    public void toggleVisibility() {
        visible = !visible;
    }

    public boolean isVisible() {
        return visible;
    }

    /**
     * Renders the keyboard at the top-centre of the screen.
     */
    public void render(DrawContext context) {
        if (!visible) {
            return;
        }

        MinecraftClient client = MinecraftClient.getInstance();
        if (client == null || client.textRenderer == null) {
            return;
        }

        int screenWidth = context.getScaledWindowWidth();

        int columns = KeyboardLayout.COLUMNS;
        int rows = KeyboardLayout.ROWS;
        int boardWidth = columns * CELL_SIZE + (columns - 1) * GAP + PADDING * 2;
        int boardHeight = rows * CELL_SIZE + (rows - 1) * GAP + PADDING * 2;

        int originX = (screenWidth - boardWidth) / 2;
        int originY = PADDING + 2;

        // Draw the board background.
        context.fill(originX, originY, originX + boardWidth, originY + boardHeight, 0xCC000000);

        TextRenderer textRenderer = client.textRenderer;

        for (KeyboardKey key : KeyboardLayout.keys()) {
            int x = originX + PADDING + key.col() * (CELL_SIZE + GAP);
            int y = originY + PADDING + key.row() * (CELL_SIZE + GAP);
            int w = key.width() * (CELL_SIZE + GAP) - GAP;
            int h = CELL_SIZE;

            boolean pressed = key.isPressed();

            int fill = pressed ? KEY_HIGHLIGHT_COLOR : KEY_COLOR;
            context.fill(x, y, x + w, y + h, fill);

            // Draw a subtle border.
            context.fill(x, y, x + w, y + 1, KEY_BORDER_COLOR);
            context.fill(x, y, x + 1, y + h, KEY_BORDER_COLOR);

            // Centered label.
            int textX = x + (w - textRenderer.getWidth(key.label())) / 2;
            int textY = y + (h - 8) / 2;
            context.drawText(
                    textRenderer,
                    Text.literal(key.label()),
                    textX,
                    textY,
                    pressed ? HIGHLIGHT_TEXT_COLOR : TEXT_COLOR,
                    !pressed
            );
        }
    }
}
