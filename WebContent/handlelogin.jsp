<%@page contentType="text/html; charset=gbk" import="Jerry.User" %>
  
  <!-- ��Ƕjava���룬��Ҫ�����߼���ת -->
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