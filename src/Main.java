import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentDAO dao = new StudentDAO();

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter email: ");
                    String email = sc.nextLine();

                    System.out.print("Enter course: ");
                    String course = sc.nextLine();

                    System.out.print("Enter age: ");
                    int age = sc.nextInt();

                    Student student =
                            new Student(name, email, course, age);

                    dao.addStudent(student);

                    break;


                case 2:

                    List<Student> students = dao.getAllStudents();

                    System.out.println("\n----- STUDENTS -----");

                    for (Student s : students) {
                        System.out.println(s);
                    }

                    break;


                case 3:

                    System.out.print("Enter student ID: ");
                    int searchId = sc.nextInt();

                    Student found = dao.getStudentById(searchId);

                    if (found != null) {
                        System.out.println(found);
                    } else {
                        System.out.println("Student not found.");
                    }

                    break;


                case 4:

                    System.out.print("Enter student ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = sc.nextLine();

                    System.out.print("Enter new email: ");
                    String newEmail = sc.nextLine();

                    System.out.print("Enter new course: ");
                    String newCourse = sc.nextLine();

                    System.out.print("Enter new age: ");
                    int newAge = sc.nextInt();

                    Student updatedStudent =
                            new Student(
                                    updateId,
                                    newName,
                                    newEmail,
                                    newCourse,
                                    newAge
                            );

                    dao.updateStudent(updatedStudent);

                    break;


                case 5:

                    System.out.print("Enter student ID: ");
                    int deleteId = sc.nextInt();

                    dao.deleteStudent(deleteId);

                    break;


                case 6:

                    System.out.println("Thank you!");
                    sc.close();
                    return;


                default:

                    System.out.println("Invalid choice.");
            }
        }
    }
}
