package com.example.aclass.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Employee {
    @SerializedName("maNv")
    private String id;

    @SerializedName("hoTen")
    private String fullName;

    @SerializedName("ngaySinh")
    private String dateOfBirth;

    @SerializedName("gioiTinh")
    private String gender;

    @SerializedName("diaChi")
    private String address;

    @SerializedName("maPb")
    private String departmentId;

    @SerializedName("cong1s")
    private List<Object> cong1s; // Mảng công trình, hiện tại để trống nên dùng List<Object>

    @SerializedName("maPbNavigation")
    private Object maPbNavigation; // Thông tin phòng ban, hiện tại là null nên dùng Object

    // Constructor mặc định (yêu cầu cho Gson)
    public Employee() {}

    public Employee(String id, String fullName, String dateOfBirth, String gender, String address, String departmentId) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.departmentId = departmentId;
    }

    // Getters và Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public String getGender() { return gender; }
    public void setGender(String gender) { this.gender = gender; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }
    public String getDepartmentId() { return departmentId; }
    public void setDepartmentId(String departmentId) { this.departmentId = departmentId; }
    public List<Object> getCong1s() { return cong1s; }
    public void setCong1s(List<Object> cong1s) { this.cong1s = cong1s; }
    public Object getMaPbNavigation() { return maPbNavigation; }
    public void setMaPbNavigation(Object maPbNavigation) { this.maPbNavigation = maPbNavigation; }
}