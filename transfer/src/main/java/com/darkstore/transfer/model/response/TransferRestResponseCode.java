package com.darkstore.transfer.model.response;

import com.darkstore.transfer.common.response.model.RestResponseCode;

public class TransferRestResponseCode extends RestResponseCode {
    public TransferRestResponseCode(String responseCode, String responseMessage) {
        super(responseCode, responseMessage);
    }

    public static final RestResponseCode TRN_DEPOT_HAS_NOT_ENOUGH_STOCK = new RestResponseCode("TRN-0001", TransferRestResponseMessage.MSG_TRN_DEPOT_HAS_NOT_ENOUGH_STOCK);
    public static final RestResponseCode TRN_INTERCITY_TRANSFERS_CAN_ONLY_BE_MADE_FROM_THE_MAIN_DEPOT = new RestResponseCode("TRN-0002", TransferRestResponseMessage.MSG_TRN_INTERCITY_TRANSFERS_CAN_ONLY_BE_MADE_FROM_THE_MAIN_DEPOT);
    public static final RestResponseCode TRN_DEPOT_CLIENT_ERROR = new RestResponseCode("TRN-0003", TransferRestResponseMessage.MSG_TRN_DEPOT_CLIENT_ERROR);

}
