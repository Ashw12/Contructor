package Lecture32_Constructor;

public class Student_client {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
          Student s=new Student("Manish",25);
          s.setName("Pooja");
          s.setAge(-22);
          System.out.println(s.getAge()+"  "+s.getName());
          
	}

}
