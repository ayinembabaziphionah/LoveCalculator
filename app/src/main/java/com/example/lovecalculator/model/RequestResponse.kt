package com.example.lovecalculator.model
import com.google.gson.annotations.SerializedName
data class RequestResponse (
    @SerializedName("fname")val firstName:String,
    @SerializedName("sname")val secondName:String
)