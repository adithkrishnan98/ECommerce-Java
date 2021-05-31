package store;
import java.util.Scanner;
import users.*;
import subproducts.clothes.*;
import subproducts.electronics.*;
import subproducts.Subproducts;
import subproducts.book.*;
import java.io.File;  
import java.io.FileWriter; 

public class Store {
  
    // function that calls other shopping stage functionals like getting products, showing products and adding products to cart
    public static void shoppingProcess(Subproducts subproduct, Customer current){
        Product [] allProducts = subproduct.getListOfProducts();
        showProducts(allProducts);
        addToCart(allProducts, current);
    }


    // function for showing products
    public static void showProducts(Product [] allProducts){
        for(int i = 0; i < allProducts.length; i++){
            System.out.println(allProducts[i].getProductId()+" "+allProducts[i].getProductName()+" "+allProducts[i].getCost());
        }
    }


    // function for adding the products to cart
    public static Product [] addToCart(Product [] allProducts, Customer current){
        Product [] cartProducts = new Product[1];
        boolean isValid = true;
        while(isValid){
            System.out.println("Do you want to add any product to the cart? Enter 'Y' for YES and 'N' for NO");
            Scanner sc = new Scanner(System.in);
            String addToCart = sc.nextLine();
                if(addToCart.equals("Y")){
                    System.out.println("Input the product id of product you wish to add to cart");
                    String productId = sc.nextLine();
                    for(int i = 0; i < allProducts.length; i++){
                        if(allProducts[i].getProductId().equals(productId)){
                            cartProducts[0] = allProducts[i];
                        }
                    }
                    Cart cart = new Cart();
                    cart.setListOfProducts(cartProducts);
                    current.setCart(cart); 
                    System.out.println("The product is successfully added to cart!"); 
                    isValid = false;
                }
                else if(addToCart.equals("N")){
                System.out.println("Okay! Going back to main menu");
                isValid = false;
                }
                else{
                    System.out.println("Invalid input! Please enter 'Y' for YES and 'N' for NO");
                    continue;
                }
            
            }
        
        return cartProducts;
    }

    // function for checkout and order generation
    public static void checkOut(Customer current){
        boolean isValid = true;
        while(isValid){
            System.out.println("Do you want to checkout? Enter Y/N");
            Scanner sc = new Scanner(System.in);
            String checkout = sc.nextLine();
            if(checkout.equals("Y")){
                if(current.getCart().checkOut()){
                    Order order = new Order();
                    order.setUser(current);
                    Customer orderCustomer = order.getUser();
                    order.setOrderId(current.getUserId());
                    String orderIdOfUser = order.getOrderId();
                    try{
                        Product [] cartProducts = current.getCart().getListOfProducts();
                        for(int i = 0; i < cartProducts.length; i++){
                            File f1 = new File(orderIdOfUser+".txt");
                            f1.createNewFile();
                            FileWriter f1Writer = new FileWriter(orderIdOfUser+".txt");
                            f1Writer.write("Dear "+orderIdOfUser+", Your order  "+orderCustomer+ " containing " +cartProducts[i].getProductName()+ " of total cost " + cartProducts[i].getCost()+ " is placed successfully!");
                            f1Writer.close();
                            System.out.println("Successfully generated order!");
                            System.out.println("Going back to main menu");
                            isValid = false;
                        }
                    }
                    catch(Exception e){
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                }
            }
            else if(checkout.equals("N")){
            System.out.println("Okay! Going back to main menu");
            isValid = false;
            }
            else{
                System.out.println("Invalid input! Please enter 'Y' for YES and 'N' for NO");
                continue;
            }   
        }
    }
    
    
    // function for adding the products by seller
    public static void addSellerProducts(){
        System.out.println("Enter the id of the new product");
        Scanner sc = new Scanner(System.in);
        String newProductId = sc.nextLine();
        System.out.println("Enter the name of the new product");
        String newProductName = sc.nextLine();
        System.out.println("Enter the cost of the new product");
        String newProductCost = sc.nextLine();
        Product newProduct = new Product();
        newProduct.setProductId(newProductId);
        newProduct.setProductName(newProductName);
        newProduct.setCost(newProductCost);
        System.out.println("Your new added product is "+ newProduct.getProductId()+" "+newProduct.getProductName()+" "+newProduct.getCost());
    }


    // function for creating customer 
    public static Customer createCustomer(){
        String typeOfUser;
        typeOfUser = "Customer";
        Scanner sc = new Scanner(System.in);
        Customer current = new Customer();
        System.out.println("What is your userId?");
        current.setUserId(sc.nextLine());
        System.out.println("What is your password?");
        current.setPassword(sc.nextLine());
        if(current.verifyUser() == true){
            System.out.println("User verified!");
        }
        return current;
    }


    // function for creating seller 
    public static void createSeller(){
        String typeOfUser;
        typeOfUser = "Seller";
        Scanner sc = new Scanner(System.in);
        Seller this_seller = new Seller();
        System.out.println("What is your sellerId?");
        this_seller.setUserId(sc.nextLine());
        System.out.println("What is your password?");
        this_seller.setPassword(sc.nextLine());
        if(this_seller.verifyUser() == true){
            System.out.println("Seller verified!");
        }
    }


     // function for creating admin 
    public static void createAdmin(){
        String typeOfUser;
        typeOfUser = "Admin";
        Admin this_admin = new Admin();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your adminId?");
        this_admin.setUserId(sc.nextLine());
        System.out.println("What is your password?");
        this_admin.setPassword(sc.nextLine());
        if(this_admin.verifyUser() == true){
            System.out.println("Admin verified!");
        }
    }
    
    
    public static void main(String[] args) {
        System.out.println("Welcome to Store!");
        System.out.println("Which type of user are you? 1. Customer  2. Seller  3. Admin");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice==1){
            Customer current = createCustomer();
                while(true){
                    System.out.println("Do you want to : 1. View Products  2. View Cart  3. Contact Us  4. Exit");
                    int userChoice = sc.nextInt();
                    if(userChoice==1){
                        System.out.println("Choose category of products : 1. Clothing  2. Electronics  3. Books ");
                        int userCategoryChoice = sc.nextInt();
                        if(userCategoryChoice == 1){
                            System.out.println("Explore clothing section : 1. Men  2. Women  3. Kids ");
                            int userSubCategoryChoice = sc.nextInt();
                            if(userSubCategoryChoice == 1){
                                Men men = new Men();
                                shoppingProcess(men, current);
                                
                            }
                            else if(userSubCategoryChoice == 2){
                                Women women = new Women();
                                shoppingProcess(women, current);
                            }
                            else if(userSubCategoryChoice == 3){
                                Kids kids = new Kids();
                                shoppingProcess(kids, current);
                            }
                            else{
                                System.out.println("Invalid input! Try again");
                            }
                        }
                        else if(userCategoryChoice == 2){
                            System.out.println("Explore electronics section : 1. Mobiles  2. Laptops  3. TVs ");
                            int userSubCategoryChoice = sc.nextInt();
                            if(userSubCategoryChoice == 1){
                                Mobile mobile = new Mobile();
                                shoppingProcess(mobile, current);
                            }
                            else if(userSubCategoryChoice == 2){
                                Laptop laptop = new Laptop();
                                shoppingProcess(laptop, current);
                            }
                            else if(userSubCategoryChoice == 3){
                                TV tv = new TV();
                                shoppingProcess(tv, current);
                            }
                            else{
                                System.out.println("Invalid input! Try again");
                            }
                        }
                        else if(userCategoryChoice == 3){
                            System.out.println("Explore books section : 1. Adventure  2. Mythology  3. Fiction ");
                            int userSubCategoryChoice = sc.nextInt();
                            if(userSubCategoryChoice == 1){
                                Adventure adventure = new Adventure();
                                shoppingProcess(adventure, current);
                            }
                            else if(userSubCategoryChoice == 2){
                                Mythology mythology = new Mythology();
                                shoppingProcess(mythology, current);
                            }
                            else if(userSubCategoryChoice == 3){
                                Fiction fiction = new Fiction();
                                shoppingProcess(fiction, current);
                            }
                            else{
                                System.out.println("Invalid input! Try again");
                            }
                        }
                    }
                    else if(userChoice==2){
                        try{
                            Product [] cartProducts = current.getCart().getListOfProducts();
                            for(int i = 0; i < cartProducts.length; i++){
                                System.out.println(cartProducts[i].getProductId()+" "+cartProducts[i].getProductName()+" "+cartProducts[i].getCost());
                            }
                            checkOut(current);
                        }
                        catch (Exception e){
                            System.out.println("No items in cart. Please add items to view the cart!");
                        }
                    }
                    else if(userChoice==3){
                        System.out.println("Please email us on store.ecomm.com");
                    }
                    else if(userChoice==4){
                        break;
                    }
                    else {
                            System.out.println("Invalid input! Please try again");
                    }
                }
            }
        else if(choice==2){
           createSeller();
                while(true){
                    System.out.println("Do you want to : 1. Add Products  2. Contact company  3. Exit");
                    int sellerChoice = sc.nextInt();
                    if(sellerChoice==1){
                        System.out.println("Choose category you want to add product to : 1. Clothing  2. Electronics  3. Books");
                        int sellerCatgChoice = sc.nextInt();
                        if(sellerCatgChoice==1){
                            System.out.println("Choose sub-category you want to add product to : 1. Men  2. Women  3. Kids");
                            int sellerSubCatgChoice = sc.nextInt();
                            if((sellerSubCatgChoice==1) || (sellerSubCatgChoice==2) || (sellerSubCatgChoice==3)){
                                addSellerProducts();
                            }
                        }
                        else if(sellerCatgChoice==2){
                            System.out.println("Choose sub-category you want to add product to : 1. Mobiles  2. Laptops  3. TVs");
                            int sellerSubCatgChoice = sc.nextInt();
                            if((sellerSubCatgChoice==1) || (sellerSubCatgChoice==2) || (sellerSubCatgChoice==3)){
                                addSellerProducts();
                            }
                        }      
                        else if(sellerCatgChoice==3){
                            System.out.println("Choose sub-category you want to add product to : 1. Adventure  2. Mythology  3. Fiction");
                            int sellerSubCatgChoice = sc.nextInt();
                            if((sellerSubCatgChoice==1) || (sellerSubCatgChoice==2) || (sellerSubCatgChoice==3)){
                                addSellerProducts();
                            }
                        } 
                        else{
                            System.out.println("Invalid input! Please try again!");
                        }          
                    }
                    else if(sellerChoice==2){
                        System.out.println("Please contact us by mail for any seller related queries : seller@ecommestore.com");
                    }
                    else if(sellerChoice==3){
                        break;
                    }
                    else{
                        System.out.println("Invalid input! Please try again");
                    }
                }

            }    
        else if(choice==3){
            createAdmin();
                while(true){
                    System.out.println("Do you want to : 1. View Customer Products  2. View Seller Products  3. Contact customer  4. Contact Seller  5. Exit");
                    int adminChoice = sc.nextInt();
                    if(adminChoice==1){
                        Catalogue customerCatalogue = new Catalogue();
                        Product [] customerProducts = customerCatalogue.getListOfAllProducts();
                        showProducts(customerProducts);
                    }
                    else if(adminChoice==2){
                        Seller seller = new Seller();
                        Product [] sellerProducts = seller.getProductsListed();
                        showProducts(sellerProducts);
                    }
                    else if(adminChoice==3){
                       Admin a = new Admin();
                       String customerContact = a.getCustomerContact();
                       System.out.println("The customer can be contacted at " + customerContact);
                    }
                    else if(adminChoice==4){
                        Admin a1 = new Admin();
                        String sellerContact = a1.getSellerContact();
                        System.out.println("The seller can be contacted at " + sellerContact);
                    }
                    else if(adminChoice==5){
                        break;
                    }
                    else{
                        System.out.println("Invalid input! Please try again!");
                    }  
                }
            }
        else {
            System.out.println("Invalid input! Please try again!");
        }
        sc.close();
    }
}
