
public class Substitute {
	
	public int getInt(String key, String Code){
		
		String temp = "";
		int value = 0;
		
		for(int i = 0; i < Code.length(); i++){ // Tracking Code
			for(int j = 9; j > 0; j--){ // Tracking Key (in theory)
				if(Code.charAt(i) == key.charAt(j)){
					System.out.println("Code char:" + Code.charAt(i));
					System.out.println(j + 1);
					System.out.println("key char: "+ key.charAt(j));
					if(j+1 == 10){
						j = -1;
					}
					temp = temp + "" + Integer.toString(j+1);
					break;
				}

			}
			
		}
		System.out.println("Temp: " + temp);
		return value;
		
	}
	
}
