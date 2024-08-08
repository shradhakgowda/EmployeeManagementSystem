package com.crimsonlogic.singlelevel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Employee {
	private String employeeId;
	private String employeeName;
	private String employeeAdress;
	float salary;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeAdress() {
		return employeeAdress;
	}
	public void setEmployeeAdress(String employeeAdress) {
		this.employeeAdress = employeeAdress;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((employeeAdress == null) ? 0 : employeeAdress.hashCode());
		result = prime * result + ((employeeId == null) ? 0 : employeeId.hashCode());
		result = prime * result + ((employeeName == null) ? 0 : employeeName.hashCode());
		result = prime * result + Float.floatToIntBits(salary);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (employeeAdress == null) {
			if (other.employeeAdress != null)
				return false;
		} else if (!employeeAdress.equals(other.employeeAdress))
			return false;
		if (employeeId == null) {
			if (other.employeeId != null)
				return false;
		} else if (!employeeId.equals(other.employeeId))
			return false;
		if (employeeName == null) {
			if (other.employeeName != null)
				return false;
		} else if (!employeeName.equals(other.employeeName))
			return false;
		if (Float.floatToIntBits(salary) != Float.floatToIntBits(other.salary))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAdress="
				+ employeeAdress + ", salary=" + salary + "]";
	}
	public Employee(String employeeId, String employeeName, String employeeAdress, float salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAdress = employeeAdress;
		this.salary = salary;
	}
	public Employee()
	{
		
	}
	
	
}
