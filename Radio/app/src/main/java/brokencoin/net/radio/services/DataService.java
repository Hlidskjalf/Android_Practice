package brokencoin.net.radio.services;

import java.util.ArrayList;

import brokencoin.net.radio.model.Station;

/**
 * Created by avroman on 9/13/17. A Singleton class designed to list the stations and
 * drawables used by the app. Each station is inserted into an ArrayList and built using the
 * public Station() function in Station.java which uses a final string for the drawable and takes
 * 2 args for the station title and the image URI.
 */

public class DataService {
    private static final DataService ourInstance = new DataService();

    public static DataService getInstance() {
        return ourInstance;
    }

    private DataService() {
    }

    public ArrayList<Station> getFeaturedStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan(Tunes for Travel", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking PLaylist", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getRecentStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan(Tunes for Travel", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking PLaylist", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }

    public ArrayList<Station> getOtherStations() {
        ArrayList<Station> list = new ArrayList<>();
        list.add(new Station("Flight Plan(Tunes for Travel", "flightplanmusic"));
        list.add(new Station("Two-Wheelin' (Biking PLaylist", "bicyclemusic"));
        list.add(new Station("Kids Jams (Music for Children", "kidsmusic"));

        return list;
    }


}
