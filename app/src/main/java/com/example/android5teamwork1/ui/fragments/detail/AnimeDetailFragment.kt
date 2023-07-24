package com.example.android5teamwork1.ui.fragments.detail

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.bumptech.glide.Glide
import com.example.android5teamwork1.R
import com.example.android5teamwork1.base.BaseFragment
import com.example.android5teamwork1.databinding.FragmentAnimeDetailFragmnetBinding
import com.example.android5teamwork1.ui.fragments.home.AnimeViewModel

class AnimeDetailFragment :
    BaseFragment<FragmentAnimeDetailFragmnetBinding, AnimeViewModel>(R.layout.fragment_anime_detail_fragmnet) {
    override val binding by viewBinding(FragmentAnimeDetailFragmnetBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setData()
    }

    private fun setData() {
        val args by navArgs<AnimeDetailFragmentArgs>()
        binding.textViewDetail.text = args.model.detail
        Glide.with(binding.imageViewPoster).load(args.model.image)
            .into(binding.imageViewPoster)
    }
}