package com.example.t_mobile.adapters

import android.app.ActionBar
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.t_mobile.databinding.CardItemBinding
import com.example.t_mobile.model.Card
import com.example.t_mobile.model.Image

class CardsAdapter(
    private val results: List<Card>
) : RecyclerView.Adapter<CardsAdapter.TrackViewHolder>() {
    private val TAG = "CardsAdapter"

    override fun onCreateViewHolder(
        parent: ViewGroup, viewType: Int
    ) = TrackViewHolder(
        CardItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(
        holder: TrackViewHolder, position: Int
    ) = with(holder.binding) {
        Glide.with(image.context)
            .load(results[position].card?.image?.url.toString())
            .into(image)
        if (results[position].card?.image == null){
            Log.d(TAG, "onBindViewHolder: this image is null")
            image.layoutParams.height = 300
        }
        card = results[position]


     }

    override fun getItemCount() = results.size



    class TrackViewHolder(val binding: CardItemBinding) : RecyclerView.ViewHolder(binding.root)
}