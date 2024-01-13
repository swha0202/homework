package bookManagement;

public class Book { //먼저 Book이라는 부모 클래스를 정의해준다.
	String title;
    String author;
    Genre genre;
    
    Book(String title, String author, Genre genre) {//Book 생성자 정의
        this.title = title;
        this.author = author;
        this.genre = genre;
    }
}
