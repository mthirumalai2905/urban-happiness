/* 
package com.studymate.page2;

import com.google.api.services.storage.model.Bucket.Lifecycle.Rule.Action;
import com.google.cloud.storage.Acl.Group;
import com.studymate.firebase_connection.Firebaseservice;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Side;

public class page2 extends Application {
    //private Firebaseservice firebaseservice2 ;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("STUDYMATE");

        TabPane tabPane = new TabPane();
        tabPane.setSide(Side.LEFT); // Set the tabs to be displayed vertically on the left side
        tabPane.getTabs().add(createTab("First Year", "lightblue", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));
        tabPane.getTabs().add(createTab("Second Year", "lightgreen", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));
        tabPane.getTabs().add(createTab("Third Year", "lightcoral", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));
        tabPane.getTabs().add(createTab("Final Year", "lightyellow", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));

        // Increase the size of the tabs
        tabPane.setTabMinWidth(150);
        tabPane.setTabMinHeight(50);

        Scene scene = new Scene(tabPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Tab createTab(String title, String colorName, String leftImagePath, String rightImagePath) {
        Tab tab = new Tab(title);
        HBox container = createContent(title, colorName, leftImagePath, rightImagePath);
        tab.setContent(container);
        return tab;
    }

    private HBox createContent(String title, String colorName, String leftImagePath, String rightImagePath) {
        VBox vb1 = new VBox(10);
        vb1.setPadding(new Insets(10));
        vb1.setAlignment(Pos.TOP_CENTER);

        Label label1 = new Label("First Semester " + title);
        ComboBox<String> comboBox1 = new ComboBox<>();
        comboBox1.getItems().addAll("Subject 1", "Subject 2", "Subject 3", "Subject 4");
        comboBox1.setOnAction(e -> {
            String selectedSubject = comboBox1.getSelectionModel().getSelectedItem();
            System.out.println("Selected subject for " + title + " First Semester: " + selectedSubject);
        });

        Image leftImage = new Image(leftImagePath);
        BackgroundImage bgLeftImage = new BackgroundImage(leftImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
         vb1.setBackground(new Background(bgLeftImage));

        vb1.getChildren().addAll(label1, comboBox1);

        VBox vb2 = new VBox(10);
        vb2.setPadding(new Insets(10));
        vb2.setAlignment(Pos.TOP_CENTER);

        Label label2 = new Label("Second Semester " + title);
        ComboBox<String> comboBox2 = new ComboBox<>();
        comboBox2.getItems().addAll("Subject 1", "Subject 2", "Subject 3", "Subject 4");
        comboBox2.setOnAction(e -> {
            String selectedSubject = comboBox2.getSelectionModel().getSelectedItem();
            System.out.println("Selected subject for " + title + " Second Semester: " + selectedSubject);
        });

        Image rightImage = new Image(rightImagePath);
        BackgroundImage bgRightImage = new BackgroundImage(rightImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        vb2.setBackground(new Background(bgRightImage));

        vb2.getChildren().addAll(label2, comboBox2);

        
        Button next = new Button("next");
        next.setAlignment(Pos.BASELINE_CENTER);
        

        ScrollPane sp1 = new ScrollPane(vb1);
        sp1.setFitToWidth(true);
        sp1.setFitToHeight(true);
        HBox.setHgrow(sp1, Priority.ALWAYS);

        ScrollPane sp2 = new ScrollPane(vb2);
        sp2.setFitToWidth(true);
        sp2.setFitToHeight(true);
        HBox.setHgrow(sp2, Priority.ALWAYS);

        HBox container = new HBox(sp1, sp2);
        container.setSpacing(10);
        container.setAlignment(Pos.CENTER);
        container.setBackground(new Background(new BackgroundFill(Color.web(colorName), CornerRadii.EMPTY, Insets.EMPTY)));

      

        Scene sc = new Scene(container);
        sc.setFill(Color.CADETBLUE);



        return container;
    }
}
*/


/* 
package com.studymate.page2;

import com.studymate.controller.Logincontroller;
import com.studymate.firebase_connection.Firebaseservice;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Side;

public class page2 extends Application {
    private Stage primaryStage;

    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        primaryStage.setTitle("STUDYMATE");

        TabPane tabPane = new TabPane();
        tabPane.setSide(Side.LEFT); // Set the tabs to be displayed vertically on the left side
        tabPane.getTabs().add(createTab("First Year", "lightblue", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));
        tabPane.getTabs().add(createTab("Second Year", "lightgreen", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));
        tabPane.getTabs().add(createTab("Third Year", "lightcoral", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));
        tabPane.getTabs().add(createTab("Final Year", "lightyellow", "file:src/main/resources/TabVBoxBg.jpeg", "file:src/main/resources/TabVBoxBg.jpeg"));

        // Increase the size of the tabs
        tabPane.setTabMinWidth(150);
        tabPane.setTabMinHeight(50);

        Scene scene = new Scene(tabPane, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Tab createTab(String title, String colorName, String leftImagePath, String rightImagePath) {
        Tab tab = new Tab(title);
        HBox container = createContent(title, colorName, leftImagePath, rightImagePath);
        tab.setContent(container);
        return tab;
    }

    private HBox createContent(String title, String colorName, String leftImagePath, String rightImagePath) {
        VBox vb1 = new VBox(10);
        vb1.setPadding(new Insets(10));
        vb1.setAlignment(Pos.TOP_CENTER);

        Label label1 = new Label("First Semester " + title);
        ComboBox<String> comboBox1 = new ComboBox<>();
        comboBox1.getItems().addAll("Subject 1", "Subject 2", "Subject 3", "Subject 4");
        comboBox1.setOnAction(e -> {
            String selectedSubject = comboBox1.getSelectionModel().getSelectedItem();
            System.out.println("Selected subject for " + title + " First Semester: " + selectedSubject);
        });

        Image leftImage = new Image(leftImagePath);
        BackgroundImage bgLeftImage = new BackgroundImage(leftImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        vb1.setBackground(new Background(bgLeftImage));

        vb1.getChildren().addAll(label1, comboBox1);

        VBox vb2 = new VBox(10);
        vb2.setPadding(new Insets(10));
        vb2.setAlignment(Pos.TOP_CENTER);

        Label label2 = new Label("Second Semester " + title);
        ComboBox<String> comboBox2 = new ComboBox<>();
        comboBox2.getItems().addAll("Subject 1", "Subject 2", "Subject 3", "Subject 4");
        comboBox2.setOnAction(e -> {
            String selectedSubject = comboBox2.getSelectionModel().getSelectedItem();
            System.out.println("Selected subject for " + title + " Second Semester: " + selectedSubject);
        });

        Image rightImage = new Image(rightImagePath);
        BackgroundImage bgRightImage = new BackgroundImage(rightImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        vb2.setBackground(new Background(bgRightImage));

        vb2.getChildren().addAll(label2, comboBox2);

        ScrollPane sp1 = new ScrollPane(vb1);
        sp1.setFitToWidth(true);
        sp1.setFitToHeight(true);
        HBox.setHgrow(sp1, Priority.ALWAYS);

        ScrollPane sp2 = new ScrollPane(vb2);
        sp2.setFitToWidth(true);
        sp2.setFitToHeight(true);
        HBox.setHgrow(sp2, Priority.ALWAYS);

        // Create the "next" button and add it to the VBox vb1
        Button nextButton = new Button("Next");
        nextButton.setAlignment(Pos.BASELINE_CENTER);
        nextButton.setOnAction(e -> navigateToFirebaseService());
        vb1.getChildren().add(nextButton);

        HBox container = new HBox(sp1, sp2);
        container.setSpacing(10);
        container.setAlignment(Pos.CENTER);
        container.setBackground(new Background(new BackgroundFill(Color.web(colorName), CornerRadii.EMPTY, Insets.EMPTY)));

        return container;
    }

    private void navigateToFirebaseService() {
        // Instantiate Firebaseservice and use it to change the scene
        Firebaseservice firebaseService = new Firebaseservice(null, null, null); // Modify constructor if necessary
        // Create a simple scene for Firebaseservice and set it to primaryStage
        VBox layout = new VBox(10);
        layout.setAlignment(Pos.CENTER);
        Button logoutButton = new Button("Logout");
        layout.getChildren().add(logoutButton);
        
        logoutButton.setOnAction(event -> {
            // Logic to logout and navigate back to login scene
            Logincontroller loginController = new Logincontroller();
            loginController.start(primaryStage);
        });

        Scene firebaseScene = new Scene(layout, 800, 600);
        primaryStage.setScene(firebaseScene);
    }
}
*/

package com.studymate.page2;

import com.studymate.controller.Logincontroller;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.geometry.Side;

public class page2 extends Application {
    private Logincontroller loginController;

    public page2(Logincontroller loginController) {
        this.loginController = loginController;
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("STUDYMATE");

        TabPane tabPane = new TabPane();
        tabPane.setSide(Side.LEFT); // Set the tabs to be displayed vertically on the left side
        tabPane.getTabs().add(createTab("First Year", "lightblue", "file:src/main/resources/First year.jpg", "file:src/main/resources/First year.jpg"));
        tabPane.getTabs().add(createTab("Second Year", "lightgreen", "file:src/main/resources/Second year.jpg", "file:src/main/resources/Second year.jpg"));
        tabPane.getTabs().add(createTab("Third Year", "lightcoral", "file:src/main/resources/Third year.jpg", "file:src/main/resources/Third year.jpg"));
        tabPane.getTabs().add(createTab("Final Year", "lightyellow", "file:src/main/resources/Fourth Year.jpg", "file:src/main/resources/Fourth Year.jpg"));

        // Increase the size of the tabs
        tabPane.setTabMinWidth(150);
        tabPane.setTabMinHeight(50);

        // Add the "Next" button
        Button nextButton = new Button("Next");
        nextButton.setOnAction(event -> loginController.navigateToFirebaseservice());

        VBox mainLayout = new VBox(10, tabPane, nextButton);
        mainLayout.setAlignment(Pos.CENTER);
        VBox.setMargin(nextButton, new Insets(10));

        Scene scene = new Scene(mainLayout, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Tab createTab(String title, String colorName, String leftImagePath, String rightImagePath) {
        Tab tab = new Tab(title);
        HBox container = createContent(title, colorName, leftImagePath, rightImagePath);
        tab.setContent(container);
        return tab;
    }

    private HBox createContent(String title, String colorName, String leftImagePath, String rightImagePath) {
        VBox vb1 = new VBox(10);
        vb1.setPadding(new Insets(10));
        vb1.setAlignment(Pos.TOP_CENTER);

        Label label1 = new Label("First Semester " + title);
        label1.setTextFill(Color.FIREBRICK);
        label1.setStyle(" -fx-font-size: 16px;-fx-font-weight: bold;");
        ComboBox<String> comboBox1 = new ComboBox<>();
        comboBox1.getItems().addAll("Subject 1", "Subject 2", "Subject 3", "Subject 4");
        comboBox1.setOnAction(e -> {
            String selectedSubject = comboBox1.getSelectionModel().getSelectedItem();
            System.out.println("Selected subject for " + title + " First Semester: " + selectedSubject);
        });

        Image leftImage = new Image(leftImagePath);
        BackgroundImage bgLeftImage = new BackgroundImage(leftImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        vb1.setBackground(new Background(bgLeftImage));

        vb1.getChildren().addAll(label1, comboBox1);

        VBox vb2 = new VBox(10);
        vb2.setPadding(new Insets(10));
        vb2.setAlignment(Pos.TOP_CENTER);

        Label label2 = new Label("Second Semester " + title);
        label2.setTextFill(Color.DARKORANGE);
        label1.setStyle(" -fx-font-size: 16px; -fx-font-weight: bold;");
        ComboBox<String> comboBox2 = new ComboBox<>();
        comboBox2.getItems().addAll("Subject 1", "Subject 2", "Subject 3", "Subject 4");
        comboBox2.setOnAction(e -> {
            String selectedSubject = comboBox2.getSelectionModel().getSelectedItem();
            System.out.println("Selected subject for " + title + " Second Semester: " + selectedSubject);
        });

        Image rightImage = new Image(rightImagePath);
        BackgroundImage bgRightImage = new BackgroundImage(rightImage, BackgroundRepeat.NO_REPEAT, BackgroundRepeat.NO_REPEAT, BackgroundPosition.CENTER, new BackgroundSize(BackgroundSize.AUTO, BackgroundSize.AUTO, false, false, true, true));
        vb2.setBackground(new Background(bgRightImage));

        vb2.getChildren().addAll(label2, comboBox2);

        ScrollPane sp1 = new ScrollPane(vb1);
        sp1.setFitToWidth(true);
        sp1.setFitToHeight(true);
        HBox.setHgrow(sp1, Priority.ALWAYS);

        ScrollPane sp2 = new ScrollPane(vb2);
        sp2.setFitToWidth(true);
        sp2.setFitToHeight(true);
        HBox.setHgrow(sp2, Priority.ALWAYS);

        HBox container = new HBox(sp1, sp2);
        container.setSpacing(10);
        container.setAlignment(Pos.CENTER);
        container.setBackground(new Background(new BackgroundFill(Color.web(colorName), CornerRadii.EMPTY, Insets.EMPTY)));
        return container;
    }
}

