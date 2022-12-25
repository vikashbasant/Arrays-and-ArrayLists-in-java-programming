package in.co.decimal.array.pojo;

public class ImportantRunner {
	public static int sum(int... values) {
		int sum = 0;
		for (int value : values) {
			sum += value;
		}
		return sum;
	}

	public static void main(String[] args) {
		int sum = sum(1, 2, 3, 7, 90, 56, 23, 45, 67, 890, 6543, 6);
		System.out.println(sum);
	}

	// Rule that is variable argument must be present at last in the argument.

//	public static void print(int... values, String name) {
//		
//	}

}
