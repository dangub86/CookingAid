package recipes.cookingaid.recipe.orm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Mono;

import java.net.URI;

@Repository
public class RecipeClient {

    @Autowired
    private WebClient.Builder builder;

    @Value("https://${astra.db.id}-${astra.db.region}.apps.astra.datastax.com/api/rest/v1/keyspaces/${astra.db.keyspace}")
    private String baseUrl;

    @Value("${astra.db.application.token}")
    private String token;

    public Mono<Object> getObj() {
        URI uri = UriComponentsBuilder.fromHttpUrl(baseUrl)
                .pathSegment("tables", "user", "rows", "t@gmail.com")
                .build()
                .toUri();

        Mono<Object> objectMono = builder.baseUrl(uri.toString())
                .defaultHeader("X-Cassandra-Token", token)
                .build()
                .get()
                .retrieve()
                .bodyToMono(Object.class);

        System.out.println("BODY: " + objectMono);

        return objectMono;
    }

}
