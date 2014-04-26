import java.util.*;
/*
 * @author frankcash
 * 183/250
 */

public class Chopsticks {

	public int getmax(int[] length) { // remove static plx
		int count = 0; 
		ArrayList<Integer> n = new ArrayList<Integer>(); // n.size()
		for(int i = 0; i<length.length; i++){
			n.add(length[i]);
		}
		for(int h=0; h<n.size();h++){
			System.out.println(n.get(h));
			for(int j=h+1;j<n.size();j++){
				System.out.println("foo"+n.get(j));
				if(n.get(h)==n.get(j)){
					n.remove(j);
					n.remove(h);
					count++;
				}
			}//
		}
		for(int h=0; h<n.size();h++){
			System.out.println(n.get(h));
			for(int j=h+1;j<n.size();j++){
				if(n.get(h)==n.get(j)){
					n.remove(j);
					n.remove(h);
					count++;
				}
			}//
		}
		return count;
	}
	 

}
