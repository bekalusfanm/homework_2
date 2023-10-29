//creating teacher class
public class Teacher {
    private String name;
    private String subject;

    // Constructor
    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }
}
