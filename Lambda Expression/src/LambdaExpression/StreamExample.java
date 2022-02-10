package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Kundan", "Kumar",60),
				new Person("Jacob", "Jazz" , 42),
				new Person("sahil", "shing", 43),
				new Person("Ghochu","Podder", 12),
				new Person("Ghochi","Podder", 10)

				);
	
		people.stream()
		.filter(p-> p.getFname().startsWith("G"))
		.forEach(p -> System.out.println(p.getFname()));
		
		long count = people.parallelStream()
		.filter(p-> p.getLname().startsWith("P"))
		.count();
		
		System.out.println(count);
	}
}
