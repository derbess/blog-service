package com.mebr0.dao;

import com.mebr0.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CommentDao extends JpaRepository<Comment, Long> {
    List<Comment> findAllByBlogId(Long blogId);
    Optional<Comment> findByIdAndBlogId(Long id, Long blogId);
}
