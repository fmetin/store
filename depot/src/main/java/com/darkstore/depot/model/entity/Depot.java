package com.darkstore.depot.model.entity;

import com.darkstore.depot.model.enums.DepotStatusEnum;
import com.darkstore.depot.model.enums.DepotTypeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "Depot")
public class Depot {

    @Id
    private String depotName;
    @Enumerated(EnumType.STRING)
    private DepotTypeEnum type;
    private String city;
    private String latitude;
    private String longitude;
    @Enumerated(EnumType.STRING)
    private DepotStatusEnum status;
    private String costCenter;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdDate;
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime updatedDate;
}
