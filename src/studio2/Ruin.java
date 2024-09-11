package studio2;
import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("input start amount: ");
		int startAmount = in.nextInt();
		System.out.println("input win chance: ");
		double winChance = in.nextDouble();
		System.out.println("input win limit: ");
		double winLimit = in.nextDouble();
		System.out.println("total simulations: ");
		int totalSimulations = in.nextInt();
		double random;
		int originalStartAmount = startAmount;
		int wins;
		int losses;
		/*while ((startAmount <= winLimit) && (startAmount >= 0)) {
			 random = Math.random();
			 if (random > winChance) {
				 System.out.println("random");
				 startAmount++;
			 }
			 else if (random < winChance) {
				 System.out.println("ruin");
				 startAmount--;
			 }
		}*/
		for (int i = 0; i < totalSimulations; i++) {
			startAmount = originalStartAmount;
			losses = 0;
			wins = 0;
			
			while ((startAmount < winLimit) && (startAmount > 0)) {
			 random = Math.random();
			 if (random > winChance) {
				wins += 1;
				 startAmount++;
			 }
			 else if (random < winChance) {
				 losses += 1;
				 startAmount--;
			 }
			 
			 System.out.println("Day " + (i+1) + " Wins: " + wins + " losses: " + losses);
		}
			 

			 
	}

	}

}
