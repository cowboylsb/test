package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AP_infoDTO {
    private String bssid;
    private int rssi;
    private int frequency;

    public AP_infoDTO(String bssid, int rssi, int frequency) {
        this.bssid = bssid;
        this.rssi = rssi;
        this.frequency = frequency;
    }
}
