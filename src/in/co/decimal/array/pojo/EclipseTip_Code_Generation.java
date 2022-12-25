package in.co.decimal.array.pojo;

import java.util.Objects;

public class EclipseTip_Code_Generation {
	
	private int i;
	private String str;
	
	
	/**
	 * @return the i
	 */
	public int getI() {
		return i;
	}
	/**
	 * @param i the i to set
	 */
	public void setI(int i) {
		this.i = i;
	}
	/**
	 * @return the str
	 */
	public String getStr() {
		return str;
	}
	/**
	 * @param str the str to set
	 */
	public void setStr(String str) {
		this.str = str;
	}
	@Override
	public int hashCode() {
		return Objects.hash(i, str);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EclipseTip_Code_Generation other = (EclipseTip_Code_Generation) obj;
		return i == other.i && Objects.equals(str, other.str);
	}
	@Override
	public String toString() {
		return "Xys [i=" + i + ", str=" + str + ", getI()=" + getI() + ", getStr()=" + getStr() + ", hashCode()="
				+ hashCode() + ", getClass()=" + getClass() + ", toString()=" + super.toString() + "]";
	}
	public EclipseTip_Code_Generation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
