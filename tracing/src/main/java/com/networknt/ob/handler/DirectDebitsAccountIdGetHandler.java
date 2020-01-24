package com.networknt.ob.handler;

import com.networknt.handler.LightHttpHandler;
import com.networknt.httpstring.AttachmentConstants;
import com.networknt.utility.Constants;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.HttpString;
import java.util.HashMap;
import java.util.Map;

public class DirectDebitsAccountIdGetHandler implements LightHttpHandler {
    
    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        Map<String, Object> auditInfo = exchange.getAttachment(AttachmentConstants.AUDIT_INFO);
        String userId = (String)auditInfo.get(Constants.USER_ID_STRING);
        logger.debug("userId = " + userId);
        String accountId = exchange.getQueryParameters().get("AccountId").getFirst();
        logger.debug("accountId = " + accountId);
        String responseBody = null;
        if("stevehu".equals(userId)) {
            switch(accountId) {
                case "22289":
                    responseBody = "{\"Data\":{\"DirectDebit\":[{\"AccountId\":\"22289\",\"DirectDebitId\":\"DD03\",\"MandateIdentification\":\"Caravanners\",\"DirectDebitStatusCode\":\"Active\",\"Name\":\"Towbar Club 3 - We Love Towbars\",\"PreviousPaymentDateTime\":\"2017-04-05T10:43:07+00:00\",\"PreviousPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/22289/direct-debits/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "31820":
                    responseBody = "{\"Data\":{\"DirectDebit\":[{\"AccountId\":\"31820\",\"DirectDebitId\":\"DD77\",\"MandateIdentification\":\"Golfers\",\"DirectDebitStatusCode\":\"Active\",\"Name\":\"Golf Club\",\"PreviousPaymentDateTime\":\"2017-04-05T10:43:07+00:00\",\"PreviousPaymentAmount\":{\"Amount\":\"22.30\",\"Currency\":\"GBP\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/31820/direct-debits/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        } else if("ericbroda".equals(userId)) {
            switch(accountId) {
                case "42281":
                    responseBody = "{\"Data\":{\"DirectDebit\":[{\"AccountId\":\"42281\",\"DirectDebitId\":\"DD04\",\"MandateIdentification\":\"Caravanners\",\"DirectDebitStatusCode\":\"Active\",\"Name\":\"Towbar Club 3 - We Love Towbars\",\"PreviousPaymentDateTime\":\"2017-04-05T10:43:07+00:00\",\"PreviousPaymentAmount\":{\"Amount\":\"0.57\",\"Currency\":\"GBP\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/42281/direct-debits/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
                case "41221":
                    responseBody = "{\"Data\":{\"DirectDebit\":[{\"AccountId\":\"41221\",\"DirectDebitId\":\"DD78\",\"MandateIdentification\":\"Golfers\",\"DirectDebitStatusCode\":\"Active\",\"Name\":\"Golf Club\",\"PreviousPaymentDateTime\":\"2017-04-05T10:43:07+00:00\",\"PreviousPaymentAmount\":{\"Amount\":\"22.30\",\"Currency\":\"GBP\"}}]},\"Links\":{\"Self\":\"https://api.alphabank.com/open-banking/v3.1/aisp/accounts/41221/direct-debits/\"},\"Meta\":{\"TotalPages\":1}}";
                    break;
            }
        }
        if(responseBody != null) {
            exchange.getResponseHeaders().add(new HttpString("Content-Type"), "application/json");
            exchange.getResponseSender().send(responseBody);
        } else {
            exchange.setStatusCode(404);
            exchange.getResponseSender().send("");
        }
    }
}
