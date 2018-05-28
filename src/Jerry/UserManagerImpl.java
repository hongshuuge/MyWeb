package Jerry;

import java.beans.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;
import com.sun.corba.se.pept.transport.Connection;

public class UserManagerImpl implements UserManager {

	public boolean add(User u) {
		// TODO Auto-generated method stub
        boolean flag = false;  
        Connection conn = null;  
        PreparedStatement pst = null;  
          
        try {  
              
            conn = DBOperator.getconnection();  
            String sql = "insert into t_users (username,password,code) value(?,?,?)";  
            pst = (PreparedStatement) conn.prepareStatement(sql);  
            pst.setInt(1, u.getUsername());  
            pst.setString(2, u.getPassword());  
            pst.setString(3, u.getCode());  
              
            int rows = pst.executeUpdate();  
            if(rows>0){  
                flag= true;  
            }  
              
        } catch (Exception e) {  
            // TODO: handle exception  
            e.printStackTrace();  
        }finally{  
            DBOperator.close(pst, conn);  
        }  
          
          
        return flag;
		//return false;
	}

	@Override
	public boolean addm(int username, String password) {
		// TODO Auto-generated method stub
        boolean flag = false;  
        Connection conn = null;  
        Statement st = null;  
        ResultSet rs = null;  
          
        try {  
              
            conn = DBOperator.getconnection();  
            String sql = "select * from t_users where username="+username;  
            st = (Statement) conn.createStatement();  
            rs = (ResultSet) st.executeQuery(sql);  
              
            while(rs.next()){  
                if (rs.getString("password").equals(password)){  
                    flag = true;  
                }  
            }  
              
              
        } catch (Exception e) {  
            // TODO: handle exception  
            e.printStackTrace();  
        }finally{  
            DBOperator.close(st, rs, conn);  
        }  
          
          
        return flag;  
    } 
		//return false;
	}


