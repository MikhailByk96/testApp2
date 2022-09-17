package service;

import testapp.model.BookModel;

public interface BookService {
    void save(BookModel bookModel);
    void delete(Long id);
}
