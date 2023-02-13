package ru.soyma.firstBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.soyma.firstBoot.models.Post;
import ru.soyma.firstBoot.repo.PostRepository;

import java.util.ArrayList;
import java.util.Optional;

@Controller
public class BooksBlogController {
    @Autowired
    private PostRepository postRepository;
    @GetMapping("/blog")
    public String booksBlog(Model model) {
        Iterable<Post> posts = postRepository.findAll();
        model.addAttribute("posts",posts);
        return "blogBooks";
    }
    @GetMapping("/blog/add")
    public String booksBlogAdd(Model model) {
        return "blogAdd";
    }
    @PostMapping("/blog/add")
    public String bookPostBlogAdd(@RequestParam String nameBook, @RequestParam String surnameAuthor,
                                  @RequestParam String nameAuthor, @RequestParam String patronymicAuthor, Model model) {
        Post post = new Post(nameBook, surnameAuthor, nameAuthor, patronymicAuthor);
        postRepository.save(post);
        return "redirect:/blog";
    }

    @GetMapping("/blog/{id}")
    public String bookBlogDetails(@PathVariable(value = "id") long blogId, Model model) {
        Optional<Post> post = postRepository.findById(blogId);
        ArrayList<Post> res = new ArrayList<>();
        post.ifPresent(res::add);
        model.addAttribute("post",res);
        return "blogDetails";
    }
}