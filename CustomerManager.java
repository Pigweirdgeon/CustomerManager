import java.util.*;

public class CustomerManager {
 List<Customer> customer;
 
 public CustomerManager() {
	 this.customer = new ArrayList<>();
 }
 
 public void addCustomer(Customer customer) {
	 this.customer.add(customer);
 }
 
 public float CalculateTheAmount(String fullName) {
	 Customer customer = this.customer.stream().
			             filter(cus -> cus.getFullName().equals(fullName)).findFirst().orElse(null);
	 if (customer == null) {
		 return 0;
	 }
	 return (customer.getMoney()-(customer.getDiscount()/100)+(customer.getMoney()*customer.getTax()/100));
 }
 
 public void showInfor() {
     this.customer.forEach(customer -> System.out.println(customer.toString()));
 }
}