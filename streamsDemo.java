package PLM;

import java.util.ArrayList;
import java.util.List;

 class employee {
		
	String name;
	double salary;
	public employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
		@Override
    public String toString() {
       // return String.format("Employee [name =%s, salary =%.2f]", name, salary);
			return "Employee [name =%s, salary =%.2f]".formatted(name, salary);
    }
	}
	
	
	public class streamsDemo{
		public static void main (String[] args) {
			employee emp=new employee("Mark", 147.2569);
		
			System.out.println(emp.toString());
			System.out.format("employee salary: %.2f", 10147.0259);
		
		
	}
}