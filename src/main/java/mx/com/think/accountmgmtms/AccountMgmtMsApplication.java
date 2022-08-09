package mx.com.think.accountmgmtms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AccountMgmtMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountMgmtMsApplication.class, args);
    }

}
