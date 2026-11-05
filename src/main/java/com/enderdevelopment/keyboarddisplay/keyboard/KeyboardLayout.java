package com.enderdevelopment.keyboarddisplay.keyboard;

import org.lwjgl.glfw.GLFW;

import java.util.List;

/**
 * Defines the visual layout of the on-screen keyboard and the GLFW key codes
 * that are watched to highlight pressed keys.
 */
public final class KeyboardLayout {

    public static final int ROWS = 5;
    public static final int COLUMNS = 16;

    private static final List<KeyboardKey> KEY_LIST = List.of(
            // Row 0
            KeyboardKey.key("`",  GLFW.GLFW_KEY_GRAVE_ACCENT, 0, 0),
            KeyboardKey.key("1",  GLFW.GLFW_KEY_1, 1, 0),
            KeyboardKey.key("2",  GLFW.GLFW_KEY_2, 2, 0),
            KeyboardKey.key("3",  GLFW.GLFW_KEY_3, 3, 0),
            KeyboardKey.key("4",  GLFW.GLFW_KEY_4, 4, 0),
            KeyboardKey.key("5",  GLFW.GLFW_KEY_5, 5, 0),
            KeyboardKey.key("6",  GLFW.GLFW_KEY_6, 6, 0),
            KeyboardKey.key("7",  GLFW.GLFW_KEY_7, 7, 0),
            KeyboardKey.key("8",  GLFW.GLFW_KEY_8, 8, 0),
            KeyboardKey.key("9",  GLFW.GLFW_KEY_9, 9, 0),
            KeyboardKey.key("0",  GLFW.GLFW_KEY_0, 10, 0),
            KeyboardKey.key("-",  GLFW.GLFW_KEY_MINUS, 11, 0),
            KeyboardKey.key("=",  GLFW.GLFW_KEY_EQUAL, 12, 0),
            new KeyboardKey("Bksp", GLFW.GLFW_KEY_BACKSPACE, 13, 0, 3),

            // Row 1
            new KeyboardKey("Tab", GLFW.GLFW_KEY_TAB, 0, 1, 2),
            KeyboardKey.key("Q", GLFW.GLFW_KEY_Q, 2, 1),
            KeyboardKey.key("W", GLFW.GLFW_KEY_W, 3, 1),
            KeyboardKey.key("E", GLFW.GLFW_KEY_E, 4, 1),
            KeyboardKey.key("R", GLFW.GLFW_KEY_R, 5, 1),
            KeyboardKey.key("T", GLFW.GLFW_KEY_T, 6, 1),
            KeyboardKey.key("Y", GLFW.GLFW_KEY_Y, 7, 1),
            KeyboardKey.key("U", GLFW.GLFW_KEY_U, 8, 1),
            KeyboardKey.key("I", GLFW.GLFW_KEY_I, 9, 1),
            KeyboardKey.key("O", GLFW.GLFW_KEY_O, 10, 1),
            KeyboardKey.key("P", GLFW.GLFW_KEY_P, 11, 1),
            KeyboardKey.key("[", GLFW.GLFW_KEY_LEFT_BRACKET, 12, 1),
            KeyboardKey.key("]", GLFW.GLFW_KEY_RIGHT_BRACKET, 13, 1),
            KeyboardKey.key("\\", GLFW.GLFW_KEY_BACKSLASH, 14, 1, 2),

            // Row 2
            new KeyboardKey("Caps", GLFW.GLFW_KEY_CAPS_LOCK, 0, 2, 2),
            KeyboardKey.key("A", GLFW.GLFW_KEY_A, 2, 2),
            KeyboardKey.key("S", GLFW.GLFW_KEY_S, 3, 2),
            KeyboardKey.key("D", GLFW.GLFW_KEY_D, 4, 2),
            KeyboardKey.key("F", GLFW.GLFW_KEY_F, 5, 2),
            KeyboardKey.key("G", GLFW.GLFW_KEY_G, 6, 2),
            KeyboardKey.key("H", GLFW.GLFW_KEY_H, 7, 2),
            KeyboardKey.key("J", GLFW.GLFW_KEY_J, 8, 2),
            KeyboardKey.key("K", GLFW.GLFW_KEY_K, 9, 2),
            KeyboardKey.key("L", GLFW.GLFW_KEY_L, 10, 2),
            KeyboardKey.key(";", GLFW.GLFW_KEY_SEMICOLON, 11, 2),
            KeyboardKey.key("'", GLFW.GLFW_KEY_APOSTROPHE, 12, 2),
            new KeyboardKey("Enter", GLFW.GLFW_KEY_ENTER, 13, 2, 3),

            // Row 3
            new KeyboardKey("LShift", GLFW.GLFW_KEY_LEFT_SHIFT, 0, 3, 3),
            KeyboardKey.key("Z", GLFW.GLFW_KEY_Z, 3, 3),
            KeyboardKey.key("X", GLFW.GLFW_KEY_X, 4, 3),
            KeyboardKey.key("C", GLFW.GLFW_KEY_C, 5, 3),
            KeyboardKey.key("V", GLFW.GLFW_KEY_V, 6, 3),
            KeyboardKey.key("B", GLFW.GLFW_KEY_B, 7, 3),
            KeyboardKey.key("N", GLFW.GLFW_KEY_N, 8, 3),
            KeyboardKey.key("M", GLFW.GLFW_KEY_M, 9, 3),
            KeyboardKey.key(",", GLFW.GLFW_KEY_COMMA, 10, 3),
            KeyboardKey.key(".", GLFW.GLFW_KEY_PERIOD, 11, 3),
            KeyboardKey.key("/", GLFW.GLFW_KEY_SLASH, 12, 3),
            new KeyboardKey("RShift", GLFW.GLFW_KEY_RIGHT_SHIFT, 13, 3, 3),

            // Row 4 (modifiers + wide space)
            new KeyboardKey("Ctrl", GLFW.GLFW_KEY_LEFT_CONTROL, 0, 4, 2),
            new KeyboardKey("Win", GLFW.GLFW_KEY_LEFT_SUPER, 2, 4, 2),
            new KeyboardKey("Alt", GLFW.GLFW_KEY_LEFT_ALT, 4, 4, 2),
            new KeyboardKey("Space", GLFW.GLFW_KEY_SPACE, 6, 4, 4),
            new KeyboardKey("Alt", GLFW.GLFW_KEY_RIGHT_ALT, 10, 4, 2),
            new KeyboardKey("Win", GLFW.GLFW_KEY_RIGHT_SUPER, 12, 4, 2),
            new KeyboardKey("Fn", GLFW.GLFW_KEY_RIGHT_CONTROL, 14, 4, 2)
    );

    private KeyboardLayout() {
    }

    public static List<KeyboardKey> keys() {
        return KEY_LIST;
    }
}
