package models;

public class Employee {
    private String id;
    private String name;
    private String phone;
    private String role;
    private String shift;

    public Employee(String id, String name, String phone, String role, String shift) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.role = role;
        this.shift = shift;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", role='" + role + '\'' +
                ", shift='" + shift + '\'' +
                '}';
    }
}
