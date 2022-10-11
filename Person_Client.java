package Lecture32_Constructor;

public class Person_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("karan",28);
		System.out.println(p.getAge());//this line use for Encapsulation
		System.out.println(p.getName());
		p.setName("priya");//this line use for Encapsulation
		p.setAge(-9);
	   // p.name="Kaju";//both are doing value update
		//p.age=23;
		p.fun();
		Person p1=new Person("kunal",25);
		//p1.name="Kunal";//both are doing value update
		//p1.age=45;
		p1.fun();
	}

}
