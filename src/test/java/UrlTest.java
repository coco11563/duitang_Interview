import org.apache.log4j.Logger;
import org.junit.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by coco1 on 2017/2/16.
 */
public class UrlTest {
    private final static Logger logger = Logger.getLogger(UrlTest.class);
    @Test
    public void urlTest(){
        String url = "http://localhost:8080/answer/?l=80,2,4,5,2,0";
        try {
            String response=pcn_connUrl(url);
            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String pcn_connUrl(String url){
        URL getUrl;
        BufferedReader br = null;
        StringBuffer buffer = new StringBuffer() ;
        try
        {
            getUrl = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) getUrl.openConnection();
            connection.setConnectTimeout(30*1000);
            connection.connect();
            InputStreamReader isr = new InputStreamReader(connection.getInputStream(),"utf-8");
            br = new BufferedReader(isr);
            int s;
            while((s = br.read())!=-1)
            {
                buffer.append((char)s);
            }
        }
        catch (IOException e)
        {
            logger.error("error",e);

        }
        return  buffer.toString() ;
    }
}

