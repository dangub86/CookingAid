package recipes.cookingaid.user.profile.orm

data class UserEntity(
    var id: Int,
    var name: String,
    var favoriteRecipe: String
)
