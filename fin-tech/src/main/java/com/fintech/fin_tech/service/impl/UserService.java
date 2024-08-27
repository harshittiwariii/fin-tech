package com.fintech.fin_tech.service.impl;

import com.fintech.fin_tech.dto.*;

public interface UserService {
    BankResponse createAccount (UserRequest userRequest);

    BankResponse balanceEnquiry(EnquiryRequest request);

    String nameEnquiry(EnquiryRequest request);

    BankResponse creditAccount(CreditDebitRequest request);
    BankResponse debitAccount(CreditDebitRequest request);
    BankResponse transfer(TransferRequest request);
}
