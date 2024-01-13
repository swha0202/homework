package bookManagement;
/* [주석 1 : 도서관 책 관리 프로그램으로 책을 추가/제거할 수 있도록 구현해놓았고, 
 추가된 책들은 원하면 따로 txt파일에 기록할 수 있는 기능 또한 구현해놓았습니다.
 이는 Book 부모객체, Novel, Textbook 자식객체 그리고 Genre 열거형, 
 Library인터페이스, MyLibrary 구현 클래스, 마지막으로 Main클래스로 구성되어있습니다.]

객체지향 프로그래밍 평가과제 (배점 25점)
학과 : 컴퓨터공학과
학번 : 202203678
이름 : 하상욱

과제 주제 : 도서관 책 관리 프로그램

*/

public class Main {

	public static void main(String[] args) {
		//먼저 객체를 생성하는 과정이다.
		MyLibrary myLibrary = new MyLibrary();
        Book book1 = new Novel("어린왕자", "생텍쥐베리", Genre.FANTASY);
        Book book2 = new Textbook("수학익힘책", "김아무개", Genre.SCIENCE);
        Book book3 = new Novel("메피스토", "클라우스 만", Genre.MYSTERY);
        
        //myLibrary에 책을 추가하는 과정이다.
        myLibrary.addBook(book1);
        myLibrary.addBook(book2);
        myLibrary.addBook(book3);
        
        //책을 추가한뒤 이것을 파일에 기록하는 과정이다.
        myLibrary.saveBooksToFile("books.txt");	
        
        //책을 도서관에서 지우는 과정이다.
        myLibrary.removeBook(book2);
        
        //현재 보유중인 책을 보여주는 메서드이다.
        //book2를 지우고 출력했으므로 book1과 book3에 관한 정보만 화면에 출력되고,파일에는 book1, book2, book3가 다 입력되게 된다.
        myLibrary.printBooks();
	}
}