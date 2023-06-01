package co.jh.prj;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")//annotation으로 서블릿임을 알려주기(/호출명)
//web.xml에서도 설정가능



public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		
//
//		
//		
//		response.getWriter().append("Served at: ").append(request.getContextPath());
//	}이렇게하면 contextpath가 출력됨

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//form에 넣어서 보내기 때문에 주소창에 해당 내용이 노출되지 않음(http의 form)
		
		
		
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=UTF-8");//한글 깨짐 방지
		response.setCharacterEncoding("utf-8");//한글 깨짐 방지
		PrintWriter out=response.getWriter();
		out.append("<h1>하하하하하하하하하하시간태우기</h1>");
		out.append("<h1>그치만 시간 안 가쥬?</h1>");
		out.append("<h1>내가 졌죠?</h1>");
		out.append("<h1>어쩔 수 없죠?</h1>");
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}


