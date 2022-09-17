package service;

import org.springframework.beans.factory.annotation.Autowired;
import repository.BookRepository;
import testapp.model.BookModel;

public class BookServiceImpl implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public void save(BookModel bookModel) {
        bookRepository.save(bookModel);
    }

    @Override
    public void delete(Long id) {
        bookRepository.delete(id);
    }
}
