import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeTime {

	ArrayList<Employee> employeeList = new ArrayList<>();;

	ArrayList<Employee> employees = new ArrayList<>();

	int length;

		public EmployeeTime() {

			employeeList = new EmployeeList().get();
			length = employeeList.size();
	}




	public String calculateTme(){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for(int i = 0; i < length; i++){
			int time = employeeList.get(i).getTime();
			String uuid = (employeeList.get(i).getuId());
			map.put(uuid, map.getOrDefault(uuid, 0) + time);
		}


			return map.toString();

	}


}
