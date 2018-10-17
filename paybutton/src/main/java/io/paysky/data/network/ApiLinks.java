package io.paysky.data.network;

/**
 * Created by Paysky-202 on 5/13/2018.
 */

public class ApiLinks {

    // note that https is 9006 port, http is 4006 port.
    public static String MAIN_LINK = "http://197.50.37.116:4006/";
    public static final String EXECUTE_PAYMENT = "Cube/PayLink.svc/api/PayByCard";
    public static final String SEND_RECEIPT_BY_MAIL = "Cube/PayLink.svc/api/SendReceiptToEmail";
    public static final String GENERATE_QRCODE = "Cube/PayLink.svc/api/GenerateQR";
    public static final String CHECK_PAYMENT_STATUS = "Cube/PayLink.svc/api/CheckTxnStatus";
    public static final String SMS_PAYMENT = "Cube/PayLink.svc/api/RequestToPay";
    public static final String MERCHANT_INFO = "Cube/PayLink.svc/api/CheckPaymentMethod";
    public static final String COMPOSE_3DS_TRANSACTION = "Cube/PayLink.svc/api/Compose3DSTransaction";
    public static final String PROCESS_3D_TRANSACTION = "Cube/PayLink.svc/api/Process3DSTransaction";
    public static final String GRAY_LINK = "https://grey.paysky.io/";
}

