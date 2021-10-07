import java.util.ArrayList;

public class Employee {
	private String uId;
	private int time;

	public Employee(String uId, int time) {
		this.uId = uId;
		this.time = time;
	}

	public String getuId() {
		return uId;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

}
