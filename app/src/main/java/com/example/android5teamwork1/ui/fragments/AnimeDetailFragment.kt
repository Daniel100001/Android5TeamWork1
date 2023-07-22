package com.example.android5teamwork1.ui.fragments

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android5teamwork1.R
import com.example.android5teamwork1.base.BaseFragment
import com.example.android5teamwork1.databinding.FragmentAnimeDetailFragmnetBinding

class AnimeDetailFragment :
    BaseFragment<FragmentAnimeDetailFragmnetBinding, AnimeViewModel>(R.layout.anime_fragment) {
    override val binding by viewBinding(FragmentAnimeDetailFragmnetBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
}