package restful.app.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import restful.app.domain.Post;
import restful.app.repository.PostRepository;
import restful.app.services.exception.ObjectNotFoundException;

@Service
public class PostService {
    @Autowired
    private PostRepository repository;

    public Post findById(String id){
        Optional<Post> obj = repository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Object not found!"));
    }

}