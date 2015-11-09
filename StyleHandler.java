import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;

public class StyleHandler implements EventHandler<ActionEvent>{
	
	private Scene _sceneMusic;
	private int _id;
	
	public StyleHandler(Scene sceneMusic, int id){
		_sceneMusic = sceneMusic;
		_id = id;
	}
	
	
	public void handle(ActionEvent event) {
		switch(_id){
		case 0:
			_sceneMusic.getStylesheets().removeAll("Forest.css", "Stormcrow.css");
			_sceneMusic.getStylesheets().add("Shred_Style.css");
			break;
		case 1:
			_sceneMusic.getStylesheets().removeAll("Shred_Style.css", "Stormcrow.css");
			_sceneMusic.getStylesheets().add("Forest.css");
			break;	
		case 2:
			_sceneMusic.getStylesheets().removeAll("Shred_Style.css", "Forest.css");
			_sceneMusic.getStylesheets().add("Stormcrow.css");
		}
		
	}

	

}
