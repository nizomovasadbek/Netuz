package netuz.org;
//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-github token
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public String guide(@RequestParam(value="t") String nom){
          return String.format("You entered %s", nom);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue = "World") String name){
        return String.format("Hello %s", name);
    }

    @GetMapping("/registration")
    public String registration(@RequestParam(value="login", defaultValue="word") String login){
        return String.format("%s", login);
    }

    @PostMapping("/selve/adj")
    public String selveadj(@RequestParam(value="object", defaultValue="sub123") String val){
        return String.format("You called %s", val);
    }

}