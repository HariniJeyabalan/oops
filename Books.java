import java.util.*;
class Books{
     private String name;
     private String author;
     private static HashMap<String,String>books=new HashMap<>();
     public Books(String name,String author){
           this.name=name;
           this.author=author;
     }
    public String getName(){
           return name;

     }
    public String getAuthor(){
        return author;
   }
   public static void addBook(String name,String author){
     if(!books.containsKey(name))
    {
      books.put(name,author);
     System.out.println("---The book "+name+" by the "+ author+" is successfully added---" );
       }
    else{

     System.out.println("The book already exits");
     }
  }
  public static void  removeBook(String name){
        if(books.containsKey(name))
        {
             books.remove(name);
             System.out.println("The book "+name+ " is succesfully deleted");
         }
        else
         { 
              System.out.println("The book "+name+ " is not available");
          
           }

   }
    public static void displayBooks(){
           System.out.println("The available books are");
           System.out.println("-----------------------------");
           System.out.println("Book     Author");
           for(Map.Entry<String,String>book:books.entrySet())
          {
              
              System.out.println(book.getKey()+"     "+book.getValue());
          }
           System.out.println("-----------------------------");

    }
  public  static boolean borrowBook(String name){
          if(books.containsKey(name)){
                  books.remove(name);
                   return true;
             
             }
        else
          {
              return false;
           }
   }
   public  static void returnBooks(String name,String auname)
  {
                  books.put(name,auname);
                   
             
             
       
   }


}
