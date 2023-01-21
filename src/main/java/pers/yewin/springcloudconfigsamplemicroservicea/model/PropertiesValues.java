package pers.yewin.springcloudconfigsamplemicroservicea.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author: Ye Win
 * @created: 15/10/2022
 * @project: spring-cloud-config-sample-microservice-b
 * @package: pers.yewin.springcloudconfigsamplemicroserviceb.model
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PropertiesValues {
    private String value;
    private String withoutEncryptedValue;
    private String encryptedValue;
    private String emailServiceUrl;
    private String emailServiceBasicAuthUsername;
    private String emailServiceBasicAuthPassword;
}
