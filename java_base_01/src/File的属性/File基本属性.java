package File������;

import java.io.File;

public class File�������� {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// File��������
		File file = new File("E://1.txt");
		boolean exists = file.exists();
		System.out.println(exists);
		String name = file.getName();
		System.out.println(name);
	}

}
