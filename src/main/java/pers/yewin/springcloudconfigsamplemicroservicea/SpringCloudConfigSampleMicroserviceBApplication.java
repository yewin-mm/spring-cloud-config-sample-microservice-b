package pers.yewin.springcloudconfigsamplemicroservicea;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class SpringCloudConfigSampleMicroserviceBApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudConfigSampleMicroserviceBApplication.class, args);
    }

}
