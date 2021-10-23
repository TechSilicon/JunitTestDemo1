import static org.junit.Assert.*;

public class AdditionTest {

    @org.junit.Test
    public void add() {
        int result= Addition.add(2,3);
        int correct=5;
        assertEquals(5,result);
    }
}