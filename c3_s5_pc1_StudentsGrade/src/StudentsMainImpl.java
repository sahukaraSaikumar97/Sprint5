import com.marks.StudentMarks;

public class StudentsMainImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        System.out.println("studentMarks of Medical Studies = " + studentMarks.calculateMarks(97, 99, 78));
        System.out.println("studentMarks of Non medical Studies = " + studentMarks.calculateMarks(99, 89, 89, 89));
        System.out.println("studentMarks of Businness Studies = " + studentMarks.calculateMarks(24.5, 99, 99.5));
    }
}



