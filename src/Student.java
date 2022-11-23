import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Student {
    private String name;
    private Integer age;
    private Double averageStudent = 0.0;
    List<Integer> marksList;

    public Student(String name, Integer age, List<Integer> marksList) {
        this.name = name;
        this.age = age;
        this.marksList = marksList;
        setAverageStudent();
    }

    public void printStudent() {
        System.out.println("Имя - " + name);
        System.out.println("Возраст - " + age);
        System.out.println("Оценки - " + marksList);
    }

    private void setAverageStudent() {
        Integer result = 0;
        for (Integer value : marksList) {
            result += value;
        }
        this.averageStudent = result * 1.0 / marksList.size();
    }

    public Double getAverageStudent() {
        return averageStudent;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<Integer> getMarksList() {
        return marksList;
    }
}
