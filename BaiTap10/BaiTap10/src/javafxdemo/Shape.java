/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxdemo;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author admin
 */
public class Shape extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
//        StackPane pane = new StackPane();
        
//        Text txt = new Text("Welcome to JAVAFX");
//        txt.setFill(Color.BLUE);
//        txt.setStroke(Color.YELLOW);
       // txt.setStrokeWidth(5);
        
//        Font font = Font.font("Tahoma", FontWeight.BOLD, 30);
//        txt.setFont(font);
//        Line l = new Line(20, 50, 200, 150);
        
//        Rectangle rect = new Rectangle(30, 50, 250, 150);
//        rect.setFill(Color.RED);
//        rect.setStroke(Color.BROWN);
//        rect.setArcWidth(50);
//        rect.setArcHeight(100);

//        Circle circle = new Circle(100, 200, 100, Color.AQUAMARINE);
//        Ellipse e = new Ellipse(100, 150, 150, 80);
//        e.setFill(Color.BLANCHEDALMOND);
//        
//        pane.getChildren().add(e);
//        
//        Scene scene = new Scene(pane, 500, 300);
//        primaryStage.setTitle("Hello");
//        primaryStage.setScene(scene);
//        primaryStage.show();

        Pane pane = new Pane();

//        int[] rotates = {45, 90, 120, 180};
//        for (int rotate: rotates) {
//            Ellipse e = new Ellipse(120, 90, 80, 30);
//            e.setFill(null);
//            e.setStroke(Color.BLUE);
//            e.setStrokeWidth(3);
//            e.setRotate(rotate);
//
//            pane.getChildren().add(e);
//        }

//        Circle c = new Circle(120, 90, 80);
//        c.setFill(null);
//        c.setStroke(Color.RED);
//        c.setStrokeWidth(3);

        Arc arc = new Arc(150, 200, 100, 100, 0, -60);
        arc.setType(ArcType.ROUND);
        arc.setFill(Color.BLUE);

        pane.getChildren().add(arc);

        Scene scene = new Scene(pane, 500, 300);
        primaryStage.setTitle("Hello");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args) {
        Application.launch();
    }
}
