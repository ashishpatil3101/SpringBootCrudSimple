package com.example.CRUDDEMOONE.demoCRUDONE.services;

import com.example.CRUDDEMOONE.demoCRUDONE.Model.User;
import com.example.CRUDDEMOONE.demoCRUDONE.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userService {

    userRepository theuserRepository;

    @Autowired
    public userService(userRepository parameterUserRepo){
        theuserRepository = parameterUserRepo;
    }
    public void addUser(User theUser){
        theuserRepository.save(theUser);
    }

    public Optional<User> getUser(int Id){

       return theuserRepository.findById(Id);
    }

    public List<User> getAllUser(){

        return theuserRepository.findAll();
    }

    public void deleteUser(int id ){

        theuserRepository.deleteById(id );
    }
}
