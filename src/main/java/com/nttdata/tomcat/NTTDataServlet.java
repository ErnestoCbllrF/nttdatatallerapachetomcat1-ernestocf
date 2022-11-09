package com.nttdata.tomcat;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Primer Servlet
 * @author ernestocf
 *
 */
@WebServlet("/ErnestoServlet")
public class NTTDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * Constructor por defecto
     * @see HttpServlet#HttpServlet()
     */
    public NTTDataServlet() {
        super();
    }

	/**
	 * Esucha peticiones HTTP usando GET
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    @Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("NTT DATA | GET | FUNCIONA PRIMER SERVLET");
	}

	/**
	 * Esucha peticiones HTTP usando POST
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("NTT DATA | POST | FUNCIONA PRIMER SERVLET");
	}

}
