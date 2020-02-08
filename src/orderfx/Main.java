/**
 * Shuwen Wang
 * 991583096
 * Assignment 2
 * 02-05-2020
 */
package orderfx;

import content.Order;
import content.DisplayOrder;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {

    private Label lblOrderID = new Label("OrderID");
    private Label lblFirstName = new Label("FirstName");
    private Label lblLastName = new Label("LastName");
    private Label lblCity = new Label("City");
    private TextField txtOrderID = new TextField();
    private TextField txtFirstName = new TextField();
    private TextField txtLastName = new TextField();
    private TextField txtCity = new TextField();

    private Label lblOrderNumberA = new Label("OrderNumberA");
    private Label lblOrderNumberB = new Label("OrderNumberB");
    private Label lblOrderNumberC = new Label("OrderNumberC");
    private Label lblOrderNumberD = new Label("OrderNumberD");
    private TextField txtOrderNumberA = new TextField("0");
    private TextField txtOrderNumberB = new TextField("0");
    private TextField txtOrderNumberC = new TextField("0");
    private TextField txtOrderNumberD = new TextField("0");

    private Image imgA = new Image("images/apple.png");
    private ImageView imgAview = new ImageView(imgA);
    private Image imgB = new Image("images/orange.png");
    private ImageView imgBview = new ImageView(imgB);
    private Image imgC = new Image("images/strawberry.png");
    private ImageView imgCview = new ImageView(imgC);
    private Image imgD = new Image("images/pear.png");
    private ImageView imgDview = new ImageView(imgD);

    private Button btnDisplay = new Button("Display");

    @Override
    public void start(Stage primaryStage) {

        btnDisplay.setOnAction((e) -> {
            Order one = new Order();
            process(one);
            DisplayOrder ds = new DisplayOrder(one);
            ds.show();
        });
        Scene scene = new Scene(getGrid(), 650, 300);
        primaryStage.setTitle("Order The Fruits");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public GridPane getGrid() {
        GridPane pane = new GridPane();
        pane.setHgap(5);
        pane.setVgap(5);
        pane.add(lblOrderID, 0, 0);
        pane.add(lblFirstName, 1, 0);
        pane.add(lblLastName, 2, 0);
        pane.add(lblCity, 3, 0);

        pane.add(txtOrderID, 0, 1);
        pane.add(txtFirstName, 1, 1);
        pane.add(txtLastName, 2, 1);
        pane.add(txtCity, 3, 1);

        pane.add(lblOrderNumberA, 0, 2);
        pane.add(lblOrderNumberB, 1, 2);
        pane.add(lblOrderNumberC, 2, 2);
        pane.add(lblOrderNumberD, 3, 2);

        pane.add(txtOrderNumberA, 0, 3);
        pane.add(txtOrderNumberB, 1, 3);
        pane.add(txtOrderNumberC, 2, 3);
        pane.add(txtOrderNumberD, 3, 3);

        pane.add(imgAview, 0, 4);
        pane.add(imgBview, 1, 4);
        pane.add(imgCview, 2, 4);
        pane.add(imgDview, 3, 4);
        pane.add(btnDisplay, 1, 5);

        return pane;
    }

    private void process(Order one) {
        try {
            one.setOrderNumberA(Integer.parseInt(txtOrderNumberA.getText()));
            one.setOrderNumberB(Integer.parseInt(txtOrderNumberB.getText()));
            one.setOrderNumberC(Integer.parseInt(txtOrderNumberC.getText()));
            one.setOrderNumberD(Integer.parseInt(txtOrderNumberD.getText()));
        } catch (NumberFormatException e) {
            System.out.println("OrderNumber must be an integer");
        }

        one.setOrderID(txtOrderID.getText());
        one.setFirstName(txtFirstName.getText());
        one.setLastName(txtLastName.getText());
        one.setCity(txtCity.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }

}
