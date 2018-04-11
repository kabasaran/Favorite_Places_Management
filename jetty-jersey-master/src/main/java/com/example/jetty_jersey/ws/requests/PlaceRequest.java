package com.example.jetty_jersey.ws.requests;

public class PlaceRequest {

    private final int PLACE = 0;
    private final int EVENT = 1;

    private Integer type;
    private Double lat;
    private Double lng;
    private String name;
    private String message;
    private String startDate;
    private String endDate;

    public PlaceRequest() {

    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "type: " + type +
                "\nlat: " + lat +
                "\nlng: " + lng +
                "\nname: " + name +
                "\nmessage: " + message +
                "\nstart date: " + startDate +
                "\nend date: " + endDate;
    }
}