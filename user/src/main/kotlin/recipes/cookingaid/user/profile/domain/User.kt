package recipes.cookingaid.user.profile.domain

data class User(
    var name: String,
    var favoriteRecipe: String?=null
)
