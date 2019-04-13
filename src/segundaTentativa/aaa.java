package segundaTentativa;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.TranslateTransition; 


public class aaa extends Application {

	Image i = new Image("https://images.vexels.com/media/users/3/150030/isolated/preview/21f6aa2ebb5547cb55eab996913e3007-ilustra----o-de-nave-espacial-by-vexels.png");
	ImageView nave = new ImageView();
	Pane root = new Pane();
	public static void main(String[] args) {
		Application.launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		MouseMove man = new MouseMove();
		MouseClick click = new MouseClick();

		nave.setImage(i);
		nave.setScaleY(0.3);
		nave.setScaleX(0.3);
		stage.addEventFilter(MouseEvent.MOUSE_MOVED, man);
		stage.addEventFilter(MouseEvent.MOUSE_CLICKED, click);
		
		
		
		root.setStyle("-fx-background-color:black; -fx-padding: 40");
		Scene scn = new Scene(root, 900, 500);
		root.setStyle("-fx-background-image: url(\"https://66.media.tumblr.com/9d9545f5b7fc4c404ccdfce2b32794a8/tumblr_myl0kzevsY1stirm3o1_500.gif\");");
		root.getChildren().add(nave);
		stage.setScene(scn);
		stage.show();
		
		stage.setScene(scn);
		stage.show();
		
	}
	class MouseMove implements EventHandler<MouseEvent> {
		public void handle(MouseEvent e) {
			double x = e.getX();
			double y = e.getY();
			
			nave.relocate(x-240, y-300);
			
			
		} 
	}
	
	class MouseClick implements EventHandler<MouseEvent> {
		public void handle(MouseEvent e) {
			Rectangle r = new Rectangle(e.getX(), e.getY(), 10 , 10);
			r.setFill(Color.YELLOW);
			
			root.getChildren().add(r);

			  //Creating Translate Transition 
		      TranslateTransition translateTransition = new TranslateTransition(); 
		      
		      //Setting the duration of the transition  
		      translateTransition.setDuration(Duration.millis(500)); 
		      
		      //Setting the node for the transition 
		      translateTransition.setNode(r); 
		      
		      //Setting the value of the transition along the x axis. 
		      translateTransition.setByY(-500); 	      
		      //Setting the cycle count for the transition 
		      translateTransition.setCycleCount(1); 		      
		      //Setting auto reverse value to false 
		      translateTransition.setAutoReverse(false); 
		      //Playing the animation 
		      translateTransition.play();
		      
			
			
		} 
	}

}
