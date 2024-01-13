package bookManagement;

public class Textbook extends Book {//주석2. 클래스 상속으로 Book 클래스를 상속받는다.
    Textbook(String title, String author, Genre genre) {
	    super(title, author, genre);//부모 생성자를 부른다.
	}
}
