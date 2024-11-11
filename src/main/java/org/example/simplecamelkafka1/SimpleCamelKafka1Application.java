package org.example.simplecamelkafka1;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.main.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SimpleCamelKafka1Application {

    public static void main(String[] args) throws Exception {
            SpringApplication.run(SimpleCamelKafka1Application.class, args);
            Main.main(args);
    }

}
