package ��̬�ؼ���;


public class static�ؼ��� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//static�ؼ���
		Teacher.age=30;
		Teacher.sleep();
		System.out.println(Teacher.age);
//		System.out.println(Teacher.name);
		System.out.println("====");
		Teacher teacher = new Teacher();
		teacher.name="��ΰ";
		teacher.eat();
		System.out.println(teacher.name);
		System.out.println(teacher.age);
		teacher.sleep();
		

	}

}
