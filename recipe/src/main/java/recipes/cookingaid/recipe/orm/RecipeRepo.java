package recipes.cookingaid.recipe.orm;

import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepo extends CassandraRepository<RecipeEntity, String> {
}
