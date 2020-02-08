/**
 * Shuwen Wang
 * 991583096
 * Assignment 2
 * 02-05-2020
 */
package content;

import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class DisplayOrder extends Stage {

    public DisplayOrder(Order one) {
        setScene(getOrder(one));
    }

    public Scene getOrder(Order one) {

        String orderID = one.getOrderID();
        String firstName = one.getFirstName();
        String lastName = one.getLastName();
        String city = one.getCity();

        int orderNumberA = one.getOrderNumberA();
        int orderNumberB = one.getOrderNumberB();
        int orderNumberC = one.getOrderNumberC();
        int orderNumberD = one.getOrderNumberD();

        Label lblOrderID = new Label("OrderID: " + orderID);
        Label lblFirstName = new Label("FirstName: "+firstName);
        Label lblLastName = new Label("LastName: "+ lastName);
        Label lblCity = new Label("City: " + city);
        
        Label lblOrderNumberA = new Label("Order Quantity of A: " + orderNumberA);
        Label lblOrderNumberB = new Label("Order Quantity of B: "+ orderNumberB);
        Label lblOrderNumberC = new Label("Order Quantity of C: "+ orderNumberC);
        Label lblOrderNumberD = new Label("Order Quantity of D: "+ orderNumberD);

        VBox pane = new VBox(5);
        pane.getChildren().addAll(lblOrderID, lblFirstName, lblLastName, lblCity, lblOrderNumberA,
                lblOrderNumberB, lblOrderNumberC, lblOrderNumberD);

        Scene scene = new Scene(pane, 200, 200);
        return scene;
    }

}
