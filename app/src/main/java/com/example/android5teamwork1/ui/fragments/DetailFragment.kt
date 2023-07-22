package com.example.android5teamwork1.ui.fragments

import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.android5teamwork1.R
import com.example.android5teamwork1.base.BaseFragment
import com.example.android5teamwork1.databinding.FragmentDetailBinding

class DetailFragment : BaseFragment<FragmentDetailBinding, DetailViewModel>(R.layout.fragment_detail) {
    override val binding by viewBinding(FragmentDetailBinding::bind)
    override val viewModel by viewModels<DetailViewModel>()
}