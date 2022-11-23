import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class University {
    private String name;
    private Double universityRate = 0.0;
    private List<Student> studentList = new LinkedList<>();

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void searchStudent(Student student) {
        boolean succes = false;

        for (Object value : studentList) {
            if (value.equals(student)) {
                separator();
                System.out.println("В " + name + " есть такой студент: ");
                student.printStudent();
                separator();
                succes = true;
            }
        }

        if (!succes) {
            System.out.println("В " + name + " таких нет");
        }
    }

    private void averageUniversity() {
        List<Double> average = new ArrayList<>();
        for (Student student : studentList) {
            average.add(student.getAverageStudent());
        }
        for (Double value : average) {
            this.universityRate += value;
        }
    }

    public void removeStudent(Student student) {
        List<Student> studentToRemove = new LinkedList<>();
        for (Student type : studentList) {
            if (type.equals(student)) {
                studentToRemove.add(type);
            }
        }
        studentList.removeAll(studentToRemove);
    }

    public void separator() {
        System.out.println("-----------------------------");
    }

    public void getStudentList() {
        separator();
        System.out.println("Университет - " + name);
        for (Student student : studentList) {
            System.out.println("Имя - " + student.getName() + ", Возраст - " + student.getAge() + ", Оценки - " + student.getMarksList());
        }
        separator();
    }

    public void getUniversityRate() {
        averageUniversity();
        separator();
        System.out.println("Рейтинг " + name + " - " + universityRate);
        separator();
    }
}
