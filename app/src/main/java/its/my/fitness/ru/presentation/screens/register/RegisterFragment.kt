package its.my.fitness.ru.presentation.screens.register

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import dagger.hilt.android.AndroidEntryPoint
import its.my.fitness.ru.R
import its.my.fitness.ru.databinding.RegisterFragmentBinding
import its.my.fitness.ru.presentation.base.BaseFragment

@AndroidEntryPoint
class RegisterFragment: BaseFragment<RegisterViewModel, RegisterFragmentBinding>(R.layout.register_fragment) {

    override val viewModel: RegisterViewModel
        get() = TODO("Not yet implemented")

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): RegisterFragmentBinding = RegisterFragmentBinding.inflate(inflater)

    override fun initialize() {
        binding.loginTxt.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_authFragment)
        }
        binding.registerBtn.setOnClickListener {
            findNavController().navigate(R.id.action_registerFragment_to_mainFragment)
        }
    }

}