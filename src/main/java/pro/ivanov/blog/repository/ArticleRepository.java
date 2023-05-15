package pro.ivanov.blog.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import pro.ivanov.blog.entity.Article;

import java.util.List;
import java.util.Optional;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Long> {
    List<Article> findAll();

    Optional<Article> findById(long id);
}