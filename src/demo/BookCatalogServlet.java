package demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import model.*;

/**
 * Created by 153262Y on 12/8/2016.
 */
@WebServlet(name = "BookCatalogServlet", urlPatterns="/bookcatalog")

public class BookCatalogServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            BookDAO db = new BookDAO();
            List<BooksEntity> list = db.getAllBook();
            request.setAttribute("books", list);
            getServletContext().getRequestDispatcher("/bookcatalog.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ServletException(e);
        }
    }
}