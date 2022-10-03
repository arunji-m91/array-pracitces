package single.dimension.array;

import java.util.Arrays;

public class SingleArray {

	public static void main(String[] args) {
		//int a[] = new int[4];//datatype variable[]=new datatype[size of array];
		
	int a[]= {10,20,30,40,50,60,70,80};
	int len=a.length;                   //a.length =find length of the array
   System.out.println(len);        //here 8 is length of the array
	for (int i = 0; i <= len-1; i++) {
		System.out.println(a[i]);
	}
	System.out.println(a);
	String s=a.toString();
	System.out.println(s);
	System.out.println(Arrays.toString(a));
		
	}
}


