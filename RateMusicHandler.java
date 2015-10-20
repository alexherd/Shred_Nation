import java.util.Optional;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.TextInputDialog;

public class RateMusicHandler implements EventHandler<ActionEvent>{

	@Override
	public void handle(ActionEvent event) {
		TextInputDialog dialogRateMusic = new TextInputDialog("enter \"ub\" for a secret");
		dialogRateMusic.setTitle("Rate Music");
		dialogRateMusic.setHeaderText("What would you like to rate?");
		dialogRateMusic.setContentText("Album Name:");
		Optional<String> rateInput = dialogRateMusic.showAndWait();
		if (rateInput.isPresent()){
			//SEARCH FOR ALBUM??
		}
	}
}
