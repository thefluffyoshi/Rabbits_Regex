import java.util.Scanner;
public class Rabbit_RegEx
{
    //Vars!
    Scanner input = new Scanner(System.in);
    private String rabbitName;
    private String breedName;
    private String color;
    private int age; //in weeks
    private String gender;
    private String weight; //in pounds
    private boolean trueDwarfGene;
    private boolean isBaby;

    //Constructors!
    public Rabbit_RegEx()
    {
        rabbitName = "";
        breedName = "";
        color = "";
        age = 0;
        gender = "";
        weight = "0.0";
        trueDwarfGene = false;
        isBaby = false;
    }

    public Rabbit_RegEx(String rabbitName, String breedName, String color, int age, String gender, String weight, boolean trueDwarfGene, boolean isBaby)
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

    public String getGender()
    {
        return gender;
    }

    public String getWeight()
    {
        return weight;
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
        this.color = color;
    }

    public void setAge(int age)
    {
        this.age = checkForValidAge(age);
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public void setWeight(String weight)
    {
        this.weight = validateWeight(weight);
    }

    public void setTrueDwarfGene(boolean trueDwarfGene)
    {
        this.trueDwarfGene = trueDwarfGene;
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
        }
        return rabbitName;
    }//end validateRabbitName

    private String validateBreedName(String breedName)
    {
        while (!breedName.matches("^[A-Z][a-zA-Z-][a-zA-z- ]*"))
        {
            System.out.println("Breed names don't have numbers!");
            return breedName;
        }
        return breedName;
        //probably add dwarfGene method??
    }//end validateBreedName

    private int checkForValidAge(int age)
    {
        if (age < 0)
        {
            age = 0;
        }
        else if (age > 10)
        {
            age = 10;
        }
        return age;
    }//end valid age

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

    private String validateWeight(String weight)
    {
       while (!weight.matches("[0-9]{1,2}(\\.[0-9]{1,2})"))
       {
           System.out.println("Weight can't be in letters. Need a decimal!");
           return weight;
       }
       return weight;
    }//end validate weight

    public String toString()
    {
        if(isBaby == false)
        {
            return "Is the rabbit a baby?: " + isBaby + "\nHow old is the rabbit?: " + age + " in years";
        }
        return "Rabbit Name: " + rabbitName + "\nBreed Name: " + breedName + "\n";
    }
}//end class Rabbit RegEx
