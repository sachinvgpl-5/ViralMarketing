package ServerImp;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class IndividualLayer
 */
@WebServlet("/IndividualLayer")
public class IndividualLayer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndividualLayer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\RAVINDER SINGH\\workspace\\FinalProject\\src\\Cascade\\individualLayer"));
		String line = br.readLine();
		JSONObject jsonVal = null;
		try{
			jsonVal = new JSONObject(line);
		}catch(JSONException e){
			e.printStackTrace();
		}
		response.getWriter().write(jsonVal.toString());
	}
}
