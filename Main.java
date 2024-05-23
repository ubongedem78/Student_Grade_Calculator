import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private String courseCode;
    private int credits;

    public Course(String courseName, String courseCode, int credits) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.credits = credits;
    }

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

class Grade {
    private Course course;
    private double score;

    public Grade(Course course, double score) {
        this.course = course;
        this.score = score;
    }

    public Course getCourse() {
        return course;
    }

    public double getScore() {
        return score;
    }

    public String getGradeLetter() {
        if (score >= 70) return "A";
        else if (score >= 60) return "B";
        else if (score >= 50) return "C";
        else if (score >= 40) return "D";
        else return "F";
    }
}

class Student {
    private String name;
    private int studentId;
    private List<Grade> grades;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
        grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void addGrade(Grade grade) {
        grades.add(grade);
    }
}

public class Main {
    public static void main(String[] args) {
        Course course1 = new Course("Cyber Law", "IFT 804", 3);
        Course course2 = new Course("Advanced Programming", "IFT 803", 3);
        Course course3 = new Course("Research Methodology", "IFT 802", 3);

        Student student1 = new Student("Ubong Edem", 20232906);

        student1.addGrade(new Grade(course1, 71));
        student1.addGrade(new Grade(course2, 95));
        student1.addGrade(new Grade(course3, 54));

        System.out.println("Student Name: " + student1.getName() + "\nStudent ID: " + student1.getStudentId());
        System.out.println("Grades:");

        for (Grade grade : student1.getGrades()) {
            System.out.println("Course: " + grade.getCourse().getCourseName() + ", Grade: " + grade.getGradeLetter());
        }
    }
}
