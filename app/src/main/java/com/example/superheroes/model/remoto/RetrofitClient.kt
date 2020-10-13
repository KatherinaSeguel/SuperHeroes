package com.example.superheroes.model.remoto

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    companion object{

        private const val  URL_BASE = "https://akabab.github.io/superhero-api/api/"  // https://www.barpay.cl/


        fun getRetrofitClient(): SuperHeroesApi {

            val mRetrofit = Retrofit.Builder()
                .baseUrl(URL_BASE)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            return  mRetrofit.create(SuperHeroesApi::class.java) // devuelve la unión de la Interface con el cliente retrofit

        }
    }
}