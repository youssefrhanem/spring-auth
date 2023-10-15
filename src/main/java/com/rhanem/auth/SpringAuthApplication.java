package com.rhanem.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

import static com.rhanem.auth.util.constants.FileConstant.FLAG_FOLDER;
import static com.rhanem.auth.util.constants.FileConstant.USER_FOLDER;

@SpringBootApplication
public class SpringAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringAuthApplication.class, args);
        new File(USER_FOLDER).mkdirs();
        //new File(FLAG_FOLDER).mkdirs();
    }

}
