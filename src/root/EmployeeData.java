package root;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class EmployeeData {

	@Id
	private int id;
	private String name;
	private String salary;
	private String department;

	public EmployeeData() {
		// TODO Auto-generated constructor stub
	}

	public EmployeeData(int id, String name, String salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

}
