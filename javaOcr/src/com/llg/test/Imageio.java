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
		//Java Image I/O API 会自动探测图片的格式并调用对应的插件进行解码，当安装了一个新 插件，新的格式会被自动理解，程序代码不需要改变。


		ImageIO.write(bi, "png",f1 );

	}

}
