package in.co.decimal.array.pojo;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> arr = new ArrayList<Integer>();

	// here int...(means variable argument enable).
	public Student(String name, int... marks) {
		this.name = name;
		for (int ele : marks) {
			this.arr.add(ele);
		}
	}

	public int getNumberOfMarks() {

		return this.arr.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int ele : this.arr) {
			sum += ele;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int maximum = Integer.MIN_VALUE;
//		for (int mark : arr) {
//			if (mark > maximum) {
//				maximum = mark;
//			}
//		}
//		return maximum;

		return Collections.max(this.arr);
	}

	public BigDecimal getAverageMarks() {
		BigDecimal temp = new BigDecimal(getTotalSumOfMarks());
		BigDecimal tempLength = new BigDecimal(getNumberOfMarks());

		// here 3 represent the after .(three number).
		// RoundingMode.Up: 0.5 that means goto 1.
		return temp.divide(tempLength, 3, RoundingMode.UP);
	}

	public int getMinimumMark() {
//		int minimum = Integer.MAX_VALUE;
//		for (int mark : arr) {
//			if (mark < minimum) {
//				minimum = mark;
//			}
//		}
//		return minimum;

		return Collections.min(this.arr);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", arr=" + arr + "]";
	}

	public void addNewMark(int newMark) {
		this.arr.add(newMark);

	}

	public void removeMarkAtIndex(int elementWhichWeWantToRemove) {
		if (elementWhichWeWantToRemove < this.getNumberOfMarks()) {

			this.arr.remove(elementWhichWeWantToRemove);
		}

	}

}
