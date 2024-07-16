import java.util.*;
public class Library{
private static ArrayList<Librarian> librarians = new ArrayList<>();
    static {
        librarians.add(new Librarian(1, "Vikram"));
        librarians.add(new Librarian(2, "Jey"));
    }

 public static boolean checkLibrarian(int id){
     for(Librarian librarian:librarians){
        if(librarian.getId()==id){
                System.out.println("Welcome back,  "+librarian.getName() +"!");
                 return true;
             }
        }
       System.out.println("Sorry Librarian not found!.....");
       return false;
   }

}