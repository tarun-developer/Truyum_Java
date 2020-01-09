package Test;
import java.io.IOException;  
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;  
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;  
import javax.servlet.http.HttpSession;

import com.truyum.Dao.UserDao;  
public class LoginServlet extends HttpServlet {  
	
	
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)  
                    throws ServletException, IOException {  
    
		response.setContentType("text/html");  
        
		PrintWriter out=response.getWriter();  
        
		request.getRequestDispatcher("link.html").include(request, response);  
          
        String email=request.getParameter("email");  
        String password=request.getParameter("password");  
          
        try {
			if(UserDao.validate(email,password)){  
			out.print("Welcome, "+email);  
			HttpSession session=request.getSession();  
			session.setAttribute("name",email);  
			}  
			else{
				
			    out.print("Sorry, username or password error!");  
			    request.getRequestDispatcher("login.html").include(request, response);  
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        
        out.close();  
    }  
}  