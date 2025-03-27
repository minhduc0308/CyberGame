package com.example.aclass.model;
    import retrofit2.Call;
    import retrofit2.http.Body;
    import retrofit2.http.DELETE;
    import retrofit2.http.GET;
    import retrofit2.http.POST;
    import retrofit2.http.PUT;
    import retrofit2.http.Path;
    import java.util.List;

    public interface EmployeeApi {
        @GET("nhanviens1")
        Call<List<Employee>> getAllEmployees();

        @GET("nhanviens1/{id}")
        Call<Employee> getEmployeeById(@Path("id") String id);

        @POST("nhanviens1")
        Call<Employee> createEmployee(@Body Employee employee);

        @PUT("nhanviens1/{id}")
        Call<Void> updateEmployee(@Path("id") String id, @Body Employee employee);

        @DELETE("nhanviens1/{id}")
        Call<Void> deleteEmployee(@Path("id") String id);
}
