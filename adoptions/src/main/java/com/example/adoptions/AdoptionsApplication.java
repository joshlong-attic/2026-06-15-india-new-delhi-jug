package com.example.adoptions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.resilience.annotation.EnableResilientMethods;

@EnableResilientMethods
@SpringBootApplication
public class AdoptionsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdoptionsApplication.class, args);
    }


//    @Bean
//    ApplicationRunner applicationRunner (IncompleteEventPublications eventPublications) {
//        return a -> eventPublications
//                .resubmitIncompletePublications(e -> true);
//    }
}

