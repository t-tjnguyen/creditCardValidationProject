package creditCardValidationProject;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class CreditCardValidator
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				Scanner userInput = new Scanner(System.in);
				System.out.println("Please input a credit card number.");
				String creditCardNumber = userInput.nextLine();

				String[] numbersToBeParsed = creditCardNumber.split("");

				int[] parsedNumbers = new int[16];

				for (int i = 0; i < numbersToBeParsed.length; i++)
					{
						parsedNumbers[i] = Integer.parseInt(numbersToBeParsed[i]);
					}

				if (LuhnAlgorithm.validateCreditCard(parsedNumbers))
					{
						System.out.println("This card is potentially valid.");
					}
				else
					{
						System.out.println("This card is not potentially valid.");
					}

			}
	}
