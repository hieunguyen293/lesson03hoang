package com.example.demo.Util.JdbcMapper;

import com.example.demo.model.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class BookMapper implements RowMapper {


    @Override
    public Book mapRow(ResultSet resultSet, int i) throws SQLException {
        Book book = new Book(); // temp
        book.setId(resultSet.getInt("id"));
        book.setName(resultSet.getString("name"));
        book.setPrice(resultSet.getInt("price"));
        return book;
    }


}
