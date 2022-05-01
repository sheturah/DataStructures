package arraylistPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int userChoice = 4;
		boolean done = false;
		
		while(done == false)
		{
		try {
			
			System.out.println("\n1. Add To Front\n"
					+ "2. Add To Back\n"
					+ "3. Add At Index\n"
					+ "4. Remove certain data\n"
					+ "5. Quit\n");
			userChoice = scan.nextInt();
			int num;
			System.out.println(userChoice);
			if(userChoice < 1 || userChoice >5)
			{
				throw new Exception("That input was valid, please try again!");
			}
			else
			{
				switch(userChoice)
				{
				case 1:
					num =NumberToAdd(1);
					addToFront(num, numbers); 
					PrintList(numbers);
					break;
					
				case 2:
					num =NumberToAdd(1);
					addToBack(num, numbers);
					PrintList(numbers);
					break;
					
				case 3:
					System.out.println("What index: ");
					int index = scan.nextInt();
					num =NumberToAdd(1);
					addAtIndex(index, num, numbers);
					PrintList(numbers);
					break;
				case 4:
				num =	NumberToAdd(2);
				remove(num, numbers);
					PrintList(numbers);
					break;
				case 5:
					done = true;
					break;
					
					
				}
			}
			
		}catch(Exception e)
		{
			System.out.println("Main method: " + e.getMessage());
		}
		}

	}
	
	public static void addToFront(int element, ArrayList<Integer> numbers)
	{
		numbers.add(0, element);
			
	}
	
	public static void addToBack(int element, ArrayList<Integer> numbers)
	{
		int lastElement = numbers.size();
		numbers.add(lastElement, element);
	}
	
	//adds an element at a give index
	public static void addAtIndex(int index, int element, ArrayList<Integer> numbers)
	{
		numbers.add(index, element);
	}
	
	//remove a certain index
	public static void remove(int element, ArrayList<Integer> numbers)
	{
		numbers.remove(element);
	}
	
	public static void PrintList(ArrayList<Integer> numbers)
	{
		System.out.println("");
		for(Integer i : numbers)
		{
			System.out.print(i + ", ");
		}
		
	}
	
	//questions to ask
	public static int NumberToAdd(int choice)
	{
		
		int numb = 0;
		int index = 0;
		
		try {
		switch(choice)
		{
		case 2:
			System.out.println("What index: ");
			index = scan.nextInt();
			numb = index;
			break;
		case 1:
			System.out.println("What number would you want to add? : ");
		 numb = scan.nextInt();
		
		
		}} catch(Exception e)
		{
			System.out.println("There was a problem! NumberToAdd: " + e.getMessage());
		}
		 
		
		return numb;
	}

}
