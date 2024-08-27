package com.fintech.fin_tech.service.impl;

import com.fintech.fin_tech.dto.EmailDetails;

public interface EmailService {

    void sendEmailAlert(EmailDetails emailDetails);
    void sendEmailWithAttachment(EmailDetails emailDetails);
}
