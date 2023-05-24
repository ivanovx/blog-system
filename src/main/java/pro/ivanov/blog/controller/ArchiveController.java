package pro.ivanov.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.ivanov.blog.entity.Article;
import pro.ivanov.blog.service.ArticleService;

import java.util.List;

@Controller
@RequestMapping("/archive")
public class ArchiveController {
    private final ArticleService articleService;

    public ArchiveController(ArticleService articleService) {
        this.articleService = articleService;
    }

    @GetMapping("/{month}/{year}")
    public String index(@PathVariable int month, @PathVariable int year, Model model) {
        List<Article> articles = this.articleService.getArchive(month, year);

        model.addAttribute("articles", articles);

        return "home/archive";
    }
}
