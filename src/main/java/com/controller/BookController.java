package com.controller;

import com.pojo.Book;
import com.pojo.User;
import com.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import sun.text.normalizer.NormalizerBase;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 处理图书请求控制器
 */
@Controller
public class BookController {
    //自动注入BookService
    @Autowired
    @Qualifier("bookService")
    private BookService bookService;

    //处理main请求
    @RequestMapping(value = "/main")
    public String main(Model model, HttpSession session
    ) {
        User user = (User) session.getAttribute("user");
        if (user != null) {
            //获取所有图书集合
            List<Book> bookList = bookService.getAll();
            //将图书集合放入到Model中
            model.addAttribute("bookList", bookList);
            //跳转回main
            return "main";

        } else {
            model.addAttribute("message", "请先登录");
        }

        return "loginForm";
    }
}
