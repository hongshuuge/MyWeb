package Jerry;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class addm extends HttpServlet {
	
		  
		  
	    public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	        doPost(request, response);  
	    }  
	 
	    public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	          
	        request.setCharacterEncoding("utf-8");  
	        response.setCharacterEncoding("utf-8");  
	          
	        int un = Integer.parseInt(request.getParameter("Username"));  
	        String pswd = request.getParameter("Password");  
	        String checkcode = request.getParameter("Checkcode");  
	          
	        String pickcode = (String) request.getSession().getAttribute("piccode");  
	          
	        UserManager um = new UserManagerImpl();  
	         User u = new User();  
	         boolean flag= false;  
	         try {  
	             flag = um.addm(un, pswd);  
	              
	        } catch (Exception e) {  
	            // TODO: handle exception  
	            e.printStackTrace();  
	        }  
	         if(flag&&checkcode.equals(pickcode)){  
	             response.sendRedirect("logchegngong.jsp");  
	         }  
	          
	          
	    }

}
