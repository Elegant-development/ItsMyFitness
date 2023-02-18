package its.my.fitness.ru.presentation.screens.welcome

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import its.my.fitness.ru.R
import its.my.fitness.ru.databinding.WelcomeFragmentBinding
import its.my.fitness.ru.presentation.base.BaseFragment

@AndroidEntryPoint
class WelcomeFragment: BaseFragment<WelcomeViewModel, WelcomeFragmentBinding>(R.layout.welcome_fragment) {

    override val viewModel: WelcomeViewModel
        get() = TODO("Not yet implemented")

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): WelcomeFragmentBinding {
        TODO("Not yet implemented")
    }

}