package mylibs;

public class Course {
    private String name;
    private Grade grade;
    
    public Course(String name, Grade grade) {
        this.name = name;
        this.grade = grade;
    }
    
    public String getCourseName() {
        return name;
    }
    
    public Grade getGrade() {
        return grade;
    }
}
