public class Student {
    private String name;
    private int id;
    private int[] grades;

    // Constructor
    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for id
    public int getId() {
        return id;
    }

    // Setter for id
    public void setId(int id) {
        this.id = id;
    }

    // Getter for grades
    public int[] getGrades() {
        return grades;
    }

    // Setter for grades
    public void setGrades(int[] grades) {
        this.grades = grades;
    }
}
