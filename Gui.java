import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Gui extends Application {
	Button addMusic, editMusic, delMusic, scanMusic, rateMusic, sortMusic,
	addProfile, delProfile, viewProfile, compProfile;
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		//Root Node
		BorderPane root = new BorderPane();
		
		//MenuBar
		MenuBar menuBar = new MenuBar();
		
		//Menu1
		Menu file = new Menu("File");
		
		//Menu Items
		MenuItem itmNew = new MenuItem("New");
		MenuItem itmDel = new MenuItem("Delete");
		MenuItem itmView = new MenuItem("View");
		MenuItem itmLogOut = new MenuItem("Log Out");
		
		//Menu2
		Menu options = new Menu("Options");
		
		//Menu Items
		MenuItem itmCustom = new MenuItem("Customize");
		
		//Menu3
		Menu help = new Menu("Help");
		
		//Menu Items
		MenuItem itmChanges = new MenuItem("Changes");
		
		//Add MenuItems to Menus
		file.getItems().addAll(itmNew,itmDel,itmView,itmLogOut);
		options.getItems().add(itmCustom);
		help.getItems().add(itmChanges);
		
		//Add Menus to MenuBar
		menuBar.getMenus().addAll(file,options,help);
		
		//TabPane
		TabPane tabPane = new TabPane();
		tabPane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
		
		//Music Tab
		Tab tabMusic = new Tab();
		tabMusic.setText("Music");
		
		//Music Tab Layout
		BorderPane paneMusic = new BorderPane();
		
		//Add label to layout
		Label labelMusic = new Label();
		labelMusic.setText("Music stuff shows here.");
		paneMusic.setCenter(labelMusic);
		
		//Music Buttons
		addMusic = new Button("Add");
		editMusic = new Button("Edit");
		delMusic = new Button("Delete");
		scanMusic = new Button("Scan");
		rateMusic = new Button("Rate");
		sortMusic = new Button("Sort");
				
		//NEW! Button Event Handlers NEW!
		//add Event Handlers to buttons
		addMusic.setOnAction(new AddMusicHandler());
		editMusic.setOnAction(new EditMusicHandler());
		delMusic.setOnAction(new DelMusicHandler());
		scanMusic.setOnAction(new ScanMusicHandler());
		rateMusic.setOnAction(new RateMusicHandler());
		sortMusic.setOnAction(new SortMusicHandler());
		
		//GridPane for Music
		GridPane gridMusic = new GridPane();
		gridMusic.setHgap(5);
		gridMusic.setVgap(5);
		gridMusic.setPadding(new Insets(10, 10, 10, 10));
		gridMusic.setAlignment(Pos.CENTER);
		
		//Add buttons to gridMusic
		gridMusic.add(addMusic, 0, 0);
		gridMusic.add(editMusic, 0, 1);
		gridMusic.add(delMusic, 0, 2);
		gridMusic.add(scanMusic, 1, 0);
		gridMusic.add(rateMusic, 1, 1);
		gridMusic.add(sortMusic, 1, 2);
		paneMusic.setRight(gridMusic);
		
		//Add layout to music tab
		tabMusic.setContent(paneMusic);
		
		//Profile Tab
		Tab tabProfile = new Tab();
		tabProfile.setText("Profile");
		
		//Profile Tab Layout
		BorderPane paneProfile = new BorderPane();
		
		//Add label to Profile layout
		Label labelProfile = new Label();
		labelProfile.setText("Profile stuff shows here.");
		paneProfile.setCenter(labelProfile);
		
		//Profile Buttons
		addProfile = new Button("Add");
		delProfile = new Button("Delete");
		viewProfile = new Button("View");
		compProfile = new Button("Compare");
		
		//GridPane for Profile
		GridPane gridProfile = new GridPane();
		gridProfile.setHgap(5);
		gridProfile.setVgap(5);
		gridProfile.setPadding(new Insets(10, 10, 10, 10));
		gridProfile.setAlignment(Pos.CENTER);
		
		//Add Buttons to gridProfile
		gridProfile.add(addProfile, 0, 0);
		gridProfile.add(delProfile, 0, 1);
		gridProfile.add(viewProfile, 1, 0);
		gridProfile.add(compProfile, 1, 1);
		paneProfile.setRight(gridProfile);
		
		//Add layout to profile tab
		tabProfile.setContent(paneProfile);
		
		setBtnSizes();
		
		//Add Tabs to tabPane
		tabPane.getTabs().addAll(tabMusic, tabProfile);
		
		//Add everything to root borderlayout
		root.setTop(menuBar);
		root.setCenter(tabPane);
		
		//Usual suspects
		Scene sceneMusic = new Scene(root,600,500);
		sceneMusic.getStylesheets().add("Shred_Style.css");
		primaryStage.setTitle("Shred Nation");
		primaryStage.setScene(sceneMusic);
		primaryStage.show();
		
	}

	//Fix this fucking mess
	public void setBtnSizes(){
		addMusic.setPrefSize(80, 80);
		editMusic.setPrefSize(80, 80);
		delMusic.setPrefSize(80, 80);
		scanMusic.setPrefSize(80, 80);
		rateMusic.setPrefSize(80, 80);
		sortMusic.setPrefSize(80, 80);
		addProfile.setPrefSize(80, 80);
		delProfile.setPrefSize(80, 80);
		viewProfile.setPrefSize(80, 80);
		compProfile.setPrefSize(80, 80);
	}

	public static void main(String[] args) {
		launch(args);
	}
	
}

/*Ideas TO-DO
* Handle Button Actions (IN PROGRESS)
* Log In Screen
* Change File Menu Options
* Sort out this mess of a code (new classes for profile/music tabs) I'm a good coder I swear (IN PROGRESS)
* Make buttons with images in list view on right of stage
* Cutomize icons
* Create CSS (IN PROGRESS)
* Add new popup menu to customize color scheme?
*/

