import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        CustomerManager customerManager = new CustomerManager();
        
        while(true) {
        	System.out.println("Quản Lý Khách Hàng");
        	System.out.println("Enter 1: Nhập khách hàng và tiền");
        	System.out.println("Enter 2: Tính số tiền của khách hàng");
        	System.out.println("Enter 3: In ra danh sách khách hàng");
        	System.out.println("Enter 4: Thoát");
        	String line = scanner.nextLine();
        	
        	switch(line) {
        	      case "1": {
        	    	  System.out.println("Enter fullname:");
        	    	  String fullName = scanner.nextLine();
        	    	  System.out.println("Enter address:");
        	    	  String address = scanner.nextLine();
        	    	  System.out.println("Enter phone:");
        	    	  String phone = scanner.nextLine();
        	    	  System.out.println("Enter money before discount and tax:");
        	    	  float money = scanner.nextFloat();
        	    	  System.out.println("Enter discount:");
        	    	  float discount = scanner.nextFloat();
        	    	  System.out.println("Enter tax:");
        	    	  float tax = scanner.nextFloat();
        	    	  
        	    	  Customer customer = new Customer(fullName, address, phone, money, discount, tax);
        	    	  customerManager.addCustomer(customer);
        	    	  scanner.nextLine();
        	    	  
        	    	  break;
        
        	      }
        	      case "2":{
        	    	  System.out.println("Enter fullname");
   				      String fullName = scanner.nextLine();
   				      System.out.println("Price: " + customerManager.CalculateTheAmount(fullName) + "$");
   			          break;
        	    	  
        	      }
        	      case "3":{
        	    	  customerManager.showInfor();
        	    	  break;
        	      }
        	      case "4":{
        	    	  return;
        	      }
        	      default:
        	    	  System.out.println("Invalid");
        	    	  continue;
        	}
        }
	}

}