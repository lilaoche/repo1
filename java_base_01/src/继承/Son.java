package �̳�;


public class Son extends Father{
	public Son(){
//		������ø���Ŀղι���
//		super();
//		���ø���Ĺ���
		super("����",18);
		System.out.println("son�����ʼ��");
	}
	public void hello(){
		System.out.println("Hello");
//		super���������
		super.play();
		//���ø����show����
		super.show();
	}
	public void show(){
		//��������д
		//1.��ȫ���츸������
		//2.��ԭ�и���Ļ���������
		super.show();
		System.out.println("�����show����");
	}
}
