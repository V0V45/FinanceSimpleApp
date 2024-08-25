package ru.productstar.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// СЕРВЛЕТ ОБРАБОТКИ ИСКЛЮЧЕНИЙ
@WebServlet(urlPatterns = "/errorhandler") // конфигурируем через аннотацию, и добавлем ему маппинг на /errorhandler 
public class ErrorHandlerServlet extends HttpServlet {
    // переопределяем метод doGet
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int code = (Integer) req.getAttribute("jakarta.servlet.error.status_code"); // код ошибки
        String message = (String) req.getAttribute("jakarta.servlet.error.message"); // описание ошибки
        resp.getWriter().println(String.format("Error (%d) - %s", code, message)); // выводим на экран в форматированном виде
    }
}
