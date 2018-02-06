package com.github.skyhawkb.insultgen.pc;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();

        Scene mainScene = new Scene(root, 500, 452);
        primaryStage.setTitle("Insult Generator v1.2");
        primaryStage.setScene(mainScene);
        primaryStage.setMaxHeight(452);
        primaryStage.setMaxWidth(500);
        primaryStage.setMinHeight(452);
        primaryStage.setMinWidth(500);

        Text insult = new Text(50, 70, "");
        insult.setText(InsultDictionary.getInsult());
        insult.setId("print");
        insult.setFont(Font.font("Helvetica", 48d));
        insult.setFill(Color.BLACK);
        insult.setWrappingWidth(400d);
        insult.setTextAlignment(TextAlignment.CENTER);

        Text reset = new Text(50, 350, "");
        reset.setText("GET ANOTHA ONE");
        reset.setFont(Font.font("Helvetica", 48d));
        reset.setFill(Color.RED);
        reset.setWrappingWidth(400d);
        reset.setTextAlignment(TextAlignment.CENTER);
        reset.setOnMouseClicked(event -> {
            Text edit = (Text) mainScene.lookup("#print");
            edit.setText(InsultDictionary.getInsult());
        });

        Text credits = new Text(50, 400, "");
        credits.setText("CREDITS");
        credits.setFont(Font.font("Helvetica", 48d));
        credits.setFill(Color.GREEN);
        credits.setWrappingWidth(400d);
        credits.setTextAlignment(TextAlignment.CENTER);
        credits.setOnMouseClicked(event -> {
            Text edit = (Text) mainScene.lookup("#print");
            edit.setText("Made by:\nDaniel Meylakh\nIdea by:\nEthan Adams.");
        });

        root.getChildren().add(insult);
        root.getChildren().add(reset);
        root.getChildren().add(credits);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
