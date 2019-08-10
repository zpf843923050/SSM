package com.service.impl;

import com.dao.BookMapper;
import com.pojo.Book;
import com.service.BookService;
import com.sun.org.apache.regexp.internal.RE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//将当前类注释为一个spring的bean,名为bookService
@Transactional(propagation= Propagation.REQUIRED,isolation= Isolation.DEFAULT)
@Service("bookService")
public class BookServiceImpl implements BookService {
    //注入BookMapper
    @Autowired
    BookMapper bookMapper;

    /**
     * BookMapper接口的getAll方法实现
     *
     * @return List<Book>
     */
    @Transactional(readOnly=true)
    @Override
    public List<Book> getAll() {
        return bookMapper.findAll();
    }
}
