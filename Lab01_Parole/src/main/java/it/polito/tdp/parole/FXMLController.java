package it.polito.tdp.parole;

import it.polito.tdp.parole.model.Parole;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FXMLController {
	
	Parole elenco ;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtParola;

    @FXML
    private Button btnInserisci;

    @FXML
    private TextArea txtResult;
    
    @FXML
    private TextField txtTimer;

    @FXML
    private Button btnReset;
    
    @FXML
    private Button btnCancella;

    @FXML
    void doCancella(ActionEvent event) {
    	double inizio = System.nanoTime();
    	elenco.deleteParola(txtParola.getText());
    	double fine = System.nanoTime() - inizio;
    	txtTimer.setText(String.format("%f", fine));
    }

    @FXML
    void doInsert(ActionEvent event) {
    	// TODO
    	double inizio = System.nanoTime();
    	elenco.addParola(txtParola.getText());
    	elenco.getElenco();
    	double fine = System.nanoTime() - inizio;
    	txtTimer.setText(String.format("%f", fine));
    }

    @FXML
    void doReset(ActionEvent event) {
    	// TODO
    	double inizio = System.nanoTime();
    	elenco.reset();
    	double fine = System.nanoTime() - inizio;
    	txtTimer.setText(String.format("%f", fine));
    }

    @FXML
    void initialize() {
        assert txtParola != null : "fx:id=\"txtParola\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnInserisci != null : "fx:id=\"btnInserisci\" was not injected: check your FXML file 'Scene.fxml'.";
        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Scene.fxml'.";
        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Scene.fxml'.";

        elenco = new Parole() ;
    }
}
