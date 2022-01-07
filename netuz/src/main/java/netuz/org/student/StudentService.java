package netuz.org.student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService {
    public List<Student> getStudents(){
        List<Student> st = new ArrayList<>();
        st.add(new Student(1L, "Asadbek", "nizomovasadbekjava@gmail.com",
                LocalDate.of(2003, 8,2), 18));
        return st;
    }
}
