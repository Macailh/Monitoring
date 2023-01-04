package com.salvadorgerman.monitoring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info {
    private Integer id;
    private LocalDateTime date;
    private Integer temperature;
    private Integer humidity;
    private Integer co2;
    private Integer cpuTemp;
    private Integer device;
}
