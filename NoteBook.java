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


        public void setOzu(String ozu) 
        {   
                this.ozu = ozu;  
        }
        public void setHardDrive(String hardDrive) 
        {
                this.hardDrive = hardDrive;
        }
        public void setOperationSystem(String operationSystem) 
        {
                this.operationSystem = operationSystem;
        }
        public void setColor(String color) 
        {
                this.color = color;
        }

        public String getOzu() {
                return ozu;
        }
        public String getHardDrive() {
                return hardDrive;
        }
        public String getOperationSystem() 
        {
                return operationSystem;
        }
        public String getColor() 
        {
                return color;
        }

            @Override
            public String toString() 
            {
                return ozu + " " + hardDrive + " " + operationSystem + " " + color + " ";
            }

}