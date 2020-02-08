/**
 * Shuwen Wang
 * 991583096
 * Assignment 2
 * 02-05-2020
 */
package content;

public class Order {

    private String orderID = new String();
    private String firstName = new String();
    private String lastName = new String();
    private String city = new String();

    private int orderNumberA;
    private int orderNumberB;
    private int orderNumberC;
    private int orderNumberD;

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOrderID() {
        return this.orderID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getCity() {
        return this.city;
    }

    public void setOrderNumberA(int orderNumberA) {
        this.orderNumberA = orderNumberA;
    }

    public void setOrderNumberB(int orderNumberB) {
        this.orderNumberB = orderNumberB;
    }

    public void setOrderNumberC(int orderNumberC) {
        this.orderNumberC = orderNumberC;
    }

    public void setOrderNumberD(int orderNumberD) {
        this.orderNumberD = orderNumberD;
    }

    public int getOrderNumberA() {
        return this.orderNumberA;
    }

    public int getOrderNumberB() {
        return this.orderNumberB;
    }

    public int getOrderNumberC() {
        return this.orderNumberC;
    }

    public int getOrderNumberD() {
        return this.orderNumberD;
    }
}
