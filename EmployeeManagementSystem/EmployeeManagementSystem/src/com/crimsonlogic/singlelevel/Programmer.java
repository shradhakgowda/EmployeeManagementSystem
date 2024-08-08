package com.crimsonlogic.singlelevel;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Programmer extends Employee{
private  int bonus;
private int point;
public int getBonus() {
	return bonus;
}
public void setBonus(int bonus) {
	this.bonus = bonus;
}
public int getPoint() {
	return point;
}
public void setPoint(int point) {
	this.point = point;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + bonus;
	result = prime * result + point;
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Programmer other = (Programmer) obj;
	if (bonus != other.bonus)
		return false;
	if (point != other.point)
		return false;
	return true;
}
@Override
public String toString() {
	return "Programmer [bonus=" + bonus + ", point=" + point + "]";
}



}
