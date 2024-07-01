class Student {
    int rollno;
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    // Override toString method to easily print student objects
    @Override
    public String toString() {
        return "Roll No: " + rollno + "| Name: " + name + "| Address: " + address;
    }
}