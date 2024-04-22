
import java.util.Scanner;

public class ECommerceSystem {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
/*
        Scanner in=new Scanner(System.in);
        System.out.println("Welcome to the E-Commerce System!");
        System.out.println("Please enter your id : ");
        int customerId=in.nextInt();
        in.nextLine();
        System.out.println("Please enter your name : ");
        String name=in.nextLine();
        System.out.println("Please enter your address : ");
        String address=in.nextLine();

        Customer c1=new Customer(customerId,name,address);

        ElectronicProduct smartphone =new ElectronicProduct(1,"smartphone",599.99f,"Samsung",1);
        ClothingProduct TShirt=new ClothingProduct(2,"Medium",19.99f,"Cotton","T-shirt");
        BookProduct OOP= new BookProduct(3,"OOP",39.99f,"O'Reilly","X publication");


        System.out.println("How many products do you want to add to your cart?");
        int nProducts=in.nextInt();
        Cart cart =new Cart(customerId,nProducts);

        for(int i=0;i<Math.abs(nProducts);i++){
            System.out.println("Which product would you like to add? 1- smartphone 2- T-shirt 3- OOP");
            int productchoice=in.nextInt();
            switch(productchoice){
                case 1:
                    cart.addProduct(smartphone, i);
                    break;
                case 2:

                    cart.addProduct(TShirt, i);
                    break;

                case 3:
                    cart.addProduct(OOP, i);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    i--;
            }
        }
        System.out.println("Your total is $"+cart.calculatePrice()+" Would you like to place the order? 1-Yes 2- No");
        int c=in.nextInt();
        if(c==1){
            Order order=new Order(customerId,1,cart.getProducts());
            order.printOrderInfo();
        }else{
            System.out.println("Order not placed.");
        }

*/
     //Run GUI

     EcommerceSystemGUI E1=new EcommerceSystemGUI();
        // ProductList p1=new ProductList();
       // OrderPlace o1=new OrderPlace();



    }
}