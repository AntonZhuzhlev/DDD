package application;
	
import javafx.animation.RotateTransition;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Box;
import javafx.scene.shape.Cylinder;
import javafx.scene.transform.Rotate;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		Box box = new Box();
		box.setWidth(150);
		box.setHeight(150);
		box.setDepth(150);
		box.setTranslateX(350);
		box.setTranslateY(150);
		box.setTranslateZ(50);
		PhongMaterial mtb = new PhongMaterial();
		mtb.setDiffuseColor(Color.LIGHTBLUE);
		box.setMaterial(mtb);
		RotateTransition rt = new RotateTransition();
		rt.setDuration(Duration.millis(1000));
		rt.setNode(box);
		rt.setAxis(Rotate.Y_AXIS);
		rt.setByAngle(180);
		rt.setCycleCount(50);
		Button btnStart = new Button();
		btnStart.setText("Start");
		btnStart.setLayoutX(50);
		btnStart.setLayoutY(100);
		EventHandler<javafx.scene.input.MouseEvent> ehbStart = 
				new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						rt.play();
					}
		};
		btnStart.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, ehbStart);
		Button btnStop = new Button();
		btnStop.setText("Stop");
		btnStop.setLayoutX(50);
		btnStop.setLayoutY(125);
		EventHandler<javafx.scene.input.MouseEvent> ehbStop = 
				new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						rt.stop();
					}
		};
		btnStop.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, ehbStop);
		Cylinder cylinder = new Cylinder();
		cylinder.setRadius(50);
		cylinder.setHeight(150);
		cylinder.setTranslateX(350);
		cylinder.setTranslateY(150);
		cylinder.setTranslateZ(50);
		PhongMaterial mtc = new PhongMaterial();
		mtc.setDiffuseColor(Color.DARKRED);
		cylinder.setMaterial(mtc);
		RotateTransition rtY = new RotateTransition();
		rtY.setDuration(Duration.millis(1000));
		rtY.setNode(cylinder);
		rtY.setAxis(Rotate.X_AXIS);
		rtY.setByAngle(180);
		rtY.setCycleCount(50);
		Button btnStartX = new Button();
		btnStartX.setText("startX");
		btnStartX.setLayoutX(50);
		btnStartX.setLayoutY(100);
		EventHandler<javafx.scene.input.MouseEvent> ehbstartX = 
				new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						rtY.play();
					}
		};
		btnStartX.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, ehbstartX);
		Button btnStopX = new Button();
		btnStopX.setText("stopX");
		btnStopX.setLayoutX(50);
		btnStopX.setLayoutY(125);
		EventHandler<javafx.scene.input.MouseEvent> ehbstopX = 
				new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						rtY.stop();
					}
		};
		btnStopX.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, ehbstopX);
		RotateTransition rtZ = new RotateTransition();
		rtZ.setDuration(Duration.millis(1000));
		rtZ.setNode(cylinder);
		rtZ.setAxis(Rotate.Z_AXIS);
		rtZ.setByAngle(180);
		rtZ.setCycleCount(50);
		Button btnStartZ = new Button();
		btnStartZ.setText("StartZ");
		btnStartZ.setLayoutX(100);
		btnStartZ.setLayoutY(100);
		EventHandler<javafx.scene.input.MouseEvent> ehbStartZ = 
				new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						rtZ.play();
					}
		};
		btnStartZ.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, ehbStartZ);
		Button btnStopZ = new Button();
		btnStopZ.setText("StopZ");
		btnStopZ.setLayoutX(100);
		btnStopZ.setLayoutY(125);
		EventHandler<javafx.scene.input.MouseEvent> ehbStopZ = 
				new EventHandler<javafx.scene.input.MouseEvent>() {
					@Override
					public void handle(MouseEvent arg0) {
						rtZ.stop();
					}
		};
		btnStopZ.addEventHandler(javafx.scene.input.MouseEvent.MOUSE_CLICKED, ehbStopZ);
		Group root = new Group(cylinder, btnStartX, btnStopX, btnStartZ, btnStopZ);
		Scene scene = new Scene(root, 300, 600);
		PerspectiveCamera camera = new PerspectiveCamera();
		camera.setTranslateX(0);
		camera.setTranslateY(0);
		camera.setTranslateZ(0);
		scene.setCamera(camera);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	public static void main(String[] args) {
		launch(args);
	}
}
