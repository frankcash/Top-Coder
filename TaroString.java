/*
 * Cat Taro has a string S. He wants to obtain the string "CAT" from the string S. In a single turn he can choose any character and erase all occurrences of this character in S. He can do as many turns as he wants (possibly zero).
 */


/*
 * @author cfcash
 * 217/250
 */
public class TaroString {

	public String getAnswer(String S) {
		S=S.toUpperCase();
		String answer = "Impossible";
		if((S.indexOf("C")<S.indexOf("A")) && (S.indexOf("A")<S.indexOf("T")) ){
			if(S.lastIndexOf("C")==S.indexOf("C")){
				if(S.lastIndexOf("A")==S.indexOf("A")){
					if(S.lastIndexOf("T")==S.indexOf("T")){
						answer = "Possible";
					}
				}
			}
		}
		return answer;
	}


}
