package com.ll.sb231127.domain.article.article.articleTag.service;

import com.ll.sb231127.domain.article.article.articleTag.entity.ArticleTag;
import com.ll.sb231127.domain.article.article.articleTag.repository.ArticleTagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleTagService {
    private final ArticleTagRepository articleTagRepository;

    public List<ArticleTag> findByAuthorId(long autorId) {
        return articleTagRepository.findByArticle_authorId(autorId);
    }
}