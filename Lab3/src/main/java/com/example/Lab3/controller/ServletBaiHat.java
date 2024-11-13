package com.example.Lab3.controller;

import com.example.Lab3.model.BaiHat;
import com.example.Lab3.repository.BaiHatRepository;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import lombok.SneakyThrows;
import org.apache.commons.beanutils.BeanUtils;

import java.io.IOException;

@WebServlet(name = "ServletBaiHat",
        value = {
                "/bai-hat/hien-thi",
                "/bai-hat/add"
})
public class ServletBaiHat extends HttpServlet {
    private BaiHatRepository repository = new BaiHatRepository();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/bai-hat/hien-thi")){
            request.setAttribute("listBaiHat", repository.getAll());
            request.getRequestDispatcher("/view/hien-thi.jsp").forward(request, response);
        }
    }

    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("/bai-hat/add")){
            BaiHat bh = new BaiHat();
            BeanUtils.populate(bh, request.getParameterMap());
            repository.add(bh);
            response.sendRedirect("/bai-hat/hien-thi");
        }
    }
}
