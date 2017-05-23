/**
 *ServiceFactory.java
 * a class with a collection of service 
 * for the business layer of the application.  
 * @version      3.0 9 Aug 2015
 * @author       Christopher R. Francisco
 */


package com.library.model.business.factory;

import com.library.model.business.service.IService;
import com.library.model.business.service.bookservice.*;
import java.io.FileInputStream;
import java.util.Properties;


public class ServiceFactory {
    
    
/** 
*It get book service require to process user request
*use to return service back to method   
*   @param: serviceName: to get the name service
*   @return Iservice: it return an IService interface back to method
*/  
    
    public IService getService(String serviceName) throws Exception {
            Class c = Class.forName(getImplName(serviceName));
		return (IService) c.newInstance();
    }
    
/** 
*a method to fetch a configuration file from properties.txt
*use to fetch key=value pair configuration
*   @param: serviceName: to get the name service
*   @return String: return the string service name required 
*/    
    
    private String getImplName(String serviceName) throws Exception {
		FileInputStream fis = new FileInputStream("config/properties.txt");
		Properties props = new Properties();
 		props.load(fis);
		fis.close();
		return props.getProperty(serviceName);
   }
}
    

        
        

    
    

