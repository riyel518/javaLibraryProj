/**
 *AuthManager.java
 * AuthManager class define all the necessary method and attribute
 * for the business layer of the application.  
 * @version      1.0 16 Aug 2015
 * @author       Christopher R. Francisco
 */
package com.library.model.business.manager;

import com.library.model.business.factory.ServiceFactory;
import com.library.model.business.service.authservice.INetSvc;
import java.util.logging.Logger;

public class AuthManager {
    
  
/** 
*loginManager method allow to connect to remote server to verify credential
*use to verify login credential 
*   @param String userNamePass: pass the string of credential to the method
*   @return boolean: return boolean if user can be grant access
*/
    
    public static boolean loginManager(String userNamePass) throws Exception{

           ServiceFactory serviceFactory = new ServiceFactory();   
           INetSvc netSvc = (INetSvc) serviceFactory.getService("INetSvc"); 
           boolean getVerified = netSvc.login(userNamePass);
             
              if(!getVerified)
                  throw new Exception();
                     
              else 
                  return getVerified;
                 
}

}