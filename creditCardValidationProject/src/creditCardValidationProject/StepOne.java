package creditCardValidationProject;

import java.io.FileNotFoundException;

public class StepOne
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				doubleDigits();
			}

		public static void doubleDigits() throws FileNotFoundException
			{
				ReadTextFile.readTextFile();
//				for (int i = 0; i < cardNumbersArray.length; i++)
//					{
//						
//						System.out.println(Integer.parseInt(cardNumbersArray[i]) + 1);
//					}
			}
	}
