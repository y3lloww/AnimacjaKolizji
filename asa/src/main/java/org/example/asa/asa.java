//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.example.asa;

import java.util.Random;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class asa extends Application {
    private static final int SCENE_WIDTH = 800;
    private static final int SCENE_HEIGHT = 600;
    private static final int BALL_RADIUS = 20;
    private static final double BALL_SPEED = 1;
    private double ballX;
    private double ballY;
    private double deltaX;
    private double deltaY;
    private Circle ball;

    public asa() {
    }

    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 800.0, 600.0);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Animacja odbijania kulki");
        this.initBall();
        root.getChildren().add(this.ball);
        AnimationTimer timer = new AnimationTimer() {
            public void handle(long now) {
                asa var10000 = asa.this;
                var10000.ballX += asa.this.deltaX;
                var10000 = asa.this;
                var10000.ballY += asa.this.deltaY;
                if (asa.this.ballX - 10.0 <= 0.0 || asa.this.ballX + 20.0 >= 800.0) {
                    var10000 = asa.this;
                    var10000.deltaX *= -1.0;
                }

                if (asa.this.ballY - 10.0 <= 0.0 || asa.this.ballY + 20.0 >= 600.0) {
                    var10000 = asa.this;
                    var10000.deltaY *= -1.0;
                }

                asa.this.ball.setCenterX(asa.this.ballX);
                asa.this.ball.setCenterY(asa.this.ballY);
            }
        };
        timer.start();
        primaryStage.show();
    }

    private void initBall() {
        this.ballX = Math.random() * 500.0 + 20.0;
        this.ballY = Math.random() * 300.0 + 20.0;
        Random random = new Random();
        double angle = random.nextDouble() * 2.0 * Math.PI;
        this.deltaX = 1 * Math.cos(angle);
        this.deltaY = 1 * Math.sin(angle);
        this.ball = new Circle(this.ballX, this.ballY, 20.0, Color.YELLOW);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
