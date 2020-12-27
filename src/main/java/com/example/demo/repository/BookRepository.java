package com.example.demo.repository;

import com.example.demo.Util.JdbcMapper.BookMapper;
import com.example.demo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Book findById(int id){
        String sql = "Select * from book where id = :?";
        Object[] params = {id};
        Book book =(Book) jdbcTemplate.queryForObject(sql, new BookMapper(), params);
        return book;


    }

}
