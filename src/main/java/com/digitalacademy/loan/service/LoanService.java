package com.digitalacademy.loan.service;

import com.digitalacademy.loan.controller.LoanController;
import com.digitalacademy.loan.model.LoanInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class LoanService {
    private static final Logger log = LogManager.getLogger(LoanService.class.getName());

    public LoanInfo getLoanInfoById(Long id) throws Exception{
        log.info("Get loan by id: {}", id);

        LoanInfo loanInfo = new LoanInfo();
        if(id.equals(1L)){
            loanInfo.setId(1L);
            loanInfo.setStatus("OK");
            loanInfo.setAccountPayable("102-222-2200");
            loanInfo.setAccountReceviable("102-333-2020");
            loanInfo.setPrincipalAmount(3400.00);
        } else {
            log.info("id: {}", id);
            throw new Exception("Test throw new exeption");
        }


        return loanInfo;

    }
}
