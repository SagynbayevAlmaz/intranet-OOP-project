package main;

import java.util.List;

/**
* @generated
*/
public class Employee extends User {
    
    /**
    * @generated
    */
    private Integer salary;
    
    /**
    * @generated
    */
    private double workExperience;
    
    /**
    * @generated
    */
    private List<Message> messages;
    
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
    private Message message;
    
    
    /**
    * @generated
    */
    private Integer getSalary() {
        return this.salary;
    }
    
    /**
    * @generated
    */
    private void setSalary(Integer salary) {
        this.salary = salary;
    }
    
    /**
    * @generated
    */
    private double getWorkExperience() {
        return this.workExperience;
    }
    
    /**
    * @generated
    */
    private void setWorkExperience(double workExperience) {
        this.workExperience = workExperience;
    }
    
    /**
    * @generated
    */
    private List<Message> getMessages() {
        return this.messages;
    }
    
    /**
    * @generated
    */
    private void setMessages(List<Message> messages) {
        this.messages = messages;
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
    
    
    /**
    * @generated
    */
    public Message getMessage() {
        return this.message;
    }
    
    /**
    * @generated
    */
    public void setMessage(Message message) {
        this.message = message;
    }
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public void sendMessage(Message message) {
        //TODO
    }
    /**
    * @generated
    */
    public void sendOrder(Order order, TechSupportGuy executor) {
        //TODO
    }
    /**
    * @generated
    */
    public void updateSalary(int newSalary) {
        //TODO
    	this.salary += newSalary;
    }
    
}
