package com.example.viewpager.models;

import com.example.viewpager.R;

import java.util.ArrayList;

public class Event {
    private String eventTitle;
    private String eventDate;
    private int eventImgId;

    public static Event createEvent(String eventTitle, String eventDate, int eventImgId) {
        Event ev = new Event();
        ev.setEventDate(eventDate);
        ev.setEventImgId(eventImgId);
        ev.setEventTitle(eventTitle);
        return ev;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public int getEventImgId() {
        return eventImgId;
    }

    public void setEventImgId(int eventImgId) {
        this.eventImgId = eventImgId;
    }

    public static ArrayList<Event> createEvents() {
        String[] titles = {"Block party", "Food event", "Business meeting", "Festival", "Celebration"};
        String[] dates = {"2020/12/29", "2020/10/08", "2020/11/22", "2020/10/18", "2020/11/03"};
        int[] imageIds = {R.drawable.party, R.drawable.food, R.drawable.business_meeting, R.drawable.concert, R.drawable.concert};

        ArrayList<Event> events = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            Event ev = new Event();
            ev.setEventDate(dates[i]);
            ev.setEventTitle(titles[i]);
            ev.setEventImgId(imageIds[i]);
            events.add(ev);
        }

        return events;
    }
}
