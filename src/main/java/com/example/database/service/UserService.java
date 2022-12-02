package com.example.database.service;

import com.example.database.entity.Address;
import com.example.database.entity.User;
import com.example.database.repository.AddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class UserService extends AbstractService<User> {
    @Autowired AddressRepo addressRepo;

    public void createData() {
        Address address = new Address(null,"Deneme", null);
        User user = new User();
        user.setAddresses(Arrays.asList(address));
        addressRepo.save(address);
        repository.save(user);
    }
}
