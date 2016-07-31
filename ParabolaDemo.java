import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polyline;

// Interpreted assignment from Swing to JavaFX.

public class ParabolaDemo extends Application {
	
	@Override
	public void start(Stage primaryStage) {
		
		//add grid to place parabola and labels
		GridPane mainPane = new GridPane();
		
		//create elemetns
		Polyline parabola = new Polyline();
		parabola.setFill(Color.WHITE);
		parabola.setStroke(Color.BLACK);
		Label lblX = new Label("Label X");
		Label lblY = new Label("Label Y");
		
		//add elements
		mainPane.add(lblX, 0, 1);
		mainPane.add(lblY, 1, 0);
		mainPane.add(parabola, 1, 1);
		
		//do math to and plot the parabola points
		double scaleFactor = 0.01;  //reduced this by x10
		Double[] points = new Double[200];
		
		for(int i = 0; i < 200 ; i++){
			int x = i-100;
			points[i] = (double)x + 200; 
			++i;
			points[i] = 200 - (scaleFactor*x*x);  //cannot cast to int.  Was that to round?


		}
		
		//add points to paraboal
		parabola.getPoints().addAll(points);
		
		//setup primary scene
		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Parabola Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
