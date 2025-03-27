package com.example.aclass.view;

import android.os.Bundle;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aclass.R;
import com.example.aclass.model.EmployeeApi;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    private EmployeeApi api;
    private LinearLayout llEmployeeList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);


        // Khởi tạo Retrofit với base URL mới
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://lastpurpledog90.conveyor.cloud/api/") // Thay đổi base URL
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(EmployeeApi.class);

    }


}