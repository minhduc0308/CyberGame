package com.example.aclass.view;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aclass.R;
import com.example.aclass.controller.EmployeeAdapter;
import com.example.aclass.controller.RetrofitClient;
import com.example.aclass.model.Employee;
import com.example.aclass.model.EmployeeApi;
import java.util.ArrayList;
import java.util.List;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class EmployeeList extends AppCompatActivity {
    private RecyclerView rvEmployees;
    private EmployeeAdapter adapter;
    private List<Employee> employeeList;
    private EmployeeApi employeeApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_employee);

        // Khởi tạo RecyclerView
        rvEmployees = findViewById(R.id.rvEmployees);
        employeeList = new ArrayList<>();
        adapter = new EmployeeAdapter(this, employeeList);
        rvEmployees.setLayoutManager(new LinearLayoutManager(this));
        rvEmployees.setAdapter(adapter);

        // Khởi tạo Retrofit
        employeeApi = RetrofitClient.getClient("http://your-api-base-url/").create(EmployeeApi.class);

        // Gọi API để lấy danh sách nhân viên
        getAllEmployees();

        // Xử lý nút Đóng
        Button btnClose = findViewById(R.id.btnClose);
        btnClose.setOnClickListener(v -> finish());
    }

    private void getAllEmployees() {
        employeeApi.getAllEmployees().enqueue(new Callback<List<Employee>>() {
            @Override
            public void onResponse(Call<List<Employee>> call, Response<List<Employee>> response) {
                if (response.isSuccessful() && response.body() != null) {
                    employeeList.clear();
                    employeeList.addAll(response.body());
                    adapter.setEmployees(employeeList);
                } else {
                    Toast.makeText(EmployeeList.this, "Không thể lấy danh sách nhân viên", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<Employee>> call, Throwable t) {
                Toast.makeText(EmployeeList.this, "Lỗi: " + t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}