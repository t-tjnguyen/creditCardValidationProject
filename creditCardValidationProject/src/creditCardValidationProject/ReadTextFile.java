package creditCardValidationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadTextFile
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				readTextFile();
			}

		public static void readTextFile() throws FileNotFoundException
			{

				Scanner myFile = new Scanner(new File("cardNumbers"));
				while (myFile.hasNext())
					{
						String cardNumbers = myFile.next();
						System.out.println(cardNumbers);
						String[] cardNumbersArray = cardNumbers.split("");
						for (int i = 0; i < cardNumbersArray.length; i++)
							{
								System.out.println(Integer.parseInt(cardNumbersArray[i]) + 1);
							}
					}
			}
	}
