import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Rabbit_RegExTest
{
    //Testing Rabbit Names!!
    @Test //TEST ONE
    void testCapitalRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("Butterscotch");
        assertTrue(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end rabbit name w/1st letter capital

    @Test //TEST TWO
    void testlowerRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("snowflake");
        assertTrue(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end rabbit name w/all lowercase

    @Test //TEST THREE
    void testallNumbersRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("12345");
        assertFalse(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end numbers in name

    @Test //TEST FOUR
    void testOneNumberinRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("MO0N");
        assertFalse(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end one number in rabbit name

    @Test //TEST FIVE
    void testSpecialCharactersRabbitName()
    {
        Rabbit_RegEx rabbit_Name = new Rabbit_RegEx();
        rabbit_Name.setRabbitName("Pot!at!*"); //potat or potato w/out an o
        assertFalse(rabbit_Name.getRabbitName().matches("[A-Za-z-]*"));
    }//end special character within name


    //Testing Breed Names!
    @Test //TEST ONE
    void testCapital1stLetterBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("AmericanFuzzyLop"); //American Fuzzy Lop, very cute!
        assertTrue(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z-][a-zA-z- ]*"));
    }//end 1st letter is capital and some random capitals

    @Test //TEST TWO
    void testallLowerBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("dwarfhotot"); //Dwarf Hotot
        assertTrue(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z-][a-zA-z- ]*"));
    }//end only lowercase

    @Test //TEST THREE
    void testallNumbersBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("282003");
        assertFalse(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z-][a-zA-z- ]*"));
    }//end only numbers in breed name

    @Test //TEST FOUR
    void testSpacesAndCapitalsBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Netherland Dwarf");
        assertTrue(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z-][a-zA-z- ]*"));
    }//end spaces & capitals

    @Test //TEST FIVE
    void testSpacesAndLowercaseBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("silver fox");
        assertTrue(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z-][a-zA-z- ]*"));
    }//end spaces & lowercase

    @Test //TEST SIX
    void testSpecialCharactersBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Champagne d'Argent");
        assertFalse(rabbit_breed.getBreedName().matches("^[A-Za-z][a-zA-Z- ][a-zA-z- ]*"));
    }//end testing for special characters


    //Testing ages and if it's a baby bun!!
    @Test //TEST ONE
    void testNegativeAge()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(-5);
        rabbit_age.setIsBaby(true);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 0 weeks"  +
                "\nWeight: 0.0 in ounces";
        assertEquals(expected, rabbit_age.toString());
    }//end negative age + baby set to true

    @Test //TEST TWO
    void testPositiveLowAge()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(4);
        rabbit_age.setIsBaby(true);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks" +
                "\nWeight: 0.0 in ounces";
        assertEquals(expected, rabbit_age.toString());
    }//end positive low age + baby set to true

    @Test //TEST THREE
    void testPositiveHighAge()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(10);
        rabbit_age.setIsBaby(false);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 10 years" +
                "\nWeight: 0.0 in pounds";
        assertEquals(expected, rabbit_age.toString());
    }//end positive high age + baby set to false

    @Test //TEST FOUR
    void testOverAgeLimit()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(18);
        rabbit_age.setIsBaby(false);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 10 years" +
                "\nWeight: 0.0 in pounds";
        assertEquals(expected, rabbit_age.toString());
    }//end age over 10


    //Testing Weight!!
    @Test //TEST ONE
    void testNegativeWeight()
    {
        Rabbit_RegEx rabbit_weight = new Rabbit_RegEx();
        rabbit_weight.setWeight(-5.0);
        rabbit_weight.setIsBaby(true);
        rabbit_weight.setAge(1);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 1 weeks\n" +
                "Weight: 1.0 in ounces";
        assertEquals(expected, rabbit_weight.toString());
    }//end negative weight

    @Test //TEST TWO
    void testPositiveLowWeightAndBabyBun()
    {
        Rabbit_RegEx rabbit_weight = new Rabbit_RegEx();
        rabbit_weight.setWeight(3.5);
        rabbit_weight.setIsBaby(true);
        rabbit_weight.setAge(2);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 2 weeks\n" +
                "Weight: 3.5 in ounces";
        assertEquals(expected, rabbit_weight.toString());
    }//end positive low weight and baby bun

    @Test //TEST THREE
    void testPositiveLowWeight()
    {
        Rabbit_RegEx rabbit_weight = new Rabbit_RegEx();
        rabbit_weight.setWeight(2.5);
        rabbit_weight.setIsBaby(false);
        rabbit_weight.setAge(3);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 3 years\n" +
                "Weight: 2.5 in pounds";
        assertEquals(expected, rabbit_weight.toString());
    } //end adult bun, low weight (dwarfs/smaller breeds)
}//end class test don't try to put tests underneath this!!