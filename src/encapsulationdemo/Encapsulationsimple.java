package encapsulationdemo;

public class Encapsulationsimple {
	
	public static void main(String[] args) {
		EncapsulationDemo E = new EncapsulationDemo();
		
		E.setName("Sivakumar");
		System.out.println(E.getName());
		
		E.setAge(25);
		System.out.println(E.getAge());
		
		E.setSalary(40000.00);
		System.out.println(E.getSalary());
		
		E.setAddress("Nucot Bangalore");
		System.out.println(E.getAddress());
	}

}
