package main;

import java.io.Serializable;

/**
* @generated
*/
public class User implements Serializable {
    
    /**
    * @generated
    */
    private String firstName;
    
    /**
    * @generated
    */
    private String lastName;
    
    /**
    * @generated
    */
    private String email;
    
    /**
    * @generated
    */
    private String id;
    
    /**
    * @generated
    */
    private String login;
    
    /**
    * @generated
    */
    private String password;
    
    
    /**
    * @generated
    */
    private String getFirstName() {
        return this.firstName;
    }
    
    /**
    * @generated
    */
    private String setFirstName(String firstName) {
        return this.firstName = firstName;
    }
    
    /**
    * @generated
    */
    private String getLastName() {
        return this.lastName;
    }
    
    /**
    * @generated
    */
    private void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    /**
    * @generated
    */
    private String getEmail() {
        return this.email;
    }
    
    /**
    * @generated
    */
    private void setEmail(String email) {
        this.email = email;
    }
    
    /**
    * @generated
    */
    private String getId() {
        return this.id;
    }
    
    /**
    * @generated
    */
    private void setId(String id) {
        this.id = id;
    }
    
    /**
    * @generated
    */
    private String getLogin() {
        return this.login;
    }
    
    /**
    * @generated
    */
    private void setLogin(String login) {
        this.login = login;
    }
    
    /**
    * @generated
    */
    private String getPassword() {
        return this.password;
    }
    
    /**
    * @generated
    */
    private void setPassword(String password) {
        this.password = password;
    }
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public boolean signIn(String login, String password) {
        //TODO
    	return true;
    }
    /**
    * @generated
    */
    public boolean changePassword(String password) {
        //TODO
    	return true;
    }
    /**
    * @generated
    */
    public void showInfo() {
        //TODO
    }
}