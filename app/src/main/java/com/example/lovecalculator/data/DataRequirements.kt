package com.example.lovecalculator.data
import com.google.gson.annotations.SerializedName

data class DataRequirements(
    @SerializedName("fname")val firstName:String,
    @SerializedName("sname")val secondName:String
)