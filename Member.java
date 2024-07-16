import java.util.*;
class Member{
     private static int next=1;
      private String memberName;
      private int mob;
      private int id;
      private int borrowedbook=0;
      private static ArrayList<Member>members=new ArrayList<>();
      public Member(String memberName,int mob)
     {
           
             this.memberName=memberName;
             this.mob=mob;
             this.id=next++;
            
             
      }
     public String getName(){
      return memberName;
     }
     public int getId(){
     return id;
    }
   public static Member getMember(int id)
   {
         for(Member member:members)
          {
               if(member.getId()==id)
                      return member;
               }
         return null;
    }
     public void addMember(Member member)
     {
            members.add(member);
            System.out.println("You are now a new member and your id is "+member.id);
           
      }
     public static boolean checkMember(int id)
     { 
              for(Member member:members)
             {
                  if(member.getId()==id)
                  {
                         System.out.println("Welcome back "+member.getName());
                         return true;
                     }
                
             }
            
             return false;
         }
      public static void displayMember()
      { 
            System.out.println("----Our Members----");
            for(Member member:members)
             {
                    System.out.println(member.id +" "+member.memberName+" "+member.borrowedbook);  
              }
             System.out.println("--------------------------");
         }
      
     public  void borrow(String name)
     {
           if(Books.borrowBook(name)) 
           {
                    System.out.println("you have borrowed this book");
                    incrementBorrow();
               }
          else
            {
                 System.out.println("sorry failed to borrow");
               }

          
        }
      public void returnBook(String name,String auname)
      {
            System.out.println("you have returned the book");
               decrementBorrow();
            
         
            
      }
 public void incrementBorrow()
 {
         borrowedbook++;
   }
public void decrementBorrow()
{
        borrowedbook--;
}
  public int getBorrowedcount()
  { 
    return borrowedbook;
   }
     
     

}