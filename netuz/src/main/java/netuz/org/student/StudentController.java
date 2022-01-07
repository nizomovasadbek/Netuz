package netuz.org.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
public class StudentController {
    @GetMapping
    public List<Student> getStudents(){
        List<Student> st = new ArrayList<>();
        st.add(new Student(1L, "Asadbek", "nizomovasadbekjava@gmail.com",
                LocalDate.of(2003, 8,2), 18));
        return st;
    }
}
