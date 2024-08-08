package interviewQuestions;

import java.util.Arrays;
import java.util.List;

public class Count_Male_and_Female_Organization1 {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(
				new Employee("Rahul Gupta","Male", "Infosys","Finane"),
				
				new Employee("Vinay ","Male","TCS","IT"),
				new Employee("Viswa","Female","TCS","BPO"),
				new Employee("Sai ","Male","Infosys","IT"),
				new Employee("Nirmala","Female","TCS","TCS")
					);
		employees.stream().map(e -> e.getDepartment()).distinct()
		.forEach(x -> System.out.println(x));

System.out.println("Hello World");
		
	}

}
