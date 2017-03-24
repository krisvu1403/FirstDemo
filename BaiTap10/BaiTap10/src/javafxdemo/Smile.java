/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class Smile extends Application {
    private final double HEAD_RADIUS = 150;
    private final double EYE_RADIUS = 15;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane = new Pane();
        
        Circle circle = new Circle(250, 200, HEAD_RADIUS, Color.YELLOW);
        
        double x = circle.getCenterX();
        double y = circle.getCenterY();
        Circle c1 = new Circle(x - HEAD_RADIUS/3, y - 2 * HEAD_RADIUS/3 + 15, EYE_RADIUS, Color.BLUE);
        Circle c2 = new Circle(x + HEAD_RADIUS/3, y - 2 * HEAD_RADIUS/3 + 15, EYE_RADIUS, Color.BLUE);
        
        Arc arc = new Arc(x, y, 2*HEAD_RADIUS/3, 2*HEAD_RADIUS/3, -30, -120);
        arc.setFill(null);
        arc.setStroke(Color.RED);
        arc.setStrokeWidth(5);
        
        pane.getChildren().addAll(circle, c1, c2, arc);
        
        Scene scene = new Scene(pane, 500, 400);
        primaryStage.setTitle("Smile");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch();
    }
}
