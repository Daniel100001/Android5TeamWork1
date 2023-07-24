package com.example.android5teamwork1.ui.fragments.home

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.GridLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android5teamwork1.R
import com.example.android5teamwork1.base.BaseFragment
import com.example.android5teamwork1.data.AnimeData
import com.example.android5teamwork1.data.model.AnimeModel
import com.example.android5teamwork1.databinding.AnimeFragmentBinding
import com.example.android5teamwork1.ui.adapters.AnimeAdapter

class AnimeFragment :
    BaseFragment<AnimeFragmentBinding, AnimeViewModel>(R.layout.anime_fragment) {
    override val binding by viewBinding(AnimeFragmentBinding::bind)
    override val viewModel: AnimeViewModel by viewModels()
    private val animeAdapter = AnimeAdapter(this::onItemClick)

    private fun onItemClick(model: AnimeModel) {
        findNavController().navigate(AnimeFragmentDirections.actionAnimeFragmentToAnimeDetailFragment(model))
    }

    override fun initialize() = with(binding.recyclerView) {
        adapter = animeAdapter
        layoutManager = GridLayoutManager(requireContext(), 3)
        val list = AnimeData()
        list.setList().observe(viewLifecycleOwner){
            animeAdapter.submitList(it)
        }
    }

    override fun setupListeners() {
        binding.btnAddItem.setOnClickListener {
            findNavController().navigate(R.id.action_animeFragment_to_addFragment2)
        }
    }

}