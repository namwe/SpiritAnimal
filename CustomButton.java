package com.gluonapplication;

import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;

public class CustomButton extends Button {
    private DropShadow dropShadow;

    public CustomButton() {
        dropShadow.setColor(Color.BLUE);
    }

}
