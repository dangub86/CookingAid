package recipes.cookingaid.user

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import recipes.cookingaid.user.profile.ProfileInfoService
import recipes.cookingaid.user.profile.domain.User

@Controller
class UserController(val profileInfoService: ProfileInfoService) {

    @GetMapping("/user/{id}")
    fun getUserInfo(@PathVariable("id") id: Int): User {
        return profileInfoService.getUser(id)
    }

}