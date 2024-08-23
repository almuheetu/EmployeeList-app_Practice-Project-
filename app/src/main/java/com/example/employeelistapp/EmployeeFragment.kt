package com.example.employeelistapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.employeelistapp.databinding.EmployeeFragmentBinding

class EmployeeFragment : Fragment() {
    private lateinit var binding: EmployeeFragmentBinding
    private lateinit var employeeAdapter: EmployeeAdapter


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = EmployeeFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView : RecyclerView = binding.employeeRecyclerView
        recyclerView.layoutManager= GridLayoutManager(requireContext(),2)
        employeeAdapter = EmployeeAdapter(employeeList)
        recyclerView.adapter = employeeAdapter


    }
}