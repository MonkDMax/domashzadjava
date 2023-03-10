
public class TelephoneChar extends SimCard {
  private int charge;
  private String model;
  public String manufacturer;

  public void setCharge(int charge) {
    this.charge = charge;
  }
  public int getCharge() {
    return this.charge;
  }

  public void setModel(String model) {
    this.model = model;
  }
  public String getModel() {
    return this.model;
  }

  public String toString(){
    return "Telephone{" +
            "manufacturer = " + this.manufacturer + "," +
            "model = " + this.model + "," +
            " charge = " + this.charge + "," +
            " number = " + this.num + "," +
            " provaider = " + this.provaider + "," +
            " balance = " + this.balance +"}";
  }

}
