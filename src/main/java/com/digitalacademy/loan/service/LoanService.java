package com.digitalacademy.loan.service;

import com.digitalacademy.loan.constants.LoanError;
import com.digitalacademy.loan.exception.LoanException;
import com.digitalacademy.loan.model.LoanInfo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    private static final Logger log = LogManager.getLogger
            (LoanService.class.getName());

    public LoanInfo getLoanInfoById(Long id) throws Exception{
        log.info("Get loan by id: {}", id);

        LoanInfo loanInfo = new LoanInfo();
        if(id.equals(1L)){
            loanInfo.setId(1L);
            loanInfo.setStatus("OK");
            loanInfo.setAccountPayable("102-222-2200");
            loanInfo.setAccountReceivable("102-333-2020");
            loanInfo.setPrincipalAmount(3400.00);
        }
        else if(id.equals(2L)){
            log.info("Id: {}",id);
            throw new LoanException(
                    LoanError.GET_LOAN_INFO_NOT_FOUND,
                    HttpStatus.BAD_REQUEST
                    );
        }
        else {
            log.info(id.toString());
            throw new Exception("Test throw new exception");
        }


        return loanInfo;

    }
}
