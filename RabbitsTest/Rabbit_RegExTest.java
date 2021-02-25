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
        assertTrue(rabbit_breed.getBreedName().matches("^[A-Za-z-' ][a-zA-Z-' ][a-zA-z-' ]*"));
    }//end testing for special characters

    @Test //TEST SEVEN
    void testUppercaseAmericanBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("American");
        String expected = "American";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name American

    @Test //TEST EIGHT
    void testLowercaseAmericanBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("american");
        String expected = "american";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name american

    @Test //TEST NINE
    void testUppercaseAmericanChinchillaBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("American Chinchilla");
        String expected = "American Chinchilla";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name American Chinchilla

    @Test //TEST TEN
    void testLowercaseAmericanChinchillaBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("american chinchilla");
        String expected = "american chinchilla";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name american chinchilla

    @Test //TEST ELEVEN
    void testUppercaseAmericanFuzzyLopBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("American Fuzzy Lop");
        String expected = "American Fuzzy Lop";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name American Fuzzy Lop

    @Test //TEST TWELVE
    void testLowercaseAmericanFuzzyLopBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("american fuzzy lop");
        String expected = "american fuzzy lop";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name american fuzzy lop

    @Test //TEST THIRTEEN
    void testUppercaseAmericanSableBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("American Sable");
        String expected = "American Sable";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name American Sable

    @Test //TEST FOURTEEN
    void testLowercaseAmericanSableBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("american sable");
        String expected = "american sable";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name american sable

    @Test //TEST FIFTEEN
    void testUppercaseArgenteBunBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Argente Bun");
        String expected = "Argente Bun";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Argente Bun

    @Test //TEST SIXTEEN
    void testLowercaseArgenteBunBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("argente bun");
        String expected = "argente bun";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name argente bun

    @Test //TEST SEVENTEEN
    void testUppercaseBelgianHareBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Belgian Hare");
        String expected = "Belgian Hare";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Belgian Hare

    @Test //TEST EIGHTEEN
    void testLowercaseBelgianHareBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("belgian hare");
        String expected = "belgian hare";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name belgian hare

    @Test //TEST NINETEEN
    void testUppercaseBeverenBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Beveren");
        String expected = "Beveren";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Beveren

    @Test //TEST TWENTY
    void testLowercaseBeverenBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("beveren");
        String expected = "beveren";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name beveren

    @Test //TEST TWENTY-ONE
    void testUppercaseBlancDeHototBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Blanc De Hotot");
        String expected = "Blanc De Hotot";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Blanc De Hotot

    @Test //TEST TWENTY-TWO
    void testLowercaseBlancDeHototBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("blanc de hotot");
        String expected = "blanc de hotot";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name blanc de hotot

    @Test //TEST TWENTY-THREE
    void testUppercaseBritanniaPetiteBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Britannia Petite");
        String expected = "Britannia Petite";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Britannia Petite

    @Test //TEST TWENTY-FOUR
    void testLowercaseBritanniaPetiteBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("britannia petite");
        String expected = "britannia petite";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name britannia petite

    @Test //TEST TWENTY-FIVE
    void testUppercaseCalifornianBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Californian");
        String expected = "Californian";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Californian

    @Test //TEST TWENTY-SIX
    void testLowercaseCalifornianBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("californian");
        String expected = "californian";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name californian

    @Test //TEST TWENTY-SEVEN
    void testUppercaseCaviesBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Cavies");
        String expected = "Cavies";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Cavies

    @Test //TEST TWENTY-EIGHT
    void testLowercaseCaviesBreedname()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("cavies");
        String expected = "cavies";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name cavies

    @Test //TEST TWENTY-NINE
    void testUppercaseChampagneDArgentBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Champagne d'Argent");
        String expected = "Champagne d'Argent";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Champagne d'Argent

    @Test //TEST THIRTY
    void testLowercaseChampagneDArgentBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("champagne d'argent");
        String expected = "champagne d'argent";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name champagne d'argent

    @Test //TEST THIRTY-ONE
    void testUppercaseCheckeredGiantBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Checkered Giant");
        String expected = "Checkered Giant";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Checkered Giant

    @Test //TEST THIRTY-TWO
    void testLowercaseCheckeredGiantBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("checkered giant");
        String expected = "checkered giant";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name checkered giant

    @Test //TEST THIRTY-THREE
    void testUppercaseCinnamonBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Cinnamon");
        String expected = "Cinnamon";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Cinnamon

    @Test //TEST THIRTY-FOUR
    void testLowercaseCinnamonBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("cinnamon");
        String expected = "cinnamon";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name cinnamon

    @Test //TEST THIRTY-FIVE
    void testUppercaseCremeDArgentBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Creme d'Argent");
        String expected = "Creme d'Argent";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Creme d'Argent

    @Test //TEST THIRTY-SIX
    void testLowercaseCremeDArgentBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("creme d'argent");
        String expected = "creme d'argent";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name creme d'argent

    @Test //TEST THIRTY-SEVEN
    void testUppercaseDutchBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Dutch");
        String expected = "Dutch";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Dutch

    @Test //TEST THIRTY-EIGHT
    void testLowercaseDutchBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("dutch");
        String expected = "dutch";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name dutch

    @Test //TEST THIRTY-NINE
    void testUppercaseDwarfHototBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Dwarf Hotot");
        String expected = "Dwarf Hotot";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name Dwarf Hotot

    @Test //TEST FORTY
    void testLowercaseDwarfHototBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("dwarf hotot");
        String expected = "dwarf hotot";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name dwarf hotot

    @Test //TEST FORTY-ONE
    void testUppercaseEnglishAngoraBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("English Angora");
        String expected = "English Angora";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name English Angora

    @Test //TEST FORTY-TWO
    void testLowercaseEnglishAngoraBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("english angora");
        String expected = "english angora";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name english angora

    @Test //TEST FORTY-THREE
    void testUppercaseEnglishLopBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("English Lop");
        String expected = "English Lop";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name english lop

    @Test //TEST FORTY-FOUR
    void testLowercaseEnglishLopBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("english lop");
        String expected = "english lop";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name english lop

    @Test //TEST FORTY-FIVE
    void testUppercaseEnglishSpotBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("English Spot");
        String expected = "English Spot";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name english spot

    @Test //TEST FORTY-SIX
    void testLowercaseEnglishSpotBreedname()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("english spot");
        String expected = "english spot";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name english spot

    @Test //TEST FORTY-SEVEN
    void testUppercaseFlemishGiantBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Flemish Giant");
        String expected = "Flemish Giant";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name flemish giant

    @Test //TEST FORTY-EIGHT
    void testLowercaseFlemishGiantBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("flemish giant");
        String expected = "flemish giant";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name flemish giant

    @Test //TEST FORTY-NINE
    void testUppercaseFloridaWhiteBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("Florida White");
        String expected = "Florida White";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end uppercase breed name florida white

    @Test //TEST FIFTY
    void testLowercaseFloridaWhiteBreedName()
    {
        Rabbit_RegEx rabbit_breed = new Rabbit_RegEx();
        rabbit_breed.setBreedName("florida white");
        String expected = "florida white";
        assertEquals(expected, rabbit_breed.getBreedName());
    }//end lowercase breed name florida white


    //Testing ages and if it's a baby bun!!
    @Test //TEST ONE
    void testNegativeAge()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(-5);
        rabbit_age.setIsBaby(true);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 0 weeks\n" +
                "Weight: 0.0 in ounces\n" +
                "Color: \n" +
                "Gender: male";
        assertEquals(expected, rabbit_age.toString());
    }//end negative age + baby set to true

    @Test //TEST TWO
    void testPositiveLowAge()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(4);
        rabbit_age.setIsBaby(true);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 0.0 in ounces\n" +
                "Color: \n" +
                "Gender: male";
        assertEquals(expected, rabbit_age.toString());
    }//end positive low age + baby set to true

    @Test //TEST THREE
    void testPositiveHighAge()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(10);
        rabbit_age.setIsBaby(false);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 10 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: \n" +
                "Gender: male";
        assertEquals(expected, rabbit_age.toString());
    }//end positive high age + baby set to false

    @Test //TEST FOUR
    void testOverAgeLimit()
    {
        Rabbit_RegEx rabbit_age = new Rabbit_RegEx();
        rabbit_age.setAge(18);
        rabbit_age.setIsBaby(false);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 10 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: \n" +
                "Gender: male";
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
                "Weight: 1.0 in ounces\n" +
                "Color: \n" +
                "Gender: male";
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
                "Weight: 3.5 in ounces\n" +
                "Color: \n" +
                "Gender: male";
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
                "Weight: 2.5 in pounds\n" +
                "Color: \n" +
                "Gender: male";
        assertEquals(expected, rabbit_weight.toString());
    } //end adult bun, low weight (dwarfs/smaller breeds)

    @Test //TEST FOUR
    void testPositiveHighWeight()
    {
        Rabbit_RegEx rabbit_weight = new Rabbit_RegEx();
        rabbit_weight.setWeight(15);
        rabbit_weight.setIsBaby(false);
        rabbit_weight.setAge(4);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 4 years\n" +
                "Weight: 15.0 in pounds\n" +
                "Color: \n" +
                "Gender: male";
        assertEquals(expected, rabbit_weight.toString());
    }//end positive high weight

    @Test //TEST FIVE
    void testPositiveOverLimitWeight()
    {
        Rabbit_RegEx rabbit_weight = new Rabbit_RegEx();
        rabbit_weight.setWeight(17);
        rabbit_weight.setIsBaby(false);
        rabbit_weight.setAge(5);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 5 years\n" +
                "Weight: 15.0 in pounds\n" +
                "Color: " +
                "\nGender: male";
        assertEquals(expected, rabbit_weight.toString());
    }//end weight over limit


    //Rabbit colors!
    @Test //TEST ONE
    void testUppercaseAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end test uppercase color agouti

    @Test //TEST TWO
    void testLowercaseAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color agouti

    @Test //TEST THREE
    void testUppercaseBlackColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Black");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Black\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color black

    @Test //TEST FOUR
    void testLowercaseBlackColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("black");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: black\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color black

    @Test //TEST FIVE
    void testUppercaseBlackOtterColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Black Otter");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Black Otter\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end test uppercase color black otter

    @Test //TEST SIX
    void testLowercaseBlackOtterColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("black otter");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: black otter\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color black otter

    @Test //TEST SEVEN
    void testUppercaseBlueColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Blue");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Blue\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color blue

    @Test //TEST EIGHT
    void testLowercaseBlueColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("blue");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: blue\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color blue

    @Test //TEST NINE
    void testUppercaseBlueOtterColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Blue Otter");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Blue Otter\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color blue otter

    @Test //TEST TEN
    void testLowercaseBlueOtterColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("blue otter");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: blue otter\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color blue otter

    @Test //TEST ELEVEN
    void testUppercaseBlueSteelColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Blue Steel");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Blue Steel\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color blue steel

    @Test //TEST TWELVE
    void testLowercaseBlueSteelColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("blue steel");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: blue steel\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color blue steel

    @Test //TEST THIRTEEN
    void testUppercaseBlueTortColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Blue Tort");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Blue Tort\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color blue tort

    @Test //TEST FOURTEEN
    void testLowercaseBlueTortColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("blue tort");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: blue tort\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color blue tort

    @Test //TEST FIFTEEN
    void testUppercaseBrokenColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Broken");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Broken\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color broken

    @Test //TEST SIXTEEN
    void testLowercaseBrokenColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("broken");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: broken\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color broken

    @Test //TEST SEVENTEEN
    void testUppercaseBrownGrayAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Brown-Gray Agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Brown-Gray Agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color brown-gray agouti

    @Test //TEST EIGHTEEN
    void testLowercaseBrownGrayAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("brown-gray agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: brown-gray agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color brown-gray agouti

    @Test //TEST NINETEEN
    void testUppercaseCalifornianColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Californian");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Californian\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color californian

    @Test //TEST TWENTY
    void testLowercaseCalifornianColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("californian");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: californian\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color californian

    @Test //TEST TWENTY-ONE
    void testUppercaseCastorColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Castor");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Castor\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color castor

    @Test //TEST TWENTY-TWO
    void testLowercaseCastorColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("castor");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: castor\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color castor

    @Test //TEST TWENTY-THREE
    void testUppercaseChinchillaColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Chinchilla");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Chinchilla\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color chinchilla

    @Test //TEST TWENTY-FOUR
    void testLowercaseChinchillaColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("chinchilla");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: chinchilla\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color chinchilla

    @Test //TEST TWENTY-FIVE
    void testUppercaseCinnamonColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Cinnamon");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Cinnamon\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color cinnamon

    @Test //TEST TWENTY-SIX
    void testLowercaseCinnamonColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("cinnamon");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: cinnamon\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color cinnamon

    @Test //TEST TWENTY-SEVEN
    void testUppercaseChocolateColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Chocolate");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Chocolate\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color chocolate

    @Test //TEST TWENTY-EIGHT
    void testLowercaseChocolateColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("chocolate");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: chocolate\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color chocolate

    @Test //TEST TWENTY-NINE
    void testUppercaseChocolateAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Chocolate Agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Chocolate Agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color chocolate agouti

    @Test //TEST THIRTY
    void testLowercaseChocolateAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("chocolate agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: chocolate agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color chocolate agouti

    @Test //TEST THIRTY-ONE
    void testUppercaseChocolateChinchillaColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Chocolate Chinchilla");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Chocolate Chinchilla\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color chocolate chinchilla

    @Test //TEST THIRTY-TWO
    void testLowercaseChocolateChinchillaColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("chocolate chinchilla");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: chocolate chinchilla\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color chocolate chinchilla

    @Test //TEST THIRTY-THREE
    void testUppercaseChocolateSteelColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Chocolate Steel");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Chocolate Steel\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color chocolate steel

    @Test //TEST THIRTY-FOUR
    void testLowercaseChocolateSteelColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("chocolate steel");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: chocolate steel\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color chocolate steel

    @Test //TEST THIRTY-FIVE
    void testUppercaseChocolateTortoiseshellColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Chocolate Tortoiseshell");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Chocolate Tortoiseshell\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color chocolate tortoiseshell

    @Test //TEST THIRTY-SIX
    void testLowercaseChocolateTortoiseshellColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("chocolate tortoiseshell");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: chocolate tortoiseshell\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color chocolate tortoiseshell

    @Test //TEST THIRTY-SEVEN
    void testUppercaseCopperAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Copper Agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Copper Agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color copper agouti

    @Test //TEST THIRTY-EIGHT
    void testLowercaseCopperAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("copper agouti");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: copper agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color copper agouti

    @Test //TEST THIRTY-NINE
    void testUppercaseCreamColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Cream");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Cream\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color cream

    @Test //TEST FORTY
    void testLowercaseCreamColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("cream");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: cream\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color cream

    @Test //TEST FORTY-ONE
    void testUppercaseFawnColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Fawn");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Fawn\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color fawn

    @Test //TEST FORTY-TWO
    void testLowercaseFawnColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("fawn");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: fawn\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color fawn

    @Test //TEST FORTY-THREE
    void testUppercaseFrostedPearlColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Frosted Pearl");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Frosted Pearl\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color frosted pearl

    @Test //TEST FORTY-FOUR
    void testLowercaseFrostedPearlColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("frosted pearl");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: frosted pearl\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color frosted pearl

    @Test //TEST FORTY-FIVE
    void testUppercaseGrayColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Gray");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Gray\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color gray

    @Test //TEST FORTY-SIX
    void testLowercaseGrayColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("gray");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: gray\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color gray

    @Test //TEST FORTY-SEVEN
    void testUppercaseLightGrayColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Light Gray");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Light Gray\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color light gray

    @Test //TEST FORTY-EIGHT
    void testLowercaseLightGrayColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("light gray");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: light gray\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color light gray

    @Test //TEST FORTY-NINE
    void testUppercaseLilaacColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Lilac");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Lilac\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color lilac

    @Test //TEST FIFTY
    void testLowercaseLilacColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("lilac");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: lilac\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color lilac

    @Test //TEST FIFTY-ONE
    void testUppercaseLilacChinchillaColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Lilac Chinchilla");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Lilac Chinchilla\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color lilac chinchilla

    @Test //TEST FIFTY-TWO
    void testLowercaseLilacChinchillaColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("lilac chinchilla");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: lilac chinchilla\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color lilac chinchilla

    @Test //TEST FIFTY-THREE
    void testUppercaseLilacSteelColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("Lilac Steel");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: Lilac Steel\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color lilac steel

    @Test //TEST FIFTY-FOUR
    void testLowercaseLilacSteelColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setIsBaby(true);
        rabbit_color.setWeight(2);
        rabbit_color.setAge(4);
        rabbit_color.setColor("lilac steel");
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 4 weeks\n" +
                "Weight: 2.0 in ounces\n" +
                "Color: lilac steel\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color lilac steel

    @Test //TEST FIFTY-FIVE
    void testUppercaseLilacTortoiseshellColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Lilac Tortoiseshell");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Lilac Tortoiseshell\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color lilac tortoiseshell

    @Test //TEST FIFTY-SIX
    void testLowercaseLilacTortoiseshellColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("lilac tortoiseshell");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: lilac tortoiseshell\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color lilac tortoiseshell

    @Test //TEST FIFTY-SEVEN
    void testUppercaseOpalAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Opal Agouti");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Opal Agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color opal agouti

    @Test //TEST FIFTY-EIGHT
    void testLowercaseOpalAgoutiColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("opal agouti");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: opal agouti\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color opal agouti

    @Test //TEST FIFTY-NINE
    void testUppercaseOrangeColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Orange");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Orange\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color orange

    @Test //TEST SIXTY
    void testLowercaseOrangeColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("orange");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: orange\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color orange

    @Test //TEST SIXTY-ONE
    void testUppercasePearlColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Pearl");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Pearl\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color pearl

    @Test //TEST SIXTY-TWO
    void testLowercasePearlColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("pearl");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: pearl\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color pearl

    @Test //TEST SIXTY-THREE
    void testUppercasePointedWhiteColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Pointed White");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Pointed White\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color pointed white

    @Test //TEST SIXTY-FOUR
    void testLowercasePointedWhiteColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("pointed white");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: pointed white\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color pointed white

    @Test //TEST SIXTY-FIVE
    void testUppercaseRedColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Red");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Red\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color red

    @Test //TEST SIXTY-SIX
    void testLowercaseRedColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("red");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: red\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color red

    @Test //TEST SIXTY-SEVEN
    void testUppercaseSableColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Sable");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Sable\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color sable

    @Test //TEST SIXTY-EIGHT
    void testLowercaseSableColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("sable");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: sable\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color sable

    @Test //TEST SIXTY-NINE
    void testUppercaseSableMartenColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("Sable Marten");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: Sable Marten\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end uppercase color sable marten

    @Test //TEST SEVENTY
    void testLowercaseSableMartenColor()
    {
        Rabbit_RegEx rabbit_color = new Rabbit_RegEx();
        rabbit_color.setColor("sable marten");
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: sable marten\n" +
                "Gender: male";
        assertEquals(expected, rabbit_color.toString());
    }//end lowercase color sable marten


    //Test True Dwarf Gene!
    @Test //TEST ONE
    void testHollandLopTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Holland Lop");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test when dwarf gene is true w/holland lop

    @Test //TEST TWO
    void testNetherlandDwarfTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Netherland Dwarf");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene true w/netherland dwarf

    @Test //TEST THREE
    void testAmericanTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "American");
        boolean expected = false;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test true dwarf gene false w/American

    @Test //TEST FOUR
    void testMiniRexTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Mini Rex");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene true w/Mini Rex

    @Test //TEST FIVE
    void testMiniSatinTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Mini Satin");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene true w/Mini Satin

    @Test //TEST SIX
    void testDwarfHototTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Dwarf Hotot");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene true w/dwarf hotot

    @Test //TEST SEVEN
    void testPolishTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Polish");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene w/Polish

    @Test //TEST EIGHT
    void testBritanniaPetiteTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Britannia Petite");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene w/britannia petite

    @Test //TEST NINE
    void testAmericanFuzzyLopTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "American Fuzzy Lop");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene w/American Fuzzy Lop

    @Test //TEST TEN
    void testJerseyWoolyTrueDwarfGene()
    {
        Rabbit_RegEx rabbit_gene = new Rabbit_RegEx();
        rabbit_gene.setTrueDwarfGene(true, "Jersey Wooly");
        boolean expected = true;
        assertEquals(expected, rabbit_gene.getTrueDwarfGene());
    }//end test dwarf gene w/Jersey Wooly


    //Test gender brain method
    @Test //TEST ONE
    void testnotBabyGenderTrue()
    {
        Rabbit_RegEx rabbit_gender = new Rabbit_RegEx();
        rabbit_gender.setIsBaby(false);
        rabbit_gender.setGender(true);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: \n" +
                "Gender: female";
        assertEquals(expected, rabbit_gender.toString());
    }//end bun not baby gender is true

    @Test //TEST TWO
    void testnotBabyGenderFalse()
    {
        Rabbit_RegEx rabbit_gender = new Rabbit_RegEx();
        rabbit_gender.setIsBaby(false);
        rabbit_gender.setGender(false);
        String expected = "Is the rabbit a baby?: false\n" +
                "How old is the rabbit?: 0 years\n" +
                "Weight: 0.0 in pounds\n" +
                "Color: \n" +
                "Gender: male";
        assertEquals(expected, rabbit_gender.toString());
    }//end bun not baby gender is false

    @Test //TEST THREE
    void testIsBabyGenderTrue()
    {
        Rabbit_RegEx rabbit_gender = new Rabbit_RegEx();
        rabbit_gender.setIsBaby(true);
        rabbit_gender.setGender(true);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 0 weeks\n" +
                "Weight: 0.0 in ounces\n" +
                "Color: \n" +
                "Gender: female";
        assertEquals(expected, rabbit_gender.toString());
    }//end bun is baby gender is true

    @Test //TEST FOUR
    void testIsBabyGenderFalse()
    {
        Rabbit_RegEx rabbit_gender = new Rabbit_RegEx();
        rabbit_gender.setIsBaby(true);
        rabbit_gender.setGender(false);
        String expected = "Is the rabbit a baby?: true\n" +
                "How old is the rabbit?: 0 weeks\n" +
                "Weight: 0.0 in ounces\n" +
                "Color: \n" +
                "Gender: male";
        assertEquals(expected, rabbit_gender.toString());
    }//end bun is baby gender is false
}//end class test don't try to put tests underneath this!!