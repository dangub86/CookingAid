package recipes.cookingaid.user

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseBody
import recipes.cookingaid.user.profile.ProfileInfoService
import recipes.cookingaid.user.profile.domain.User
import recipes.cookingaid.user.profile.orm.UserEntity

@Controller
class UserController(val profileInfoService: ProfileInfoService) {

    @GetMapping("/user/{id}")
    @ResponseBody
    fun getUserInfo(@PathVariable("id") id: Int): User {
        return profileInfoService.getUser(id)
    }

    @PostMapping("/user/create")
    @ResponseBody
    fun saveUserInfo(@RequestBody user: User): UserEntity {
        return profileInfoService.saveUser(user)
    }

}