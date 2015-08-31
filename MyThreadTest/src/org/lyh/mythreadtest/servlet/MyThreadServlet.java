package org.lyh.mythreadtest.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.lyh.mythreadtest.service.MyService;
import org.lyh.mythreadtest.thread.MyThread;

/**
 * Servlet implementation class MyThreadServlet
 */
@WebServlet("/mythreadservlet")
public class MyThreadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyThreadServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		int stopFlag = Integer.valueOf(request.getParameter("stopFlag"));

		MyService service = new MyService();
		service.runThread(stopFlag);

		response.sendRedirect("/MyThreadTest");
	}
}
