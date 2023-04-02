import java.text.DecimalFormat;
import java.util.Scanner;

public class Competition {

	public static void main(String[] args) {

		/*
		 * For data input.
		 */
		Scanner kb = new Scanner(System.in);

		/*
		 * Declare an array to store the judge's scores.
		 */
		double[] scores = new double[8];

		/*
		 * Declare variables for lowest and highest scores.
		 */
		double lowestScore = Integer.MAX_VALUE;
		double highestScore = Integer.MIN_VALUE;

		/*
		 * Read 8 judge's scores.
		 */
		for (int i = 0; i < 8; i++) {
			System.out.print(String.format("Judge Score #%d: ", i + 1));
			scores[i] = kb.nextDouble();

			/*
			 * Compare the current score with the lowest and the highest scores.
			 */
			if (scores[i] < lowestScore) {
				lowestScore = scores[i];
			}
			if (scores[i] > highestScore) {
				highestScore = scores[i];
			}
		}

		/*
		 * Sum the scores, except the lowest and the highest scores.
		 */
		double total = 0.00;
		for (int i = 0; i < 8; i++) {
			if (scores[i] != lowestScore && scores[i] != highestScore) {
				total = total + scores[i];
			}
		}

		/*
		 * Display the output.
		 */
		DecimalFormat df = new DecimalFormat("0.00");
		System.out.println("Total points received: " + df.format(total));

	}

}
