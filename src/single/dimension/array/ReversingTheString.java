package single.dimension.array;

public class ReversingTheString {

	public static void main(String[] args) {
	//reversing the string in three methods
		
		String s="arun nallalam";
		int len=s.length();//find the length of 's' string use length()
		System.out.println(len);
		s.charAt(0);//zero th index value of s variable contains string
		System.out.println(s.charAt(0));
		
/*reversing string using concodinate operation*/
		
		String rev="";   //rev is empty string the reversed value stored in this
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);      // s.charAt(index) =add charactor of indexed 
			                                           //value
		}
		System.out.println(rev);
		
		
/*reversing string using characte Array operation*/
		
		
	String t="arun kumar nallalam";
	//convert this strings into char array  which means each letter have seperate char  
	// whole string in t variable is converted into char array	
	char a[]=t.toCharArray();
	int length =  a.length;    //for array use length only to find length of the array
	
	for(int i= length-1;i>=0;i--) {
		System.out.print(a[i]);
	}
	
/* by using string Builder */
	StringBuilder sb=new StringBuilder("meerasankari arun kumar nallalm");
	System.out.print(sb.reverse());
		
		
		
	}

}
