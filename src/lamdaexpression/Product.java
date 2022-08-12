package lamdaexpression;

class Product{
    private int Id;
    private String name;
    private float price;

    public Product(int id, String name, float price) {
        Id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
