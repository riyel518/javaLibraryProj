/**
 *Author.java
 * This is a class for the Author
 * This class define the  
 * Attribute and Methods for the author's class   
 * @version      1.0 18 July 2015
 * @author       Christopher R. Francisco
 */
package com.library.model.domain;

import java.io.Serializable;
import java.util.Objects;


public class Author implements Serializable  {
    
    private String lastName;       //The authors last name 
    private String firstName;      // the authros first name 

    
/** 
*Class construction method for the Author without param
*Use to construct an Author's object 
*   @param no param
*   @return No Return Value 
*/   
    
    public Author() {
    }
    
    
/** 
*Class construct method for the authors with param
*Use to initialize an object when the object is being constructed
*   @param lastName: last name of author; firstName: first name of authors
*   @return No Return Value 
*/    
    

    public Author(String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }

    
/** 
*To set the author's last name on the author object properties
*use as a setter 
*   @param String lastName: it pass a string lastName to the methods 
*   @return void 
*/    
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

/** 
*To set the author's first name on the author object properties
*use as a setter
*   @param String firstName: it pass a string firstName to the methods 
*   @return void 
*/       
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

/** 
*To get the author's last name from the class
*Use as a getter 
*   @param No Param
*   @return String: it return a string of  author's last name to the method
*/
    public String getLastName() {
        return lastName;
    }

/** 
*To get the author's last name from the class
*use as a getter
*   @param No Param
*   @return String: it return a string of  author's first name to the method
*/    
    
    public String getFirstName() {
        return firstName;
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
        final Author other = (Author) obj;
        if (!Objects.equals(this.lastName, other.lastName)) {
            return false;
        }
        if (!Objects.equals(this.firstName, other.firstName)) {
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
                   if (lastName == null || lastName.equals("")){
                       return false;
                   }
                   if (firstName == null || firstName.equals("")){
                       return false;
                   }
                   return true;
       }

 /** 
*ToString method to dump the content of the class
*Used to see the content of the class
*   @param No Peram
*   @return String: it return information of the authors to the methods 
*/      
    
       @Override
    public String toString() {
        return  " (" + lastName + ", " + firstName + ")";
    }

}