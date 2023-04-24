
package furniture;

/**
 * This class models the chair furniture
 * @author eze
 */
public class Chair extends Furniture{
    
    public static int numOfChairs;
    private boolean hasArmrest;
    
    public Chair(String idNumber, String typeOfWood, Double itemPrice, String quantity, boolean hasArmrest) 
    {
        super(idNumber, typeOfWood, itemPrice, quantity);
        this.hasArmrest = hasArmrest;
        numOfChairs = 0;
    }

    public Chair(){
        
    }

    @Override
    public Double getItemPrice() {
        return 45.56;
    }
    
    
    
    @Override
    double calculateTotal(int num) {
        return getItemPrice() * num;
    }

    public boolean isHasArmrest() {
        return hasArmrest;
    }

    public void setHasArmrest(boolean hasArmrest) {
        this.hasArmrest = hasArmrest;
    } 
}
