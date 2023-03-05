package example.bean;

public class Medicines {
    private String productName;
    private Float productPerUnitInMG;
    private Integer availableUnit;
    private Float perUnitPrice;

    public Medicines() {
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setProductPerUnitInMG(Float productPerUnitInMG) {
        this.productPerUnitInMG = productPerUnitInMG;
    }

    public void setAvailableUnit(Integer availableUnit) {
        this.availableUnit = availableUnit;
    }

    public void setPerUnitPrice(Float perUnitPrice) {
        this.perUnitPrice = perUnitPrice;
    }

    public String getProductName() {
        return productName;
    }

    public Float getProductPerUnitInMG() {
        return productPerUnitInMG;
    }

    public Integer getAvailableUnit() {
        return availableUnit;
    }

    public Float getPerUnitPrice() {
        return perUnitPrice;
    }
}
