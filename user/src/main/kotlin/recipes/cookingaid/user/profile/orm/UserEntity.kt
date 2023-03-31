package recipes.cookingaid.user.profile.orm

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table


@Entity
@Table(name = "user")
class UserEntity(

    var name: String,

    @Column(name = "favorite_recipe")
    var favoriteRecipe: String?=null,

    @Column(name = "favorite_ingredients")
    var favoriteIngredients: String?=null,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int?=null
)
