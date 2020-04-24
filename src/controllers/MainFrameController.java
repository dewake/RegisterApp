 
package controllers;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import registerapp.App;
 
public class MainFrameController implements Initializable {

    @FXML
    private Button btnChoose;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleChoose(ActionEvent event) {
     File f=   App.chooseFile();
     if(f!=null){
         System.out.println(f.getAbsolutePath());
     }else{
         System.out.println("null");
     }
    }
    
}
