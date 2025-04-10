package creditCardValidationProject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadTextFile
	{
		public static void main(String[] args) throws FileNotFoundException
			{
				readTextFile();
			}

		static ArrayList<Card> cardList = new ArrayList<Card>();

		public static void readTextFile() throws FileNotFoundException
			{

				Scanner myFile = new Scanner(new File("cardNumbers"));
				while (myFile.hasNext())
					{
						String cardNumbers = myFile.next();
						System.out.println(cardNumbers);
						String[] cardNumbersArray = cardNumbers.split("");
						cardList.add(new Card(cardNumbersArray));
//						for (int i = 0; i < cardNumbersArray.length; i++)
//							{
//								System.out.println(Integer.parseInt(cardNumbersArray[i]) + 1);
//							}
						for (int i = 0; i < cardList.size(); i++)
							{
								System.out.println(cardList.get(i).getCardNums()[i]);
							}
					}
			}
	}
