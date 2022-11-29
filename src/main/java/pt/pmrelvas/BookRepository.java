package pt.pmrelvas;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;
import java.util.Optional;

@ApplicationScoped
public class BookRepository {

    public List<Book> getAllBooks() {
        return List.of(
                Book.builder().id(1).title("Title 01").author("PMR 01").yearOfPublication(2020).genre("Tech").build(),
                Book.builder().id(2).title("Title 02").author("PMR 02").yearOfPublication(2021).genre("Tech").build(),
                Book.builder().id(3).title("Title 03").author("PMR 03").yearOfPublication(2022).genre("Tech").build(),
                Book.builder().id(4).title("Title 04").author("PMR 04").yearOfPublication(2023).genre("Tech").build()
        );
    }

    public Optional<Book> getBook(int id) {
        return getAllBooks().stream()
                .filter(book -> book.getId() == id)
                .findFirst();
    }
}
