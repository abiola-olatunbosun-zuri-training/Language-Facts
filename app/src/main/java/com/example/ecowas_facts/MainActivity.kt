package com.example.ecowas_facts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.ecowas_facts.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private var binding: ActivityMainBinding? = null
    private var adapter:FactAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding?.root)
        setUpFact()
    }

    private fun setUpFact(){
        adapter = FactAdapter(this,DummyData.languageFacts)
        binding?.factListView?.adapter = adapter
    }


    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }

}
