import java.util.*;

class Student {
    int id;
    String name;
    int age;
    double marks;

    Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    public String toString() {
        return "ID: " + id +
               ", Name: " + name +
               ", Age: " + age +
               ", Marks: " + marks;
    }
}

class Main {

    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student");
            System.out.println("5. Delete Student");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");

            int choice;

            try {
                choice = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid Input!");
                sc.nextLine();
                continue;
            }

            switch (choice) {

                case 1:

                    try {
                        System.out.print("Enter ID: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Age: ");
                        int age = sc.nextInt();

                        System.out.print("Enter Marks: ");
                        double marks = sc.nextDouble();

                        students.add(new Student(id, name, age, marks));

                        System.out.println("Student Added Successfully");
                    } catch (Exception e) {
                        System.out.println("Invalid Data Entered");
                        sc.nextLine();
                    }

                    break;

                case 2:

                    if (students.isEmpty()) {
                        System.out.println("No Students Found");
                    } else {
                        for (Student s : students) {
                            System.out.println(s);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (Student s : students) {
                        if (s.id == searchId) {
                            System.out.println(s);
                            found = true;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.print("Enter Student ID to Update: ");
                    int updateId = sc.nextInt();

                    sc.nextLine();

                    boolean updated = false;

                    for (Student s : students) {

                        if (s.id == updateId) {

                            System.out.print("Enter New Name: ");
                            s.name = sc.nextLine();

                            System.out.print("Enter New Age: ");
                            s.age = sc.nextInt();

                            System.out.print("Enter New Marks: ");
                            s.marks = sc.nextDouble();

                            updated = true;

                            System.out.println("Student Updated Successfully");
                        }
                    }

                    if (!updated) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 5:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean deleted = false;

                    Iterator<Student> iterator = students.iterator();

                    while (iterator.hasNext()) {

                        Student s = iterator.next();

                        if (s.id == deleteId) {
                            iterator.remove();
                            deleted = true;
                            System.out.println("Student Deleted Successfully");
                        }
                    }

                    if (!deleted) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 6:

                    System.out.println("Thank You");
                    return;

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}
