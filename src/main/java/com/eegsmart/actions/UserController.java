package com.eegsmart.actions;

import com.eegsmart.dao.UserDao;
import com.eegsmart.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by patrick on 2015/9/21.
 */

@Controller
public class UserController {

    @RequestMapping(value="/create")
    @ResponseBody
    public String create(String email, String name){
        try{
            User user = new User(email,name);
            userDao.create(user);
        }catch(Exception e){
            return "Error creating the user "+e.toString();
        }
        return "User created successfully";
    }

    @Autowired
    private UserDao userDao;
}
