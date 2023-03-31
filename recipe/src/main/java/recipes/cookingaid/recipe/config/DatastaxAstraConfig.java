package recipes.cookingaid.recipe.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.cassandra.CqlSessionBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.nio.file.Path;


@Configuration
public class DatastaxAstraConfig {

    @Value("${spring.data.cassandra.username}")
    private String clientId;
    @Value("${spring.data.cassandra.password}")
    private String clientSecret;


    @Bean
    public CqlSessionBuilderCustomizer sessionBuilderCustomizer(DataStaxAstraProperties astraProperties) {
        Path bundle = astraProperties.getSecureConnectBundle().toPath();
        System.out.println(astraProperties.getSecureConnectBundle().getAbsolutePath());
        return cqlSessionBuilder -> cqlSessionBuilder.withCloudSecureConnectBundle(bundle)
                .withAuthCredentials(clientId, clientSecret)
                ;
    }
}
