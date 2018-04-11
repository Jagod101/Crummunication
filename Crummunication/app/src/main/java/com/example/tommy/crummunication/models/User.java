package com.example.tommy.crummunication.models;

import java.util.UUID;

/**
 * Created by tommy on 2/23/18.
 */

public class User {
    private UUID uuid;
    private int permissionsLevel;
    private String name;
    private String email;
    private String phoneNum;
    private int[] channels;
    private String bio;
    private String imgPath;

    public String getUUID() {
        return uuid.toString();
    }
}
