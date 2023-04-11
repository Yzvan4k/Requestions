package com.example.allquest

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.PATCH
import retrofit2.http.POST
import retrofit2.http.Query

interface API {
    @GET("catalog/tags")
    fun getTags():Call<List<tags>>
    @GET("catalog/courses")
    fun getCatalogCourses(@Header("idUser") id:Int):Call<List<courses>>
    @GET("catalog/course")
    fun getCourse(@Query("idCourse") id:String):Call<course>
    @GET("catalog/materials")
    fun getMaterials():Call<List<materials>>
    @POST("catalog/orderCreate")
    fun postOrder(@Body order:List<Int>):Call<Boolean>
    @GET("workSpace/plan")
    fun getPlan(@Header("idUser") id:Int,@Query("date") date:String,@Query("courseld") courseld:Int, @Query("direction") dir:String):Call<List<planData>>
    @POST("workSpace/confirmLesson")
    fun postConfirm(@Header("idUser") id:Int,@Query("idLesson") idLesson:Int,@Query("commentFile") comment:String):Call<confirmLesson>
    @GET("workSpace/delayLessons")
    fun getDelayLesson(@Header("idUser") id:Int):Call<List<delayedLesson>>
    @GET("profile")
    fun profile(@Query("idUser") idUser:String):Call<profileData>
    @PATCH("profile")
    fun patchEdit(@Header("idUser") id:Int,@Body patchProfile:patchProfile):Call<profileData>
    @GET("profile/courses")
    fun getProfileCourses(@Header("idUser") id:Int):Call<List<courses>>
    @GET("profile/course")
    fun getProfileCourse(@Header("idUser") id:Int,@Query("idCourse") idcourse:String):Call<course>

}