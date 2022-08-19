import com.marks.StudentMarks;

public class StudentsMainImpl {
    public static void main(String[] args) {
        StudentMarks studentMarks =new StudentMarks();
        studentMarks.calculateMarks(35,36,39);
        studentMarks.calculateMarks(41,49,80,95);
        studentMarks.calculateMarks(23,36,45);
        
    }
}
