
 // class Product
public class Product {
    protected int productId;
    protected String name;
    protected float price;


    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
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

    public Product(){}


        public Product( String name, float price) {
           // this.productId = productId;
            this.name = name;
            this.price = price;
        }

    public Product(int productId, String name, float price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }
}
