package DataBase;

public class main {
	public static void main(String[] args) {
	 Student d = new Student();
	 d.setName("rahul");
	 d.setAge(15);
	 d.setCity("jsr");
	 d.setPincode(8999);
	 
	 System.out.println("-----------------------------------------------");
	 
	 d.setName("rahu");
	 d.setAge(1);
	 d.setCity("js");
	 d.setPincode(899);
	 
	 System.out.println(d.getName());
	 System.out.println(d.getAge());
	 System.out.println(d.getCity());
	 System.out.println(d.getPincode());
	 
     	
}
	


}

