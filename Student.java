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
