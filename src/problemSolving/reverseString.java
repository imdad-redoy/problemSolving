package problemSolving;

public class reverseString {

	public static void main(String[] args) {
		
		System.out.print("The reverse is :" + reverse("Imdad Hossain Redoy"));
	}
	
	
	


	public static String reverse(String s){
		String s2="";
		for(int i=s.length()-1; i>=0;i--){
			s2=s2+s.charAt(i);
			
		}
		return s2;
	}

}
