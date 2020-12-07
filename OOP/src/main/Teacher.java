package main;

import java.io.Serializable;
import java.util.List;

/**
* @generated
*/
public class Teacher extends Employee implements Serializable, Comparable {
    
    /**
    * @generated
    */
    private Integer salary;
    
    /**
    * @generated
    */
    private double  workExperience;
    
    /**
    * @generated
    */
    private List<Message> messages;
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
    private List<Course> courses;
    
    /**
    * @generated
    */
    private TeachingStatus teachingStatus;
    
    
    
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
    private double  getWorkExperience() {
        return this.workExperience;
    }
    
    /**
    * @generated
    */
    private void setWorkExperience(double  workExperience) {
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
    private List<Course> getCourses() {
        return this.courses;
    }
    
    /**
    * @generated
    */
    private void setCourses(List<Course> courses) {
        this.courses = courses;
    }
    
    /**
    * @generated
    */
    private TeachingStatus getTeachingStatus() {
        return this.teachingStatus;
    }
    
    /**
    * @generated
    */
    private void setTeachingStatus(TeachingStatus teachingStatus) {
        this.teachingStatus = teachingStatus;
    }
    
    

    //                          Operations                                  
    

    /**
    * @generated
    */
    public News createNews(String title, String text) {
		return null;
        //TODO
    }
    /**
    * @generated
    */
    public void addCourse(Course course) {
        //TODO
    }
    /**
    * @generated
    */
    public void putMark(Student student, Course course, MarksType marksType, double points) {
        //TODO
    }
    /**
    * @generated
    */
    public void addCourseFile(Course course, File file) {
        //TODO
    }
    /**
    * @generated
    */
    public void deleteCourseFile(Course course, File file) {
        //TODO
    }
    /**
    * @generated
    */
    public void viewCourses() {
        //TODO
    }
    /**
    * @generated
    */
    public void viewMarks(Course course) {
        //TODO
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
