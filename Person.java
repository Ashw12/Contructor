package Lecture32_Constructor;

public class Person {
	  private String name="kriti";//this is parsing(update)step.in dono variable ko name aur age ko private kar denge to ye sirf
	  private int age=32;// person class me access hoga .
	//Non Prameterise constructor
	public Person(){//public Person()this is constructor .this no any return type.void bhi nhi.
		 this.name="Motu";//class ke data member ko set karta hai. 
		 this.age=25;//isme ham class ke data memberko initilizse karte hai.
	}
	/*Default constructor
	public Person(){	
	}
	*/
	//parameterise constructor
	public Person(String name,int age) {//this is the parameterise constructor
		 this.name=name;
		  this.age=age;
	}
	public void fun() {   
		String name="Anshu";
		int Adhar_no=909128;
		System.out.println(this.name+" "+this.age+" "+Adhar_no);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
