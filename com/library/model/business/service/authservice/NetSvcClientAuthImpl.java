/**
 *NetSvcClientAuthImpl.java
 * class that in-charge connecting to the server for
 * verifying user credential  
 * @version      1.0 16 Aug 2015
 * @author       Christopher R. Francisco
 */
package com.library.model.business.service.authservice;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;


public class NetSvcClientAuthImpl implements INetSvc {

    private Socket socket = null;
    private ObjectInputStream in = null;
    private ObjectOutputStream out = null;
    private boolean verifyLogin = false;
    
    /** 
*to verify login credential from the remote server
*use to verified user credential to grant access to application
*   @param String userNamePass: pass the string of credential to the method
*   @return boolean: return boolean if user can be grant access
*/ 
    
    @Override
    public boolean login(String userNamePass) throws Exception {
        
        socket = new Socket(InetAddress.getLoopbackAddress(), 8000);  //create new client socket
        
        if (!socket.isConnected()){
           socket.close();
           throw new SocketException();     //throw exception if cannot be connected to server
        }
        else{
                
           in = new ObjectInputStream(socket.getInputStream());        //intantiate input object
           out = new ObjectOutputStream(socket.getOutputStream());     //intantiate out object
           out.writeObject(userNamePass);       //send creditial string to server                   
           verifyLogin = (boolean)in.readObject();     //read boolean to verified credential
           in.close();            // close input stream
           out.close();          //close output stream
           socket.close();       //close socket 
           return verifyLogin;
           
        }
    
    
    }
   
}
