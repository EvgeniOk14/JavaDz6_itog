import java.io.IOException;
import java.util.Set;

public class recordSet
{
 public static Set<NoteBook> recSet(Set<NoteBook> listNotes, NoteBook noteBook) throws IOException
 {
    listNotes.add(noteBook);
    return (Set<NoteBook>) listNotes;
 }   
}
