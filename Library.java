import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Library {

    public static void main(String args[]){
        ArrayList<Book> bookList = new ArrayList<>();
        Map<Integer,Student> studentList = new HashMap<>();
        Scanner s = new Scanner(System.in);
        int id = 1;
        int sId = 100;
        while(true){
            System.out.println("1. Add new Book \n2. Display Book \n3. Search Book \n4. Issue Book \n5. Return Book\n6. Delete Book \n");
            System.out.print("Enter your choice : ");
            int choice = s.nextInt();

            switch (choice){
                case 1 :
                          System.out.print("\nEnter Title Name : ");
                          String title = s.next();
                          System.out.print("Enter Author Name : ");
                          String author = s.next();
                          System.out.print("Enter Category : ");
                          String category = s.next();

                          Book book = new Book(id++,title,author,category,true);
                          bookList.add(book);
                          System.out.println("\nBook Added Successfully...\n");
                          break;
                case 2 :
                          System.out.println();
                          if (bookList.isEmpty()) {
                              System.out.println("No Books Available...\n");
                          }
                          else{
                              for(Book b : bookList){
                                  System.out.println(b);
                              }
                              System.out.println();
                          }
                          break;
                case 3 :
                          System.out.print("Enter Title : ");
                          String title1 = s.next().toLowerCase();
                          boolean flag = true;
                          System.out.println();
                          for(Book b : bookList){
                              if (b.title.equals(title1)) {
                                  System.out.println(b);
                                  flag = false;
                                  break;
                              }
                          }
                          System.out.println();
                          if(flag){
                              System.out.println("No Book Available...\n");
                          }
                          break;
                case 4 :
                          System.out.print("Enter BookID : ");
                          int bookid = s.nextInt();
                          Book book1 = null;
                          boolean flag1 = true;
                          for (int i = 0;i<bookList.size();i++){
                              if(bookList.get(i).bookId == bookid){
                                  flag1 = false;
                                  book1 = bookList.get(i);
                                  bookList.remove(i);
                                  break;
                              }
                          }
                          if(flag1){
                              System.out.println("No Book Available on that BookID...\n");
                          }
                          if (!flag1){
                              System.out.print("Enter Student name : ");
                              String name = s.next();

                              Student student = new Student(name);
                              student.list.add(book1);
                              studentList.put(sId,student);
                              System.out.println("Book Issued Successfully...");
                              System.out.println("Student Id is "+sId+"\n");
                              sId++;
                          }
                          break;
                case 5 :
                          ReturnBook returnBook = new ReturnBook();
                          returnBook.returnBook(studentList,s,bookList);
                          break;

                case 6 :
                          System.out.print("\nEnter the Book ID : ");
                          int id2 = s.nextInt();
                          if (bookList.isEmpty()){
                              System.out.println("\nNo Book Available...\n");
                          }
                          else{
                              int i = 0;
                              for (;i<bookList.size();i++){
                                  if (bookList.get(i).bookId == id2){
                                      bookList.remove(i);
                                      System.out.println("Book Deleted Successfully...\n");
                                      break;
                                  }
                              }
                              if(i>bookList.size()){
                                  System.out.println("Book Not Found...\n");
                              }
                          }
                          break;
                default : System.out.println("\nEnter the Valid Choice.");
            }
        }
    }
}
