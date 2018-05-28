 <%@ page contentType="text/html; charset=gbk" import="Jerry.User"%>
  
  <html>
      <head>
          <title>login</title>
      </head>
      <body style="background:url(image/ab.jpg)">
          <!-- <p1>test!</p1> -->
          <h2 align="center">»¶Ó­µÇÂ¼</h2>
         <form name=loginForm action="handlelogin.jsp" method=post>
         <table align="center">
             <tr>
                 <td>ÓÃ»§Ãû£º</td><td><input type=text name=username /></td>
             </tr>    
             <tr>
                 <td>ÃÜÂë£º</td><td><input type=password name=pwd /></td>
             <tr/>            
             <tr>
             <td colspan="2",align="center">
                 <input type="submit" value="submit" />
                <input type="reset" value="reset" />
            </td>
             </tr>        
         </table>
         
         </form>
     </body>
      </html>