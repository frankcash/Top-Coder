/**
 * 220.40/250 points
 * @author foobar
 * @problem The people at TopCoder invited a bunch of members to a recognition party. 
 * At the party, they arranged all of the people in a line ordered by rating. Unfortunately, they may have made mistakes. 
 * Each member will file a complaint for every person ahead of them that has a lower rating. For example: line = {1000,800,900,1400} The line is ordered front to back. 
 * The member rated 900 (position 2 in the line) will file 1 complaint since there is a member rated 800 (position 1) ahead of him. 
 * The member rated 1400 (position 3) will file 3 complaints since there are members rated 1000 (position 0), 800 (position 1), and 900 (position 2) ahead of him. 
 * In total there will be 4 (1+3) complaints. Given the list of ratings ordered front to back, you will determine how many complaints TopCoder will receive.
 * Create a class Complaints that contains the method howMany, which takes an line and returns an that represents the number of complaints TopCoder will receive.
 *
 */


public class Complaints {
	
	public static int howMany(int[] line){
		int total = 0;
		
		for(int i = 0; i < line.length; i++){
			for(int j = i; j >= 0; j--){


				if(line[i] > line[j]){
					System.out.println(line[i] +  " > " + line[j]);
					
					++total;
				}
			}
		}
		
		return total;
	}
	
//	public static void main(String args[]){
//		int[] foo = {1000, 800, 900, 1400};
//		int[] bar = {10, 9, 8, 7, 6, 5};
//		System.out.println(howMany(foo));
//		System.out.println(howMany(bar));
//	}

}
