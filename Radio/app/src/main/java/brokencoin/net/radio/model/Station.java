package brokencoin.net.radio.model;

/**
 * Created by avroman on 9/13/17.
 */

public class Station {

    final String DRAWABLE = "drawable/";
    private String stationTitle;
    private String imgUri;

    /*
        Used by the DataService Singleton to build out the ArrayList for the
        stations and drawables
     */

    public Station(String stationTitle, String imgUri) {
        this.stationTitle = stationTitle;
        this.imgUri = imgUri;
    }


    public String getStationTitle() {
        return stationTitle;
    }

    public String getImgUri() {
        return DRAWABLE + imgUri;
    }
}
