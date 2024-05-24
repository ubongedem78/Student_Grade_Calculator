package practice;

import java.util.ArrayList;
import java.util.List;

// Class to represent a course with name, code, and credits
class Course {
    // Encapsulation: private fields for course details
    private String courseName;
    private String courseCode;
    private int credits;

    // Constructor for Course class
    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

    // Getter methods to access private fields (Encapsulation)
    public String getCourseName() {
        return courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public int getCredits() {
        return credits;
    }
}

// Class to represent a grade for a specific course with score and grade letter
class Grade {
    // Encapsulation: private fields for grade details
    private Course course;
    private double score;

    // Constructor for Grade class
    public Grade(Course course, double score) {
        this.course = course;
        this.score = score;
    }

    // Getter methods to access private fields (Encapsulation)
    public Course getCourse() {
        return course;
    }

    public double getScore() {
        return score;
    }

    // Method to get the grade based on the score
    public String getGradeLetter() {
        if (score >= 70) return "A";
        else if (score >= 60) return "B";
        else if (score >= 50) return "C";
        else if (score >= 40) return "D";
        else return "F";
    }
}

// Class to represent a student with name, ID, and a list of grades
class Student {
    // Encapsulation: private fields for student details
    private String name;
    private int studentId;
    private List<Grade> grades;

    // Constructor for Student class
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        this.grades = new ArrayList<>();
    }

    // Getter methods to access private fields (Encapsulation)
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    // Method to add a grade to the student's list of grades
    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create courses using the Course constructor
        Course course1 = new Course("Cyber Law", "IFT 804", 3);
        Course course2 = new Course("Advanced Programming", "IFT 803", 3);
        Course course3 = new Course("Research Methodology", "IFT 802", 3);

        // Create students using the Student constructor
        Student student1 = new Student("Ubong Edem", 20232906);
        Student student2 = new Student("Ahmad Hamid Abubakar", 20233198);
        Student student3 = new Student("Ibrahim Usman Bukar", 20233238);
        Student student4 = new Student("Barnabas Akla Gwary", 20233018);
        Student student5 = new Student("Mohammed Aminu Yahya", 20222437);

        // Add grades to students using the Grade constructor
        student1.addGrade(new Grade(course1, 71));
        student1.addGrade(new Grade(course2, 95));
        student1.addGrade(new Grade(course3, 54));

        student2.addGrade(new Grade(course1, 71));
        student2.addGrade(new Grade(course2, 95));
        student2.addGrade(new Grade(course3, 54));

        student3.addGrade(new Grade(course1, 71));
        student3.addGrade(new Grade(course2, 95));
        student3.addGrade(new Grade(course3, 54));

        student4.addGrade(new Grade(course1, 71));
        student4.addGrade(new Grade(course2, 95));
        student4.addGrade(new Grade(course3, 54));

        student5.addGrade(new Grade(course1, 71));
        student5.addGrade(new Grade(course2, 95));
        student5.addGrade(new Grade(course3, 54));

        // Create a list to hold all students
        List<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        // Print grades for all students
        printAllStudentGrades(students);
    }

    // Method to print the grades of all students
    public static void printAllStudentGrades(List<Student> students) {
        for (Student student : students) {
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getStudentId());
            System.out.println("Grades:");
            // Print each grade for the students
            for (Grade grade : student.getGrades()) {
                System.out.println("  Course: " + grade.getCourse().getCourseName() + ", Grade: " + grade.getGradeLetter());
            }
            System.out.println(); // Add an empty line between students for better readability
        }
    }
}
