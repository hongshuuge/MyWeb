/**
 * 
 */
package Jerry;

import javax.servlet.http.HttpServlet;
public class TestServlet extends HttpServlet {
	   public void doGet(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	  
	        doPost(request, response);  
	    }  
	  
	    public void doPost(HttpServletRequest request, HttpServletResponse response)  
	            throws ServletException, IOException {  
	          
	        request.setCharacterEncoding("utf-8");  
	        response.setCharacterEncoding("utf-8");  
	          
	        int username = Integer.parseInt(request.getParameter("Username"));  
	        String pswd = request.getParameter("Password");  
	        String code = request.getParameter("Code");  
	          
	        UserManager um =new  UserManagerImpl();  
	        User u = new  User();  
	          
	        u.setUsername(username);  
	        u.setPassword(pswd);  
	        u.setCode(code);  
	          
	        boolean flag= false;  
	          
	        try {  
	            flag = um.add(u);  
	            if(flag==true){  
	                response.sendRedirect("index.jsp");  
	            }  
	              
	        } catch (Exception e) {  
	            // TODO: handle exception  
	            e.printStackTrace();  
	        } 
}
}
