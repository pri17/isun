package com.example.myisun.json;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import android.util.Log;

/**
  	�ӷ����������ȡ��JSON���ݸ�ʽ���ַ���
 */
public class HttpUtils {

    public HttpUtils() {
        // TODO Auto-generated constructor stub
    }

    public static String getJsonContent(String url_path) {
    	try{
            URL url = new URL(url_path);
            Log.v("getjson","is:"+url.toString());
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(9000); // ����ʱʱ��3s
            connection.setRequestMethod("GET");
            connection.setDoInput(true);
            int code = connection.getResponseCode(); // ����״̬��
            Log.v("dff",""+code);
           // if (code == 200) {
                // ��õ�����������ʱ�������Ѿ������˷���˷��ػ�����JSON������,��ʱ��Ҫ�������ת�����ַ���
                return changeInputStream(connection.getInputStream());
           // }
        } catch (Exception e) {
           Log.v("8786","wrong:"+e.toString());
        }
        return "";
        
        }

    private static String changeInputStream(InputStream inputStream) {
        // TODO Auto-generated method stub
        String jsonString = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int length = 0;
        byte[] data = new byte[1024];
        try {
            while (-1 != (length = inputStream.read(data))) {
                outputStream.write(data, 0, length);
            }
            // inputStream�������õ�����д��ByteArrayOutputStream����,
            // Ȼ��ͨ��outputStream.toByteArrayת���ֽ����飬��ͨ��new String()����һ���µ��ַ�����
            jsonString = new String(outputStream.toByteArray());
        } catch (Exception e) {
            // TODO: handle exception
        }
        return jsonString;
    }
}
