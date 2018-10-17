package io.paysky.util;


public interface AppConstant {

    interface BundleKeys {
        String SECURE_HASH_KEY = "secure_hash";
        String TERMINAL_ID = "terminal_id";
        String MERCHANT_ID = "merchant_id";
        String PAY_AMOUNT = "pay_amount";
        String PAYMENT_DATA = "payment_data";
        String RECEIPT = "receipt";
        String CURRENCY_CODE = "currency_code";
        String IS3DS_ENABLED = "is_3ds_enabled";
    }


    interface TransactionChannelName {
        String CARD = "Card";
        String TAHWEEL = "Tahweel";
    }

}
