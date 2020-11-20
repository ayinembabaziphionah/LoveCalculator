package com.example.lovecalculator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import com.example.lovecalculator.Network.ApiClient
import com.example.lovecalculator.R
import com.example.lovecalculator.Network.ApiInterface
import com.example.lovecalculator.model.RequestResponse
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.security.auth.callback.Callback

class RequestResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_request_result)

        btCalc.setOnClickListener {
            val firstname = etFname.text.toString()
            val secondname = etSname.text.toString()

            if ( firstname.isBlank()){
                etFname.error="Password Required"
            }
            if ( secondname.isBlank()){
            }
            else {
                requestResponse(requestName)
            }

        }
    }

    fun requestResponse(requestName:RequestName){
        val apiClient= ApiClient.buildService(ApiInterface::class.java)
        val registrationCall=apiClient.requestPercentage(requestName)
        registrationCall.enqueue(object : Callback<RequestResponse> {
            fun onFailure(call: Call<RequestResponse>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_LONG).show()
            }

            override fun onResponse(
                call: Call<RequestResponse>,
                response: Response<RequestResponse>
            ) {
                if (response.isSuccessful) {
                    val message = "Request Successful"
                    Toast.makeText(baseContext, response.body()?.firstName, Toast.LENGTH_LONG)
                        .show()
                    startActivity(Intent(baseContext, MainActivity::class.java))



    }
}