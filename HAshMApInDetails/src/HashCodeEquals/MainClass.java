package HashCodeEquals;

public class MainClass {

	public static void main(String[] args) {
		
		Empolyee e1 = new Empolyee();
		e1.setEmpID(1332);
		e1.setEmpName("Ghochu");
		
		Empolyee e2 = new Empolyee();
		e2.setEmpID(1342);
		e2.setEmpName("Ghochi");
		
		System.out.println("Shallow Compare: " + (e1 == e2));
		
		System.out.println("deep Compare:  " + (e1.equals(e2)));


	}

}
