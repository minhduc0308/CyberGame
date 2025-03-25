package models;

public class MenuItem {
    private String menuItemId;
    private String name;
    private double price;
    private String category;

    public MenuItem(String menuItemId, String name, double price, String category) {
        this.menuItemId = menuItemId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getMenuItemId() {
        return menuItemId;
    }

    public void setMenuItemId(String menuItemId) {
        this.menuItemId = menuItemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "menuItemId='" + menuItemId + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}
