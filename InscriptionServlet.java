import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/InscriptionServlet")
public class InscriptionServlet extends HttpServlet {
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

    // Récupération des données du formulaire
    String nom = request.getParameter("nom");
    String email = request.getParameter("email");
    String motdepasse = request.getParameter("motdepasse");

    // Traitement simple (à remplacer par enregistrement en base de données si besoin)
    response.setContentType("text/html;charset=UTF-8");
    response.getWriter().println("<html><head><title>Inscription</title></head><body>");
    response.getWriter().println("<h2>Bienvenue, " + nom + " !</h2>");
    response.getWriter().println("<p>Ton inscription FSOCIETY est confirmée.</p>");
    response.getWriter().println("<a href='index.html'>Retour à l’accueil</a>");
    response.getWriter().println("</body></html>");
  }
}
