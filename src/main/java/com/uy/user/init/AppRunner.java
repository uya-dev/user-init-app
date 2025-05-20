package com.uy.user.init;

import com.uy.user.init.service.UserReaderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    @Autowired
    private UserReaderService userReaderService;

    public AppRunner() {
        System.out.println("born app runner");
    }

    @Override
    public void run(String... args) {
        userReaderService.printUsers();
    }

}
