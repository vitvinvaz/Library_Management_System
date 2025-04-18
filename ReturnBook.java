import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class ReturnBook {
    public ReturnBook(){

    }

    public void returnBook(Map<Integer,Student> student, Scanner s, List<Book> bookList){
        System.out.print("Enter your Student ID : ");
        int id = s.nextInt();
        Student s1 = null;

        if(student.containsKey(id))
            s1 = student.get(id);
        else{
            System.out.println("Student Id Not Found...\n");
            return;
        }
        if (s1 != null && !s1.list.isEmpty()){
            System.out.print("Enter Book Title : ");
            String title = s.next();
            for (int i = 0;i<s1.list.size();i++) {
                if(s1.list.get(i).title.equals(title)){
                    Book book = s1.list.get(i);
                    s1.list.remove(i);
                    bookList.add(book);
                    System.out.println("Book Returned Sucessfully...\n");
                    break;
                }
            }
        }else{
            System.out.println("Book Not Found...\n");
        }
    }
}
