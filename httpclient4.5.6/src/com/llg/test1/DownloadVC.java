package com.llg.test1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

public class DownloadVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet getVerifyCode = new HttpGet("http://www.oaj.pku.edu.cn/OAJ/.traceImg");//验证码get
		RequestConfig requestConfig = RequestConfig.custom()
		        .setConnectTimeout(10000)
		        .setSocketTimeout(10000).build();
        FileOutputStream fileOutputStream = null;
        HttpResponse response;
        try {
            response = client.execute(getVerifyCode);//获取验证码
            /*验证码写入文件,当前工程的根目录,保存为verifyCode.jped*/
            fileOutputStream = new FileOutputStream(new File("verifyCode.jfif"));
            response.getEntity().writeTo(fileOutputStream);
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

	}

}
