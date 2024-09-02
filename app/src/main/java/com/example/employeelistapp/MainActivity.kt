package com.example.employeelistapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.employeelistapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        if (savedInstanceState == null) {
//            val fragment = EmployeeFragment()
//            supportFragmentManager.beginTransaction()
//                .add(R.id.fragment_container, fragment)
//                .commit()
//        }
    }
}