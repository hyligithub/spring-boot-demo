package com.example.chapter2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lihuiyan on 2017/2/23.
 */
@RestController
@RequestMapping("/users")
public class UserController {

    ConcurrentHashMap<Integer, User> userMap = new ConcurrentHashMap<Integer, User>();

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<User> getUserList() {
        List<User> list = new ArrayList(userMap.values());
        return list;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String postUser(@ModelAttribute User user) {
        userMap.put(user.getId(), user);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@PathVariable int id) {
        return userMap.get(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public String updateUser(@PathVariable int id, @ModelAttribute User user) {
        User user1 = userMap.get(id);
        user1.setName(user.getName());
        user1.setAge(user.getAge());
        userMap.put(id, user1);
        return "success";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public String deleteUser(@PathVariable int id) {
        userMap.remove(id);
        return "success";
    }

}
