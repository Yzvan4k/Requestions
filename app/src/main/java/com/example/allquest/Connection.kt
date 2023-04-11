package com.example.allquest

import org.java_websocket.client.WebSocketClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.net.URI

object Connection {
    val retrofit = Retrofit.Builder().baseUrl("http://95.31.130.149:8085/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val api = retrofit.create(API::class.java)

}