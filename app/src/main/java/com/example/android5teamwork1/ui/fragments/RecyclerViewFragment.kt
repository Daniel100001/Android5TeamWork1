package com.example.android5teamwork1.ui.fragments

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android5teamwork1.databinding.ItemRecyclerViewBinding

class RecyclerViewFragment :
    ListAdapter<Model, RecyclerViewFragment.RecyclerViewHolder>(DiffUtilCallback()) {

    inner class RecyclerViewHolder(private val binding: ItemRecyclerViewBinding) :
        RecyclerView.ViewHolder(binding.root) {

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
        class DiffUtilCallback : DiffUtil.ItemCallback<Model>() {

            override fun areItemsTheSame(oldItem: Model, newItem: MOdel): Boolean {
                return oldItem.id == newItem.id
            }

            override fun areContentsTheSame(oldItem: Model, newItem: MOdel): Boolean {
                return oldItem == newItem
            }
        }
    }
}