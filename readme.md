**미션 1: 도서 목록 관리 시스템 구축**
- **입력:**
    - 도서 정보를 담은 Book 객체
- **기능:**
    1. Book 객체를 추가, 삭제할 수 있는 도서 목록 관리 기능
    2. 현재 등록된 모든 도서 목록을 조회하여 문자열로 반환
- **포함 기술:**
    - 변수, 데이터 타입, 연산자, 배열과 문자열 다루기
    - 클래스 및 객체, 생성자와 메서드 활용, 캡슐화
    - 제네릭스와 Collection(List) 활용
- **출력 예:**  
  "도서: [Title1], [Author1], [Price1]; 도서: [Title2], [Author2], [Price2]"


**미션 상세 (도서 목록 관리 시스템 구축):**
1. `Book` 클래스를 정의하여 private 멤버 변수(title, author, price)를 선언하고, 생성자와 getter, toString() 메서드를 구현
2. `service.BookManager` 클래스를 정의하여 내부에 `List<Book>` 컬렉션을 선언하고,
    - `addBook(Book book)` 메서드로 도서를 추가
    - `removeBook(String title)` 메서드로 도서를 삭제
    - `listBooks()` 메서드로 전체 도서 목록을 문자열로 반환
3. main() 메서드에서 샘플 데이터를 이용하여 기능을 시연

**미션 2: 사용자 대여 목록 관리 기능 구현**
- **입력:**
    - 회원 정보(회원ID, 이름)와 회원별 대여 도서 (Book 객체)
- **기능:**
    1. 회원별로 대여한 도서를 관리하는 기능 (대여 추가, 조회)
    2. 회원의 대여 목록을 조회하여 문자열로 반환
- **포함 기술:**
    - 클래스 및 객체, 생성자와 메서드 활용, 캡슐화, 상속 및 다형성 (필요 시)
    - 인터페이스와 제네릭스 활용
    - Collection(Map, List) 활용
- **출력 예:**  
  "회원ID: LM001 -> 대여 도서: [Title1]; [Title2]"

**미션 상세 (사용자 대여 목록 관리 기능 구현):**
1. `LibraryMember` 클래스를 정의하여 private 멤버 변수(name, membershipId)를 선언하고, 생성자와 getter, toString()을 구현
2. `RentalManager` 클래스를 정의하여 내부에 `Map<String, List<Book>>` 컬렉션을 선언하고,
    - `rentBook(String memberId, Book book)` 메서드로 회원의 대여 목록에 도서를 추가
    - `getRentalList(String memberId)` 메서드로 특정 회원의 대여 도서 목록을 문자열로 반환
3. main() 메서드에서 샘플 데이터를 이용하여 기능을 시연