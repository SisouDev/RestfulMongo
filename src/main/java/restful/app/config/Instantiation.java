package restful.app.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import restful.app.domain.Post;
import restful.app.domain.User;
import restful.app.dto.AuthorDTO;
import restful.app.repository.PostRepository;
import restful.app.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User u1 = new User(null, "Maria Brown", "maria@gmail.com");
        User u2 = new User(null, "Alex Green", "alex@gmail.com");
        User u3 = new User(null, "Bob Grey", "bob@gmail.com");
        User u4 = new User(null, "Afonso Luis", "afonsolindo@gmail.com");
        User u5 = new User(null, "Sarah Luisa", "sarahgatinha@gmail.com");
        User u6 = new User(null, "Nelio Alves", "acenelio@gmail.com");

        userRepository.saveAll(Arrays.asList(u1, u2, u3, u4, u5, u6));
        
        Post post1 = new Post(null, sdf.parse("21/03/2023"), "Vacations", "I am going to travel, see you later!", new AuthorDTO(u1));
        Post post2 = new Post(null, sdf.parse("23/03/2023"), "Good morning.", "Im happy today!", new AuthorDTO(u1));

        postRepository.saveAll(Arrays.asList(post1, post2));

        u1.getPosts().addAll(Arrays.asList(post1, post2));

        userRepository.save(u1);

    }
    
}
