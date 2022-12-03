package com.perscholas.PolymorphismAndInterface;
/*
 * @author Mahlet Zemedie
 * Date- 12/02/22
 */
public class LibraryInterfaceDemo {
	
	public static void main(String[] args) {
		
		KidUser kid1 = new KidUser();
		KidUser kid2 = new KidUser();
		
		kid1.setAge(10);
		kid1.setBookType("kids");
		kid1.registerAccount();
		kid1.requestBook();
		
		System.out.println();
		
		
		kid2.setAge(18);
		kid2.setBookType("Fiction");
		kid2.registerAccount();
		kid2.requestBook();
		
		
		System.out.println();
		
		AdultUser adult1 = new AdultUser();
		AdultUser adult2 = new AdultUser();
		
		
		adult1.setAge(5);
		adult1.setBookType("kids");
		adult1.registerAccount();
		adult1.requestBook();
		
		
		System.out.println();
		
		adult2.setAge(23);
		adult2.setBookType("Fiction");
		adult2.registerAccount();
		adult2.requestBook();
		
		
	}

	
	
}


interface LibraryUser{
	
	void registerAccount();
	void requestBook();

}

class KidUser implements LibraryUser{
	
	int age;
	String bookType;
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	
	@Override
	public void registerAccount() {
		
		if(age <= 11) System.out.println("You have successfully registered under a Kids Account");
		else System.out.println("Sorry, Age must be less than 12 to register as a kid");
	}
	@Override
	public void requestBook() {
		
		if (bookType == "kids") System.out.println("Book Issued successfully, please return the book within 10 days");
		else System.out.println("Oops, you are allowed to take only kids books");
	}
	
}

class AdultUser implements LibraryUser{
	
	int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getBookType() {
		return bookType;
	}
	public void setBookType(String bookType) {
		this.bookType = bookType;
	}
	String bookType;
	
public void registerAccount() {
		
		if(age >=12) System.out.println("You have successfully registered under a Adult Account");
		else System.out.println("Sorry, Age must be greater than 12 to register as a kid");
	}
	@Override
	public void requestBook() {
		
		if (bookType == "Fiction") System.out.println("Book Issued successfully, please return the book within 7 days");
		else System.out.println("Oops, you are allowed to take only adult fiction books");
	}
	
}
