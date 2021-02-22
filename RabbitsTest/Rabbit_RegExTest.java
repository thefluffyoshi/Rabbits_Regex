import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rabbit_RegExTest
{
    //Testing Rabbit Names!
    @Test
    void testCapitalRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("Butterscotch");
        assertTrue(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end rabbit name w/1st letter capital TEST ONE

    @Test
    void testlowerRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("snowflake");
        assertTrue(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end rabbit name w/all lowercase TEST TWO

    @Test
    void testallNumbersRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("12345");
        assertFalse(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end numbers in name TEST THREE

    @Test
    void testOneNumberinRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("MO0N");
        assertFalse(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end one number in rabbit name TEST FOUR

    @Test
    void testSpecialCharactersRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("Pot!at!*"); //potat or potato w/out an o
        assertFalse(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end special character within name


    //Testing Breed Names!
    @Test
    void testCapital1stLetterBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("AmericanFuzzyLop"); //American Fuzzy Lop, very cute!
        assertTrue(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z-][a-zA-z- ]*"));
    }//end 1st letter is capital and some random capitals

    @Test
    void testallLowerBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("dwarfhotot"); //Dwarf Hotot
        assertTrue(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z-][a-zA-z- ]*"));
    }//end only lowercase

    @Test
    void testallNumbersBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("282003");
        assertFalse(rabbit_breed.getBreedName().matches("^[A-Z][a-zA-Z-][a-zA-z- ]*"));
    }//end only numbers in breed name
}//end class test don't try to put tests underneath this!!