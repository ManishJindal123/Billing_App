/**
 * Sample Skeleton for 'chkRadioView.fxml' Controller Class
 */

package chkRadio;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class chkRadioViewController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="chkAll"
    private CheckBox chkAll; // Value injected by FXMLLoader

    @FXML // fx:id="chkDosa"
    private CheckBox chkDosa; // Value injected by FXMLLoader

    @FXML // fx:id="chkPizza"
    private CheckBox chkPizza; // Value injected by FXMLLoader

    @FXML // fx:id="chkuBurger"
    private CheckBox chkuBurger; // Value injected by FXMLLoader

    @FXML // fx:id="lblitems"
    private Label lblitems; // Value injected by FXMLLoader

    @FXML // fx:id="lblTotal"
    private Label lblTotal; // Value injected by FXMLLoader

    @FXML // fx:id="dis"
    private ToggleGroup dis; // Value injected by FXMLLoader
    
    @FXML
    private TextField txtnet;

    @FXML // fx:id="lblDiscount"
    private Label lblDiscount; // Value injected by FXMLLoader
int bill=0;
    @FXML
    void doChkUnchk(ActionEvent event) {
    	/*if(chkAll.isSelected())
		{
		chkDosa.setSelected(true);
		chkuBurger.setSelected(true);
		chkPizza.setSelected(true);
		}
	else
	{
		chkDosa.setSelected(false);
		chkuBurger.setSelected(false);
		chkPizza.setSelected(false);
	}*/
	boolean bl=chkAll.isSelected();
	chkDosa.setSelected(bl);
	chkuBurger.setSelected(bl);
	chkPizza.setSelected(bl);

    }

    @FXML
    void doDiscount10(ActionEvent event) {
    		doDiscountNow(10);
    }

    @FXML
    void doDiscount20(ActionEvent event) {
    	doDiscountNow(20);
    }
    void doDiscountNow(int rate)
    {
    	int discount=bill*rate/100;
    	lblDiscount.setText("Discount="+String.valueOf(discount));
    	
    	int netAmount=bill-discount;
    	txtnet.setText("Payment="+String.valueOf(netAmount));
    	
    }

    @FXML
    void doShow(ActionEvent event) {
    	String items="";
    	bill=0;
    	
    	if(chkDosa.isSelected())
    		{
    			items=items+" Dosa,";
    			bill=bill+80;
    		}
    	
    	if(chkuBurger.isSelected())
    		{
    			items=items+" Burger,";
    			bill=bill+50;
    		}
    	
    	if(chkPizza.isSelected())
    	{
    		items=items+" pizza,";
    		bill+=100;
    	}
    	items=items.substring(0,items.length()-1);
    	lblitems.setText(items);
    	lblTotal.setText("Bill="+bill);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
       

    }
}
