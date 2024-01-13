package bookManagement;

public interface Library {// 주석3. 인터페이스를 만들었다.
	void addBook(Book book);
	void removeBook(Book book);
}//도서관에 책을 추가하고 삭제하는 추상메서드를 구현
