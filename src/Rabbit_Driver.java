import java.util.Scanner;
public class Rabbit_Driver
{
    public static void main(String[] args)
    {
        Rabbit_RegEx rabbit = new Rabbit_RegEx();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a rabbit name:");
        rabbit.setRabbitName(input.nextLine());
        System.out.println("Rabbit's Name is: " + rabbit.getRabbitName());
        
    }
}
