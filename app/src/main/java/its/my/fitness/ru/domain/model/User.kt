package its.my.fitness.ru.domain.model

data class User(
    val login: String,
    var name: String? = null,
    val password: String,
)