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
    private Label lblMsg = new Label("Please input the number(int) and click the image to order");

    private TextField txtOrderID = new TextField();
    private TextField txtFirstName = new TextField();
    private TextField txtLastName = new TextField();
    private TextField txtCity = new TextField();

    private Label lblOrderNumberA = new Label("Quantity of A");
    private Label lblOrderNumberB = new Label("Quantity of B");
    private Label lblOrderNumberC = new Label("Quantity of C");
    private Label lblOrderNumberD = new Label("Quantity of D");
    private TextField txtOrderNumberA = new TextField("0");
    private TextField txtOrderNumberB = new TextField("0");
    private TextField txtOrderNumberC = new TextField("0");
    private TextField txtOrderNumberD = new TextField("0");

    // the following fruit images are from the website:
    // https://7esl.com/fruits-vocabulary-english/
    private Image imgA = new Image("images/apple.png", 100, 100, true, true);
    private ImageView imgAview = new ImageView(imgA);
    private Button btnImgA = new Button("", imgAview);

    private Image imgB = new Image("images/orange.png", 100, 100, true, true);
    private ImageView imgBview = new ImageView(imgB);
    private Button btnImgB = new Button("", imgBview);

    private Image imgC = new Image("images/strawberry.png", 100, 100, true, true);
    private ImageView imgCview = new ImageView(imgC);
    private Button btnImgC = new Button("", imgCview);

    private Image imgD = new Image("images/pear.png", 100, 100, true, true);
    private ImageView imgDview = new ImageView(imgD);
    private Button btnImgD = new Button("", imgDview);

    private Button btnDisplay = new Button("Display the order details");
    private int orderNumberA;
    private int orderNumberB;
    private int orderNumberC;
    private int orderNumberD;

    private Order one = new Order();

    @Override
    public void start(Stage primaryStage) {
        orderA(btnImgA, txtOrderNumberA);
        orderB(btnImgB, txtOrderNumberB);
        orderC(btnImgC, txtOrderNumberC);
        orderD(btnImgD, txtOrderNumberD);
        displayOrder(one);

        Scene scene = new Scene(getGrid(), 500, 300);
        primaryStage.setTitle("Order The Fruits");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void displayOrder(Order one) {
        btnDisplay.setOnAction((e) -> {
            process(one);
            DisplayOrder ds = new DisplayOrder(one);
            ds.show();
        });
    }

    public void orderA(Button btnImg, TextField txtOrderNumber) {
        btnImg.setOnAction((e) -> {
            try {
                orderNumberA = Integer.parseInt(txtOrderNumber.getText());
            } catch (Exception e1) {
                txtOrderNumber.setText("0");
                System.out.println(e1.getMessage());
            }
        });
    }

    public void orderB(Button btnImg, TextField txtOrderNumber) {
        btnImg.setOnAction((e) -> {
            try {
                orderNumberB = Integer.parseInt(txtOrderNumber.getText());
            } catch (Exception e1) {
                txtOrderNumber.setText("0");
                System.out.println(e1.getMessage());
            }
        });
    }

    public void orderC(Button btnImg, TextField txtOrderNumber) {
        btnImg.setOnAction((e) -> {
            try {
                orderNumberC = Integer.parseInt(txtOrderNumber.getText());
            } catch (Exception e1) {
                txtOrderNumber.setText("0");
                System.out.println(e1.getMessage());
            }
        });
    }

    public void orderD(Button btnImg, TextField txtOrderNumber) {
        btnImg.setOnAction((e) -> {
            try {
                orderNumberD = Integer.parseInt(txtOrderNumber.getText());
            } catch (Exception e1) {
                txtOrderNumber.setText("0");
                System.out.println(e1.getMessage());
            }
        });
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

        pane.add(lblMsg, 0, 2, 4, 1);

        pane.add(lblOrderNumberA, 0, 3);
        pane.add(lblOrderNumberB, 1, 3);
        pane.add(lblOrderNumberC, 2, 3);
        pane.add(lblOrderNumberD, 3, 3);

        pane.add(txtOrderNumberA, 0, 4);
        pane.add(txtOrderNumberB, 1, 4);
        pane.add(txtOrderNumberC, 2, 4);
        pane.add(txtOrderNumberD, 3, 4);

        pane.add(btnImgA, 0, 5);
        pane.add(btnImgB, 1, 5);
        pane.add(btnImgC, 2, 5);
        pane.add(btnImgD, 3, 5);
        pane.add(btnDisplay, 1, 6, 2, 1);

        return pane;
    }

    private void process(Order one) {
        one.setOrderNumberA(orderNumberA);
        one.setOrderNumberB(orderNumberB);
        one.setOrderNumberC(orderNumberC);
        one.setOrderNumberD(orderNumberD);
        one.setOrderID(txtOrderID.getText());
        one.setFirstName(txtFirstName.getText());
        one.setLastName(txtLastName.getText());
        one.setCity(txtCity.getText());
    }

    public static void main(String[] args) {
        launch(args);
    }

}
