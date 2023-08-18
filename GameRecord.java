package baseBallGame;

import java.util.ArrayList;
import java.util.Scanner;

public class GameRecord {

	public static void main(String[] args) {

		ArrayList<String> score = new ArrayList<>();

//		score.add("5");
//		score.add("2");
//		score.add("c");
//		score.add("d");
//		score.add("+");

		score.add("5");
		score.add("-2");
		score.add("4");
		score.add("c");
		score.add("d");
		score.add("9");
		score.add("+");
		score.add("+");

		GameRecord.manipulateArray(score);

	}

	public static void manipulateArray(ArrayList<String> value) {

		ArrayList<String> check = new ArrayList<>();
		String holdValue = "";
		for (int i = 0; i < value.size(); i++) {
			holdValue = value.get(i);
			if (value.get(i).equalsIgnoreCase("c") && i > 0) {
				check.remove(check.get(check.indexOf("c") - 1));
				check.remove("c");
			}

			if ((value.get(i).equalsIgnoreCase("d") && i > 0)) {

				String num = check.get(check.indexOf("d") - 1);
				check.remove("d");
				check.add(String.valueOf(Integer.parseInt(num) * 2));
			}

			if ((value.get(i).equalsIgnoreCase("+") && i > 0)) {
				check.remove("+");
				int sum = 0;
				int sub = 0;
				for (String n : check) {
//					System.out.println(n);
					if (!n.contains("-")) {
						sum += Integer.parseInt(n);

					}
//					 sub += Integer.parseInt(n);
				}
				check.add(String.valueOf(sum - sub));
			}
			System.out.println(check);
		}
		int sum = 0;
		for (String n : check) {
			sum += Integer.parseInt(n);
		}
		System.out.println(sum);
	}

}
