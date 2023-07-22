package com.example.android5teamwork1.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android5teamwork1.data.model.Anime
import com.example.android5teamwork1.databinding.ItemRecyclerViewBinding

class RecyclerViewFragment :
    ListAdapter<Anime, RecyclerViewFragment.RecyclerViewHolder>(DiffUtilCallback()) {

    inner class RecyclerViewHolder(private val binding: ItemRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: Anime?) {

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        return RecyclerViewHolder(
            ItemRecyclerViewBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    companion object {
        class DiffUtilCallback : DiffUtil.ItemCallback<Anime>() {

            override fun areItemsTheSame(oldItem: Anime, newItem: Anime): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Anime, newItem: Anime): Boolean {
                return oldItem == newItem
            }
        }
    }
}