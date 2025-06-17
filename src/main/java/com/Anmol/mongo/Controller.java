package com.Anmol.mongo;

import com.Anmol.mongo.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class Controller {
    @Autowired
    private service serviceObj;
    @GetMapping
    List<User> getAllUsers (){
        return serviceObj.getAllUsers();
    }
    @PostMapping
    User createUser (@RequestBody User user) throws InvalidTypeException{
        return serviceObj.createUser(user);
    }
    @DeleteMapping("/{id}")
    void deleteUser (@PathVariable long id)throws InvalidTypeException {
        serviceObj.deleteUser(id);
    }

}
