package mylibs;

public class Student {
    private Name name;
    private Course course;
    
    public Student(Name name, int studentID, Course course) {
        this.name = name;
        this.course = course;
    }
    
    public void displayStudentInfo() {
        System.out.println("Name: " + name.getFullName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Grade: " + course.getGrade().computeGrade());
    } 
}