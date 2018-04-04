package fr.kouignamann.springBootDemo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import org.springframework.security.config.annotation.web.configuration.*;

@EnableWebSecurity
@SpringBootApplication
public class AppInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AppInitializer.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
        };
    }
}
