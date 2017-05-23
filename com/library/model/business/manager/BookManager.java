/**
 *BookManager.java
 * BookManager class define all the necessary method and attribute
 * for the business layer of the application.  
 * @version      3.0 9 Aug 2015
 * @author       Christopher R. Francisco
 */

package com.library.model.business.manager;      

import com.library.model.business.factory.ServiceFactory;
import com.library.model.business.service.bookservice.IBookSvc;
import com.library.model.domain.Book;            //import the book class
import javax.swing.JOptionPane;


public class BookManager{


/** 
*storeBook method allow book data to be add in the mySql database  
*use to save data to database 
*   @param Book book: it pass Book object as the param
*   @return Book: it return book object back to method
*/
    
    public static Book storeBook(Book book) throws Exception{
  
         try {
        
              
        ServiceFactory serviceFactory = new ServiceFactory();     //construct new ServiceFactory
        IBookSvc bookSvc = (IBookSvc) serviceFactory.getService("IBookSvc");           //service factory to interface
        return bookSvc.write(book);                              //write the object 
       

         } catch (Exception e){
             
        JOptionPane.showMessageDialog(null, e);        //throw exception if file not found

             
         }
        return book = null;
           
    }
/** 
*retrievedBook method allow to query book data from database 
*use to fetch data from the database  
*   @param String isbn: isbn value to be query to the database
*   @return Book: it return book object back to method
*/    
    
        public static Book retrieveBook (String isbn) throws Exception{
        
        ServiceFactory serviceFactory = new ServiceFactory();          //construct a service factory
        IBookSvc bookSvc = (IBookSvc) serviceFactory.getService("IBookSvc");                 //service factory to interface
        try {
            
            return bookSvc.read(isbn);               //read file to object 
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);  //throw exception 
        }
        
        return null;
        
    }
    
    
    
    
}