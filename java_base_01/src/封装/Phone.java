package ��װ;

public class Phone {
	private String brand;
	private int price;
	public void setBrand(String brand){
		//���ַ�װ��������˴���Ŀ�ά����
		//if�������˴���İ�ȫ��
		if (brand == "����"){
			System.out.println("��������!");	
		}else{
			this.brand = brand;
		}
	}
	public String getBrand(){
		return this.brand;
	}
}
