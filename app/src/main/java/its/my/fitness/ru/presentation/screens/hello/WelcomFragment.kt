package its.my.fitness.ru.presentation.screens.hello

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import its.my.fitness.ru.R
import its.my.fitness.ru.databinding.WelcomFragmentBinding
import its.my.fitness.ru.presentation.base.BaseFragment

@AndroidEntryPoint
class WelcomFragment: BaseFragment<WelcomViewModel, WelcomFragmentBinding>(R.layout.welcom_fragment) {

    override val viewModel: WelcomViewModel
        get() = TODO("Not yet implemented")

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): WelcomFragmentBinding {
        TODO("Not yet implemented")
    }

}