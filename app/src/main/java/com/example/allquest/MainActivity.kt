package com.example.allquest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import retrofit2.Call
import retrofit2.Response
val TAG = "ERRROR"
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Connection.api.getCatalogCourses(6).enqueue(object :retrofit2.Callback<List<courses>>{
            override fun onResponse(call: Call<List<courses>>, response: Response<List<courses>>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+"Catalog Courses")
            }

            override fun onFailure(call: Call<List<courses>>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }
        })
        Connection.api.getTags().enqueue(object :retrofit2.Callback<List<tags>>{
            override fun onResponse(call: Call<List<tags>>, response: Response<List<tags>>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+"get Tag")
            }

            override fun onFailure(call: Call<List<tags>>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }
        })
        Connection.api.getCourse("6").enqueue(object :retrofit2.Callback<course>{
            override fun onResponse(call: Call<course>, response: Response<course>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+"get corse")
            }

            override fun onFailure(call: Call<course>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }
        })
        Connection.api.getMaterials().enqueue(object :retrofit2.Callback<List<materials>>{
            override fun onResponse(call: Call<List<materials>>, response: Response<List<materials>>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+"Materials")
            }

            override fun onFailure(call: Call<List<materials>>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })
        Connection.api.postOrder(listOf(1,3,5)).enqueue(object :retrofit2.Callback<Boolean>{
            override fun onResponse(call: Call<Boolean>, response: Response<Boolean>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+"order")
            }

            override fun onFailure(call: Call<Boolean>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })
        Connection.api.getPlan(6,"09.04.2023",3,"next").enqueue(object :retrofit2.Callback<List<planData>>{
            override fun onResponse(call: Call<List<planData>>, response: Response<List<planData>>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+" plan")
            }

            override fun onFailure(call: Call<List<planData>>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })
//        Connection.api.postConfirm(6,1,"Comment").enqueue(object :retrofit2.Callback<confirmLesson>{
//            override fun onResponse(call: Call<confirmLesson>, response: Response<confirmLesson>) {
//                Log.d(TAG,response.body().toString())
//                Log.d(TAG,response.message()+"confirm")
//            }
//
//            override fun onFailure(call: Call<confirmLesson>, t: Throwable) {
//                Log.d(TAG,t.message!!)
//            }
//
//        })
        Connection.api.getDelayLesson(6).enqueue(object :retrofit2.Callback<List<delayedLesson>>{
            override fun onResponse(call: Call<List<delayedLesson>>, response: Response<List<delayedLesson>>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+"delay ses")
            }

            override fun onFailure(call: Call<List<delayedLesson>>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })
        Connection.api.profile("6").enqueue(object :retrofit2.Callback<profileData>{
            override fun onResponse(call: Call<profileData>, response: Response<profileData>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+" Profile")
            }

            override fun onFailure(call: Call<profileData>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })
        Connection.api.patchEdit(6,patchProfile("Ivan","va","in","aleks@mail.ru","12.12.2003","Мужчина")).enqueue(object :retrofit2.Callback<profileData>{
            override fun onResponse(call: Call<profileData>, response: Response<profileData>) {

                Log.d(TAG,response.body().toString()+" PatchEdit")
                Log.d(TAG,response.message()+" Patch edit")

            }

            override fun onFailure(call: Call<profileData>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })
        Connection.api.getProfileCourses(6,).enqueue(object :retrofit2.Callback<List<courses>>{
            override fun onResponse(call: Call<List<courses>>, response: Response<List<courses>>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+" profile courses")
            }

            override fun onFailure(call: Call<List<courses>>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })
        Connection.api.getProfileCourse(6,"2").enqueue(object :retrofit2.Callback<course>{
            override fun onResponse(call: Call<course>, response: Response<course>) {
                Log.d(TAG,response.body().toString())
                Log.d(TAG,response.message()+" profile course")
            }

            override fun onFailure(call: Call<course>, t: Throwable) {
                Log.d(TAG,t.message!!)
            }

        })

    }
}