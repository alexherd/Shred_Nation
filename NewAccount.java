import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class NewAccount extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		// GridPane
		GridPane root = new GridPane();
		root.setAlignment(Pos.CENTER);
		root.setHgap(5);
		root.setVgap(5);

		// Title
		Text title = new Text("Create Account");
		root.add(title, 0, 0, 2, 1);

		// User Name Label
		Label userName = new Label("User Name:");
		root.add(userName, 0, 1);

		// User Name TextField
		TextField tfUserName = new TextField();
		root.add(tfUserName, 1, 1);

		// Password Label
		Label password = new Label("Password:");
		root.add(password, 0, 2);

		// PasswordField
		PasswordField pfPassword = new PasswordField();
		root.add(pfPassword, 1, 2);

		// Password Confirm Label
		Label passwordConf = new Label("Confirm:");
		root.add(passwordConf, 0, 3);
		
		// PasswordField Confirm
		PasswordField pfPasswordConf = new PasswordField();
		root.add(pfPasswordConf, 1, 3);

		// Log in Button
		Button btnCreate = new Button("Create");
		Button btnCancel = new Button("Cancel");

		// HBox for buttons
		HBox hbBtns = new HBox(5);
		hbBtns.setAlignment(Pos.BOTTOM_RIGHT);
		hbBtns.getChildren().addAll(btnCreate, btnCancel);
		root.add(hbBtns, 1, 4);

		// Usual Shit
		Scene sceneNew = new Scene(root, 350, 300);
		primaryStage.setTitle("Shred Nation");
		primaryStage.setScene(sceneNew);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
