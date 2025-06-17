package com.Anmol.mongo;

import com.Anmol.mongo.exception.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class service {
    @Autowired
    private UserRepository userRepository;

    List<User> getAllUsers(){
        return userRepository.findAll();
    }

    User createUser (User user) throws InvalidTypeException {
        if(user.getId() < 1){
            throw new InvalidTypeException("Id less than one not possible");
        }
        return userRepository.save(user);
    }

    void deleteUser(long id) throws InvalidTypeException{
            if(id < 1 ){
                throw new InvalidTypeException("Id less than one not possible");
            }
            else{
                userRepository.deleteById(id);
            }
    }
}
