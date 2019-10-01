package dad.bindings.dimensiones;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DimensionesApp extends Application {
	private Label alturaLabel;
	private Label anchoLabel;
	private Label areaLabel;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		alturaLabel = new Label();
		anchoLabel = new Label();
		areaLabel = new Label();
		
		VBox root = new VBox(5, alturaLabel, anchoLabel, areaLabel);
		root.setFillWidth(false);
		root.setAlignment(Pos.CENTER);
		
		Scene scene = new Scene(root, 320, 200);
		
		DoubleProperty altura = new SimpleDoubleProperty();
		altura.bind(scene.heightProperty());
		DoubleProperty ancho = new SimpleDoubleProperty();
		ancho.bind(scene.widthProperty());
		DoubleProperty area = new SimpleDoubleProperty();
		area.bind(altura.multiply(ancho));
		
		alturaLabel.textProperty().bind(Bindings.concat("La altura es ", altura));
		anchoLabel.textProperty().bind(Bindings.concat("El ancho es ", ancho));
		areaLabel.textProperty().bind(Bindings.concat("El area es ", area));
		
		primaryStage.setTitle("DimensionesApp");
		primaryStage.setScene(scene);
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
