package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class Wifi_infoService {

    @Autowired
    private Wifi_infoRepository Wifi_infoRepository;

    public Wifi_info saveWifiInfo(Wifi_infoDTO wifiInfoDTO) {
        GeoJsonPoint location = new GeoJsonPoint(wifiInfoDTO.getLongitude(), wifiInfoDTO.getLatitude());
        double altitude = wifiInfoDTO.getAltitude();
        List<AP_infoDTO> apInfoList = wifiInfoDTO.getApInfoList();
        String label = wifiInfoDTO.getLabel();
        LocalDateTime date = LocalDateTime.now();

        Wifi_info wifiInfo = new Wifi_info(location, altitude, apInfoList, label, date);
        return Wifi_infoRepository.save(wifiInfo);
    }
}
