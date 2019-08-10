package com.service;

import com.pojo.Book;

import java.util.List;

/**
 * Book服务层接口
 */
public interface BookService {
    /**
     * 查找所有图书
     *
     * @return Book对象集合
     */
    List<Book> getAll();
}
