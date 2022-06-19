package com.example.database.service;

import com.example.database.entity.Address;
import com.example.database.entity.User;
import com.example.database.repository.AddressRepo;
import com.example.database.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {
    @Autowired AddressRepo addressRepo;
    @Autowired UserRepo userRepo;

    public void createData() {
        Address address = new Address(null,"Deneme", null);
        User user = new User(null, null);
        user.setAddresses(Arrays.asList(address));
        addressRepo.save(address);
        userRepo.save(user);
    }
}
