package com.example.android5teamwork1.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android5teamwork1.data.model.AnimeModel
import com.example.android5teamwork1.databinding.ItemRecyclerViewBinding

class AnimeAdapter(private val onItemClick: (model: AnimeModel) -> Unit) :
    ListAdapter<AnimeModel, AnimeAdapter.AnimeViewHolder>(DiffUtilCallback()) {

    inner class AnimeViewHolder(private val binding: ItemRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

        init {
            itemView.setOnClickListener {
                getItem(adapterPosition)?.let {
                    onItemClick(it)
                }
            }
        }

        fun onBind(animeModel: AnimeModel?) = with(binding) {
            Glide.with(itemCharacterImage).load(animeModel?.image).into(itemCharacterImage)
            itemCharacterName.text = animeModel?.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        return AnimeViewHolder(
            ItemRecyclerViewBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    companion object {

        class DiffUtilCallback : DiffUtil.ItemCallback<AnimeModel>() {

            override fun areItemsTheSame(
                oldItem: AnimeModel,
                newItem: AnimeModel,
            ): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(
                oldItem: AnimeModel,
                newItem: AnimeModel,
            ): Boolean {
                return oldItem == newItem
            }
        }
    }
}

