package single.dimension.array;

public class ForEachArrayLoop {

	public static void main(String[] args) {
		
		int a[] =new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
		//a[5]=6; //array size 5 so 0,1,2,3,4 if 5 means out of bount exception
		for(int i:a) {
			System.out.println(i);//for each loop just print i itself
		}
		System.out.println("===============================");
		
		String b[]=new String[4];
		b[0]="arun";
		b[1]="kumar";
		b[2]="meera";
		b[3]="m"; //we dont use single quote for string array
		 for(String j :b) {
			 System.out.println(j);
		 }
		System.out.println("========================================");
		
		

	}

}
