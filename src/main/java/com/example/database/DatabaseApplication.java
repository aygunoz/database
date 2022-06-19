package com.example.database;

import com.example.database.entity.Address;
import com.example.database.entity.User;
import com.example.database.repository.AddressRepo;
import com.example.database.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseApplication {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseApplication.class, args);
    }

}
