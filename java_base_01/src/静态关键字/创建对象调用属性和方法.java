package ��̬�ؼ���;


public class ��������������Ժͷ��� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��������,�������Ժͷ���
		Student s1 = new Student();
		s1.name="����";
		s1.age=34;
		System.out.println(s1.name);
		System.out.println(s1.age);
		s1.study();
		s1.sleep();
		System.out.println("====");
		Student s2 = new Student();
		s2.name="����";
		s2.age=18;
		System.out.println(s2.name);
		System.out.println(s2.age);
		s2.study();
		s2.sleep();
		System.out.println("====");
		System.out.println(s1);
		System.out.println(s2);	
	}
}
