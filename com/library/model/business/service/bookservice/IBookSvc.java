/**
 *IBookSvc.java
 * a public interface for book service
 * An interface for reading and writing object.  
 * @version      3.0 9 Aug 2015
 * @author       Christopher R. Francisco
 */

package com.library.model.business.service.bookservice;

import com.library.model.business.service.IService;
import com.library.model.domain.Book;

public interface IBookSvc extends IService {
    
/** 
*write interface for writing object to location
*use to write or send object to location
*   @param: book: book object
*   @return book: return book object to method
*/ 
    public Book write(Book book) throws Exception;
    
/** 
*read interface for writing object to location
*use to write or send object to location
*   @param: String filename: location to retrieve book data
*   @return book: return book object to method
*/ 
    
 public Book read(String isbn) throws Exception;
    



}