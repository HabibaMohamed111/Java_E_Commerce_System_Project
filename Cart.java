public class Cart {

    private int customerId;
    private int nProducts;
    private Product [] Products;

    public Cart(){}

    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId);
        this.nProducts = Math.abs(nProducts);
        this.Products = new Product[Math.abs(nProducts)];
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getnProducts() {
        return nProducts;
    }

    public void setnProducts(int nProducts) {
        this.nProducts = nProducts;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }


    public void addProduct(Product product, int index){
        if(index>=0 && index < nProducts){
            Products[index]=product;
        }

    }

    public void removeProduct(int index){
        if(index>=0 && index < nProducts){
            Products[index]= null;
        }

    }
    public float calculatePrice(){
        float totalPrice=0;
        for(Product product : Products){
            if(product != null){
                totalPrice+=product.price;
            }
        }
        return totalPrice;
    }
    public Order placeOrder(){
        return new Order(customerId,Products,calculatePrice());
    }

    public void addProduct(String label1) {

    }
}
