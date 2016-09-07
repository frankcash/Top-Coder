import java.util.regex.*; 
/**
 * 201.97/250
 * Sept 06, 2016
 * @author cfcash
 * @problem When people whisper to each other in the TopCoder arena, they type "/msg " (quotes and angle brackets for clarity only). However, TopCoder allows users to have spaces in their names. This leads to some ambiguity in regards to who a whisper is actually addressed to. For examples if a user types in "/msg John Doe hi there", this could interpreted in a number of ways. It could be that the user is trying to send the message "Doe hi there" to a user named "John" or it could be that the message is to a user "John Doe", and has content "hi there".
 * To figure this out you should take a list of users who are logged in, and determine, of the users that the message could possibly be to, which one has the longest name. It may only be to a user if it starts exactly with "/msg ". That is, "/msg " followed by a single space, followed by the user's handle, followed by another space. Thus, if someone typed in "/msg John Doe hi there" and the people logged in were {"John","John Doe","John Doe h"}, the message could be to either "John Doe" or "John" (but not "John Doe h" because there is not a space following his handle in the typed string). Of those two, "John Doe" has the longer name, so we assume it is to him.
 * Additionally, all whispering is case insensitive, so "/msg John Doe hi there" will go to the same person as "/MSG jOHN dOE HI THERE".
 * If there is no user who the message could be to return "user is not logged in" (see examples) 
 * If typed does not begin with "/msg " return "not a whisper" (note that there is a space at the end of "/msg ").
 *
 */
public class Whisper {
	
	
	public String toWhom(String[] usernames, String typed){
		String patternMesg = "(?i)msg";
		Pattern e = Pattern.compile(patternMesg);
		Matcher f = e.matcher(typed);
		if(!f.find()){
			return "not a whisper";
		}
		
		String user = "user is not logged in";
		String pattern = "";
		String longest = "";
		
		for(int i = 0; i < usernames.length; i++){
			pattern = " " + "(?i)" + usernames[i] + " ";
			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(typed);
			if((usernames[i].length()> longest.length()) && m.find() ){
				user = usernames[i];
			}
		}
		
		
		return user;
	}

}
