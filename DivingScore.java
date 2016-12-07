/**
 * @Unit 8
 * @author Andre Dorsey
 * @version 03-20-2016
 * @professor Than Maung
 * a program that inputs a degree of difficulty and the seven scores of the judges, then outputs the overall score for that dive.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DivingScore 
{ 
	private static Scanner input;

	public static void main(String[] args) 
	{

		//takes in the user input of scores
		
		input = new Scanner(System.in);

		
		//Declared an array to store the judge's scores.
		 
		double[] judgeScores = new double[7];

		
		//Declared variables for lowest scores and highest scores.
		 
		double lowestScore = Integer.MAX_VALUE;
		double highestScore = Integer.MIN_VALUE;

		//reads the score from the 7 judges.
		
		for (int i = 0; i < 7; i++) {
			System.out.print(String.format("Please enter judge #%d's score : ", i + 1));
			judgeScores[i] = input.nextDouble();

			
		// Compare the current score with the lowest and the highest scores.
		
			if (judgeScores[i] < lowestScore) 
			{
				lowestScore = judgeScores[i];
			}
			if (judgeScores[i] > highestScore) 
			{
				highestScore = judgeScores[i];
			}
			// ends program if score is outside of range 1 to 10
			if ((judgeScores[i] > 10) || (judgeScores[i] < 1)) 
			{
			System.out.print("\nInvalid input please select a score from the range 1.2 to 3.8");
			return;
			}
		}

		
		// Sums up the scores, except for the lowest scores and the highest scores.
		 
		double total = 0.00;
		for (int i = 0; i < 7; i++) 
		{
			if (judgeScores[i] != lowestScore && judgeScores[i] != highestScore) 
			{
				total = total + judgeScores[i] * 0.6;
			}
		}

		
		//used decimal format to display the correct format for the output.
		 
		DecimalFormat Final = new DecimalFormat("0.00");
		System.out.println("Overall points received from the judges is: " + Final.format(total));

	}

}
