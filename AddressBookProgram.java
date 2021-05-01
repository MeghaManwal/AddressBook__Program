
import java.util.ArrayList;
import java.util.*;

class Person {
   	private String name;
   	private String Address;
   	private String phoneNumber;
   	private String email;

    	public String getname() {
        	return name;
    	}
    	public void setname(String name) {
        	this.name = name;
    	}

    	public String getAddress() {
        	return Address;
    	}
    	public void setAddress(String Address) {
        	this.Address = Address;
    	}
    	public String getphoneNumber() {
        	return phoneNumber;
    	}
    	public void setphoneNumber(String phoneNumber) {
        	this.phoneNumber = phoneNumber;
    	}

    	public String getemail() {
        	return email;
    	}
    	public void setemail(String email) {
        	this.email = email;
    	}


  	@Override
    	public String toString() {
        return "Person [name=" + name + "Address="+ Address + "phoneNumber=" + phoneNumber + "emailId=" + email +"]";
    	}

   public void PersonInfo() {
    	ArrayList<Person> list=new ArrayList<Person>();
    	Person P1=new Person();
    	Scanner s=new Scanner(System.in);

    	System.out.println("Enter Name: ");
     	P1.setname(s.nextLine());
    	System.out.println("Enter Address: ");
     	P1.setAddress(s.nextLine());
    	System.out.println("Enter phoneNumber: ");
     	P1.setphoneNumber(s.nextLine());
    	System.out.println("Enter email ID: ");
     	P1.setemail(s.nextLine());

    	list.add (P1);
    	System.out.println(list);
   }

}

public class AddressBookProgram {
     public static void main(String[] args) {
   	Scanner s=new Scanner(System.in);
   	int ch;
   	String name;
    	while(true){
     	System.out.println("Enter 1 to add\n Enter 2 to exit\n");
      	name=s.next();
       	ch = Integer.parseInt(name);
         switch (ch){
          case 1:
             System.out.println("Give the information for the Person");
             Person A1 =new Person();
             A1.PersonInfo();
             break;
          case 2:
             System.exit(0);
          break;
        }
      }
  }
}


