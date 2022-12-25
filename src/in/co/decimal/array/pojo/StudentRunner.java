package in.co.decimal.array.pojo;

import java.math.BigDecimal;

public class StudentRunner {
	public static void main(String[] args) {
		Student student = new Student("Vikash", 98, 97, 100);

		int number = student.getNumberOfMarks();
		System.out.println("number of marks : " + number);

		int sum = student.getTotalSumOfMarks();
		System.out.println("Sum of marks : " + sum);

		int maximumMark = student.getMaximumMark();
		System.out.println("maximum of marks : " + maximumMark);

		int minimumMark = student.getMinimumMark();
		System.out.println("minimum of marks : " + minimumMark);

		BigDecimal average = student.getAverageMarks();
		System.out.println("average : " + average);

		System.out.println(student);

		// In array once declare the array then not easy to change the size of the array
		// and modifies it.
		student.addNewMark(35);
		System.out.println(student);

		student.removeMarkAtIndex(3);
		System.out.println(student);
	}
}
