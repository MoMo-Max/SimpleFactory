package oo.com;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Factory {
	
	 public static Api createApi(String imp){  
	        
	//直接讀取配置properties 需要創造的實例的類
	        Properties p = new Properties();   
	        InputStream in = null;  
	        try {  
	            in = Factory.class.getResourceAsStream(  
	"FactoryTest.properties");  
	            p.load(in);  
	        } catch (IOException e) {  
	          
	            e.printStackTrace();  
	        }finally{  
	            try {  
	                in.close();  
	            } catch (IOException e) {  
	                e.printStackTrace();  
	            }  
	        }  
	        //用反射去創造
	        Api api = null;  
	        try {  
	            api = (Api)Class.forName(p.getProperty(imp))  
	.newInstance();  
	        } catch (InstantiationException e) {  
	        	System.out.println("ERROR 這裡");
	            e.printStackTrace();  
	        } catch (IllegalAccessException e) {  
	            e.printStackTrace();  
	        } catch (ClassNotFoundException e) {  
	            e.printStackTrace();  
	        }  
	        return api;  
	    }  

}
