/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san.beer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import san.beer.model.BeerExpert;

/**
 *
 * @author sdeshapriya
 */
public class SelectBeer extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String color = req.getParameter("color");
        BeerExpert beerExpert = new BeerExpert();
        List<String> list= beerExpert.getBandList(color);
        String adminEmail = getServletConfig().getInitParameter("adminEmail");
        req.setAttribute("brands", list);
        req.setAttribute("adminEmail", adminEmail);
        RequestDispatcher dispatcher = req.getRequestDispatcher("result.jsp");
        dispatcher.forward(req, resp);
    }
    
}
