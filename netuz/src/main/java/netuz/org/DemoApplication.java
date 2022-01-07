package netuz.org;
//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-github token

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String guide(){
          return "Hello from Spring Boot Application";
    }

}