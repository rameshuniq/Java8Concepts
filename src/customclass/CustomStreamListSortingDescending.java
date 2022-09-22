package customclass;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// Sort List of Employee objects in Descending order using Java 8 Stream APIs
public class CustomStreamListSortingDescending {
	public static void main(String[] args) {

		// sort employee by salary in ascending order
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 30, 400000));
		employees.add(new Employee(20, "John", 29, 350000));
		employees.add(new Employee(30, "Tom", 30, 450000));
		employees.add(new Employee(40, "Pramod", 29, 500000));

		List<Employee> employeesSortedList1 = employees.stream()
				.sorted((o1, o2) -> (int) (o2.getSalary() - o1.getSalary())).collect(Collectors.toList());
		System.out.println(employeesSortedList1);

		List<Employee> employeesSortedList2 = employees.stream()
				.sorted(Comparator.comparingLong(Employee::getSalary).reversed()).collect(Collectors.toList()); // ascending
																												// order
		System.out.println(employeesSortedList2);
	}
}
