package com.dao;

import com.pojo.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface BookMapper {
    @Select("SELECT *from  tb_book")
    List<Book> findAll();
}
