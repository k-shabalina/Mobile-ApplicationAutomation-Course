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
}
