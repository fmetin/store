package com.darkstore.depot.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import static com.darkstore.depot.model.response.DepotRestResponseMessage.*;

@Data
public class UpdateStockRequestDto {
    @NotNull(message = MSG_VALIDATION_CONSTRAINT_DEPOT_NAME_NOTNULL)
    @Size(min = 1, max = 255, message = MSG_VALIDATION_CONSTRAINT_DEPOT_NAME_SIZE)
    private String depotName;
    @NotNull(message = MSG_VALIDATION_CONSTRAINT_NOTNULL)
    @Size(min = 1, max = 255, message = MSG_VALIDATION_CONSTRAINT_SIZE)
    private String productName;
    private long numberOfStock;
}
