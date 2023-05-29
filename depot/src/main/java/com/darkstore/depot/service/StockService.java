package com.darkstore.depot.service;

import com.darkstore.depot.model.dto.*;

public interface StockService {
    void createStock(CreateStockRequestDto request);

    void updateStock(UpdateStockRequestDto request);

    void updateStockList(UpdateStockListRequestDto request);

    StockInfoResponseDto stockInfo(StockInfoRequestDto request);
}
