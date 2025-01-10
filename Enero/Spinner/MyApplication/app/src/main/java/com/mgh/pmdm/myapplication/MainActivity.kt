package com.mgh.pmdm.myapplication

import android.R
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.mgh.pmdm.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var arrayPaises : ArrayList<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        arrayElementos()
        configurarSpinner()
    }

    private fun arrayElementos (){
        arrayPaises = arrayListOf("Portugal", "Suecia", "Finlandia")
    }

    private fun configurarSpinner (){
        val paisesAdapter = ArrayAdapter(this, R.layout.simple_list_item_1, arrayPaises)
        binding.spinner.setAdapter(paisesAdapter)
        binding.spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {

            override fun onItemSelected(v1: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                val elemento = binding.spinner.selectedItem.toString()
                binding.textView.text = elemento
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }
    }
}