package creditCardValidationProject;

import java.util.Arrays;

public class Card
	{
		private String[] cardNums;
		
		public Card(String[] c)
		{
			cardNums = c;
			System.out.println("Hi");
		}

		public String[] getCardNums()
			{
				return cardNums;
			}

		public void setCardNums(String[] cardNums)
			{
				this.cardNums = cardNums;
			}

		@Override
		public String toString()
			{
				return "Card [cardNums=" + Arrays.toString(cardNums) + "]";
			}
		
		
	}
