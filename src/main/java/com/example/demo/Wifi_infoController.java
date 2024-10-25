package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/wifi_info")
public class Wifi_infoController {

    @Autowired
    private Wifi_infoRepository Wifi_infoRepository;
    @Autowired
    private Wifi_infoService Wifi_infoService;

    // 모든 사용자 조회
    @GetMapping
    public List<Wifi_info> getAllWifi_infos() {
        return Wifi_infoRepository.findAll();
    }

    // 특정 ID의 사용자 조회
    @GetMapping("/{id}")
    public Wifi_info getWifi_infoById(@PathVariable String id) {
        return Wifi_infoRepository.findById(id).orElse(null);
    }

    // 새로운 사용자 추가
    @PostMapping
    public Wifi_info addWifiInfo(@RequestBody Wifi_infoDTO wifiInfoDTO) {
        return Wifi_infoService.saveWifiInfo(wifiInfoDTO);
    }

    // 사용자 정보 업데이트
    @PutMapping("/{id}")
    public Wifi_info updateWifi_info(@PathVariable String id, @RequestBody Wifi_info wifi_info) {
        return Wifi_infoRepository.save(wifi_info);
    }

    // 사용자 삭제
    @DeleteMapping("/{id}")
    public void deleteWifi_info(@PathVariable String id) {
        Wifi_infoRepository.deleteById(id);
    }
}
