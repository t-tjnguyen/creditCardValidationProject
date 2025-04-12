package creditCardValidationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class DataUtils
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				readTextFile();
			}

		static ArrayList<Card> allCards = new ArrayList<Card>();

		public static void readTextFile() throws FileNotFoundException
			{

				Scanner myFile = new Scanner(new File("cardNumbers.txt"));
				while (myFile.hasNext())
					{
						String cardNumber = myFile.next();
						System.out.println(cardNumber);
						String[] cardNumbers = cardNumber.split("");
						Card creditCard = new Card(cardNumbers);
						allCards.add(creditCard);
//						for (int i = 0; i < cardNumbersArray.length; i++)
//							{
//								System.out.println(Integer.parseInt(cardNumbersArray[i]) + 1);
//							}
						for (int i = 0; i < allCards.size(); i++)
							{
								System.out.println(allCards.get(i).toString());
							}
					}
			}
	}

// read file, parse data