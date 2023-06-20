package com.reitama.fastcooking.interfaces

import com.reitama.fastcooking.entities.Category
import com.reitama.fastcooking.entities.Meal
import com.reitama.fastcooking.entities.MealResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface GetDataService {
    @GET("categories.php")
    fun getCategoryList(): Call<Category>

    @GET("filter.php")
    fun getMealList(@Query("c") category: String): Call<Meal>

    @GET("lookup.php")
    fun getSpecificItem(@Query("i") id: String): Call<MealResponse>

    @GET("search.php")
    fun getSearchItem(@Query("s") id: String): Call<MealResponse>
}