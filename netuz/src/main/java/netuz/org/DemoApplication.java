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