package recipes.cookingaid.user.profile

import org.springframework.stereotype.Service
import recipes.cookingaid.user.profile.domain.User

@Service
class ProfileInfoService {

    fun getUser(id: Int): User {
        return User(id, "name", "pizza")
    }

}