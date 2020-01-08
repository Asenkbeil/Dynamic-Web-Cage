package hello;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletResponse;
//import javax.annotation.Generated;
//import javax.websocket.server.PathParam;

import org.apache.tomcat.util.http.fileupload.IOUtils;
//import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PictureController {

    @RequestMapping(value="/cage/{filePath}", method=RequestMethod.GET)
    public void getImage(HttpServletResponse response, @PathVariable String filePath) throws IOException {
        File file = new File(filePath);
        if(file.exists()) {
            String contentType = "application/octet-stream";
            response.setContentType(contentType);
            OutputStream out = response.getOutputStream();
            FileInputStream in = new FileInputStream(file);

            IOUtils.copy(in, out);
            out.close();
            in.close();
        }
        else {
            System.out.println("this is me saying the exception was thrown");
            throw new FileNotFoundException();
        }
    }
   

}