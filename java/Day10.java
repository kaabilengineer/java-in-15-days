import java.util.Arrays;
import java.util.Comparator;

public class Day10 {
    public static class Student {
        private String name;
        private int age;
        private int rollNo;

        public Student(String name, int age, int rollNo) {
            this.name = name;
            this.age = age;   
            this.rollNo = rollNo;
        }

        public void getDetails() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Roll No: " + rollNo);
        }
    }

    public static void SortSpecific(Student[] students, String field) {
        switch (field.toLowerCase()) {
            case "name":
                Arrays.sort(students, Comparator.comparing(student -> student.name));
                break;
            case "age":
                Arrays.sort(students, Comparator.comparingInt(student -> student.age));
                break;
            case "id":
                Arrays.sort(students, Comparator.comparingInt(student -> student.rollNo));
                break;
            default:
                System.out.println("Invalid field name");
                return;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student("Rahul", 20, 1);
        Student s2 = new Student("Atharva", 20, 2);
        Student s3 = new Student("Ayush", 18, 3);
        Student[] students = {s1, s2, s3};
        for(Student student: students)
        {
            student.getDetails();
        }
        String fieldToSortBy = "name";  
        SortSpecific(students, fieldToSortBy);

        System.out.println("\nAfter sorting by " + fieldToSortBy + ":");
        for (Student student : students) {
            student.getDetails();
        }
        
    }
}
