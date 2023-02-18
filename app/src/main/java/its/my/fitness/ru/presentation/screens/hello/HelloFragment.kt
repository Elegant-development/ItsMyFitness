package its.my.fitness.ru.presentation.screens.hello

import android.view.LayoutInflater
import android.view.ViewGroup
import dagger.hilt.android.AndroidEntryPoint
import its.my.fitness.ru.R
import its.my.fitness.ru.databinding.HelloFragmentBinding
import its.my.fitness.ru.presentation.base.BaseFragment

@AndroidEntryPoint
class HelloFragment: BaseFragment<HelloViewModel, HelloFragmentBinding>(R.layout.hello_fragment) {

    override val viewModel: HelloViewModel
        get() = TODO("Not yet implemented")

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): HelloFragmentBinding {
        TODO("Not yet implemented")
    }

}