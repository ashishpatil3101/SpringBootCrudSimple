package com.example.CRUDDEMOONE.demoCRUDONE.controllers;

import com.example.CRUDDEMOONE.demoCRUDONE.Model.User;
import com.example.CRUDDEMOONE.demoCRUDONE.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("user")
public class userController {

    userService theUserService;
    @Autowired
    public userController( userService paraUserService){

        theUserService =paraUserService;
    }


    @PostMapping("/add")
    public  String addUser( @RequestBody() User TheUser){

        theUserService.addUser(TheUser);

        return "user added succesfully";
    }

    @GetMapping("/{Id}")
    public Optional<User> getUser(@PathVariable int Id){

        return theUserService.getUser(Id);
    }

    @GetMapping("/")
    public List<User> getAllUser(){
        return  theUserService.getAllUser();
    }

    @DeleteMapping("/{Id}")
    public String deleteUser( @PathVariable int Id){

        theUserService.deleteUser(Id);
        return "User has deleted successfully";
    }
}
