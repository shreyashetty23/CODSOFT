import java.util.*;

class Student {
    String name;
    int rollNo;
    String grade;

    Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Grade: " + grade);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter Name: ");
                sc.nextLine(); // clear buffer
                String name = sc.nextLine();
                System.out.print("Enter Roll No: ");
                int roll = sc.nextInt();
                System.out.print("Enter Grade: ");
                sc.nextLine();
                String grade = sc.nextLine();
                students.add(new Student(name, roll, grade));
                System.out.println("Student Added!");
            }
            else if (choice == 2) {
                System.out.print("Enter Roll No to Remove: ");
                int roll = sc.nextInt();
                boolean found = false;
                for (int i = 0; i < students.size(); i++) {
                    if (students.get(i).rollNo == roll) {
                        students.remove(i);
                        System.out.println("Student Removed");
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student Not Found!");
                }
            }
            else if (choice == 3) {
                System.out.print("Enter Roll No to Search: ");
                int roll = sc.nextInt();
                boolean found = false;
                for (Student s : students) {
                    if (s.rollNo == roll) {
                        s.display();
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Student Not Found");
                }
            }
            else if (choice == 4) {
                if (students.isEmpty()) {
                    System.out.println("No Students Found");
                } else {
                    for (Student s : students) {
                        s.display();
                    }
                }
            }
            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            else {
                System.out.println("Invalid Option");
            }
        }
        sc.close();
    }
}

