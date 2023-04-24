
package furniture;

/**
 * This class models the table furniture
 * @author eze
 */
public class Table extends Furniture {
    
    private String baseType;
    private double diameter;
    public static int numOfTable;

    public Table
        (String idNumber, String typeOfWood, 
         Double itemPrice, String quantity, 
         String baseType, double diameter) 
    {
        super(idNumber, typeOfWood, itemPrice, quantity);
        this.baseType = baseType;
        this.diameter = diameter;
        numOfTable = 0;
    }
        
    public Table(){
        
    }

    @Override
    public Double getItemPrice() {
        return 34.65;
    }

    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    
    
    @Override
    double calculateTotal(int num) {
        return getItemPrice() * num; 
    }
    
}
