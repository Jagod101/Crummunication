package com.example.tommy.crummunication.models;

import java.util.HashMap;

/**
 * Created by tommy on 2/23/18.
 */

class UserCollection {
    private static final UserCollection ourInstance = new UserCollection();
    private HashMap<String, User> users;

    static UserCollection getInstance() {
        return ourInstance;
    }

    private UserCollection() {
        users = new HashMap<String, User>();
    }

    public void addUser(User user)
    {
        users.put(user.getUUID(), user);
    }

    public User getUser(String userID) {
        return users.get(userID);
    }

    public User removeUser(String userID) {
        return users.remove(userID);
    }

}
