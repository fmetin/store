package com.darkstore.transfer.common.util;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class LocalDateTimeUtil {

    public LocalDateTime now (){
        return LocalDateTime.now();
    }
}
