package com.example.tommy.crummunication.models;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by tommy on 2/23/18.
 */

class EventCollection {
    private static final EventCollection ourInstance = new EventCollection();
    private HashMap<String, Event> events;

    static EventCollection getInstance() {
        return ourInstance;
    }

    private EventCollection()
    {
        events = new HashMap<String, Event>();
    }

    public void addEvent(Event event)
    {
        events.put(event.getUUID(), event);
    }

    public Event getEvent(String eventID)
    {
        return events.get(eventID);
    }

    public Event removeEvent(String eventID) {
        return events.remove(eventID);
    }
}
