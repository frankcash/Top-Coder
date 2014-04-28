//Computers tend to store dates and times as single numbers which represent the number of seconds or milliseconds since a particular date. Your task in this problem is to write a method whatTime, which takes an int, seconds, representing the number of seconds since midnight on some day, and returns a String formatted as "<H>:<M>:<S>". Here, <H> represents the number of complete hours since midnight, <M> represents the number of complete minutes since the last complete hour ended, and <S> represents the number of seconds since the last complete minute ended. Each of <H>, <M>, and <S> should be an integer, with no extra leading 0's. Thus, if seconds is 0, you should return "0:0:0", while if seconds is 3661, you should return "1:1:1".

/*
 * @author frankcash
 * 151/200 points
 */

public class Time {

	public String whatTime(int seconds) { // change to string
		
		double ne = 0.0;
		
		int minutes =seconds/60; // into minutes
		int hours = minutes/60;
		int sec = minutes%60;
		int total = seconds-((hours*60*60) + (sec*60));
		
		
		String time =hours+":" + sec+ ":" + total;
		
		return time;
	}

}
