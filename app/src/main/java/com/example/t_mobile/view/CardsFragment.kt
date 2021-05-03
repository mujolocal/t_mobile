package com.example.t_mobile.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import com.example.t_mobile.R
import com.example.t_mobile.databinding.FragmentCardsBinding
import com.example.t_mobile.databinding.FragmentHomeBinding
import com.example.t_mobile.viewModel.MainViewModel

class CardsFragment : Fragment(R.layout.fragment_cards) {
    private val mainVM by viewModels<MainViewModel>()
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        FragmentCardsBinding.bind(view).apply {
            lifecycleOwner = viewLifecycleOwner
            mainViewModel = mainVM
        }

    }
}