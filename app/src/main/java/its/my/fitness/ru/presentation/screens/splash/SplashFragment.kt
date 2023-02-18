package its.my.fitness.ru.presentation.screens.splash

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import its.my.fitness.ru.R
import its.my.fitness.ru.databinding.SplashFragmentBinding
import its.my.fitness.ru.presentation.base.BaseFragment

@AndroidEntryPoint
class SplashFragment: BaseFragment<SplashViewModel, SplashFragmentBinding>(R.layout.splash_fragment) {

    override val viewModel: SplashViewModel
        get() = TODO("Not yet implemented")

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): SplashFragmentBinding {
        TODO("Not yet implemented")
    }

}