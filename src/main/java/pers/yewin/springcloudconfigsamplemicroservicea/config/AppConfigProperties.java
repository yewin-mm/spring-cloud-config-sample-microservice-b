package pers.yewin.springcloudconfigsamplemicroservicea.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @author: Ye Win
 * @created: 15/10/2022
 * @project: spring-cloud-config-sample-microservice-b
 * @package: config
 */

@Configuration
@ConfigurationProperties(prefix = "app.config.test")
@Data
public class AppConfigProperties {

    /**
     * You can Reference about reading value from properties by using @ConfigurationProperties in below link
     * https://github.com/yewin-mm/reading-properties-file-values
     */

    private String value;
    private String withoutEncryptedValue;
    private String withEncryptedValue;
    private String emailServiceUrl;
    private String emailServiceBasicAuthUsername;
    private String emailServiceBasicAuthPassword;

}
