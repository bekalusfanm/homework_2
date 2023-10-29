import java.util.ArrayList;
import java.util.Arrays;
// creating main class
public class Main {
    public static void main(String[] args) {
        // Create Student objects
        Student stud = new Student("tsion", 1,new int[] {75, 64, 72});
        Student student2 = new Student("amir", 2,new int[]{54, 77, 45});

        // Create Teacher object
        Teacher teacher = new Teacher("Mr. estifanos", "mathematics");

        // Create College object
        College college = new College("College of mathematics", new ArrayList<Student>(), new ArrayList<Teacher>());

        // Add students and teacher
        college.getStudents().add(stud);
        college.getStudents().add(student2);
        college.getTeachers().add(teacher);

        // Print out details
        System.out.println("College Name: " + college.getName());
        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId() + " , grade:"+ Arrays.toString(student.getGrades()));
        }
        System.out.println("Teachers:");
        for (Teacher teacherObj : college.getTeachers()) {
            System.out.println("Name: " + teacherObj.getName() + ", Subject: " + teacherObj.getSubject());
        }
    }
}