package com.example.employeelistapp

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.employeelistapp.databinding.EmployeeListBinding

class EmployeeAdapter(
    private val employeesList: ArrayList<Employee>,
) : RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {
    class ViewHolder(var binding: EmployeeListBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = EmployeeListBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )
        return ViewHolder(binding)
    }

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int
    ) {
        val employee = employeesList[position]
        viewHolder.binding.employeeName.text = employee.name
        viewHolder.binding.inEmployeeAge.emailText.text = "Age :"
        viewHolder.binding.inEmployeeAge.emailValue.text = employee.age
        viewHolder.binding.inEmployeeEmail.emailText.text = "Email :"
        viewHolder.binding.inEmployeeEmail.emailValue.text = employee.email
        viewHolder.binding.inEmployeeAddress.emailText.text = "Address :"
        viewHolder.binding.inEmployeeAddress.emailValue.text = employee.address
    }


    override fun getItemCount(): Int {
        return employeesList.size
    }
}