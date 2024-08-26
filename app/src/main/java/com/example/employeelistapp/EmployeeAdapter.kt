package com.example.employeelistapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.employeelistapp.databinding.EmployeeFragmentBinding
import com.example.employeelistapp.databinding.EmployeeListBinding

class EmployeeAdapter(
    val employeesList: ArrayList<Employee>,
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

    override fun onBindViewHolder(
        viewHolder: ViewHolder,
        position: Int
    ) {
        val employee = employeesList[position]
        viewHolder.binding.employeeName.text = employee.name

        viewHolder.binding.inEmployeeAge.tvKey.text = "Age :"
        viewHolder.binding.inEmployeeAge.tvValue.text = employee.age.toString()


        viewHolder.binding.inEmployeeEmail.tvKey.text = "Email :"
        viewHolder.binding.inEmployeeEmail.tvValue.text = employee.email

        viewHolder.binding.inEmployeeAddress.tvKey.text = "Address :"
        viewHolder.binding.inEmployeeAddress.tvValue.text = employee.address

    }


    override fun getItemCount(): Int {
        return employeesList.size
    }
}