package firstIS;

import java.util.Arrays;
import java.util.Scanner;

public class MispacedTilesUsingA {

	static int[] goalStateArray;
	static int heuristicChoice;
	public static void main(String args[]) {
		Calculate8Puzzle calculate8Puzzle=new Calculate8Puzzle();
		
		System.out.println(" Enter Heuristic function");
		System.out.println("****************************");
		System.out.println("1) Manhattan 2) Misplaced tiles");
		
		Scanner reader = new Scanner(System.in);

		heuristicChoice = Integer.parseInt(reader.nextLine());
				
		System.out
				.println("Enter Initial State - Use space after every number (example : 0 1 2 3 4 5 6 7 8): \n");
		reader = new Scanner(System.in);
		int[] initialStateArray = getArrayFromInputOutput(reader.nextLine()
				.split(" "));
		System.out
				.println("Enter goal State - Use space after every number (example : 0 1 2 3 4 5 6 7 8) : \n");
		reader = new Scanner(System.in);

		goalStateArray = getArrayFromInputOutput(reader.nextLine().split(
				" "));
		if(Arrays.equals(initialStateArray, goalStateArray)){
			System.out.println("Goal State Reached...");
			System.exit(0);
			
		}	
		calculate8Puzzle.calculateData(goalStateArray,initialStateArray);
		

		
	}
	
	
	
	private static int[] getArrayFromInputOutput(String[] a) {
		int[] initState = new int[9];
		for (int i = 0; i < a.length; i++) {
			initState[i] = Integer.parseInt(a[i]);
		}
		return initState;
	}

}
