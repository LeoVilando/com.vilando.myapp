import mylibs.Student;
import mylibs.Name;
import mylibs.Grade;
import mylibs.Course;

public class Test {
    public static void main(String[] args) {
        Name studentName = new Name("Joe", "Uy");
        Grade studentGrade = new Grade(85, 90, 95);
        Course studentCourse = new Course("CS100", studentGrade);
        Student student = new Student(studentName, 12345, studentCourse);
        
        student.displayStudentInfo();
    }
}
