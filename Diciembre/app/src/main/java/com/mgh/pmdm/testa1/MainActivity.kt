package com.mgh.pmdm.testa1

import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import com.mgh.pmdm.testa1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), OnClickListener {
    private lateinit var binding : ActivityMainBinding
    private var contador = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // A partir de aquí la parte gráfica está conectada a la parte lógica
        binding.textViewNombre.text = "Contador"
        binding.botonGuardar.setOnClickListener(this)
        binding.botonContador.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            binding.botonGuardar.id -> {
                binding.textViewNombre.text = "He hecho click aquí"
            }
            binding.botonContador.id ->{
                contador++
                binding.textViewContador.text = contador.toString()
            }
        }
    }


}