package ��̬�ؼ���;

public class Student {
	String name;
	int age;
	public void study(){
		System.out.println("ѧ��ѧϰ");
	}
	public Student(String name, int age) {
		//this�ؼ��ִ��������,���ó�Ա����,����ͽ�ԭ�������
		this.name = name;
		this.age = age;
	}
	public Student() {
		// �޲ι���
	}
	public void sleep(){
		System.out.println("ѧ��˯��");
	}

}
