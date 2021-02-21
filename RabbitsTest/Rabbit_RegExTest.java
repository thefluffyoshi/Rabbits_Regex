import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rabbit_RegExTest
{
    @Test
    void testCapitalRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("Butterscotch");
        assertTrue(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end rabbit name w/1st letter capital TEST ONE
}