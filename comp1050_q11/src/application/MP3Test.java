package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaPlayer.Status;


public class MP3Test extends Application {
	MediaPlayer player;
	@Override
	public void start(Stage primaryStage) {
		final Button b = new Button("pause");
		b.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent event) 
			{
				if (player.getStatus()==Status.PAUSED) 
				{
					player.play();
					b.setText("pause");
				}
				else
				{
					player.pause();
					b.setText("play!");
				}
			}
		});
		
		final StackPane sp = new StackPane();
		sp.getChildren().add(b);
		
		player = new MediaPlayer(new Media(getClass().getResource("example.mp3").toString()));
		player.play();
		player.setCycleCount(MediaPlayer.INDEFINITE);
		
		primaryStage.setScene(new Scene(sp));
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}