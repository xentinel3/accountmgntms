package mx.com.think.accountmgmtms.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/account")
public class AccountManagementController {
    Logger logger = LoggerFactory.getLogger(AccountManagementController.class);

    @GetMapping("/estatus")
    public String status(){
        logger.info("hi");
        return "hi";
    }
}
