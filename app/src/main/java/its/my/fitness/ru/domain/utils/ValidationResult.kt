package its.my.fitness.ru.domain.utils

data class ValidationResult(
    val successful: Boolean,
    val errorMessage: String? = null
)