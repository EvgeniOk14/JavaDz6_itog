import java.io.IOException;
import java.util.Set;

public class condition2 
{
    public static Set<NoteBook> twoCondition(Set<NoteBook> listNotes, NoteBook notebook1,NoteBook notebook2,NoteBook notebook3,NoteBook notebook4,NoteBook notebook5)
    {  
       int operationNumber = scanFile.scanOperation();
        while(operationNumber < 1 || operationNumber > 5)
          {
            System.out.println("Вы ввели не верный номер операции!\n Введите его снова!");
            interOzu.interfacеOzu();
            operationNumber = scanFile.scanOperation();
          }
          
        switch (operationNumber)
        {
        case 1: 
            System.out.println("По выбранному Вами параметру Вам подходит nonetbook5: " + notebook1 + " \nДобавим его в Вашу карзину! ");
        
            try
             {
                  recordSet.recSet(listNotes, notebook1);
             }    
            catch (IOException e)
              {
        
              e.printStackTrace();
              } 
        return start.startProgram(listNotes, notebook1, notebook2, notebook3, notebook4, notebook5);
        
          
        case 2:
            System.out.println("Вы выбрали параметр! Подходит nonetbook2: " + notebook2 + " Добавим его в Вашу карзину! ");  
            try 
              {
              recordSet.recSet(listNotes, notebook2);
              } 
            catch (IOException e) 
              {
              e.printStackTrace();
              } 

        return start.startProgram(listNotes,notebook1, notebook2, notebook3, notebook4, notebook5);

        case 3:  
            System.out.println("Вы выбрали параметр! Подходит nonetbook3:  " + notebook3 + " Добавим его в Вашу карзину! ");
            try 
              {
              recordSet.recSet(listNotes, notebook3);
              } 
            catch (IOException e) 
              {
              e.printStackTrace();
              }
        return start.startProgram(listNotes,notebook1, notebook2, notebook3, notebook4, notebook5);

        case 4:
            System.out.println("Вы выбрали параметр! Подходит nonetbook4:  "+ notebook4 + " Добавим его в Вашу карзину! ");
            try 
              {
              recordSet.recSet(listNotes, notebook4);
              } 
            catch (IOException e) 
              {
              e.printStackTrace();
              }
        return start.startProgram(listNotes,notebook1, notebook2, notebook3, notebook4, notebook5);
          
        case 5:
          System.out.println("Вы выбрали параметр! Подходит nonetbook5: "+ notebook5 + " Добавим его в Вашу карзину! ");
            try 
              {
              recordSet.recSet(listNotes, notebook5);
              } 
            catch (IOException e) 
              {
              e.printStackTrace();
              }
        return start.startProgram(listNotes,notebook1, notebook2, notebook3, notebook4, notebook5);
        
        }
    
        return null;  
    
    }        
}

