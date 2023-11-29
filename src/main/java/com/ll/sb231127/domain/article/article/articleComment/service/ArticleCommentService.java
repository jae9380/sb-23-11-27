package com.ll.sb231127.domain.article.article.articleComment.service;

import com.ll.sb231127.domain.article.article.articleComment.repository.ArticleCommentRepository;
import com.ll.sb231127.domain.article.articleComment.entity.ArticleComment;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ArticleCommentService {
    private final ArticleCommentRepository articleCommentRepository;

    public List<ArticleComment> findByAuthorId(long authorId) {
        return articleCommentRepository.findByAuthorId(authorId);
    }
}