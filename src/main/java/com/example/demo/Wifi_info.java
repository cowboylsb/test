package com.example.demo;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.geo.GeoJsonPoint;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;

@Getter
@Setter
@Document(collection = "listtest")
public class Wifi_info {

    @Id
    private String id;
    @Field("location")
    private GeoJsonPoint location;
    @Field("altitude")
    private double altitude;
    @Field("ap_info_list")
    private List<AP_infoDTO> apInfoList;
    @Field("label")
    private String label;
    @Field("date")
    private LocalDateTime date;

// 생성자
    public Wifi_info() {}

    public Wifi_info(GeoJsonPoint location, double altitude, List<AP_infoDTO> apInfoList, String label, LocalDateTime date) {
        this.location = location;
        this.altitude = altitude;
        this.apInfoList = apInfoList;
        this.label = label;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Wifi_info{" +
                "id='" + id + '\'' +
                ", location=" + location +
                ", altitude=" + altitude +
                ", apInfoList=" + apInfoList +
                ", label='" + label + '\'' +
                ", date='" + date + '\'' +
                '}';
    }

    public void setLocation(GeoJsonPoint location) {
        this.location = location;
    }

    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public void setDate(LocalDateTime date) {
        ZonedDateTime utcZonedDateTime = date.atZone(ZoneId.of("UTC"));
        ZonedDateTime kstZonedDateTime = utcZonedDateTime.withZoneSameInstant(ZoneId.of("Asia/Seoul"));
        this.date = kstZonedDateTime.toLocalDateTime();
    }
}
