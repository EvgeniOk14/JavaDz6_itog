public class main 
{
    public static void main(String[] args) 
    {
        NoteBook notebook1 = new NoteBook("DDR1", "8","Linox","Зелёный");
        NoteBook notebook2 = new NoteBook("DDR2","16","Ubuntu","Чёрный");
        NoteBook notebook3 = new NoteBook("DDR3","32","ChromOS","Красный");
        NoteBook notebook4 = new NoteBook("ddr4","64","MacOS","Синий");
        NoteBook notebook5 = new NoteBook("DDR5","256","Windows","Белый");
        
        // System.out.println(notebook1);
        // System.out.println(notebook2);
        // System.out.println(notebook3);
        // System.out.println(notebook4);
        // System.out.println(notebook5);
        System.out.println("Магазин ноутбуков приветствуем Вас дорогой покупатель!\n "); 
        interMain.interfaceMain();
        condition1.oneCondition(notebook1, notebook2, notebook3, notebook4, notebook5);
    }
}
