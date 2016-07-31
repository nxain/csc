import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;


public class BorderLayoutDemo extends Application {

	//@Override
	public void start(Stage primaryStage){
		
		//create the border pane as the main scene on the stage
		BorderPane mainPane = new BorderPane();
		mainPane.setMaxWidth(227);  //why do I need to do this?  There is much extra space in the auto-sized frame
		
		//create two sub frames using flow frame
		FlowPane pane1 = new FlowPane();
		pane1.setHgap(5);
		pane1.setVgap(5);
		pane1.setPadding(new Insets(5,5,5,5));
		
		FlowPane pane2 = new FlowPane();
		pane2.setPadding(new Insets(5,5,5,5));
		pane2.setHgap(5);
		pane2.setVgap(5);
		
		//add buttons to sub-panes
		pane1.getChildren().addAll(new Button("Butotn 1"), new Button("Button 2"), new Button("Button 3"));
		pane2.getChildren().addAll(new Button("Butotn 4"), new Button("Button 5"), new Button("Button 6"));
		
		//add elements to mainFrme
		mainPane.setBottom(pane1);
		mainPane.setCenter(pane2);

		//create and show scene
		Scene scene = new Scene(mainPane);
		primaryStage.setTitle("Border Layout Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}
}
