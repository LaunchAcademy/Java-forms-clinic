package com.launchacademy.calculator;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.beanutils.BeanUtils;

@WebServlet(urlPatterns = "/sum")
public class SumController extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    RequestDispatcher dispatcher = req.getRequestDispatcher("/views/sum/new.jsp");
    dispatcher.forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    Sum sum = new Sum();
    try {
      BeanUtils.populate(sum, req.getParameterMap());
    }
    catch (IllegalAccessException ex){
      //sout logs
    }
    catch(InvocationTargetException ex){
      //sout logs
    }

    req.setAttribute("sum", sum);
    RequestDispatcher dispatcher = req.getRequestDispatcher("/views/sum/show.jsp");
    dispatcher.forward(req, resp);
  }
}
