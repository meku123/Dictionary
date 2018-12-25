/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dict;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.google.gson.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Michael
 */
public class dictionary extends HttpServlet {

   
  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      PrintWriter out=response.getWriter();
      String word=request.getParameter("word");
      System.out.print(word);
      WordFinder wf=new WordFinder();
      if(wf!=null)
      {
      word w=wf.findWord(word);
      Gson gson=new Gson();
      out.print(gson.toJson(w));
      }     
       
    }

    
}
