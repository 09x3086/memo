package forGithub;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

import com.google.gson.Gson;

@WebServlet(urlPatterns={"/Servlet"})
public class fxServlet extends HttpServlet implements Servlet {

    private static final long serialVersionUID = 1L;

    public fxServlet() {
        super();
    }
    
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    	
        String resdata = "response data";
        
        Map<String, String> mapMsg = new HashMap<String, String>();
        mapMsg.put("resdata", resdata);
        Gson mapper = new Gson();
        String jsonStr = mapper.toJson(mapMsg);
        response.setContentType("application/json;charset=Shift_JIS");
        PrintWriter pw = response.getWriter();
        pw.print(jsonStr);
        pw.close();
    }

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
    }
}