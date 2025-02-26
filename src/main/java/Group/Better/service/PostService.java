package Group.Better.service;

import Group.Better.entity.Post;
import Group.Better.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAll(){
        return postRepository.findAll();
    }

    public Post getById(@PathVariable("id") String id){
        return postRepository.findById(id).orElseThrow();
    }

    public void save(Post post){

        postRepository.save(post);
    }

    public void delete(@PathVariable("id") String id){
        postRepository.deleteById(id);
    }
}


