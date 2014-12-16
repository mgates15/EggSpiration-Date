import java.util.Scanner;



public class EggSpiration{
	
	public static void main(String args[]){
		System.out.print("Put in the three digit number on the egg carton : ");
		Scanner keyboardA = new Scanner (System.in);
		int expirationDate = keyboardA.nextInt();
		System.out.print("Enter the current date as a three digit number : ");
		Scanner keyboardB = new Scanner (System.in);
		int currentDate = keyboardB.nextInt();
		
		if(expirationDate < 59){
			int newerNumber = expirationDate + 365 - currentDate;
			System.out.print(newerNumber);
		}
		else{
			System.out.print("The number of days until the eggs expire is: " + (expirationDate - currentDate));
		}
	}
}
