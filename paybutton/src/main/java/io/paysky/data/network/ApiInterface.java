package io.paysky.data.network;

import io.paysky.data.model.request.ManualPaymentRequest;
import io.paysky.data.model.request.MerchantInfoRequest;
import io.paysky.data.model.request.Process3dTransactionRequest;
import io.paysky.data.model.request.QrGeneratorRequest;
import io.paysky.data.model.request.SendReceiptByMailRequest;
import io.paysky.data.model.request.SmsPaymentRequest;
import io.paysky.data.model.request.TransactionStatusRequest;
import io.paysky.data.model.request.Compose3dsTransactionRequest;
import io.paysky.data.model.response.GenerateQrCodeResponse;
import io.paysky.data.model.response.ManualPaymentResponse;
import io.paysky.data.model.response.MerchantInfoResponse;
import io.paysky.data.model.response.Process3dTransactionResponse;
import io.paysky.data.model.response.SendReceiptByMailResponse;
import io.paysky.data.model.response.SmsPaymentResponse;
import io.paysky.data.model.response.TransactionStatusResponse;
import io.paysky.data.model.response.Compose3dsTransactionResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by Paysky-202 on 5/17/2018.
 */

public interface ApiInterface {


    @POST(ApiLinks.SEND_RECEIPT_BY_MAIL)
    Call<SendReceiptByMailResponse> sendReceiptByMail(@Body SendReceiptByMailRequest mailRequest);

    @POST(ApiLinks.CHECK_PAYMENT_STATUS)
    Call<TransactionStatusResponse> checkTransactionStatus(@Body TransactionStatusRequest request);

    @POST(ApiLinks.GENERATE_QRCODE)
    Call<GenerateQrCodeResponse> generateQrCode(@Body QrGeneratorRequest request);

    @POST(ApiLinks.EXECUTE_PAYMENT)
    Call<ManualPaymentResponse> executeManualPayment(@Body ManualPaymentRequest paymentRequest);

    @POST(ApiLinks.SMS_PAYMENT)
    Call<SmsPaymentResponse> requestToPay(@Body SmsPaymentRequest request);

    @POST(ApiLinks.MERCHANT_INFO)
    Call<MerchantInfoResponse> getMerchantInfo(@Body MerchantInfoRequest request);

    @POST(ApiLinks.COMPOSE_3DS_TRANSACTION)
    Call<Compose3dsTransactionResponse> compose3dpsTransaction(@Body Compose3dsTransactionRequest request);

    @POST(ApiLinks.PROCESS_3D_TRANSACTION)
    Call<Process3dTransactionResponse> process3dTransaction(@Body Process3dTransactionRequest request);
}
