package com.darkstore.depot.model.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import static com.darkstore.depot.model.response.DepotRestResponseMessage.MSG_VALIDATION_CONSTRAINT_DEPOT_NAME_NOTNULL;
import static com.darkstore.depot.model.response.DepotRestResponseMessage.MSG_VALIDATION_CONSTRAINT_DEPOT_NAME_SIZE;

@Data
public class ShutDownDepotRequestDto {
    @NotNull(message = MSG_VALIDATION_CONSTRAINT_DEPOT_NAME_NOTNULL)
    @Size(min = 1, max = 255, message = MSG_VALIDATION_CONSTRAINT_DEPOT_NAME_SIZE)
    private String depotName;
}
