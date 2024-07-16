import java.util.*;
class Main{
public static void main(String args[]){
    
    System.out.println("-----WELCOME TO THE LIBRARY-----");
    boolean loop=true;
    while(loop){
         System.out.println("Are you a...");
         Scanner s=new Scanner(System.in);
         System.out.println("1.Librarian");
         System.out.println("2.Existing Member");
         System.out.println("3.New Member");
         System.out.println("4.Exit");
         int choice=s.nextInt();
         switch(choice){
                case 1:
                   {
                         System.out.println("PLEASE ENTER YOU ID");
                         int id=s.nextInt();
                         if(Library.checkLibrarian(id))
                         {
                         boolean exit = false;
                         while(!exit){
                        System.out.println("what would you like to do?");
                         System.out.println("1.Add book");
                         System.out.println("2.Remove book");
                         System.out.println("3.Display the members");
                         System.out.println("4.Display all the books");
                         System.out.println("5.Exit");
                         int n=s.nextInt();

                         switch(n){
                                case 1:
                                       System.out.println("Enter the name of the book");
                                       String name=s.next();
                                       System.out.println("Enter the author of the book");
                                       String author=s.next();
                                       Books.addBook(name,author);
                                       break;
                                           
                                case 2:
                                       System.out.println("Enter the book name to be deleted");
                                       String bookName=s.next();
                                       Books.removeBook(bookName);
                                       break;
                                          
                                case 3:
                                       Member.displayMember();
                                       break;
                                 
                                 case 4:
                                        Books.displayBooks();
                                        break;   
                                 case 5:
                                        exit=true;
                                       System.out.println("Exiting!...");
                                        break;
                                  
                              }
                          
                         }
                       }
                        
                       break;
                         
                    }
                   
                    case 2:{
                           System.out.println("ENTER YOUR MEMBER ID:");
                           int id=s.nextInt();
                           if(Member.checkMember(id))
                           {
                           Member member=Member.getMember(id);
                           System.out.println("What would you like to do");
                           boolean exit=true;
                           while(exit){
                              System.out.println("1.Display all books");
                              System.out.println("2.Borrow book");
                              System.out.println("3.Return book");
                              System.out.println("4.Exit");
                              int n=s.nextInt();
                              switch(n){
                                     case 1:
                                           Books.displayBooks();
                                           break;
                                     case 2:
                                          System.out.println("Enter the book you want to borrow");
                                          String bookname=s.next();
                                          member.borrow(bookname);
                                          break;
                                    case 3:
                                        
                                          System.out.println("Enter the book you want to return");
                                          String rbookname=s.next();
                                          System.out.println("Enter the author of book you want to return");
                                          String auname=s.next();
                                          member.returnBook(rbookname,auname);
                                          break;
                                   case 4:
                                         System.out.println("Exiting...");
                                         exit=false;
                                        break;
                                  }
                              
                          
                            }
                           
                          }
                             else
                         {   System.out.println("Member Id not available,please get the member ship");
                               }
                         break;
                       
                        
                      }
                   case 3:
                   {
                        System.out.println("Enter your name:");
                        String memberName = s.next();
                        System.out.println("Enter your mobile number:");
                        int mob = s.nextInt();
                        Member member =new Member(memberName,mob);
                        member.addMember(member);   
                        break;                    

                    }
                   case 4:
                    {
                        System.out.println("----------------Exiting---------------");
                         loop=false;
                        break;


                       }
             }
      }
    

}
}