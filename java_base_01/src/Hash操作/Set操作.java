package Hash����;

import java.util.HashSet;
import java.util.Iterator;

public class Set���� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("abc");
		set.add("����");
		set.add("123");
		System.out.println(set);
		System.out.println("=====");
		for(String s : set){
			System.out.println(s);
		}
		System.out.println("=====");
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String s = iterator.next();
			System.out.println(s);
		}
	}

}
