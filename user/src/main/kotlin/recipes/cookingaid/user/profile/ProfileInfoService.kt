package recipes.cookingaid.user.profile

import org.springframework.stereotype.Service
import recipes.cookingaid.user.profile.domain.User
import recipes.cookingaid.user.profile.orm.UserEntity
import recipes.cookingaid.user.profile.orm.UserRepo
import java.util.Optional

@Service
class ProfileInfoService(val userRepo: UserRepo) {

    fun getUser(id: Int): User {
        val userRecovered = userRepo.findById(id)
            .orElseThrow()

        return User(
            userRecovered.name,
            userRecovered.favoriteRecipe
        )
    }

    fun saveUser(user: User): UserEntity {

        return userRepo.save(
            UserEntity(
                user.name,
                user.favoriteRecipe
            )
        )

    }

    fun findUserByName(name: String): UserEntity? {
        return userRepo.findByName(name)
    }

    fun deleteUser(id: Int) {
        return userRepo.deleteById(id)
    }


}