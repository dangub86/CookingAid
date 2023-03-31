package recipes.cookingaid.user

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import recipes.cookingaid.user.profile.ProfileInfoService
import recipes.cookingaid.user.profile.domain.User

@SpringBootTest
class UserEntityApplicationTests {
	@Autowired
	lateinit var profileInfoService: ProfileInfoService

	@Test
	fun contextLoads() {
	}

	@Test
	fun getUser() {
		val user = profileInfoService.getUser(1)
		println(user)
	}

	@Test
	fun saveUser() {
		val user = User("xxx", "favorite-xxx")
		val savedUser = profileInfoService.saveUser(user)
		println(savedUser)
	}

	@Test
	fun removeUser() {
		val user = profileInfoService.findUserByName("xxx")
		user?.id?.let { profileInfoService.deleteUser(it) }

		println(user)
	}

}
