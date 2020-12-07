package main;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;

/**
* @generated
*/
public class Course implements Serializable, Comparable {
    
    /**
    * @generated
    */
    private String courseName;
    
    /**
    * @generated
    */
    private Integer credits;
    
    /**
    * @generated
    */
    private String description;
    
    /**
    * @generated
    */
    private String courseCode;
    
    /**
    * @generated
    */
    private boolean isAvailable;
    
    /**
    * @generated
    */
    private Teacher teacher;
    
    /**
    * @generated
    */
    private List<Student> students;
    
    /**
    * @generated
    */
    private List<File> courseFiles;
    
    /**
    * @generated
    */
    private HashMap<Student, Mark> marks;
    
    /**
    * @generated
    */
    private String prerequisite;
    
    
    /**
    * @generated
    */
    private File file;
    
    
    /**
    * @generated
    */
    private String getCourseName() {
        return this.courseName;
    }
    
    /**
    * @generated
    */
    private void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    /**
    * @generated
    */
    private Integer getCredits() {
        return this.credits;
    }
    
    /**
    * @generated
    */
    private void setCredits(Integer credits) {
        this.credits = credits;
    }
    
    /**
    * @generated
    */
    private String getDescription() {
        return this.description;
    }
    
    /**
    * @generated
    */
    private void setDescription(String description) {
        this.description = description;
    }
    
    /**
    * @generated
    */
    private String getCourseCode() {
        return this.courseCode;
    }
    
    /**
    * @generated
    */
    private void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    
    /**
    * @generated
    */
    private boolean getIsAvailable() {
        return this.isAvailable;
    }
    
    /**
    * @generated
    */
    private void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    /**
    * @generated
    */
    private Teacher getTeacher() {
        return this.teacher;
    }
    
    /**
    * @generated
    */
    private void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    
    /**
    * @generated
    */
    private List<Student> getStudents() {
        return this.students;
    }
    
    /**
    * @generated
    */
    private void setStudents(List<Student> students) {
        this.students = students;
    }
    
    /**
    * @generated
    */
    private List<File> getCourseFiles() {
        return this.courseFiles;
    }
    
    /**
    * @generated
    */
    private void setCourseFiles(List<File> courseFiles) {
        this.courseFiles = courseFiles;
    }
    
    /**
    * @generated
    */
    private HashMap<Student, Mark> getMarks() {
        return this.marks;
    }
    
    /**
    * @generated
    */
    private void setMarks(HashMap<Student, Mark> marks) {
        this.marks = marks;
    }
    
    /**
    * @generated
    */
    private String getPrerequisite() {
        return this.prerequisite;
    }
    
    /**
    * @generated
    */
    private void setPrerequisite(String prerequisite) {
        this.prerequisite = prerequisite;
    }
    
    /**
    * @generated
    */
    public File getFile() {
        return this.file;
    }
    
    /**
    * @generated
    */
    public void setFile(File file) {
        this.file = file;
    }
    

    //                          Operations                                  
    
    /**
    * @return 
     * @generated
    */
    public void addStudent(Student student) {
        //TODO
    }
    /**
    * @return 
     * @generated
    */
    public boolean removeStudent(Student student) {
        //TODO
    	return true;
    }
    /**
    * @return 
     * @generated
    */
    public void addCourseFile(File file) {
        //TODO
    }
    /**
    * @return 
     * @generated
    */
    public boolean removeCourseFile(File file) {
        //TODO
    	return true;
    }
//    /**
//    * @return 
//     * @generated
//    */
//    public void putMark() {
//        //TODO
//    }
    /**
    * @generated
    */
    public boolean hasPrereq() {
        //TODO
    	return false;
    }
    /**
    * @generated
    */
    public void showPrereq() {
        //TODO
    }
    /**
    * @generated
    */
    public void addPrereq(Course course, String courseCode) {
        //TODO
    }

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
    
}
