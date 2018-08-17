package springbootdockertestapp.SpringBootDockerTestApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDockerTestAppApplication {

        @RequestMapping("/testapp")
        public String testApp(){
            return "<h1>TEST APP DOCKERIZED<h1>";
        }
    
	public static void main(String[] args) {
		SpringApplication.run(SpringBootDockerTestAppApplication.class, args);
	}
}
