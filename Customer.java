public class Customer {
  protected String fullName;
  protected String address;
  protected String phone;
  protected float money;
  protected float discount;
  protected float tax;
  
  public Customer(String fullName , String address, String phone, float money , float discount, float tax) {
	  this.fullName = fullName;
	  this.address = address;
	  this.phone = phone;
	  this.money = money;
	  this.discount = discount;
	  this.tax = tax;
  }
  
  public String getFullName() {
	  return fullName;
  }
  
  public void setFullName(String fullName) {
	  this.fullName = fullName;
  }
  
  public String getAddress() {
	  return address;
  }
  
  public void setAddress(String address) {
	  this.address = address;
  }
  
  public String getPhone() {
	  return phone;
  }
  
  public void setPhone(String phone) {
	  this.phone = phone;
  }
  public float getMoney() {
	  return money;
  }
  
  public void setMoney(float money) {
	  this.money = money;
  }
  
  public float getDiscount() {
	  return discount;
  }
  
  public void setPhone(float discount) {
	  this.discount = discount;
  }
  public float getTax() {
	  return tax;
  }
  
  public void setTax(float tax) {
	  this.tax = tax;
  }
  
  @Override
  public String toString() {
	  return "Customer{" +
             "FullName: " + fullName + "\n" +
             "Address: " + address + "\n" +
             "Phone: " + phone + "\n" +
             "Amount of money before discount and tax: " + money + "$" + "\n" +
             "Percentage of discount :" + discount + "%" + "\n" +
             "Tax: " + tax + "%" + "\n" +
              "}";
  }
}