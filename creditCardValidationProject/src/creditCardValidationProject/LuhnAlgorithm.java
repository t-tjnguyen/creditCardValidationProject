package creditCardValidationProject;

import java.io.FileNotFoundException;

public class LuhnAlgorithm
	{
		public static void main(String[] args)
			{

			}

		private static int[] doubleAlternatingDigits(int[] creditCardNumber)
			{
				int[] nums = new int[creditCardNumber.length];
				for (int i = 0; i < creditCardNumber.length; i++)
					{
						if (i % 2 == 0)
							{
								int doubledNumber = creditCardNumber[i] * 2;
								if (doubledNumber > 9)
									{
										int a = doubledNumber % 10 + 1;
										nums[i] = a;
									}
								else
									{
										nums[i] = doubledNumber;
									}
							}
						else
							{
								nums[i] = creditCardNumber[i];
							}

					}

				return nums;
			}

		private static int sumNumbers(int[] numbers)
			{
				int sum = 0;
				for (int i = 0; i < numbers.length; i++)
					{
						sum += numbers[i];
					}

				return sum;
			}

		private static boolean checkSumDivisibleByTen(int sum)
			{
				if (sum % 10 == 0)
					{
						return true;
					}

				return false;
			}

		public static boolean validateCreditCard(int[] creditCardNumber)
			{
				int[] doubledNumbers = doubleAlternatingDigits(creditCardNumber);
				int sum = sumNumbers(doubledNumbers);
				boolean passesLuhnCheck = checkSumDivisibleByTen(sum);
				return passesLuhnCheck;
			}
	}