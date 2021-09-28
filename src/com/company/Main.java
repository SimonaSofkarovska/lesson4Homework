package com.company;

import javafx.application.Application;
import javafx.beans.property.StringProperty;
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


        //password label
        Label password = new Label("Password:");
        GridPane.setConstraints(password,0,1);

        //password input
        TextField passwordInput = new TextField();
        StringProperty password1 = passwordInput.textProperty();
        //trying to validate password
        validatePassword(password1);


        Button login = new Button("Log in");
        GridPane.setConstraints(login,1,2);
        login.setVisible(false);
        if(validatePassword(password1))
        {
            login.setVisible(true);
        }


        gridPane.getChildren().addAll(name,nameInput, password, password1, login);
        Scene scene = new Scene (gridPane, 300, 200);
        window.setScene(scene);
        window.show();
    }
    public static boolean checkPassword (String password){
        boolean hasNumber = false; boolean hasLetter = false;  char c;
        for(int i = 0; i<password.length(); i++){
            c = password.charAt(i);
            if (Character.isDigit(c)) {
                hasNumber = true;

            }
            else if (Character.isLetter(c)) {
                hasLetter = true;

            }
            if(hasNumber && hasLetter) {
                return true;
            }
        }
        return false;
    }
    public static boolean validatePassword(String password) {
        if(password.length() >= 8) {
            if(checkPassword(password)){
                return true;
            }
            else{
                return false;
            }
        }
        else {
            System.out.println("Too short");
            return false;
        }
        }
    }
}
