package com.saan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestApplication.class, args);

        // ConfigurableApplicationContext ctx =
        // new SpringApplicationBuilder(SpringBootRestApplication.class).web(WebApplicationType.NONE).run();
        // System.out.println("Spring Boot application started");
        // ctx.getBean(TerminateBean.class);
        // ctx.close();
    }

}
