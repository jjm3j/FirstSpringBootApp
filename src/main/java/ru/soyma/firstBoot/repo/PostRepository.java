package ru.soyma.firstBoot.repo;

import org.springframework.data.repository.CrudRepository;
import ru.soyma.firstBoot.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {

}
