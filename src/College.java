import java.util.ArrayList;

public class College {
    private String name;
    private ArrayList<Student> students;
    private ArrayList<Teacher> teachers;

    // Constructor
    public College(String name, ArrayList<Student> students, ArrayList<Teacher> teachers) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for students
    public ArrayList<Student> getStudents() {
        return students;
    }

    // Setter for students
    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    // Getter for teachers
    public ArrayList<Teacher> getTeachers() {
        return teachers;
    }

    // Setter for teachers
    public void setTeachers(ArrayList<Teacher> teachers) {
        this.teachers = teachers;
    }
}

