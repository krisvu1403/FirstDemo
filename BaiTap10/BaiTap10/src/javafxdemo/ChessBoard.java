/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class ChessBoard extends Application {
    private final double WIDTH = 50;
    private final int SIZE = 8;

    @Override
    public void start(Stage primaryStage) throws Exception {
        GridPane pane = new GridPane();
        pane.setAlignment(Pos.CENTER);
        
        for (int i = 0; i < SIZE; i++) 
            for (int j = 0; j < SIZE; j++) {
                Rectangle rect = new Rectangle(WIDTH, WIDTH);
                if ((i + j) % 2 == 0)
                    rect.setFill(Color.WHITE);
                else
                    rect.setFill(Color.BLACK);
                
                pane.add(rect, j, i);
            }
        
        
        Scene scene = new Scene(pane, WIDTH * SIZE, WIDTH * SIZE);
        
        primaryStage.setTitle("Chessboard");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch();
    }
}
