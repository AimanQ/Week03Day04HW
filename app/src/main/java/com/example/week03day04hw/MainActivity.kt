package com.example.week03day04hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var recyclerView:RecyclerView?= null
    var buttonLogin:Button?= null
    var editTextPhone:EditText?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        connectViews()
        prepareRecyclerView()
    }

    private fun connectViews(){
        recyclerView = findViewById(R.id.recycler)
        buttonLogin = findViewById(R.id.button)
        editTextPhone = findViewById(R.id.etPhone)


        buttonLogin?.setOnClickListener {
            val phoneNumber = editTextPhone?.text
            Log.i("PHONE_NUMBER","Your phone number is $phoneNumber")
        }
    }

    private fun prepareRecyclerView(){

        val array:ArrayList<Phone> = ArrayList()
        array.add(Phone("Pixel 5","Google",R.drawable.phone))
        array.add(Phone("Pixel XL","Google",R.drawable.phone))
        array.add(Phone("S21","Samsung",R.drawable.phone))
        array.add(Phone("Note 20","Samsung",R.drawable.phone))
        array.add(Phone("Note 10","Samsung",R.drawable.phone))
        array.add(Phone("IPhone 8","Apple",R.drawable.phone))
        array.add(Phone("IPhone 10","Apple",R.drawable.phone))
        array.add(Phone("IPhone 11","Apple",R.drawable.phone))
        array.add(Phone("IPhone 12","Apple",R.drawable.phone))

//        recyclerView?.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        val customAdapter:CustomAdapter = CustomAdapter(array)

        recyclerView?.adapter = customAdapter

    }
}