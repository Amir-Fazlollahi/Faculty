/**
 * Class Lab is to simulate a class and its attending students
 * @author Amir Fazlollahi
 * @version 0.0
 */
public class Lab {
    //     students: the list of the attending students
    private Student[] students;
    //     avg: the average mark of the students, currentSize: the number of the students
//     having enrolled. capacity: the maximum number of students that can enroll to the lab
    private int avg, currentSize, capacity;
    //     day: the day of the week when the lab is held
    private String day;
    /**
     * constructor Lab builds an object of the class
     * @param cap the ccapacity of the class
     * @param day the day of the class
     */
    public Lab(int cap, String day) {
        students = new Student[50];
        capacity = cap;
        this.day = day;
        currentSize = 0;
        avg = 0;
    }
    /**
     * enrollStudent is used to add a new student to the lab
     * @param std new student
     */
    public void enrollStudent(Student std) {
        if(currentSize < capacity) {
            students[currentSize] = std;
            ++currentSize;
        }
        else System.err.println("Lab is full!");
    }
    /**
     * print prints the students information beside their average
     * mark to the standard output
     */
    public void print() {
        for (int i = 0; i < currentSize; i++) {
            students[i].print();
        }
        System.out.println(getAvg());
    }
    /**
     * getStudents gives the list of the students
     */
    public Student[] getStudents() {
        return students;
    }
    /**
     * setStudents changes the list of the class students to a fresh list
     * @param students
     */
    public void setStudents(Student[] students) {
        this.students = students;
    }
    /**
     * calculateAvg computes the average grade of all the students
     */
    private void calculateAvg() {
        // totalMark stores the total grage of the students
        int totalMark = 0;
        for (int i = 0; i < currentSize; i++) {
            totalMark += students[i].getGrade();
        }
        avg = totalMark / currentSize;
    }
    /**
     * getAvg returns the avg of the class
     * @return int avg
     */
    public int getAvg() {
        calculateAvg();
        return avg;
    }
    /**
     * getDay returns the day when the class is held
     * @return String day
     */
    public String getDay() {
        return day;
    }
    /**
     * setDay is used to change te time of the class
     * @param day a day of the week
     */
    public void setDay(String day) {
        this.day = day;
    }
    /**
     * getCapaciry retrurns the capacity of the class
     * @return int capacity
     */
    public int getCapacity() {
        return capacity;
    }
    /**
     * setCapacity changes the capacity of the class
     * @param cap
     */
    public void setCapacity(int cap) {
        capacity = cap;
    }
}

