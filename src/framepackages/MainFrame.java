package framepackages;

/**
 * @author eze
 */
public class MainFrame {


    public static void main(String[] args) 
    {
        LandingFrame frame = new LandingFrame();
        frame.setSize(400, 430);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    
}
