package service;

import org.springframework.beans.factory.annotation.Autowired;
import repository.AuthorRepository;
import testapp.model.AuthorModel;

import java.util.List;

public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;
    @Override
    public void save(AuthorModel authorModel) {
        authorRepository.save(authorModel);
    }
    public List<AuthorModel> listAll(){
        return (List<AuthorModel>) authorRepository.findAll();
    }
    @Override
    public void delete(Long id) {
        authorRepository.delete(id);
    }
}
