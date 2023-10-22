package restful.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import restful.app.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{
    
}
