package com.llg.test;
import javax.imageio.*;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Imageio {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*String readFormats[] = ImageIO.getReaderFormatNames();
		String writeFormats[] = ImageIO.getWriterFormatNames();
		System.out.println("Readers:" + Arrays.asList(readFormats));
		System.out.println("Writers:" + Arrays.asList(writeFormats));*/
		
		File f = new File("D:\\test.png");
		
		BufferedImage bi = ImageIO.read(f);
		File f1 = new File("D:\\test2.jpg");
		//Java Image I/O API ���Զ�̽��ͼƬ�ĸ�ʽ�����ö�Ӧ�Ĳ�����н��룬����װ��һ���� ������µĸ�ʽ�ᱻ�Զ���⣬������벻��Ҫ�ı䡣


		ImageIO.write(bi, "png",f1 );

	}

}
