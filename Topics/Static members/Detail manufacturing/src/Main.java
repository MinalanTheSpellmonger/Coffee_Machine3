class ManufacturingController {
    public static int productCount;

    public static String requestProduct(String product) {
        // write your code here
        productCount++;
        return productCount + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return productCount;
    }
}