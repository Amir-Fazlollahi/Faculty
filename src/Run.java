public class Run {
    public static void main(String[] args) {
        Student st1 = new Student("Amir", "Fazlollahi", "9722032");
        Student st2 = new Student("Amir", "Fazlollahi", "9722032");
        Student st3 = new Student("Amir", "Fazlollahi", "9722032");
        Lab lab = new Lab(5, "Wednesday");
        lab.enrollStudent(st1);
        lab.enrollStudent(st2);
        lab.enrollStudent(st3);
        st1.setGrade(20);
        st2.setGrade(19);
        st3.setGrade(19);
        Faculty faculty1 = new Faculty("CE", 20);
        faculty1.addLab(lab);
        faculty1.print();
    }
}
