import org.junit.Test;

public class MainClassTest {

    MainClass Main = new MainClass();

    @Test
    public void testGetLocalNumber()
    {
        if (Main.getLocalNumber() == 14){
            System.out.println("getLocalNumber method returns 14");
        }else{
            System.out.println("getLocalNumber method returns not 14");
        }
    }

    @Test
    public void testGetClassNumber()
    {
        if (Main.getClassNumber() > 45){
            System.out.println("getClassNumber method returns a number greater 45");
        }else{
            System.out.println("getClassNumber method returns a number less than or equal to 45");
        }
    }
}
