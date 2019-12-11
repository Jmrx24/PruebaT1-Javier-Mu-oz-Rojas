package application;

import javafx.animation.FadeTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

public class ControlRocket {
	/**
	 * Método que permite abrir la segunda pantalla al pulsar el boton Let me in.
	 */
	@FXML
	public void openStage() 
	{
		try {
			Parent p= FXMLLoader.load(getClass().getResource("/application/view/Urano.fxml"));
			Stage s= new Stage();
			Scene sce=new Scene(p);
			s.setScene(sce);
			s.initStyle(StageStyle.UNDECORATED);
			s.show();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	/**
	 * Método que permite cerrar la aplicación
	 */
	public void closeApp()
	{
		System.exit(0);
	}
}
