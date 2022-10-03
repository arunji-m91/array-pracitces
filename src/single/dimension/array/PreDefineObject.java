package single.dimension.array;

public class PreDefineObject {

	public static void main(String[] args) {
	/*
	 Object is a predefined class in jave .
	 in array we can store the similar datatypes but in object we can use
	 various datatype into the single array
    */
		Object o []=new Object[4];//syntax for object array
		o[0]="arun";
		o[1]=52;
		o[2]='d';
		o[3]="25.36";
		for(Object i :o) {
			System.out.println(i);
		} 
		
		
		
		
		
		

	}

}
