package sk.itsovy.sestak.family;

public class Mobile {
    private String brand;
    private String model;
    private String phoneNumber;

    public Mobile(){ // bezparametricky konstruktor

    }

    public Mobile( String brand, String model, String phoneNumber){
        this.brand=brand;
        this.model=model;
        this.phoneNumber=phoneNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
