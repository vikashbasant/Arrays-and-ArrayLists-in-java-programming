package in.co.decimal.array.pojo;

public class StringRunner {

	public static void main(String[] args) {
		String[] dayOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		String dayWithMostCharacter = "";
		for (String day : dayOfWeek) {
			if (dayWithMostCharacter.length() < day.length()) {
				dayWithMostCharacter = day;
			}
		}
		System.out.println("Day with Most number of characters: " + dayWithMostCharacter);

		for (int i = dayOfWeek.length - 1; i >= 0; i--) {
			System.out.print(dayOfWeek[i] + " ");
		}

	}
}
