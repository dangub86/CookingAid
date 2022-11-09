package recipes.cookingaid.recipe.orm;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.CassandraType;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

@Table(value = "recipes_by_user")
public record RecipeEntity(
        @PrimaryKeyColumn(name = "user_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
        String userId,
        @PrimaryKeyColumn(name = "recipe_id", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
        String recipeId,
        @CassandraType(type = CassandraType.Name.TEXT)
        String recipeName,
        @CassandraType(type = CassandraType.Name.TEXT)
        String timeInfo,
        @CassandraType(type = CassandraType.Name.TEXT)
        String complexity
) {}
