package com.kr.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kr.web.dao.BusinessPartnersDao;
import com.kr.web.model.BusinessPartners;

/**
 * Servlet implementation class GetAlienController
 */
@WebServlet("/GetAlienController")
public class GetAlienController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAlienController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		int bpID = Integer.parseInt(request.getParameter("bpid"));
		
		BusinessPartnersDao bpDao = new BusinessPartnersDao();
		
		BusinessPartners businessPartners = bpDao.getBusinessPartner(bpID);
		
		request.setAttribute("BusinessPartner", businessPartners);
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplayBPs.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
