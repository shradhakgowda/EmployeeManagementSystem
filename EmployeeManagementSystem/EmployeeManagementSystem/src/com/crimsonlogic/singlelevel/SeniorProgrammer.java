package com.crimsonlogic.singlelevel;

public class SeniorProgrammer extends Programmer{
private String certification;
private static int experience_yrs;
private double stocks;
public String getCertification() {
	return certification;
}
public void setCertification(String certification) {
	this.certification = certification;
}
public int getExperience_yrs() {
	return experience_yrs;
}
public void setExperience_yrs(int experience_yrs) {
	this.experience_yrs = experience_yrs;
}
public double getStocks() {
	return stocks;
}
public void setStocks(double stocks) {
	this.stocks = stocks;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((certification == null) ? 0 : certification.hashCode());
	result = prime * result + experience_yrs;
	long temp;
	temp = Double.doubleToLongBits(stocks);
	result = prime * result + (int) (temp ^ (temp >>> 32));
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
	SeniorProgrammer other = (SeniorProgrammer) obj;
	if (certification == null) {
		if (other.certification != null)
			return false;
	} else if (!certification.equals(other.certification))
		return false;
	if (experience_yrs != other.experience_yrs)
		return false;
	if (Double.doubleToLongBits(stocks) != Double.doubleToLongBits(other.stocks))
		return false;
	return true;
}
@Override
public String toString() {
	return "SeniorProgrammer [certification=" + certification + ", experience_yrs=" + experience_yrs + ", stocks="
			+ stocks + "]";
}

}
