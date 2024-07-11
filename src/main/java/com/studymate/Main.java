package com.studymate;



import com.studymate.controller.Logincontroller;
import com.studymate.firebase_connection.Firebaseservice;
import com.studymate.page2.page2;
import com.studymate.secondpage.secondpage;

import javafx.application.Application;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Application.launch(Logincontroller.class,args);
    }
}