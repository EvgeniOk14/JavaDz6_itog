import java.util.Scanner;
public class scanFile 
{
    public static int scanOperation()
    {
        Scanner sc = new Scanner(System.in,"Cp866");  
        System.out.println("Выберите параметры ноутбука: ");
            if(sc.hasNextInt())
            {
                int operationNumber = sc.nextInt();
                return operationNumber; 
            }  
            else
            {
                System.out.println("Вы ввели не число! Введите число! ");
                return scanOperation();
            } 
    }
}
    
                            
    

