package com.example.shoptestapp.services

import com.example.shoptestapp.models.MovieReponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("movie/popular?api_key=c6ec046981d220c8430997cfd9c00f8c")
    fun getMovieList() : Call<MovieReponse>
}