package furniture;

/**
 * 
 * This class models the Desk furniture
 * @author eze
 */
public class Desk extends Furniture
{

    private int numOfDraws;
    private double height;
    private double depth;
    private double width;
    public static int numOfDesks;

    public Desk( 
            String idNumber, String typeOfWood, 
            Double itemPrice, String quantity,
            int numOfDraws, double height, 
            double depth, double width) 
    {
        super(idNumber, typeOfWood, itemPrice, quantity);
        this.numOfDraws = numOfDraws;
        this.height = height;
        this.depth = depth;
        this.width = width;
        numOfDesks = 0;
    }
    
    public Desk() {
    }
    
    @Override
    double calculateTotal(int num) {
        return getItemPrice() * num;
    }

    @Override
    public Double getItemPrice() {
        return 22.5;
    }
    
}
