package thesmartshopper.ui.login

data class LoginResult(
    val success: LoggedInUserView? = null,
    val error: Int? = null
)