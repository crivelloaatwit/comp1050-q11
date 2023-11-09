package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;


public class ImageTest extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Load Image");
		StackPane sp = new StackPane();
		Image img = new Image("example.png");
		Image img1 = new Image("https://wit.edu/sites/default/files/styles/780w_520h/public/2022-03/2021_Wentworth_Sep-5613.jpg");
		ImageView imgView = new ImageView(img);
		ImageView imgView1 = new ImageView(img1);
		sp.getChildren().add(imgView);
		sp.getChildren().add(imgView1);
		Scene scene = new Scene(sp);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
