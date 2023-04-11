package com.example.allquest

import java.time.Duration

data class tags(
    val id:Int,
    val name:String
)
data class courses(
    val id: Int,
    val title: String,
    val tags: List<Int>,
    val cover: String,
    val price:Int
)
data class course(
    val id: Int,
    val price:Int,
    val title:String,
    val tags: List<Int>,
    val description:String,
    val mentors:List<mentorsData>,
    val cover:String,
    val plan:List<planData>
)
data class mentorsData(
    val id:String,
    val firstname:String,
    val lastname:String,
    val patronymic:String,
    val avatar:String
)
data class planData(
    val title: String,
    val description: String,
    val duration: Int
)
data class materials(
    val id:Int,
    val title: String,
    val cover:String,
    val url:String
)
data class orderCreate(
    val list: List<Int>
)
data class workPlanData(
    val id:Int,
    val idcourse:Int,
    val title: String,
    val description: String,
    val isComplete:Boolean,
    val datetime:String,
    val duration: Int
)
data class confirmLesson(
    val isConfirm:Boolean
)
data class delayedLesson(
    val id: Int,
    val idcourse:Int,
    val title: String,
    val description: String,
    val isComplete:Boolean,
    val datetime:String,
    val duration: Int
)
data class profileData(
    val id:String,
    val firstname:String,
    val lastname:String,
    val patronymic:String,
    val email:String,
    val sex:String,
    val dateBirthDay:String,
    val avatar:String
)
data class profileCourses(
    val id:Int,
    val title: String,
    val tags: tags,
    val cover:String,
    val price: Int
)

data class patchProfile(
    val firstname: String,
    val lastname: String,
    val patronymic: String,
    val email: String,
    val dateBirthDay: String,
    val sex:String

)
