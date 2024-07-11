 
/* 
package com.studymate.controller;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.studymate.firebase_connection.Firebaseservice;
import com.studymate.page2.page2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * LoginController manages the login UI and interactions with FirebaseService.
 */
/* 
public class Logincontroller extends Application {
    private Stage primaryStage;
    private Firebaseservice firebaseService;
    
    public void setPrimaryStageScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    public void initializeLoginScene() {
        Scene loginScene = createLoginAndSignUpScene();
        primaryStage.setScene(loginScene);
    }

    private Scene createLoginAndSignUpScene() {
        Image img = new Image("file:src/main/resources/note.jpg");
        ImageView i = new ImageView(img);
        i.setFitHeight(800);
        i.setFitWidth(1000);

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.setMaxWidth(600);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(i, layout);

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Log In");
        Button signUpButton = new Button("Sign Up");

        firebaseService = new Firebaseservice(this, emailField, passwordField);

        loginButton.setOnAction(event -> firebaseService.login());
        signUpButton.setOnAction(event -> firebaseService.signUp());

        HBox buttonBox = new HBox(10, loginButton, signUpButton);
        layout.getChildren().addAll(emailField, passwordField, buttonBox);

        return new Scene(stackPane, 800, 800);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        // Initialize Firebase App
        try {
            FileInputStream serviceAccount = new FileInputStream("src/main/resources/studymate.json");
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://studymate-ts-default-rtdb.asia-southeast1.firebasedatabase.app")
                .build();
            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Create initial login and signup scene
        Scene scene = createLoginAndSignUpScene();
        primaryStage.setTitle("STUDYMATE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void navigateToPage2() {
        page2 page = new page2();
        try {
            page.start(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
*/

package com.studymate.controller;

import java.io.FileInputStream;
import java.io.IOException;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.studymate.firebase_connection.Firebaseservice;
import com.studymate.page2.page2;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * LoginController manages the login UI and interactions with FirebaseService.
 */
public class Logincontroller extends Application {
    private Stage primaryStage;
    private Firebaseservice firebaseService;
    
    public void setPrimaryStageScene(Scene scene) {
        primaryStage.setScene(scene);
    }

    public void initializeLoginScene() {
        Scene loginScene = createLoginAndSignUpScene();
        primaryStage.setScene(loginScene);
    }

    private Scene createLoginAndSignUpScene() {
        Image img = new Image("file:src/main/resources/note.jpg");
        ImageView i = new ImageView(img);
        i.setFitHeight(800);
        i.setFitWidth(1000);

        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        layout.setMaxWidth(600);

        StackPane stackPane = new StackPane();
        stackPane.getChildren().addAll(i, layout);

        TextField emailField = new TextField();
        emailField.setPromptText("Email");

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Password");

        Button loginButton = new Button("Log In");
        Button signUpButton = new Button("Sign Up");

        firebaseService = new Firebaseservice(this, emailField, passwordField);

        loginButton.setOnAction(event -> firebaseService.login());
        signUpButton.setOnAction(event -> firebaseService.signUp());

        HBox buttonBox = new HBox(10, loginButton, signUpButton);
        layout.getChildren().addAll(emailField, passwordField, buttonBox);

        return new Scene(stackPane, 800, 800);
    }

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        // Initialize Firebase App
        try {
            FileInputStream serviceAccount = new FileInputStream("src/main/resources/studymate.json");
            FirebaseOptions options = FirebaseOptions.builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://studymate-ts-default-rtdb.asia-southeast1.firebasedatabase.app")
                .build();
            FirebaseApp.initializeApp(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Create initial login and signup scene
        Scene scene = createLoginAndSignUpScene();
        primaryStage.setTitle("STUDYMATE");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void navigateToPage2() {
        page2 page = new page2(this);
        try {
            page.start(primaryStage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateToFirebaseservice() {
        StackPane stackPane = new StackPane();
        Button logoutButton = new Button("Logout");
        stackPane.getChildren().add(logoutButton);
        logoutButton.setOnAction(event -> initializeLoginScene());
        Scene scene = new Scene(stackPane, 800, 600);
        primaryStage.setScene(scene);
    }
}

