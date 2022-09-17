package service;

import testapp.model.AuthorModel;

public interface AuthorService {
    void save(AuthorModel authorModel);
    void delete(Long id);
}
