package ���󷽷�;

public class ��̬ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��̬
		Animal a = new Cat();
		Animal a2 = new Dog();
//		a.eat();
//		a.sleep();
//		a2.eat();
//		a2.sleep();
//		method(a);
//		method(a2);
//		����ת��(ǿת),a��cat����,a�Ǹ���ת������(����ת��(ǿת))
		Cat c = (Cat)a;
		c.play();
	}
	public static void method(Animal a){
		a.sleep();
	}
//	public static void method(Dog d){
//		d.sleep();
//	}
//	public static void method(Cat c){
//		c.sleep();
//	}
}
