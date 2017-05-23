/**
 *BookSerializedIOImpl.java
 * class that in-charge of Serialize and de-serialize
 * object from/to file   
 * @version      1.0 2 Aug 2015
 * @author       Christopher R. Francisco
 */


package com.library.model.business.service.bookservice;

import com.library.model.domain.Book;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class BookSerializedIOImpl implements IBookSvc {
    
    private File libraryFile = null;     //creat a variable of File and set it to null

    
    /** 
*write method store serialized book object to file 
*use to save book data to the file 
*   @param  book: it pass Book object as the param
*   @return Book: it return book object back to method
*/
    @Override
    public Book write(Book book) throws Exception {
        
        libraryFile = new File ("TestFile.lib");        //construct a File 
        
       if(!libraryFile.exists()) {
           
         libraryFile.createNewFile();             //create new file if file not found
         throw new FileNotFoundException();      //throw exception if file not found
        
        
    }
        else
       
       {
       
        FileOutputStream bookFos = new FileOutputStream (libraryFile);       //create an output file stream
        ObjectOutputStream insertObject = new ObjectOutputStream (bookFos);   //create an output object stream
        insertObject.writeObject(book);       //write book to file 
        insertObject.flush();

        return book;          // return book to method 
        
   
            
    }
    
       }

/** 
*read method to de-serialized file to book object
*use to retrieve file and for testing purpose  
*   @param String isbn: isbn value to be query to the database
*   @return Book: it return book object back to method
*/    
    
    @Override
    public Book read(String filename) throws Exception {
        
        libraryFile = new File (filename);          //Construct a file 
        
        if(!libraryFile.exists()){
            throw new FileNotFoundException();         //throw exception if file does not exist 
        }
       
        else{
        
        FileInputStream bookFis = new FileInputStream(libraryFile);   //create an input file stream
        ObjectInputStream input = new ObjectInputStream(bookFis);     //create an input object stream
        Book retrivedBook = new Book ();                               //deserialize file to object
        return retrivedBook = (Book) input.readObject();              //return object 
        
    }

    }


}
    

  