package recipes.cookingaid.recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import recipes.cookingaid.recipe.domain.Recipe;
import recipes.cookingaid.recipe.orm.RecipeClient;

@RestController
public class RecipeController {

    @Autowired
    private RecipeClient recipeClient;

    @GetMapping("recipe/{id}")
    @ResponseBody
    public Recipe getRecipe(@PathVariable Integer id) {
        Object obj = recipeClient.getObj().block();
        System.out.println(obj);
        return null;
    }

    @PostMapping("recipe/create")
    @ResponseBody
    public Recipe saveRecipe(@RequestBody Recipe recipe) {
        return recipe;
    }

}
