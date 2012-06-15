package com.modulefx.test.view;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class App extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        
        BorderPane borderPane = new BorderPane();

        String fxmlUri = "fxml/main/Main.fxml";
        
        //load the Main.fxml layout
        Parent root = loadFxml(fxmlUri);

        //load the styleSheet of the project
        Scene scene = new Scene(root);
        scene.getStylesheets().add(Activator.class.getClassLoader().getResource("css/test.css").toString());

        primaryStage.setScene(scene);
        //TODO change to a properties value
        primaryStage.setTitle("ModuleFX");
        primaryStage.show();
    }

    private Parent loadFxml(String fxmlUri) {
        try {
            
            //set the osgi ClassLoader to the FXMLLoader.
            FXMLLoader.setDefaultClassLoader(Activator.class.getClassLoader());
            return FXMLLoader.load(getClass().getClassLoader().getResource(fxmlUri));

        } catch (IOException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
