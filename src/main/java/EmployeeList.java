import java.util.ArrayList;

public class EmployeeList {
public ArrayList<Employee> get(){
	ArrayList<Employee> employees = new ArrayList<>();
	employees.add(new Employee("a1", 3));
	employees.add(new Employee("a2", 2));
	employees.add(new Employee("a3", 1));
	employees.add(new Employee("a4", 5));
	employees.add(new Employee("a5", 6));
	employees.add(new Employee("a1", 4));
	employees.add(new Employee("a1", 9));
	employees.add(new Employee("a5", 3));
	employees.add(new Employee("a5", 2));
	employees.add(new Employee("a4", 5));
	employees.add(new Employee("a3", 1));
	employees.add(new Employee("a2", 3));
	return employees;
}
}
