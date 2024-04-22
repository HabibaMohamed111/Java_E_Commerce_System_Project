public class Order {

    private int customerId;
    private int orderedId;
    private Product[]Products;
    private float totalPrice;


    public Order(int customerId1, Product[] Products1, float calculatePrice){}

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderedId() {
        return orderedId;
    }

    public void setOrderedId(int orderedId) {
        this.orderedId = orderedId;
    }

    public Product[] getProducts() {
        return Products;
    }

    public void setProducts(Product[] Products) {
        this.Products = Products;
    }

    public float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(float totalPrice) {
        this.totalPrice = totalPrice;
    }
    public Order(int customerId, int orderedId, Product[] Products) {
        this.customerId = Math.abs(customerId);
        this.orderedId = Math.abs(orderedId);
        this.Products = Products;
        this.totalPrice = Math.abs(totalPrice);
    }
    private double calculateTotalPrice(){
        float totalPrice=0;
        for(Product product : Products){
            if(product != null){
                totalPrice+=product.getPrice();
            }
        }
        return totalPrice;
    }
    public void printOrderInfo(){
        System.out.println("Here 's Your order 's summary :");
        System.out.println("Order ID: "+ orderedId);
        System.out.println("Customer ID: "+customerId);
        System.out.println("Products: ");
        for(Product product : Products){
            if(product!=null){
                System.out.println(product.getName() +" - $"+ product.getPrice() );
            }
        }
        System.out.printf("Total Price: $ %.5f",calculateTotalPrice());
    }  }
