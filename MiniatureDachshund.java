import java.util.Arrays;

//Lun the miniature dachshund loves mikan (satsuma oranges). She has just bought some mikan. You are given a int[] mikan. It gives the weight of all mikan she bought. For each valid i, mikan[i] is the weight of the i-th mikan in grams. 
//You are also given an int weight. Currently, Lun weighs weight grams. When she eats i-th mikan, her weight increases by mikan[i] grams. If she eats multiple mikan, her weight increases by their total weight. She cannot eat just a part of a mikan. In other words, if she chooses to eat a mikan, she eats it completely. 

/*
 * @author cfcash
 * 171/250 pointsss
 */

public class MiniatureDachshund {
 
	public int maxMikan(int[] mikan, int weight) { // delete static
		int count = 0;
		int i=0;
		Arrays.sort(mikan);
		while(weight < 5000){
			
			if(weight+mikan[i]>5000){
				break;
			}
			
			if (i>=mikan.length-1){
				weight+=mikan[i];
				count++;
				i++;
				break;
				
			}else{
				
				weight+=mikan[i];
				count++;
				i++;
			}
		}
		return count;
	}

}
