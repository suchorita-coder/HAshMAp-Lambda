package LambdaExpression;

import java.util.HashMap;
import java.util.Map;

public class HashMapObjectAsKey {

	public static void main(String[] args) {
		
		Employee emp1 = new Employee(122, "Nishitha");
		Employee emp2 = new Employee(122, "Nishitha");
		Employee emp3 = new Employee(122, "Nishu");
		
		HashMap<Employee,String> HashMp = new HashMap<>();
		
		HashMp.put(emp1, "User1");
		HashMp.put(emp2, "User2");
		HashMp.put(emp3, "User3");
		
		//emp3.setEmpID(132);
		System.out.println(HashMp.get(emp3));
		
		//System.out.println(HashMp.get(emp3));
		
		for(Map.Entry<Employee , String> entry : HashMp.entrySet()) {
			System.out.println(entry.getKey() + "===" +entry.getValue());
		}

	}

}
