package �̳�;


public class Father extends GrandFather{
	public String name;
	private int age;
	public Father(){
		System.out.println("Father�����ʼ��");
	}
	public Father(String name,int age){
		System.out.println("Father���вι���");
		this.name = name;
		this.age = age;
	}
	public void show(){
		System.out.println("���������show����");
	}
	public void print(){
		System.out.println("print");
	}

}
