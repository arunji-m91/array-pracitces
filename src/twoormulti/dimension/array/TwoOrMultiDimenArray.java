package twoormulti.dimension.array;

public class TwoOrMultiDimenArray {

	public static void main(String[] args) {
		
	     //  row column row col	
		System.out.println("one checking");
		int a[][]=new int[2][4];//syntax for two or multi
    	a[0][0]=25;
		a[0][1]=26;
	    a[0][2]=27;
	    a[0][3]=28;
	    
	    a[1][0]=25;
		a[1][1]=26;
	    a[1][2]=27;
	    a[1][3]=28;
	    	
		
	for(int i=0;i<2;i++) {
		for(int j=0;j<4;j++) {
			System.out.print(" "+a[i][j]);
		}
		System.out.println();
	}

}
}
