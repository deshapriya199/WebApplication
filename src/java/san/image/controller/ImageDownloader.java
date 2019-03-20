/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package san.image.controller;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sdeshapriya
 */
public class ImageDownloader extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream os = resp.getOutputStream();
        ServletContext sc = getServletContext();
        InputStream is = sc.getResourceAsStream("/XML_Inbound_Files.zip");
        int read = 0;
        byte[] bytes = new byte[1024];
        while((read=is.read(bytes)) != 1){
            os.write(bytes, 0, read);
        }
        
        os.flush();
        os.close();
    }
    
}
