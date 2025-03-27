package com.example.aclass.controller;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aclass.R;
import com.example.aclass.model.Employee;
import java.util.List;

public class EmployeeAdapter extends RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder> {
    private List<Employee> employees;
    private Context context;

    public EmployeeAdapter(Context context, List<Employee> employees) {
        this.context = context;
        this.employees = employees;
    }

    @NonNull
    @Override
    public EmployeeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_employee, parent, false);
        return new EmployeeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull EmployeeViewHolder holder, int position) {
        Employee employee = employees.get(position);
        holder.tvEmployeeId.setText("Mã NV: " + employee.getId());
        holder.tvFullName.setText("Họ Tên: " + employee.getFullName());
        holder.tvDateOfBirth.setText("Ngày Sinh: " + employee.getDateOfBirth());
        holder.tvGender.setText("Giới Tính: " + employee.getGender());
        holder.tvAddress.setText("Địa Chỉ: " + employee.getAddress());
        holder.tvDepartmentId.setText("Mã Phòng Ban: " + employee.getDepartmentId());
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
        notifyDataSetChanged();
    }

    static class EmployeeViewHolder extends RecyclerView.ViewHolder {
        TextView tvEmployeeId, tvFullName, tvDateOfBirth, tvGender, tvAddress, tvDepartmentId;

        public EmployeeViewHolder(@NonNull View itemView) {
            super(itemView);
            tvEmployeeId = itemView.findViewById(R.id.edtEmployeeId);
            tvFullName = itemView.findViewById(R.id.edtFullName);
            tvDateOfBirth = itemView.findViewById(R.id.edtDateOfBirth);
            tvGender = itemView.findViewById(R.id.rgGender);
            tvAddress = itemView.findViewById(R.id.edtAddress);
            tvDepartmentId = itemView.findViewById(R.id.edtDepartmentId);
        }
    }
}