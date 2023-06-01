package co.jh.notice;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.jh.notice.common.Command;
import co.jh.notice.main.command.MainCommand;

/**
 * Servlet implementation class FrontController
 */
@WebServlet("*.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HashMap<String,Command>map=new HashMap<>();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// 최초에 1번만 실행되는 메서드 요청한 것을(맵에) 담아둠
		map.put("/main.do", new MainCommand());//처음 들어오는 페이지를 돌려준다
		
		
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//request분석, 수행할 command 찾기, 결과return 
		request.setCharacterEncoding("utf-8");//한글깨짐방지
		String uri=request.getRequestURI();//request객체의 requestURI갖고오기
		String contextPath=request.getContextPath();//request객체의 contextpath(root를 의미함)
		String page=uri.substring(contextPath.length());//실제요청
		
		Command command=map.get(page);
		String viewPage=command.exec(request, response);
		
		if(!viewPage.endsWith(".do")) {
			viewPage="WEB-INF/views/"+viewPage+".jsp";
		}else {
			response.sendRedirect(viewPage); //위임
		}
		
		RequestDispatcher dispatcher= request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
