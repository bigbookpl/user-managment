package pl.coderslab.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.logging.Logger;

@WebFilter("/self-care/*")
public class SecurityFilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {

//        Logger log = Logger.getLogger("SECURITY");

        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        HttpServletResponse httpServletResponse = (HttpServletResponse) response;

        HttpSession session = httpServletRequest.getSession();

        if (session != null &&
            session.getAttribute("authorized") != null &&
            session.getAttribute("authorized").equals(true))
        {
            String username = session.getAttribute("username").toString();
            String role = session.getAttribute("role").toString();

            request.setAttribute("username", username);
            request.setAttribute("role", role);

            chain.doFilter(request, response);
        }
        else
        {
            redirectToLoginPage(httpServletRequest, httpServletResponse);
        }
    }

    private void redirectToLoginPage(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws IOException {
        httpServletResponse.sendRedirect(httpServletRequest.getContextPath() + "/auth/login");
    }

    @Override
    public void destroy() {

    }
}
