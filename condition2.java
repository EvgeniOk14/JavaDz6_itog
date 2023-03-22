public class condition2 
{
    public static String twoCondition(int operationNumber, NoteBook notebook1,NoteBook notebook2,NoteBook notebook3,NoteBook notebook4,NoteBook notebook5)
    {
        while(operationNumber < 1 || operationNumber > 5)
          {
            System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
            interMain.interfaceMain();
            operationNumber = scanFile.scanOperation();
          }
      
        switch (operationNumber)
        {
        case 1: 
        System.out.println(notebook1);
        break;
        
          
        case 2:
        System.out.println(notebook2);  
        break;

        case 3:  
        System.out.println(notebook3);
        break;

        case 4:
        System.out.println(notebook4);
        break;
          
        case 5:
        System.out.println(notebook5);
        break;
        
        default : 
          break;
        }
        return null;  
    
    }        
}

