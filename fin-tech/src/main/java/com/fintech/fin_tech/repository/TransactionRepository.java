package com.fintech.fin_tech.repository;

import com.fintech.fin_tech.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, String> {


}
