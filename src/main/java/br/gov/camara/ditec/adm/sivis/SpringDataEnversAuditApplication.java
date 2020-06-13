package  br.gov.camara.ditec.adm.sivis ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableJpaRepositories(repositoryFactoryBeanClass = EnversRevisionRepositoryFactoryBean.class)
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages="br.gov.camara.ditec.adm.sivis")
public class SpringDataEnversAuditApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataEnversAuditApplication.class, args);
    }

}
