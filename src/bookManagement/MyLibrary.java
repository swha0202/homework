package bookManagement;
import java.util.*;
import java.io.*;

public class MyLibrary implements Library{//MyLibrary가 Library 인터페이스를 구현하도록 함
	private ArrayList<Book> books;

    MyLibrary() {
        this.books = new ArrayList<>();//주석7. 컬렉션 프레임워크중 ArrayList 사용
    }

    @Override
    public void addBook(Book book) {//인터페이스의 구현
    	//주석5. 매개변수의 다형성을 통해 Book 부모타입의 매개변수를 갖는 메서드를 선언했다.
        books.add(book);
    }

    @Override
    public void removeBook(Book book) {//인터페이스의 구현
    	//주석5. 매개변수의 다형성을 통해 Book 부모타입의 매개변수를 갖는 메서드를 선언했다.
        books.remove(book);
    }
    
    public void saveBooksToFile(String filename) {//주석8. 파일입출력
        try (PrintWriter writer = new PrintWriter(new File(filename))) {
            for (Book book : books) {//향상된 for문을 통해 여러 객체를 각각 다룸
                writer.println("책명: " + book.title + ", 저자: " + book.author);
        }//말 그대로 파일에 책명: ~~, 저자: ~~를 입력하는 구문이다.
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }//주석4. 예외처리로 파일을 못 찾을시 발생하는 예외처리이다.
    }
    public void printBooks() {// 저장된 책들을 화면으로 보여주는 메서드이다.
        for (Book book : books) {//향상된 for문으로 여러 책 객체들을 각각 다룬다.
            System.out.println("책명: " + book.title + ", 저자: " + book.author);
        }
    }
}
