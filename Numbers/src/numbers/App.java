package numbers;
import java.util.Scanner;

/*public class App {

	public int number;

	public App(int number) {
		this.number = number;
	}

	public void newNumber(int number) {
		int number1=number%100;
		int hundreds=number/100;
		System.out.println(number1);
		
		if (number1 >= 0 & number1<20) 
		{
			switch (number1) 
			{
				case 0 :
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3 :
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6 :
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9 :
					System.out.println("Nine");
					break;
				}
		}
			else
			{
				System.out.println("no number");
			}
		
	*/

public class App {

	public static void main(String[] args) {		

	
		Scanner scan = new Scanner (System.in);
		System.out.println ("Please enter a Number");
		int num = scan.nextInt();
		System.out.println("You enterd : " + num);
		
		int number1=num%100;
		int hundreds=num/100;
		System.out.println("number1 is : " + number1);
		System.out.println("hundreds is :" + hundreds);
		
		if (number1 >= 0 & number1<20) 
		{
			switch (number1) 
			{
				case 0 :
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3 :
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6 :
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9 :
					System.out.println("Nine");
					break;
				case 10 :
					System.out.println("Ten");
					break;
				case 11 :
					System.out.println("Eleven");
					break;
				case 12 :
					System.out.println("Twelve");
					break;
				case 13 :
					System.out.println("Thirteen");
					break;
				case 14 :
					System.out.println("Fourteen");
					break;
				case 15 : 
					System.out.println("Fifteen");
					break;
				case 16 :
					System.out.println("Sixteen");
					break;
				case 17 :
					System.out.println("Seventeen");
					break;
				case 18 : 
					System.out.println("Eighteen");
					break;
				case 19 :
					System.out.println("Nineteen");
					break;
				
				}
		}
			else
			{
				int tens=number1/10;
				int ones = number1%10;
				System.out.println("tens is : " + tens);
				System.out.println("ones is : " + ones);
				
				switch (tens) 
				{
						case 2 :
						System.out.println("Twenty");
						break;
						case 3 :
						System.out.println("Thirty");
						break;
					case 4:
						System.out.println("Fourty");
						break;
					case 5:
						System.out.println("Fifty");
						break;
					case 6 :
						System.out.println("Sixty");
						break;
					case 7:
						System.out.println("Seventy");
						break;
					case 8:
						System.out.println("Eighty");
						break;
					case 9 :
						System.out.println("Ninety");
						break;
				}
				
				switch (ones) 
				{
					case 1:
						System.out.println("One");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3 :
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5:
						System.out.println("Five");
						break;
					case 6 :
						System.out.println("Six");
						break;
					case 7:
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9 :
						System.out.println("Nine");
						break;
				}
				
				switch (hundreds) 
				{
					case 1:
						System.out.println("One hundred");
						break;
					case 2:
						System.out.println("Two hundred");
						break;
					case 3 :
						System.out.println("Three hundred");
						break;
					case 4:
						System.out.println("Four hundred");
						break;
					case 5:
						System.out.println("Five hundred");
						break;
					case 6 :
						System.out.println("Six hundred");
						break;
					case 7:
						System.out.println("Seven hundred");
						break;
					case 8:
						System.out.println("Eight hundred");
						break;
					case 9 :
						System.out.println("Nine hundred");
						break;
			}
		
			}
		int thousands=num/1000;
		System.out.println("thousands is : " + thousands);
			
		if (thousands >= 0 & thousands<20) 
		{
			switch (thousands) 
			{
				case 0 :
					System.out.println("Zero");
					break;
				case 1:
					System.out.println("One");
					break;
				case 2:
					System.out.println("Two");
					break;
				case 3 :
					System.out.println("Three");
					break;
				case 4:
					System.out.println("Four");
					break;
				case 5:
					System.out.println("Five");
					break;
				case 6 :
					System.out.println("Six");
					break;
				case 7:
					System.out.println("Seven");
					break;
				case 8:
					System.out.println("Eight");
					break;
				case 9 :
					System.out.println("Nine");
					break;
				case 10 :
					System.out.println("Ten");
					break;
				case 11 :
					System.out.println("Eleven");
					break;
				case 12 :
					System.out.println("Twelve");
					break;
				case 13 :
					System.out.println("Thirteen");
					break;
				case 14 :
					System.out.println("Fourteen");
					break;
				case 15 : 
					System.out.println("Fifteen");
					break;
				case 16 :
					System.out.println("Sixteen");
					break;
				case 17 :
					System.out.println("Seventeen");
					break;
				case 18 : 
					System.out.println("Eighteen");
					break;
				case 19 :
					System.out.println("Nineteen");
					break;
				
				}
		}
			else
			{
				int tensThousands=thousands/10;
				int onesThousands = thousands%10;
				System.out.println("tens thousands is : " + tensThousands);
				System.out.println("ones thousands is : " + onesThousands);
				
				switch (tensThousands) 
				{
						case 2 :
						System.out.println("Twenty");
						break;
						case 3 :
						System.out.println("Thirty");
						break;
					case 4:
						System.out.println("Fourty");
						break;
					case 5:
						System.out.println("Fifty");
						break;
					case 6 :
						System.out.println("Sixty");
						break;
					case 7:
						System.out.println("Seventy");
						break;
					case 8:
						System.out.println("Eighty");
						break;
					case 9 :
						System.out.println("Ninety");
						break;
				}
				
			
				
				switch (onesThousands) 
				{
					case 1:
						System.out.println("One");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3 :
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5:
						System.out.println("Five");
						break;
					case 6 :
						System.out.println("Six");
						break;
					case 7:
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9 :
						System.out.println("Nine");
						break;
				}
				
				switch (hundreds) 
				{
					case 1:
						System.out.println("One hundred");
						break;
					case 2:
						System.out.println("Two hundred");
						break;
					case 3 :
						System.out.println("Three hundred");
						break;
					case 4:
						System.out.println("Four hundred");
						break;
					case 5:
						System.out.println("Five hundred");
						break;
					case 6 :
						System.out.println("Six hundred");
						break;
					case 7:
						System.out.println("Seven hundred");
						break;
					case 8:
						System.out.println("Eight hundred");
						break;
					case 9 :
						System.out.println("Nine hundred");
						break;
			}
		
		System.out.println("Thousand");
		
			}	
				
			}
		
}
		
		
		
		
	
	

