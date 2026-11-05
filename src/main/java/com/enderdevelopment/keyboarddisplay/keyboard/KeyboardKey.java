package com.enderdevelopment.keyboarddisplay.keyboard;

import net.minecraft.client.util.InputUtil;

/**
 * A single physical key on the on-screen keyboard.
 *
 * @param label    The text drawn on the key.
 * @param keycode  The GLFW key code used to check whether this key is pressed.
 * @param col      Zero-based column on the layout grid.
 * @param row      Zero-based row on the layout grid.
 * @param width    Width of the key in grid cells (used for wider keys like Space).
 */
public record KeyboardKey(String label, int keycode, int col, int row, int width) {

    /**
     * Convenience factory for a single-cell key.
     */
    public static KeyboardKey key(String label, int keycode, int col, int row) {
        return new KeyboardKey(label, keycode, col, row, 1);
    }

    /**
     * Whether this key is currently held down using raw GLFW key state.
     */
    public boolean isPressed() {
        return InputUtil.isKeyPressed(
                InputUtil.Type.KEYSYM,
                keycode
        );
    }
}
