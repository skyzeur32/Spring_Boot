package com.microservice.articlesservice.dao;

import com.microservice.articlesservice.model.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArticleDao extends JpaRepository<Article,Integer> {
    public List<Article> findAll();

    public Article findById(int id);
    public Article save(Article article);
    List<Article> findByPrixGreaterThan(int prixLimit);
    List<Article> findByNomLike(String recherche);



}
