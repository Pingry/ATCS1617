import java.io.*;
import java.util.Scanner;

/*To use this example program, run it in the same folder as a .csv file 
named Sheet1.csv */

/*
Scoring method number three
use a for loop to go through all the columns and if it is > 0, then find the difference and add that idfference into an array of size 44 for all the values
pick the index with the lowest index
then find it's highest rated shows that are zeros for the inputFile and return them s
*/
 

public class Netflix
{

	private Vector<Vector<Integer>> ratings;
	private Vector<String> names;

	public static void main (String args[])
	{
		Vector<Vector<Integer>> TVRatings = new Vector(); 
		Vector<String> TVNames = new Vector(); 
		Vector<Integer> inputRatings = new Vector(); 

		String pathname = "TV_Ratings.csv";
		File file = new File(pathname);	
		Scanner input = null;
		try
		{
			input = new Scanner(file);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(" Cannot open " + pathname );
			System.exit(1);
		}
		
		String pathname2 = "TV_Preferences.csv";
		File file2= new File(pathname2);	
		Scanner input2 = null;
		try
		{
			input2 = new Scanner(file2);
		}
		catch (FileNotFoundException ex)
		{
			System.out.println(" Cannot open " + pathname2 );
			System.exit(1);
		}

		//make r a counter. Why do I need the for loop? 
		int r = 0; 
		while( input.hasNextLine() )
		{ 
			System.out.println("r " + r); 
			//System.out.println("TVNames " + TVNames.size());
			Vector<Integer> row = new Vector<Integer>();
			if(r == 0)
			{
				TVNames.add(input.nextLine()); 
			}
			else
			{
				String [] toAdd = StringToArray(input.nextLine()); 
				for(int c = 0; c < 78; c++)
				{
					row.add(Integer.parseInt(toAdd[c])); 

				}
				//System.out.println(row); 
				TVRatings.add(row); 
			}
			r++;
			
		}

		while(input2.hasNextLine())
		{
			for(int i = 0; i < 44; i++)
			{
				String [] toAdd = StringToArray(input.nextLine());
				for(int c = 0; c < 78; c++)
				{
					inputRatings.add(Integer.parseInt(toAdd[c])); 

				}
			}
		}
	}

	/**
	 * @return  String [] 
	 * @param str [String]
	 */
	public static String [] StringToArray(String str)
	{
		String [] nums = new String[78]; 
		int count = 0; 
		for(int i = 0; i < str.length(); i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				nums[count] = Character.toString(str.charAt(i));  
				count++;
			}
		}
		return nums; 
	}

	/**
	 * 
	 * @param a [description]
	 */
	public static void print(String [] a)
	{
		for(String x: a)
		{
			System.out.print(x + ", "); 
		}
		System.out.println(); 
	}
}





















