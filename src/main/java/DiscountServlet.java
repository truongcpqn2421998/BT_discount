import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/DiscountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product=request.getParameter("pd");
        float price=Float.parseFloat(request.getParameter("price"));
        float discount=Float.parseFloat(request.getParameter("discount"));
        float DiscountAmount=price*discount*0.1f;
        float DiscountPrice=price-DiscountAmount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h3>San pham: "+product+"</h3>");
        writer.println("<h3>Gia ban dau:" +price+"</h3>");
        writer.println("<h3>Tien triet khau: "+DiscountAmount+"</h3>");
        writer.println("<h3>gia sau triet khau: "+DiscountPrice+"</h3>");
        writer.println("</html>");
    }
}
