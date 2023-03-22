
public class condition1 
{
  
      public static String oneCondition(NoteBook notebook1,NoteBook notebook2,NoteBook notebook3,NoteBook notebook4,NoteBook notebook5)
      {
        int operationNumber = scanFile.scanOperation();
         
          while(operationNumber < 1 || operationNumber > 5)
            {
              System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
              interMain.interfaceMain();
              operationNumber = scanFile.scanOperation();
            }
        
          switch (operationNumber)
          {
          case 1: 
          interOzu.interfacеOzu();
          condition2.twoCondition(scanFile.scanOperation(), notebook1, notebook2, notebook3, notebook4, notebook5);
          
            
          case 2:
          interHardDrive.interfacеHardDrive();
          condition2.twoCondition(scanFile.scanOperation(), notebook1, notebook2, notebook3, notebook4, notebook5);
  
          case 3:  
          interOperationSys.interfacеOperationSystem();
          condition2.twoCondition(scanFile.scanOperation(), notebook1, notebook2, notebook3, notebook4, notebook5);
  
          case 4:
          interColor.interfacеColor();
          condition2.twoCondition(scanFile.scanOperation(), notebook1, notebook2, notebook3, notebook4, notebook5);
            
          case 5:
          System.out.println(notebook5);
          break;
          
          default : 
            break;
          }
          return null;  
      
      }        
  }      


