import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;

public class ShowLine extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		Scene scene = new Scene(new LinePane(), 200, 200);
		primaryStage.setTitle("ShowLine");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
