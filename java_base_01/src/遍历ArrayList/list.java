package ����ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class list {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(123);
		list.add(456);
		list.add(789);
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
//		1.�õ�����
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		
//		System.out.println("=====");
		
//		2.������for�͵�����
		for(Integer i : list){
			System.out.println(i);
		}
		//������
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()){
			Integer i = iterator.next();
			System.out.println();
		}
	}

}
