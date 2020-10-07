/**
 * The class Student represents a student and their information in a class
 * @author Amir Fazlollahi
 * @version 0.0
 */
public class Student {
    private String firstName;
    private String lastName;
    private String studentID;
    private int grade;
    /**
     * The constructor Student builds a new object of the class.
     * @param firstName Student's first name
     * @param lastName Student's last name
     * @param stdID Student's ID number
     */
    public Student(String firstName, String lastName, String stdID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.studentID = stdID;
        grade = 0;
    }
    /**
     * getFirstName gives the student's firstName
     * @return String firstName
     */
    public String getFirstName() {
        return firstName;
    }
    /**
     * getLastName gives the student's lastName
     * @return String lastName
     */
    public String getLastName() {
        return lastName;
    }
    /**
     * setFirstName is used to change the student's firstName
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    /**
     * setLastName is used to change the student's firstName
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     * getStudentID gives the student's ID
     * @return String studentID
     */
    public String getStudentID() {
        return studentID;
    }
    /**
     * setStudentID enables the user to change the studentID field
     * @param stdID
     */
    public void setStudentID(String stdID) {
        if(stdID.length() == 7) studentID = stdID;
        else System.out.println("Invalid ID entered!");
    }
    /**
     * getGrade gives the student's grade
     * @return int grade
     */
    public int getGrade() {
        return grade;
    }
    /**
     * setGrade is for changing the student's grade
     * @param grade
     */
    public void setGrade(int grade) {
        if(grade <= 20 && grade >= 0) this.grade = grade;
        else System.out.println("Invalid grade entered!");
    }
    /**
     * print prints out the student's last name, ID number and grade to the
     * standard output
     */
    public void print() {
        System.out.println("Last name: " + lastName + ", ID: " + studentID + ", Grade: " + grade);
    }
}
