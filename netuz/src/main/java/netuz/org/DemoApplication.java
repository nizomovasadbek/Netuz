package netuz.org;
//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-github token

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import netuz.org.student.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping
    public List<Student> guide(){
        List<Student> st = new ArrayList<>();
        st.add(new Student(1L, "Asadbek", "nizomovasadbekjava@gmail.com",
                LocalDate.of(2003, 8,2), 18));
        return st;
    }

}