
package furniture;

/**
 * An Abstract class for real office furniture
 * @author eze
 */
abstract class Furniture {
    String idNumber;
    String typeOfWood;
    Double itemPrice;
    String quantity;

    public Furniture(String idNumber, String typeOfWood, Double itemPrice, String quantity) {
        this.idNumber = idNumber;
        this.typeOfWood = typeOfWood;
        this.itemPrice = itemPrice;
        this.quantity = quantity;
    }
    
    public Furniture(){
        
    }
    
    abstract double calculateTotal(int num);

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getTypeOfWood() {
        return typeOfWood;
    }

    public void setTypeOfWood(String typeOfWood) {
        this.typeOfWood = typeOfWood;
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    
}
