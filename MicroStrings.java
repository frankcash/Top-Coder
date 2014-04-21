/*
 * Each such progression defines one MicroString, as follows: You take all the non-negative elements, convert each of them into a string, and then concatenate those strings (in order).
 *For example, let A=12 and D=5. For these values we get the arithmetic progression (12, 7, 2, -3, -8, ...). The non-negative elements are 12, 7, and 2. The corresponding strings are "12", "7", and "2". Their concatenation is the following MicroString: "1272".
 */

/*
 * @author cfcash
 * 229/250 points
 */

public class MicroStrings {

	public String makeMicroString(int A, int D) {
		String result = "";
		result+=A;
		while ((A-D)>=0){
			A=A-D;
			result +=A;
		}	
		return result;
	}
}
