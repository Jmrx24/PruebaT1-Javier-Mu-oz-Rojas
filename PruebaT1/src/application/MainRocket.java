package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Font;

/**
 * Aplicaci�n hecha con JavaFX y SceneBuilder que consiste en la creaci�n de dos pantallas
 * ,la primera tiene un Log-in y que al pulsar al bot�n te lleva a otra pantalla
 * ,la cual, tiene un bot�n para cerrar la aplicaci�n.
 * @author Javier Mu�oz
 * @see ControlRocket
 * 
 * 
 */
public class MainRocket extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/view/Mars.fxml"));
			//BorderPane root = new BorderPane();
			AnchorPane root = (AnchorPane)loader.load();
			Scene scene = new Scene(root,700,600);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.setTitle("Let me in");
			scene.getStylesheets().add(
					"https://fonts.googleapis.com/css?family=Poiret%20One");
			Font.loadFont(
					getClass().getResourceAsStream(
							"/application/view/assets/PioretOne-Regular.ttf"), 20);
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
