
/**
 *BookUI.java
 * This BookUI class defined the UI's attribute and methods to interact with user
 * It use swing graphics to get book information from the user 
 * All of the book information from UI populate the book class  
 * @version      1.0 24 July 2015
 * @author       Christopher R. Francisco
 */

package com.library.view;


import static com.library.model.business.manager.BookManager.retrieveBook;
import static com.library.model.business.manager.BookManager.storeBook;
import com.library.model.domain.Author;
import com.library.model.domain.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class BookUI extends javax.swing.JFrame {

    
    private List <Author> bookAuthorsList = new ArrayList();      //Create a temporary collection of author for the book object
    private DefaultListModel myList = new DefaultListModel();;    //A default model object to be use in populating the JList field.
    

/** 
*Class construction method for the BookUI
*Use to construct a BookUI objects 
*   @param no param
*   @return No Return Value 
*/
    public BookUI() {
        initComponents();                     //Method for adding component in the JFrame
        authorsListField.setModel(myList);    //set the model object to the JList
    }
    
/** 
*clearList method clear the JTextfield for the last and firstName
*Use to clear any information from the field after add author handler fires 
*   @param 
*   @return No Return Value 
*/       
    public void clearList (){
        
        firstNameTxt.setText("");       //set the field to blank
        lastNameTxt.setText("");        //set the field to blank
        
    }
    
    

/** 
*Method to add all necessary component to the JFrame
*Cannot be edited or deleted. Auto generate by the netbeans 
*   @param: no param
*   @return No Return Value 
*/   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorsListField = new javax.swing.JList();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lastNameTxt = new javax.swing.JTextField();
        firstNameTxt = new javax.swing.JTextField();
        addAuthor = new javax.swing.JButton();
        createBook = new javax.swing.JButton();
        cancel = new javax.swing.JButton();
        removeAuthor = new javax.swing.JButton();
        isbnTxt = new javax.swing.JTextField();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Create Book");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 204));
        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Baskerville Old Face", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BOOK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Book ISBN:");

        authorsListField.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jScrollPane1.setViewportView(authorsListField);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Author(s):");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Last Name");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("First Name");

        lastNameTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        firstNameTxt.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        addAuthor.setText("Add Author");
        addAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addAuthorActionPerformed(evt);
            }
        });

        createBook.setText("Create ");
        createBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBookActionPerformed(evt);
            }
        });

        cancel.setText("Cancel");
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });

        removeAuthor.setText("Remove Author");
        removeAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeAuthorActionPerformed(evt);
            }
        });

        isbnTxt.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(createBook, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameTxt)
                                    .addComponent(lastNameTxt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                                .addComponent(addAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(removeAuthor))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lastNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(firstNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addAuthor)
                        .addGap(39, 39, 39))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(isbnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addComponent(jLabel3)
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeAuthor)
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel)
                    .addComponent(createBook))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

/** 
*Event handler (listener) for the addAuthor button
*Use to add author to the JList and the bookAuthorList 
*   @param ActionEvent: to pass the event to the methods
*   @return No Return Value 
*/       
    
    private void addAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addAuthorActionPerformed
       
       
       Author author = new Author ();                      //Construct an Author Object
       author.setFirstName(firstNameTxt.getText());        //Set the firstName for the Author Object
       author.setLastName(lastNameTxt.getText());          //Set the last name for the Author Object
       
       //Validate to check if there is data in the object
       if (author.validate())
       {
       
       
       bookAuthorsList.add(author);    //add the author to the collection
       myList.addElement(author.getFirstName() + " " + author.getLastName());   //update the JList 
       clearList();  //Clear the firtName and lastName text field 
       
       }
        else
       {
          JOptionPane.showMessageDialog(null, "ERROR: Last name and first name field cannot be blank! ");  //Issue error if blank
           
       }
    }//GEN-LAST:event_addAuthorActionPerformed

    
/** 
*Event handler / listener for the remove author button
*Use to remove author from the list before it pass to book object 
*   @param @param ActionEvent: to pass the event to the methods
*   @return No Return Value 
*/       
    
    private void removeAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeAuthorActionPerformed
        
        int removeIdx = authorsListField.getSelectedIndex();      //get the index of author to be remove from the JList
        myList.remove(removeIdx);      //remove from the JList
        bookAuthorsList.remove(removeIdx);   //remove from the collection 
      
    }//GEN-LAST:event_removeAuthorActionPerformed

    
/** 
*Event Handler / Listener to create button
*Use to populate book object with data and pass book object to business layer
*   @param ActionEvent: event is pass to the method 
*   @return No Return Value 
*/       
    
    private void createBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBookActionPerformed
             
 
         Book newBook = new Book(isbnTxt.getText(), bookAuthorsList);   //add the isbn and the author list to the book object
         
         
         //Validate if all the data populate the book object    
           if(newBook.validate())
               
           {   
              
       
             try {
                 Book bookData = new Book ();
                 bookData = storeBook(newBook);      //pass the book to bookManager object
                 Book returnData = new Book ();
          
                 
                    returnData = retrieveBook(bookData.getIsbn());
                 
            
                   JOptionPane.showMessageDialog(null, "Book Information Succesfully Added to Database\n" + "Book ISBN: " + returnData.getIsbn() + "\n Authors(s): " + returnData.getAuthorList() );  
                       

             } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null, "Error: Book not succesfully added!");
             }
           }

         
           else 
               
             JOptionPane.showMessageDialog(null, "Error: Missing ISBN, Author or Both!"); //Issue error if one of more information is missing
         
    }//GEN-LAST:event_createBookActionPerformed

/** 
*Event Handler / Listener to cancel or exit the program
*Use to cancel the book creation/add. exit the system gracefully 
*   @param ActionEvent: event is pass to the method 
*   @return No Return Value 
*/        
    
    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed
       
        System.exit(0);       //exit the system
        
    }//GEN-LAST:event_cancelActionPerformed
  
    


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addAuthor;
    private javax.swing.JList authorsListField;
    private javax.swing.JButton cancel;
    private javax.swing.JButton createBook;
    private javax.swing.JTextField firstNameTxt;
    private javax.swing.JTextField isbnTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastNameTxt;
    private javax.swing.JButton removeAuthor;
    // End of variables declaration//GEN-END:variables
}
