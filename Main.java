import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        CourseManager cm = new CourseManager();
        EnrollmentManager em = new EnrollmentManager();

        Instructor profIvan = new Instructor("Ivan", "Petrov", "Computer Science");
        Instructor profAnna = new Instructor("Anna", "Smirnova", "Mathematics");

        Course oop = cm.createCourse("OOP101", "Object-Oriented Programming", 3);
        Course alg = cm.createCourse("ALG201", "Algorithms", 2);

        oop.setInstructor(profIvan);
        alg.setInstructor(profAnna);

        Student s1 = new Student("Ainur", "K", "CS");
        Student s2 = new Student("Dana", "S", "CS");
        Student s3 = new Student("Erlan", "T", "Math");

        Person p = s1;
        System.out.println("Polymorphism check: " + p.getFullName() + " -> " + p.getRole());

        try {
            em.enroll(s1, oop);
            em.enroll(s2, oop);
            em.enroll(s3, oop);

            em.enroll(s1, alg);
            em.enroll(s2, alg);
        } catch (IllegalStateException ex) {
            System.out.println("Enrollment failed: " + ex.getMessage());
        }

        System.out.println("\nCourses:");
        for (Course c : cm.listCourses()) {
            System.out.println("  " + c);
            for (Enrollment e : c.getEnrollments()) {
                System.out.println("     -> " + e.getStudent().getFullName()
                        + " (" + e.getStatus() + ")");
            }
        }

        System.out.println("\nStudent schedules:");
        for (Student s : Arrays.asList(s1, s2, s3)) {
            System.out.println("  " + s + " major=" + s.getMajor());
            for (Enrollment e : s.getEnrollments()) {
                System.out.println("     - " + e.getCourse().getCode()
                        + " : " + e.getStatus());
            }
        }

        Enrollment e1 = s1.getEnrollments().getFirst();
        e1.setGrade(92.0);
        e1.setStatus(Enrollment.Status.COMPLETED);

        Enrollment e2 = s2.getEnrollments().getFirst();
        e2.setGrade(42.0);
        e2.setStatus(Enrollment.Status.DROPPED);

        Enrollment e3 = s3.getEnrollments().getFirst();
        e3.setGrade(69.0);
        e3.setStatus(Enrollment.Status.ENROLLED);

        System.out.println("\nAfter grading:");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\nCompleted enrollments:");
        em.findByStatus(Enrollment.Status.COMPLETED)
                .forEach(System.out::println);

        System.out.println("\nEnrollments sorted by grade (desc):");
        em.sortByGradeDesc()
                .forEach(System.out::println);

        System.out.println("\nCourses sorted by title:");
        cm.sortByTitle()
                .forEach(System.out::println);
    }
}
