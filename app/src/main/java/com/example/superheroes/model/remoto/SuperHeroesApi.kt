package com.example.superheroes.model.remoto

import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET

interface SuperHeroesApi {

//Vieja confieble
@GET("all.json")
fun fetchAllSuperHeroes(): Call<HeroesData>

    //Coroutines
    @GET("all.json")
    suspend fun fetchAllSuperHeroesWithCoroutines(): Response<HeroesData>

}