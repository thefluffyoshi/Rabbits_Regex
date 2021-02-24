import java.util.Scanner;
public class Rabbit_RegEx
{
    //Vars!
    //Scanner input = new Scanner(System.in);
    private String rabbitName;
    private String breedName;
    private String color; //47 colors
    private int age; //in weeks or years
    private double weight; //in pounds
    private boolean gender; //not used
    private boolean trueDwarfGene; //certain rabbit breeds have true dwarf gene
    // (gene = usually smaller ears, gene is kind of like a Punett Sqaure where if there are two true dwarf genes it equals a peanut baby bunny)
    private boolean isBaby;

    //Constructors!
    public Rabbit_RegEx()
    {
        rabbitName = "";
        breedName = "";
        color = "";
        age = 0;
        gender = false;
        weight = 0.0;
        trueDwarfGene = false;
        isBaby = false;
    }

    public Rabbit_RegEx(String rabbitName, String breedName, String color, int age, boolean gender, double weight, boolean trueDwarfGene, boolean isBaby)
    {
        this.rabbitName = rabbitName;
        this.breedName = breedName;
        this.color = color;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.trueDwarfGene = trueDwarfGene;
        this.isBaby = isBaby;
    }

    //Getters!
    public String getRabbitName()
    {
        return rabbitName;
    }

    public String getBreedName()
    {
        return breedName;
    }

    public String getColor()
    {
        return color;
    }

    public int getAge()
    {
        return age;
    }

    public boolean getGender()
    {
        return gender;
    }

    public double getWeight()
    {
        return weight;
    }

    public boolean getTrueDwarfGene()
    {
        return trueDwarfGene;
    }

    public boolean getIsBaby()
    {
        return isBaby;
    }

    //Setters!
    public void setRabbitName(String rabbitName)
    {
        this.rabbitName = validateRabbitName(rabbitName);
    }

    public void setBreedName(String breedName)
    {
        this.breedName = validateBreedName(breedName);
    }

    public void setColor(String color)
    {
        this.color = validateColors(color);
    }

    public void setAge(int age)
    {
        this.age = checkForValidAge(age);
    }

    public void setGender(boolean gender)
    {
        this.gender = gender;
    }

    public void setWeight(double weight)
    {
        this.weight = checkForValidWeight(weight);
    }

    public void setTrueDwarfGene(boolean trueDwarfGene, String breedName)
    {
        this.trueDwarfGene = checkTrueDwarfGene(trueDwarfGene, breedName);
    }

    public void setIsBaby(boolean isBaby)
    {
        this.isBaby = isBaby;
    }


    //Validation!! ~ Regex
    private String validateRabbitName(String rabbitName)
    {
        while(!rabbitName.matches("[A-Za-z-]*"))
        {
            System.out.println("You can't use special characters. A-Z or a-z");
            return rabbitName;
        }//end while
        return rabbitName;
    }//end validateRabbitName

    private String validateBreedName(String breedName)
    {
//        String[] breedNameArr = {"American", "American Chinchilla", "American Fuzzy Lop", "American Sable", "Argente Brun",
//            "Belgian Hare", "Beveren", "Blanc de Hotot", "Britannia Petite", "Californian", "Cavies", "Champagne d'Argent", "Checkered Giant", "Cinnamon",
//            "Creme d'Argent", "Dutch", "Dwarf Hotot", "English Angora", "English Lop", "English Spot", "Flemish Giant", "Florida White", "French Angora", "French Lop",
//            "Giant Angora", "Giant Chinchilla", "Harlequin", "Havana", "Himalayan", "Holland Lop", "Jersey Wooly", "Lilac", "Lionhead",
//            "Mini Lop", "Mini Rex", "Mini Satin", "Netherland Dwarf", "New Zealand", "Palomino", "Polish", "Rex", "Rhinelander",
//            "Satin", "Santin Angora", "Silver", "Silver Fox", "Silver Marten", "Standard Chinchilla", "Tan", "Thrianta"};

        while (!breedName.matches("^[A-Za-z-' ][a-zA-Z-' ][a-zA-z-' ]*"))
        {
            System.out.println("Breed names don't have numbers!");
            return breedName;
        }//end while
        return breedName;
    }//end validateBreedName

    private int checkForValidAge(int age)
    {
        if (age < 0)
        {
            age = 0;
        }//end if
        else if (age > 10)
        {
            age = 10;
        }//end else
        return age;
    }//end valid age

    private double checkForValidWeight(double weight)
    {
        if (weight < 0.0)
        {
            weight = 1;
        }//end if
        else if (weight > 15.0)
        {
            weight = 15.0; //largest rabbit, French Lop
        }//end else
        return weight;
    }//end check weight

    private String validateColors(String color)
    {
        //uppercase and lowercase
        String[] colorArr = {"Agouti", "Black", "Black Otter", "Blue", "Blue Otter", " Blue Steel", "Blue Tortoiseshell", "Broken",
                "Brown-Gray Agouti", "Californian", "Castor", "Chinchilla", "Cinnamon",
                "Chocolate", "Chocolate Agouti", "Chocolate Chinchilla", "Chocolate Steel", "Chocolate Tortoiseshell",
                "Copper Agouti", "Cream", "Fawn", "Frosted Pearl", "Gray", "Light Gray",
                "Lilac", "Lilac Chinchilla", "Lilac Steel", "Lilac Tortoiseshell", "Opal Agouti", "Orange", "Pearl", "Pointed White", "Red",
                "Sable", "Sable Marten", "Sable Point", "Sandy", "Seal", "Self-Group", "Shaded Group",
                "Silver", "Silver Fox", "Silver Marten", "Tan Pattern", "Ticking", "Tortoise", "Tortoiseshell", "Tri-Colored"};

        for (int i = 0; i < colorArr.length; i++)
        {
            if (color.equals(colorArr[i]))
            {
                while(!color.matches("[A-Za-z- ][A-Za-z- ]*"))
                {
                    System.out.println("You can't use special characters. A-Z or a-z");
                    return color;
                }//end while loop
            }//end if
        }//end for
        return color;
    }//end validate colors

    private boolean checkTrueDwarfGene(boolean trueDwarfGene, String breedName)
    {
        boolean tempGene = false;
        //uppercase and lowercase
        String[] breedNameArr = {"Holland Lop", "Netherland Dwarf", "Mini Rex", "Mini Satin", "Dwarf Hotot",
                                    "Polish", "Britannia Petite", "American Fuzzy Lop", "Jersey Wooly"};
        if (trueDwarfGene == true)
        {
            for (int i = 0; i < breedNameArr.length; i++)
            {
                if (breedName.equals(breedNameArr[i]))
                {
                    tempGene = true;
                }
            }//end for
        }
        return tempGene;
    }

    public String toString()
    {
        if(isBaby == false)
        {
            return "Is the rabbit a baby?: " + isBaby +
                        "\nHow old is the rabbit?: " + age + " years" +
                        "\nWeight: " + weight + " in pounds" +
                        "\nColor: " + color;
        }//end if
        else
        {
            return "Is the rabbit a baby?: " + isBaby +
                        "\nHow old is the rabbit?: " + age + " weeks" +
                        "\nWeight: " + weight + " in ounces" +
                        "\nColor: " + color;
        }//end else
    }//end toString

//    private String validateAge(String age, boolean isBaby)
//    {
//        String weekAge = "";
//        while(!age.matches("[0-9]"))
//        {
//            System.out.println("Age can't be in letters");
//            age = input.nextLine();
//        }
//        if (isBaby == false)
//        {
//            weekAge = age + " in years";
//        }
//        else if (isBaby == true)
//        {
//            weekAge = age + " in weeks";
//        }
//
//        if (age.equals("0") || )
//        {
//
//        }
//        return weekAge;
//    }//end validate age

//    private String validateWeight(String weight)
//    {
//       while (!weight.matches("[0-9]{1,2}(\\.[0-9]{1,2})"))
//       {
//           System.out.println("Weight can't be in letters. Need a decimal!");
//           return weight;
//       }
//       return weight;
//    }//end validate weight

}//end class Rabbit RegEx
