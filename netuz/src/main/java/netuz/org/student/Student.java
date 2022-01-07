package netuz.org.student;

import java.time.LocalDate;
import org.springframework.annotation.web.Autowired

public class Student {
    private long id;
    private String name;
    @Autowired
    @Qualifier("rockMusic")
    private LocalDate dob;
    private Integer age;
}
