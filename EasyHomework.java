//More formally, you are given a int[] numbers. Let P be the product of all elements of numbers. If P is positive, return "POSITIVE"; if P is negative, return "NEGATIVE"; else return "ZERO".

import java.math.BigInteger;

/*
 * @author frankcash
 * 223/250 points
 */

public class EasyHomework {

	public String determineSign(int[] A) {
		String answer = "POSITIVE";
		int r=1;
		
		for(int i = 0; i<A.length; i++){
			r=r*A[i];
			
		}
		if(r<0){
			answer="NEGATIVE";
		}else if(r>0){
			answer="POSITIVE";
		}else{
			answer="ZERO";
		}
		
		return answer;
	}

}
