package its.my.fitness.ru.presentation.screens.onboarding

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import its.my.fitness.ru.R
import its.my.fitness.ru.databinding.OnboardingFragmentBinding
import its.my.fitness.ru.presentation.base.BaseFragment

class OnboardingFragment: BaseFragment<OnboardingViewModel, OnboardingFragmentBinding>(R.layout.onboarding_fragment) {

    override val viewModel: OnboardingViewModel
        get() = TODO("Not yet implemented")

    override fun initBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): OnboardingFragmentBinding = OnboardingFragmentBinding.inflate(inflater)

    override fun initialize() {
        var number = 1
        with(binding){
            onboardingButton.setOnClickListener {
                number++
                if (number == 2) {
                    onboardingImage.setImageResource(R.drawable.onboarding_2)
                    onboardingButton.setImageResource(R.drawable.onboarding_button_2)
                }
                if (number == 3) {
                    onboardingImage.setImageResource(R.drawable.onboarding_3)
                    onboardingButton.setImageResource(R.drawable.onboarding_button_3)
                }
                if (number == 4) {
                    onboardingImage.setImageResource(R.drawable.onboarding_4)
                    onboardingButton.setImageResource(R.drawable.onboarding_button_4)
                }
                if (number == 5) {

                }
            }
        }
    }

}