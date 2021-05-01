
import java.util.ArrayList;
import java.util.*;

 class Person {
	  private String firstname;
	  private String lastname;
	  private String address;
	  private String city;
	  private String state;
	  private String zip;
	  private String phoneNumber;
	  private String emailId;

	  public String getFirstname() {
           return firstname;
          }
          public String setFirstname(String name) {
           this.firstname = name;
           return name;
	  }

	  public String getLastname() {
	   return lastname;
          }
          public void setLastname(String lastname) {
           this.lastname = lastname;
          }

	  public String getAddress() {
           return address;
          }
          public void setAddress(String Address) {
           this.address = Address;
          }

          public String getCity() {
           return city;
          }
          public void setCity(String city) {
	   this.city = city;
          }
          public String getState() {
	   return state;
	  }
          public void setState(String state) {
           this.state = state;
          }

          public String getZip() {
           return zip;
          }
	  public void setZip(String zip) {
           this.zip = zip;
	  }

          public String getphoneNumber() {
           return phoneNumber;
	  }
	  public void setphoneNumber(String phoneNumber) {
	   this.phoneNumber = phoneNumber;
	  }

	  public String getemail() {
	   return emailId;
	  }
	  public void setemail(String email) {
	   this.emailId = email;
	  }

	  @Override
	  public String toString() {
          return " " + firstname + " " + lastname +" "+ address + " " + city + " " + state + " " + zip + " "+ phoneNumber + " " + emailId +"";
          }
}

class PersonInfoOperations {
	 
	   static Scanner s=new Scanner(System.in);
	
	   public static void addContact(List<Person> persons) {
	            Person P = new Person();

			    System.out.println("Enter Firstname"); 
			    P.setFirstname(s.nextLine());
			    System.out.println("Enter Lastname"); 
			    P.setLastname(s.nextLine());
			    System.out.println("Enter Address");
			    P.setAddress(s.nextLine());
			    System.out.println("Enter City");
			    P.setCity(s.nextLine());
			    System.out.println("Enter State");
			    P.setState(s.nextLine());
			    System.out.println("Enter Zip");
			    P.setZip(s.nextLine());
			    System.out.println("Enter PhoneNumber");
			    P.setphoneNumber(s.nextLine());
			    System.out.println("Enter EmailId");
			    P.setemail(s.nextLine());

			    persons.add(P);
			    System.out.println(persons);
	   }

	   public static void EditContact(List<Person> distinctEntries) {
			System.out.println("Enter first name that you want to Edit:");
			String firstName = s.nextLine();
			Person selectedPerson = null;
			for (int i = 0; i < distinctEntries.size(); i++) {
				if (firstName.equals(distinctEntries.get(i).getFirstname())) {
	            		       selectedPerson = distinctEntries.get(i);
	       			       break;
				}  
			}  
			if (selectedPerson != null) {
			    	System.out.println("Enter new Firstname"); 
			    	selectedPerson.setFirstname(s.nextLine());
			        System.out.println("Enter new Lastname"); 
			        selectedPerson.setLastname(s.nextLine());
			        System.out.println("Enter new Address");
			        selectedPerson.setAddress(s.nextLine());
			        System.out.println("Enter new City");
			        selectedPerson.setCity(s.nextLine());
			        System.out.println("Enter new State");
			        selectedPerson.setState(s.nextLine());
			        System.out.println("Enter new Zip");
			        selectedPerson.setZip(s.nextLine());
			        System.out.println("Enter new PhoneNumber");
			        selectedPerson.setphoneNumber(s.nextLine());
			        System.out.println("Enter new EmailId");
			        selectedPerson.setemail(s.nextLine());
			        System.out.println(distinctEntries);   
			  }	
			  else {
			        System.out.println("Invalid Name!Not Exist");
			  }
	     }

             public static void DeleteContact(List<Person> persons) {
			  System.out.println("Enter first name that you want to Delete:");
			  String firstName = s.nextLine();

   			  Person selectedPerson = null;
			  for (int i = 0; i < persons.size(); i++) {
				if (firstName.equals(persons.get(i).getFirstname())) {
				    selectedPerson = persons.get(i);
				    break;
				 }  
			   }
                          if (selectedPerson != null) {	
				 persons.remove(selectedPerson);
				 System.out.println("Successfully Deleted!\n");
				 System.out.println(persons); 
			   }	
			   else {
				 System.out.println("Invalid Name!Not Exist");
			   }
	    }


}

public class AddressBookProgram {

   public static void main(String[] args) {	
	Scanner s= new Scanner(System.in);
	int choice;

	ArrayList<Person> persons=new ArrayList<> ();
	System.out.println(" Enter 1 to Add Contact\n Enter 2 to Edit Contact\n Enter 3 to Delete Contact \n Enter 4 to Exit\n");
	choice=s.nextInt();
        switch (choice) 
        {
	 case 1:
	        PersonInfoOperations.addContact(persons);
		break;
	 case 2:
	        PersonInfoOperations.EditContact(persons);
	        break;
         case 3:
       	        PersonInfoOperations.DeleteContact(persons);
	        break;
         case 4:
	        System.exit(0);
	        break;

	 }
    }
}
