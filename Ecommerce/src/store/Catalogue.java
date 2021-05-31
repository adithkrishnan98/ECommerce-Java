package store;
public class Catalogue {
    private Product [] listOfAllProducts;

    public Product[] getListOfAllProducts() {
        Product product1 = new Product();
        product1.setProductId("1");
        product1.setProductName("Product 1");
        product1.setCost("100");

        Product product2 = new Product();
        product2.setProductId("2");
        product2.setProductName("Product 2");
        product2.setCost("200");

        listOfAllProducts = new Product [2];
        listOfAllProducts[0] = product1;
        listOfAllProducts[1] = product2;
        return listOfAllProducts;
    }

    public void setListOfAllProducts(Product[] listOfAllProducts) {
        this.listOfAllProducts = listOfAllProducts;
    }

    public Catalogue(Product[] listOfAllProducts) {
        this.listOfAllProducts = listOfAllProducts;
    }
    public Catalogue(){
    }
}
