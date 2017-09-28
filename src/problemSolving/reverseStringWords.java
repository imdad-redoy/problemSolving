package problemSolving;

public class reverseStringWords {
	
	public static void main(String[] args) {
		
		//System.out.print("The reverse is :" + reverse("Imdad Hossain Redoy"));
	//}
	
	
	


	//public static  String reverse(String s){
		
	
	String s="imdad shaheb";
	int blank=s.length();
	String s2="";
	
	for(int i=s.length()-1;i>=0;i--){
		if(s.charAt(i)==' '){
			s2+=s.substring(i+1, blank)+" ";
			blank=i;
		}	
		else if( i==0){
			s2+=s.substring(i, blank)+" ";
			blank=i;
		}
		}
	System.out.print(s2);
	}
}
