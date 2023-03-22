public class NoteBook
 {
     private String ozu;
     private String hardDrive;
     private String operationSystem;
     private String color;

     public NoteBook(String ozu, String hardDrive, String operationSystem, String color)
     {
        this.ozu =ozu;
        this.hardDrive = hardDrive;
        this.operationSystem = operationSystem;
        this.color = color;
     }   
        @Override
        public String toString() 
        {
            return ozu + " " + hardDrive + " " + operationSystem + " " + color + " ";
        }
}