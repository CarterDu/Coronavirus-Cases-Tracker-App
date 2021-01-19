package com.du.convirtracker.models;

public class LocationStats {

    private String country;
    private String state;
    private int totalUpdatedCases;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getTotalUpdatedCases() {
        return totalUpdatedCases;
    }

    public void setTotalUpdatedCases(int totalUpdatedCases) {
        this.totalUpdatedCases = totalUpdatedCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", totalUpdatedCases='" + totalUpdatedCases + '\'' +
                '}';
    }
}
