package creditCardValidationProject;

public class Card
	{
		private String[] cardNums;
		
		public Card(String[] c)
		{
			cardNums = c;
		}

		public String[] getCardNums()
			{
				return cardNums;
			}

		public void setCardNums(String[] cardNums)
			{
				this.cardNums = cardNums;
			}
	}
