package pkg1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class C3 {
	public static void main(String[] args) throws FileNotFoundException{
		File f1 = new File("dictionary.txt");
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(System.in);//User scanner
		ArrayList<String>words = new ArrayList<>();
		String computerChoice;
		String userChoice;
		boolean running = true;
		while(sc1.hasNextLine()) {
			words.add(sc1.nextLine());			
		}
		
		while(running) {
			Random rand1 = new Random();
			int rand2 = rand1.nextInt(0, words.size());
			computerChoice = words.get(rand2);
			System.out.println("Comp: "+computerChoice);
			System.out.print("You: ");
			userChoice = sc2.nextLine();
			if(userChoice.startsWith(String.valueOf(computerChoice.charAt(computerChoice.length()-1))) & words.contains(userChoice)) {
				//Nothing			
			}else {
				break;
			}
			words.remove(rand2);
			words.remove(words.indexOf(userChoice));
		}
		
		System.out.println("------------------------------------ GAME OVER ------------------------------------");
	}
}
