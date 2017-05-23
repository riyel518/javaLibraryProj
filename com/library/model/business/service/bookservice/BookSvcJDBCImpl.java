/**
 *BookSvcJDBCImpl.java
 * class that in-charge writing and reading 
 * object from/to database    
 * @version      1.0 9 Aug 2015
 * @author       Christopher R. Francisco
 */

package com.library.model.business.service.bookservice;

import com.library.model.domain.Author;
import com.library.model.domain.Book;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class BookSvcJDBCImpl implements IBookSvc {
    
    private String connString = "jdbc:mysql://localhost/library?user=root&password=1234";  //Load database driver
    private Connection getConnection() throws Exception {
        return DriverManager.getConnection(connString);
        
        
    }

     private ResultSet bookData = null;       //create variable resulset 
    
     
      /** 
*write method to store book data to database 
*use to save book data to database. 
*   @param  book: it pass Book object as the param
*   @return Book: it return book object back to method
*/   
     
    @Override
    public Book write(Book book) throws Exception {
        
        Connection conn = getConnection();                     //get Connected
        ArrayList authors =  new ArrayList();                 //use to get authors information
        authors = (ArrayList) book.getAuthorList();
        Author bookAuthor = new Author ();
        int arraySize = 0;                                    //counter
        
        try{
            Statement stmt = conn.createStatement();
	    String sql = "INSERT INTO book (isbn)" + "VALUES ('"+ book.getIsbn() +"') ";     //sql preparaded statment
	    stmt.executeUpdate(sql);
            
            while( arraySize < authors.size()){            //loop to insert authors to the database
                bookAuthor = (Author) authors.get(arraySize);
                String sql2 = "INSERT INTO authors (isbn, lastName, firstName)" + "VALUES ('"+ book.getIsbn() +"', '"+ bookAuthor.getLastName() +"', '"+ bookAuthor.getFirstName() +"' ) ";
                stmt.executeUpdate(sql2);
                arraySize++;
            }
            
            return book;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally {
            
            if (conn != null) conn.close();
            
        }
                
        return book = null;
        
    }
    
/** 
*read method allow to query book data from database 
*use to fetch data from the database   
*   @param String fileName: specify the file's filename
*   @return Book: it return book object back to method
*/    

    
    @Override
    public Book read(String search) throws Exception {
        
        Book fetchBook = null;
        Author bookAuthor = null;
        List <Author> authorList = new ArrayList();
        String isbnBook = null;
        
        Connection conn = getConnection();                  //get connected 
        
       try {
            Statement stmt = conn.createStatement();
	    String sql = ("Select isbn, lastName, firstName FROM authors WHERE isbn= " + "'" + search + "'");  //sql stament
	    bookData = stmt.executeQuery(sql);               //trasfere fetch data to resultset 
            
            
            
            while(bookData.next()){              //loop to get the data from the resultset bookData 
            isbnBook = bookData.getString("isbn");
            bookAuthor = new Author(bookData.getString("lastName"), bookData.getString("firstName"));
            authorList.add(bookAuthor);
            
            }
            
            fetchBook = new Book (isbnBook, authorList);
            return fetchBook;
            
        }catch(Exception e){
            
            JOptionPane.showMessageDialog(null, e);
       
        }finally {
            
            if (conn != null) conn.close();
            
        }
                
          return fetchBook = null;
           
            
            
            }
    

  
    
}
