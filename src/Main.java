import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    // Selection sort method
    public static void selectionSort(ArrayList<Student> list, Comparator<Student> comparator) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            int iMin = i;
            for (int j = i + 1; j < n; j++) {
                if (comparator.compare(list.get(j), list.get(iMin)) < 0) {
                    iMin = j;
                }
            }
            // Swap the found minimum element with the first element
            Student temp = list.get(iMin);
            list.set(iMin, list.get(i));
            list.set(i, temp);
        }
    }

    public static void main(String[] args) {
        // Create an ArrayList of Students
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(5, "Alison", "431 A St"));
        students.add(new Student(1, "Boris", "729 B St"));
        students.add(new Student(3, "Chandler", "195 C St"));
        students.add(new Student(10, "David", "409 D St"));
        students.add(new Student(2, "Eve", "286 E St"));
        students.add(new Student(8, "Frank", "820 F St"));
        students.add(new Student(7, "Grace", "320 G St"));
        students.add(new Student(6, "Henry", "901 H St"));
        students.add(new Student(9, "Ingrid", "302 I St"));
        students.add(new Student(4, "John", "957 J St"));

        System.out.println("Original List:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorted by name
        selectionSort(students, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorted by rollno
        selectionSort(students, new RollNoComparator());
        System.out.println("\nSorted by Roll No:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}