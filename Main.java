import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

public class Main extends Application {

  @Override
  public void start(Stage stage) {
    Group root = new Group();
    Scene scene = new Scene(root, 260, 80);
    stage.setScene(scene);

    Group g = new Group();

    Polyline polyline = new Polyline();
    
    Double[] test = {0.0, 0.0,20.0, 10.0,10.0, 20.0};
    
    polyline.getPoints().addAll(test);

    
    g.getChildren().add(polyline);
    
    scene.setRoot(g);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}