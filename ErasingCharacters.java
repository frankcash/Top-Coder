
// For example, if she receives "cieeilll", she will change the string as follows: "cieeilll" -> "ciilll" -> "clll" -> "cl". You are given a String s. Return the string she will get after she erases characters as described above

/*
 * @author cfcash
 */

public class ErasingCharacters {

	public String simulate(String s) { 
		String result = "";
		String temp = "";
		for(int i = 0; i<s.length()-1; i++){
			if(s.charAt(i)==(s.charAt(i+1))){
				temp =s.substring(0, (i)) + s.substring(i+2, s.length()); 
				s=temp;
				i=0;
			}
		}
		if(s.length()>1){
			if((s.charAt(0)==s.charAt(1)) && s.length()==2 ){
				s="";
				}
		}
		result=s;
		return result;
	}


}
