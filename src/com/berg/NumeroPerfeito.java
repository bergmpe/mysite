package com.berg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NumeroPerfeito extends HttpServlet{

	int numero;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doGet(req, resp);
		//resp.getWriter().print("Digite um n\uc3a9mero: ");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		try{
			numero = Integer.valueOf( req.getParameter("numero") );
		} catch ( NumberFormatException e ){
			e.printStackTrace();
		}
		
		out.println("<html>");
		out.println("<head><title>numero perfeito</head></title>");
		out.println("<body>");
		if(ePerfeito( numero ))
			out.println(" " + numero + " \uc3a9 perfeito.");
		else
			out.println(" " + numero + " n\uc3a3o \uc3a9 perfeito.");
		out.println("</body></html>");
		
	}
	
	public boolean eDivisor(int x, int y){
		return (x % y) == 0;
	}
	
	public boolean ePerfeito(int x){
		int aux = x/2;
		int somaDivisores = 0;
		
		while(aux > 0){
			if( eDivisor(x, aux) ){
				somaDivisores += aux;
			}
			aux--;
		}
		if(x != 0)
			return x == somaDivisores;
		else
			return false;
	}
	
	
}
