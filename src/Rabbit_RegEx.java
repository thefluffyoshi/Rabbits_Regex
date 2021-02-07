import java.util.Scanner;
public class Rabbit_RegEx
{
    //Vars!
    Scanner input = new Scanner(System.in);
    private String rabbitName;
    private String breedName;
    private String color;
    private String age; //in weeks
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
        age = "0";
        gender = "";
        weight = "0.0";
        trueDwarfGene = false;
        isBaby = false;
    }

    public Rabbit_RegEx(String rabbitName, String breedName, String color, String age, String gender, String weight, boolean trueDwarfGene, boolean isBaby)
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

    public String getAge()
    {
        return age;
    }

    public String getGender()
    {
        return gender;
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

    public void setAge(String age)
    {
        this.age = validateAge(age, isBaby);
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
            rabbitName = input.nextLine();
        }
        return rabbitName;
    }//end validateRabbitName

    private String validateBreedName(String breedName)
    {
        while (!breedName.matches("[A-Z][a-z]"))
        {
            System.out.println("Breed names don't have numbers!");
            breedName = input.nextLine();
        }
        return breedName;
    }//end validateBreedName

    private String validateAge(String age, boolean isBaby)
    {
        String weekAge = "";
        while(!age.matches("[0-9]"))
        {
            System.out.println("Age can't be in letters");
            age = input.nextLine();
        }
        if (isBaby == true)
        {
            weekAge = "Age in weeks: " + age;
        }
        return weekAge;
    }//end validate age

    private String validateWeight(String weight)
    {
       while (!weight.matches("/^[0-9]+(\\.[0-9]+)?$"))
       {
           System.out.println("Weight can't be in letters. Need a decimal!");
           weight = input.nextLine();
       }
       return weight;
    }
}//end class Rabbit RegEx
