package us.codecraft.webmagic;

import java.io.*;
import java.net.*;

public class DownloadImage {
	public static void download(String urlString, String filename,String savePath) throws Exception {
        // ����URL
        URL url = new URL(urlString);
        // ������
        URLConnection con = url.openConnection();
        //��������ʱΪ5s
        con.setConnectTimeout(5*1000);
        // ������
        InputStream is = con.getInputStream();

        // 1K�����ݻ���
        byte[] bs = new byte[1024];
        // ��ȡ�������ݳ���
        int len;
        // ������ļ���
        File sf=new File(savePath);
        if(!sf.exists()){
            sf.mkdirs();
        }
        OutputStream os = new FileOutputStream(sf.getPath()+"\\"+filename);
        // ��ʼ��ȡ
        while ((len = is.read(bs)) != -1) {
            os.write(bs, 0, len);
        }
        // ��ϣ��ر���������
        os.close();
        is.close();
    }
}