package com.company;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.awt.*;

public class Main extends Application {
    Stage window;

    public static void main(String[] args) {
	// write your code here
    }
    @Override
    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("Login screen");
        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        //name label
        Label name = new Label("Username:");
        GridPane.setConstraints(name,0,0);

        //name input
        TextField nameInput = new TextField();
        System.out.println(nameInput.getText());
        nameInput.setPromptText("username");
       // GridPane.setConstraints(nameInput,1,0);

        //password label
        Label password = new Label("Password:");
        GridPane.setConstraints(password,0,1);

        //password input
        TextField passwordInput = new TextField();
        String password1 = passwordInput.getText();
       // password.setPromptText("password");
       // GridPane.setConstraints(passwordInput,1,1);

        Button login = new Button("Log in");
        GridPane.setConstraints(login,1,2);

        gridPane.getChildren().addAll(name,nameInput, password, passwordInput, login);
        Scene scene = new Scene (gridPane, 300, 200);
        window.setScene(scene);
        window.show();
    }
}
