import java.util.Set;

public class start {
    public static Set<NoteBook> startProgram(Set<NoteBook> listNotes ,NoteBook notebook1,NoteBook notebook2,NoteBook notebook3,NoteBook notebook4,NoteBook notebook5)
    {
        interMain.interfaceMain();
        condition1.oneCondition(listNotes,notebook1, notebook2, notebook3, notebook4, notebook5);
        return listNotes;
    
    }
}
