package com.example.tommy.crummunication.models;

import com.google.api.client.util.DateTime;

import java.util.UUID;

/**
 * Created by tommy on 2/23/18.
 */

public class Event {
    private UUID uuid;
    private String name;
    private String meetingLocation;
    private String eventLocation;
    private DateTime createTime;
    private DateTime updateTime;
    private DateTime scheduledTime;

    private User[] invited;

    public Event() {
        this.uuid = UUID.randomUUID();
        this.name = "";
        this.createTime = new DateTime(System.currentTimeMillis());
    }

    // At least these three should be set i
    public Event(String name, String eventLocation, DateTime scheduledTime)
    {
        this.uuid = UUID.randomUUID();
        this.name = name;
        this.createTime = new DateTime(System.currentTimeMillis());
        this.eventLocation = eventLocation;
        this.scheduledTime = scheduledTime;
    }

    public String getUUID() {
        return uuid.toString();
    }
}
