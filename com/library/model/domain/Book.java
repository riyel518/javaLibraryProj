/**
 *Book.java
 * This is a class for the book
 * This class define the  
 * Attribute and Methods for the book class   
 * @version      2.0 19 July 2015
 * @author       Christopher R. Francisco
 */
package com.library.model.domain;

import java.io.Serializable;
import java.util.ArrayList;          //ArrayList Library 
import java.util.List;               //List Interface Library
import java.util.Objects;


public class Book implements Serializable {
    
   
    private String isbn;                                    //define isbn attribute for the book
    private List <Author> authorList = new ArrayList();    // Create a list collection object for authors
    

/** 
*Class construction method for the book
*Use to construct a book object 
*   @param no param
*   @return No Return Value 
*/
    public Book() {
    }

/** 
*Class construct method for the book with initialization
*Use to initialize an object when the object is being constructed
*   @param isbn: isbn of the book, authoList: Collection of author in a list
*   @return No Return Value 
*/
       
    public Book(String isbn, List<Author> authorList) {
 
        this.isbn = isbn;
        this.authorList = authorList; 
    }
    
/** 
*To get a an author properties from the class
*It use to return author properties from the book class
*   @param No Peram
*   @return List <author>: it return a collection object of the author 
*/
    
    public List <Author> getAuthorList() {
        return authorList;
    }
 
/** 
*To set the collection list author to the class author properties
*use as setter of author collection in the class
*   @param List<Author>: pass the list collection author to the method
*   @return void
*/
    
    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }
    
/** 
*To get the book isbn from the class
*Use to getter for the isbn properties of the clas
*   @param No Peram
*   @return String: it return a string of isbn to the methods. 
*/
    
    public String getIsbn() {
        return isbn;
    }
    
/** 
*To set the book's isbn information to the book class
*use as a setter 
*   @param String isbn: it pass a string isbn to the methods 
*   @return void 
*/
    
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    
    
/** 
*To add author object to the author collection in the book class
*Use to add object to the collection in the clas
*   @param Author authorToAdd: the author object that will be add to the collection
*   @return void 
*/    
    
    public void addAuthors (Author authorToAdd){
        
        authorList.add(authorToAdd);
          
        
    }
    
    
/** 
*To remove selected author to the author collection in the book class
*Use to delete or remove object in the collection 
*   @param int authorToRemove: the index location of author object to remove in collection
*   @return, Author: it return the removed author object to the method. 
*/      
    
    public Author removeAuthors(int authorToRemove){
        
        Author removeAuthor = authorList.remove(authorToRemove);
        
        return removeAuthor;
     
    }
    

/** 
*An equal method to test if the object is of equal
*Use for the JUnit testing 
*   @param Object obj: it pass the object to the method
*   @return boolean: it return true if the object is equal. return false if its not 
*/

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Book other = (Book) obj;
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        if (!Objects.equals(this.authorList, other.authorList)) {
            return false;
        }
        return true;
    }


/** 
*To validate if its object has value or it is null
*Use to test if there's data in the object 
*   @param No Param
*   @return boolean. it return true if has data. It return false if no data 
*/
      
   public boolean validate(){
                   if (authorList == null || authorList.isEmpty()){
                       return false;
                   }
                  else if (isbn == null || isbn.equals("")){
                       return false;
                   }
                   
                   return true;
                               
       
              }

/** 
*ToString method to dump the content of the class
*Used to see the content of the class
*   @param No Peram
*   @return String: it return information of the book to the methods 
*/   
   
    @Override
    public String toString() {
        return "Book{" + "isbn=" + isbn + ", authorList= " + authorList + '}';
    }



 
    
}
