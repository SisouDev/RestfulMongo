package restful.app.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import restful.app.domain.User;
import restful.app.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        userRepository.deleteAll();
        User u1 = new User(null, "Maria Brown", "maria@gmail.com");
        User u2 = new User(null, "Alex Green", "alex@gmail.com");
        User u3 = new User(null, "Bob Grey", "bob@gmail.com");
        User u4 = new User(null, "Afonso Luis", "afonsolindo@gmail.com");
        User u5 = new User(null, "Sarah Luisa", "sarahgatinha@gmail.com");
        User u6 = new User(null, "Nelio Alves", "acenelio@gmail.com");
        User u7 = new User(null, "David Jones", "david@gmail.com");
        User u8 = new User(null, "Jennifer White", "jennifer@gmail.com");
        User u9 = new User(null, "William Miller", "william@gmail.com");
        User u10 = new User(null, "Linda Garcia", "linda@gmail.com");
        User u11 = new User(null, "James Rodriguez", "james@gmail.com");
        User u12 = new User(null, "Patricia Martinez", "patricia@gmail.com");
        User u13 = new User(null, "Charles Hernandez", "charles@gmail.com");
        User u14 = new User(null, "Karen Gonzalez", "karen@gmail.com");
        User u15 = new User(null, "Thomas Wilson", "thomas@gmail.com");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6, u7, u8, u9, u10, u11, u12, u13, u14, u15));

    }
    
}
