import java.util.Comparator;

// Comparator class to sort by rollno
class RollNoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rollno, s2.rollno);
    }
}