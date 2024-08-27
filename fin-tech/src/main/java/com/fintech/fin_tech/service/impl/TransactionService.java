package com.fintech.fin_tech.service.impl;

import com.fintech.fin_tech.dto.TransactionDto;
import com.fintech.fin_tech.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);

    void saveTransaction(Transaction transaction);
}
