package single.dimension.array;

public class Employee {
	int id;
	String name;
	long phoneNo;
	
	public Employee(int id,String name){
		
		this.id=id;
		this.name=name;
		this.phoneNo=phoneNo;
	}
public static void main(String[] args) {
	Employee arun = new Employee(20,null);
	Employee arjun = new Employee(20,"arujun");
	System.out.println(arjun.id);

	
}
}
