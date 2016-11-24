package codility;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static boolean sorts(int[] A){
		boolean val = true;

		int temp = 0;
		boolean swapping = true;
		int moved = 0;

		List<Integer> B = new ArrayList<Integer>();

		for(int i = 0; i < A.length; i++){
			B.add(A[i]);
		}

		while(swapping){
			swapping = false;

			for(int i = 1; i < A.length; i++){
				if(A[i] < A[i - 1]){
					temp = A[i];
					A[i] = A[i - 1];
					A[i - 1] = temp;
					swapping = true;
				}
			}
		}

		// Checks for sameness
		for(int i = 0; i < A.length; i++){
			if(A[i] != B.get(i)){
				moved ++;
			}
		}

		// Checks amount that have moved
		if(moved > 2){
			val = false;
		}

		System.out.println("Moved "+ moved);
		return val;
	}


	public static void main(String args[]){

				int[] foo = { 1, 5, 3, 3, 7};
				
				int[] bar = { 1, 3, 5, 3, 4};
				
				System.out.println(sorts(foo));
				System.out.println(sorts(bar));

	

	}

}
