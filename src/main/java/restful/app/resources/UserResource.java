package restful.app.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import restful.app.domain.User;

@RestController
@RequestMapping(value = "/users/")
public class UserResource {

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<List<User>> findAll(){
        User jane = new User("1", "Jane Doe", "jane@gmail.com");
        User john = new User("2", "John Doe", "john@gmail.com");

        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(jane, john));

        return ResponseEntity.ok().body(list);
    }
}
