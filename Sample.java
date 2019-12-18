package httpurl;


import java.io.*;    
import java.net.*;  


public class Sample {    


    public static void main(String[] args) throws MalformedURLException, IOException {
        

        String url = "https://www.google.com";
        URL webpage = new URL(url);
        
        try {
        HttpURLConnection connect = (HttpURLConnection) webpage.openConnection();
        
        BufferedReader in = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        
        int status = connect.getResponseCode();
        System.out.println("Response: " + status);
        
        String page;              
        while((page = in.readLine()) != null) {
            System.out.println(page);
        }
        
        in.close();
        connect.disconnect();
        } catch (MalformedURLException e) {
            System.out.println(url + ": is URL correct?");
        } catch (UnknownHostException e) {
            System.out.println(url + " nothing found, check connection or path");
        }
    }
    
}