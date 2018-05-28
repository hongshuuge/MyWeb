<%@page contentType="text/html; charset=gbk" import="Jerry.User" %>
  
  <!-- 内嵌java代码，主要控制逻辑跳转 -->
  <%
      String username = request.getParameter("username");
      String pwd = request.getParameter("pwd");
      if(username.equals("a")&&pwd.equals("1")){
          User u = new User(username,pwd);
          session.setAttribute("username",username);
        pageContext.forward("ok.jsp");
     }else{
         pageContext.forward("Hello.jsp");
     }
 %>l>