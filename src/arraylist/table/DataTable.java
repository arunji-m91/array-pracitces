package arraylist.table;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataTable {

	public static void main(String[] args) {
		
//1d without heading
		List<String> l = new ArrayList<String>();
		l.add("arun");
		l.add("arun@gmail.com");
		l.add("java");

		String string = l.get(0);
		String string2 = l.get(1);
		String string3 = l.get(2);
		System.out.println(string + " " + string2 + " " + string3);
		for (int i = 0; i < l.size(); i++) {

			String string4 = l.get(i);
			System.out.println(string4);

		}
		System.out.println("================================");

		// 2d without heading

		List<ArrayList<String>> emp = new ArrayList<ArrayList<String>>();

		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("kumari");
		a1.add("kumari@gmail.com");
		a1.add("c++");
		ArrayList<String> a2 = new ArrayList<String>();

		a2.add("meera");
		a2.add("meera@gmail.com");
		a2.add("python");
		ArrayList<String> a3 = new ArrayList<String>();

		a3.add("ram");
		a3.add("ram@gmail.com");
		a3.add("python");

		ArrayList<String> a4 = new ArrayList<String>();
		a4.add("ks");
		a4.add("ks@gmail.com");
		a4.add("c#");

		emp.add(a1);
		emp.add(a2);
		emp.add(a3);
		emp.add(a4);

		ArrayList<String> arrayList = emp.get(3);
		System.out.println(arrayList);
		String string4 = arrayList.get(1);
		System.out.println(string4);
		System.err.println("=========================");

		// 1d with heading
		Map<String, String> m = new LinkedHashMap<String, String>();
		m.put("name", "arun");
		m.put("email", "arun@91@gmail.com");
		m.put("course", "java");

		String string5 = m.get("email");
		System.out.println(string5);

		// 2d with heading
		LinkedHashMap<String, String> m1 = new LinkedHashMap<String, String>();
		m1.put("name", "arun");
		m1.put("email", "arun@91@gmail.com");
		m1.put("course", "java");
		
		LinkedHashMap<String, String> m2 = new LinkedHashMap<String, String>();
		m2.put("name", "sss");
		m2.put("email", "sss@91@gmail.com");
		m2.put("course", "xxx");
		
		LinkedHashMap<String, String> m3 = new LinkedHashMap<String, String>();
		m3.put("name", "ggg");
		m3.put("email", "ggg@91@gmail.com");
		m3.put("course", "hgh");

		LinkedHashMap<String, String> m4 = new LinkedHashMap<String, String>();
		m4.put("name", "qqq");
		m4.put("email", "qqq@91@gmail.com");
		m4.put("course", "ttt");

		List<LinkedHashMap<String,String>> emp1 = new ArrayList<LinkedHashMap<String,String>>();
		emp1.add(m1);
		emp1.add(m2);
		emp1.add(m3);
		emp1.add(m4);
		LinkedHashMap<String,String> linkedHashMap = emp1.get(2);
		System.out.println(linkedHashMap);
		String string6 = linkedHashMap.get("name");
		System.out.println(string6);
		
	}

}
