package pub.sha0w.controller;

import pub.sha0w.service.CommaArrayService;
import pub.sha0w.util.CastUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by coco1 on 2017/2/16.
 * 用以实现WebService
 */
@WebServlet("/")
public class CommaArrayController extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse rep){
        String message = req.getParameter("l");
        int ret = CommaArrayService.Service(message);
        try {
            PrintWriter out = rep.getWriter();
            out.print(ret);
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
