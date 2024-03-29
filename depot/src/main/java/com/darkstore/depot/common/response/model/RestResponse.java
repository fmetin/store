package com.darkstore.depot.common.response.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class RestResponse<T> {
    private RestResponseHeader header;

    private T detail;

    private Map<String, String> validationErrors;

    public RestResponse(RestResponseHeader header, T detail, Map<String, String> validationErrors) {
        this.header = header;
        this.detail = detail;
        this.validationErrors = validationErrors;
    }

    public RestResponse() {
        this.header = new RestResponseHeader();
    }

    public RestResponse(T detail) {
        this.header = new RestResponseHeader();
        this.detail = detail;
    }
}
