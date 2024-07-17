package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int capacity;
	private String alternateEmail;
	private String companyName = "amazon";
	private String eMail;
	
	// Constructor
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = generatePassword();
		setDepartment();
		this.capacity = 1000;
		this.alternateEmail = "";
		
		// combination for email
		this.eMail = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + this.department.toLowerCase() + "."
				+ companyName + ".com";
		
		printEmailInfo(this);
	}
	
	public void printEmailInfo(Email e) {
		System.out.println("Email Address: " + this.eMail + "\n");
		System.out.println("Temporary Password: " + this.password + "\n");
	}
	
	// Generate random password
	public String generatePassword() {
		int n = 10;
		// choose a Character random from this String 
		  String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
		         + "0123456789"
		         + "abcdefghijklmnopqrstuvxyz"; 
		 
		  // create StringBuffer size of AlphaNumericString 
		  StringBuilder sb = new StringBuilder(n); 
		 
		  for (int i = 0; i < n; i++) { 
		 
		   // generate a random number between 
		   // 0 to AlphaNumericString variable length 
		   int index 
		    = (int)(AlphaNumericString.length() 
		      * Math.random()); 
		 
		   // add Character one by one in end of sb 
		   sb.append(AlphaNumericString 
		      .charAt(index)); 
		  } 
		 
		  return sb.toString(); 
	}	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDepartment() {
		return department;
	}
	
	// specific departmants
	public void setDepartment() {
		System.out.println("Enter departmant: (1 for Sales, 2 for Development, 3 for Accounting, 4 for others)\n");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		switch (choice) {
		case 1: 
			this.department = "Sales";
			break;
		
		case 2:
			this.department = "Development";
			break;
			
		case 3:
			this.department = "Accounting";
			break;
			
		case 4:
			this.department = "Others";
			break;
			
		default:
			this.department = "";
			break;
		}
		
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}
	
}
