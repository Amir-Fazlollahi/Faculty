/**
 * Class Faculty is to emulate a faculties affairs with respect
 * to its labs. It can give out information about the labs and their
 * average marks, day and total number of students.
 * @author Amir Fazlollahi
 * @version 0.0
 */
public class Faculty {
    //    labs is a series holding the labs of the faculty
    private Lab[] labs;
    //    avg hold the net average among all the labs and totalStudents]
//    contains the total number of the students in the faculty, capacity
//    holds the maximum number of the labs that the faculty can take,
//    totalLab is the number of the existing labs
    private int avg, totalStudents, totalLabs, capacity;
    //    name of the faculty
    String name;
    /**
     * Constructor builds an object of the class
     * @param name faculty's name
     * @param cap capacity of the faculty
     */
    public Faculty(String name, int cap) {
        this.name = name;
        capacity = cap;
        labs = new Lab[capacity];
        totalLabs = 0;
        avg = 0;
        totalStudents = 0;
    }
    /**
     * Adds a new lab to the faculty
     * @param lab the new lab
     */
    public void addLab(Lab lab) {
        if(totalLabs < capacity) {
            labs[totalLabs] = lab;
            ++totalLabs;
            totalStudents += lab.getStudents().length;
            return;
        }
        System.err.println("Out of capacity!");
    }
    /**
     * Uses the print method in Lab class to print the labs informations
     * to the standard output
     */
    public void print() {
        for (int i = 0; i < totalLabs; i++) {
            System.out.println("Lab " + (i + 1) + ":");
            labs[i].print();
            System.out.println("--------");
        }
        System.out.println("Total Average: " + getAvg());
    }
    /**
     * Returns the average of all the labs
     * @return int
     */
    private int getAvg() {
        return calcAvg();
    }
    /**
     * Calculates the average of all the labs
     * @return int
     */
    private int calcAvg() {
//        the total mark of all the enrolled students
        int total = 0;
        for (int i = 0; i < totalLabs; i++) {
            total += labs[i].getStudents().length * labs[i].getAvg();
        }
        return total / totalStudents;
    }
}

