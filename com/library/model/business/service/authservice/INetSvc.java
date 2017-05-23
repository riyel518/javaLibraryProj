/**
 *INetSvc.java
 * a public interface for network connection service
 * Use to connect application to remote service verification  
 * @version      1.0 16 Aug 2015
 * @author       Christopher R. Francisco
 */
package com.library.model.business.service.authservice;

import com.library.model.business.service.IService;


public interface INetSvc extends IService {
    
/** 
*to verify login credential from the remote server
*use to verified user credential to grant access to application
*   @param String userNamePass: pass the string of credential to the method
*   @return boolean: return boolean if user can be grant access
*/ 
    public boolean login(String userNamePass)throws Exception;
    
}
