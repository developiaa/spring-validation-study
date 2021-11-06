package study.developia.validation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import study.developia.validation.web.validation.ItemValidator;

@SpringBootApplication
public class ValidationApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(ValidationApplication.class, args);
    }

    //global validator
//    public Validator getValidator() {
//        return new ItemValidator();
//    }

}
