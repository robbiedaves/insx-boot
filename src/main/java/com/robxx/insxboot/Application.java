package com.robxx.insxboot;

import org.apache.commons.cli.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            this.processCommandArguments(args);  // this is not working as expected
            // this.printSpringBeansInspector(ctx);
        };
    }

    private void printSpringBeansInspector(ApplicationContext ctx) {
        System.out.println("Spring Boot Beans Inspector");
        System.out.println("===========================");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    private void processCommandArguments(String... args) {
        Options options = new Options();
        Option input = new Option("lbs", "listBeans", false, "list Spring Boot beans");

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        CommandLine cmd;

        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp("utility-name", options);
            System.exit(1);
            return;
        }

        if (cmd.hasOption("lbs")) {
            System.out.println("ROBXX lbs request");
        } else {
            System.out.println("ROBXX lbs not request");
        }


    }
}
