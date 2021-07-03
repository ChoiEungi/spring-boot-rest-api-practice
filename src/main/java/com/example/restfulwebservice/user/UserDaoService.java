package com.example.restfulwebservice.user;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;


@Service // spring knoew the usage of bean
public class UserDaoService {
    private static List<User> users = new ArrayList<>();
    private static int userCount = 3 ;

    static {
        users.add(new User(1,"Kenneth", new Date(), "pass1", "701010-1234567"));
        users.add(new User(2,"Alic", new Date(), "pass2", "701010-1234569"));
        users.add(new User(3,"Eungi", new Date(), "pass3", "701010-1234568"));

    }

    public List<User> findAll() {
        return users;
    }

    public User save(User user){
        if (user.getId() == null){
            user.setId(++userCount );
        }

        users.add(user);
        return user;
    }

    public User findOne(int id){
        for (User user : users){
            if (user.getId() == id ){
                return user;
            }
        }
        return null;
    }

    public User deleteById(int id){
        Iterator<User> iterator = users.iterator();

        while(iterator.hasNext()){
            User user = iterator.next();

            if (user.getId() == id) {
                iterator.remove();
                return user;
            }
        }
        return null;
    }
}
