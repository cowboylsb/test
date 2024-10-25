package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Wifi_infoDTO {
    private double latitude;
    private double longitude;
    private double altitude;
    private List<AP_infoDTO> apInfoList;
    private String label;

    public Wifi_infoDTO(double latitude, double longitude, double altitude, List<AP_infoDTO> apInfoList, String label) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.apInfoList = apInfoList;
        this.label = label;
    }

    public double getLatitude() {
        return latitude;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getAltitude() {
        return altitude;
    }
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }

    public List<AP_infoDTO> getApInfoList() {
        return apInfoList;
    }
}
