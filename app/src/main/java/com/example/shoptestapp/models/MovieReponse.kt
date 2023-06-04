package com.example.shoptestapp.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieReponse(
    @SerializedName("results") val movies : List<Movies>
): Parcelable{
    constructor()   : this(mutableListOf())
}
