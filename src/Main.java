import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Jhon", 22, Arrays.asList(4, 5, 6, 7));
        Student student2 = new Student("Mikel", 23, Arrays.asList(6, 8, 5, 6, 3, 5, 6, 7));
        Student student3 = new Student("Nick", 17, Arrays.asList(4, 3, 7, 7, 7));
        Student student4 = new Student("Jame", 21, Arrays.asList(3, 3, 5, 9));
        Student student5 = new Student("Lolik", 27, Arrays.asList(4, 7, 7, 5, 6, 7));
        Student student6 = new Student("Sam", 24, Arrays.asList(6, 8, 3, 3, 2, 5, 1, 7));
        Student student7 = new Student("Jayne", 13, Arrays.asList(6, 6, 7, 8, 3, 7, 7, 7));
        Student student8 = new Student("Nikolas", 23, Arrays.asList(3, 3, 5, 6, 7, 3, 4, 9));

        University oxford = new University("Oxford");
        University cambridge = new University("Cambridge");
        oxford.addStudent(student1);
        oxford.addStudent(student2);
        oxford.addStudent(student3);
        oxford.addStudent(student4);
        oxford.getStudentList();
        cambridge.addStudent(student5);
        cambridge.addStudent(student6);
        cambridge.addStudent(student7);
        cambridge.addStudent(student8);
        cambridge.getStudentList();
        oxford.searchStudent(student2);
        oxford.removeStudent(student4);
        oxford.getStudentList();
        oxford.getUniversityRate();


    }
}
