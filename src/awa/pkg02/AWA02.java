/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package awa.pkg02;

import javafx.application.Application;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
/**
 *
 * @author etudiant
 */
public class AWA02 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        Label lblValeur = new Label( " 0 " );
        Button btnInc = new Button( "Incrémenter" );
        Button btnQuitter = new Button( " Quitter ");
        
        VBox root = new VBox();
        
 
        btnInc.setOnAction(new EventHandler<ActionEvent>(){
             int valeur = 0;
                
            @Override
            public void handle(ActionEvent event) {
                valeur++;
                lblValeur.setText(""+valeur+"");
                }});
        

        btnQuitter.setOnAction(new EventHandler<ActionEvent>() {
        int a=1; 
            @Override
            public void handle(ActionEvent event) {

                 Platform.exit();

                
               
            }
        });
                
        
        Scene scene = new Scene(root, 300, 250);
        root.getChildren().add( lblValeur );
        root.getChildren().add( btnInc );
        root.getChildren().add( btnQuitter );
        
        primaryStage.setTitle("AWA-02!");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
