package com.example.android5teamwork1.ui.fragments

import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android5teamwork1.R
import com.example.android5teamwork1.base.BaseFragment
import com.example.android5teamwork1.databinding.FragmentDetailBinding
import com.example.android5teamwork1.ui.adapters.AnimeAdapter

class DetailFragment :
    BaseFragment<FragmentDetailBinding, DetailViewModel>(R.layout.fragment_detail) {
    override val binding by viewBinding(FragmentDetailBinding::bind)
    override val viewModel: DetailViewModel by viewModels()
    private val animeAdapter = AnimeAdapter()

    override fun initialize() = with(binding.recyclerView) {
        adapter = animeAdapter
        layoutManager = GridLayoutManager(requireContext(), 3)
    }
}