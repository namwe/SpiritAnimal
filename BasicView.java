package com.gluonapplication;

import com.gluonhq.charm.glisten.control.AppBar;
import com.gluonhq.charm.glisten.control.Icon;
import com.gluonhq.charm.glisten.mvc.View;
import com.gluonhq.charm.glisten.visual.MaterialDesignIcon;
import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.awt.*;
import java.util.*;

public class BasicView extends View {
    private GridPane base;
    private Button answer1,answer2,answer3,answer4;
    private Image image;
    private Map<String, Set<Integer>> animalDataStructure = new HashMap<>();
    private AppBar appBar;
    private Scene scene;

    @Override
    protected void updateAppBar(AppBar ab) {
        appBar = ab;
        run();
       /* appBar.setNavIcon(MaterialDesignIcon.MENU.button(e -> System.out.println("Menu")));
        appBar.setTitleText("Basic View");
        appBar.getActionItems().add(MaterialDesignIcon.SEARCH.button(e -> System.out.println("Search")));

        */

    }

    private void run() {
        answer1 = new Button("One");
        answer2 = new Button("Two");
        answer3 = new Button("Three");
        answer4 = new Button("Four");

        answer1.setPrefSize(350,100);
        answer2.setPrefSize(350,100);
        answer3.setPrefSize(350,100);
        answer4.setPrefSize(350,100);

        answer1.setId("Gorilla");
        answer2.setId("Delfin");
        answer3.setId("Jaguar");
        answer4.setId("Hund");

        image = new Image("https://i.imgur.com/XjeUFzM.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(200);
        imageView.setFitWidth(330);
        VBox vBox = new VBox();
        vBox.getChildren().add(imageView);


        // Button test = new CustomButton();



        base = new GridPane();
        base.setHgap(70);
        base.setVgap(100);
        base.add(answer1, 0, 0);
        base.add(answer2,1,0);
        base.add(answer3,0,1);
        base.add(answer4,1,1);
        // base.add(test,2,2);

        // VBox controls = new VBox(15.0, label, button);
        base.setAlignment(Pos.CENTER);
        vBox.setAlignment(Pos.TOP_CENTER);

        setCenter(base);
        setTop(vBox);

        appBar.setTitleText("                       Pick one trait");
        answer1.setOnAction(this::pressedButton);
        answer2.setOnAction(this::pressedButton);
        answer3.setOnAction(this::pressedButton);
        answer4.setOnAction(this::pressedButton);
    }

    private void pressedButton(ActionEvent event) {
        Button pressedButton = (Button) event.getSource();
        String djurNamn = pressedButton.getId();
        Set<Integer> temp = animalDataStructure.get(djurNamn);
        if (temp == null) {
            temp = new HashSet<>();
        }

        temp.add(1);

        switch (djurNamn) {
            case "Gorilla":
                animalDataStructure.put("Gorilla", temp);
                break;
            case "Delfin":
               // temp.add(1);
                animalDataStructure.put("Delfin", temp);
                break;
            case "Jaguar":
               // temp.add(1);
                animalDataStructure.put("Jaguar", temp);
                break;
            case "Hund":
               // temp.add(1);
                animalDataStructure.put("Hund", temp);
                break;
        }

        System.out.println(animalDataStructure.toString());


    }

}
