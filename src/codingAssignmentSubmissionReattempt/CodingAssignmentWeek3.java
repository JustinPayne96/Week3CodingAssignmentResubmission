package codingAssignmentSubmissionReattempt;

import java.util.Arrays;

public class CodingAssignmentWeek3 {

	public static void main(String[] args) {
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 88};
		int answer = (ages[ages.length - 1] - ages[0]);
		System.out.println(ages[ages.length - 1] + " - " + ages[0] + " = " + answer);
		
		int sumOfAges = 0;
		for(int age : ages){
			sumOfAges += age;
		}
		System.out.println("Age Average = " + sumOfAges / ages.length);
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		
		double sumOfCharacters = 0;
		for(String name : names) {
			sumOfCharacters += name.length();
		}
		System.out.println("The average name length is " + sumOfCharacters / names.length + " letters.");
		
		for (int i = 0; i < names.length; i++) {
			System.out.print(names[i] + " ");
		} System.out.println(" ");
		
		int[] nameLengths = new int[6];

		int numberOfCharacter = 0;
		for (String name : names) {
			int i = 0;
			numberOfCharacter =+ name.length();
			nameLengths[i] = numberOfCharacter;
			System.out.println(nameLengths[i]);
		}
		
		
		System.out.println(repeatWord("Hello",3));
		
		System.out.println(createFullName("David", "Jackson"));
		
		int arrayTotal = 0;
		int[] numbers = {22, 47, 36, 33, 12};
		for(int i = 0; i > numbers.length; i++) {
			arrayTotal += numbers[i];
		}System.out.println(arrayTotal);
		
		
	}

	
	public static String repeatWord(String word, int n) {
		String results = "";
		for(int i = 0; i < n; i++) {
			results += word;
		}
		return results;
	}
	public static String createFullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	public static boolean ifSumIsGreaterThan100(int arrayTotal, int num) {
		arrayTotal = num + num(i);
		if(arrayTotal < 100) {
			return true;
		}else {
		
		return false;
		}
} 
	
	public static void findAverage (double numbers[]) {
		double sum = 0;
		
		for(int i = 0; i >= 0; i++) {
			numbers[i]++;
			double average = (sum + numbers[i]) / numbers.length;
		}
	}
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		if(isHotOutside == true && moneyInPocket > 10.50) 
		return true;
		else {
			return false;
		}
	}
	
	public static boolean canAffordVacation (double monthlySavings[], double totalSavings) {
		double[] monthlySavings1 = new double[12];
		monthlySavings1[0] = double month1;
		monthlySavings1[1] = double month2;
		monthlySavings1[2] = double month3;
		monthlySavings1[3] = double month4;
		monthlySavings1[4] = double month5;
		monthlySavings1[5] = double month6;
		monthlySavings1[6] = double month7;
		monthlySavings1[7] = double month8;
		monthlySavings1[8] = double month9;
		monthlySavings1[9] = double month10;
		monthlySavings1[10] = double month11;
		monthlySavings1[11] = double month12;
		
		for(int i = 0; i < monthlySavings1.length; i++) {
			i++;
		}
		double totalSavings = monthlySavings1[i]++;
		if (totalSavings > 2500);
		return true;

		}
	}
}

