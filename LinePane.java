import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

class LinePane extends Pane {
	public LinePane() {
		Line line1 = new Line(30,30,30,30);
		line1.endXProperty().bind(widthProperty().subtract(30));
		line1.endYProperty().bind(heightProperty().subtract(30));
		line1.setStrokeWidth(5);
		line1.setStroke(Color.GREEN);
		getChildren().add(line1);
		
		Line line2 = new Line(0,0,0,0);
		line2.startXProperty().bind(widthProperty().subtract(10));
		line2.endYProperty().bind(heightProperty().subtract(10));
		line2.setStrokeWidth(5);
		line2.setStroke(Color.GREEN);
		getChildren().add(line2);
	}
}