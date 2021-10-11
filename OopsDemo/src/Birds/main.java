package Birds;

public class main {
	public static void main(String[] args) {
		Bird d = new Bird();
//		d.crow();
//		d.eagle();
//		d.parrot();
		
		d.setAge(18);
		d.setName("Hello");
		
		System.out.println(d.getAge());
		System.out.println(d.getName());
	}

}
