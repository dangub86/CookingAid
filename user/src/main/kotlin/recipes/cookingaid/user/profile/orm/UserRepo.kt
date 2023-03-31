package recipes.cookingaid.user.profile.orm

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepo : JpaRepository<UserEntity, Int> {
    fun findByName(name: String): UserEntity?

}