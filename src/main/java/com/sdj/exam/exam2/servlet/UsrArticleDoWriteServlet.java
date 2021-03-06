package com.sdj.exam.exam2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/usr/article/doWrite")
public class UsrArticleDoWriteServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 들어오는 파리미터를 UTF-8로 해석
		request.setCharacterEncoding("UTF-8");

		// 서블릿이 HTML 파일을 만들때 UTF-8 로 쓰기
		response.setCharacterEncoding("UTF-8");
		// HTML이 UTF-8 형식이라는 것을 브라우저에게 알린다.
		response.setContentType("text/html; charset=UTF-8");

		//write.jsp에서 잘 넘어오는지 확인 하는 코드
		String title=request.getParameter("title");
		String body=request.getParameter("body");
		
		
		response.getWriter().append(title + "<br>");
		
		response.getWriter().append(body + "<br>");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
