package netuz.org;
//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-github token
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "Def val") String name){
        return String.format("Hello %s", name);
    }

}