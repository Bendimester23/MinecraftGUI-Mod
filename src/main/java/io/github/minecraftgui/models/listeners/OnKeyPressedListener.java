package io.github.minecraftgui.models.listeners;

import io.github.minecraftgui.controllers.KeyBoard;
import io.github.minecraftgui.models.components.Component;

/**
 * Created by Samuel on 2015-11-21.
 */
public interface OnKeyPressedListener {

    void onKeyPressed(Component component, KeyBoard keyBoard);

}
