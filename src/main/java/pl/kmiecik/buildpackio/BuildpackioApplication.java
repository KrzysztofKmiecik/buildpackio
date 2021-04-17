package pl.kmiecik.buildpackio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BuildpackioApplication {

    public static void main(String[] args) {
        SpringApplication.run(BuildpackioApplication.class, args);
    }


    @GetMapping("/hello")
    public String get(){
        return "Eluwina tiger";
    }
}
