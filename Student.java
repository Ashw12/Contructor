package Lecture32_Constructor;

public class Student {
       private String name="Kriti";
       private int age=25;
       public Student(String name,int age) {
    	   this.name=name;
    	   this.age=age;
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
	/*public void setAge(int age)throws Exception {
		if(age<0) {
			throw new Exception("the age is not nagetive");
		}
		this.age=age;
	}*/
	public void setAge(int age) throws Exception {//throws Exception using for Exception Handle.it is write in just after method call.
		try{
			if(age<0) {
			throw new Exception("the age is not negative");//throw new Exception use for generate Exception.it is write in condition box.
		}
			this.age = age;
		}
		catch(Exception e) {
			//System.out.println(e);
			e.printStackTrace();//isa line se code run hoga terminate nhi higa
		}
		//this.age = age;
		finally{//ye line Exception ho ya na ho finally block challega hi chalega.
			System.out.println(getName());
		}
	
}
}
