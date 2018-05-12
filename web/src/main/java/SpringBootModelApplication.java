import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @auther  fly
 * @date 2018/5/9 22:02
 **/
@SpringBootApplication
@ComponentScan("com.fly.springboot")
public class SpringBootModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootModelApplication.class, args);
    }
}
