import java.io.*;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class imdownloand {
    public static void main (String[] args){
        try {
            URL url = new URL("https://instagram.ftpe6-1.fna.fbcdn.net/v/t51.2885-15/325820469_588019112654199_5554580756762792323_n.jpg?stp=dst-jpg_e35_p1080x1080&_nc_ht=instagram.ftpe6-1.fna.fbcdn.net&_nc_cat=103&_nc_ohc=HU2cYNyZJD4AX-mwCEa&tn=9lLYTHRYY2PdGBJb&edm=ACWDqb8BAAAA&ccb=7-5&ig_cache_key=MzAyMTE3NTQxNTE0MjA1NzA2Nw%3D%3D.2-ccb7-5&oh=00_AfAM13FdppzLsfxfEVjqy4JCxLOYwZgolhxl5bPFqFx05g&oe=63DD5ECE&_nc_sid=1527a3");
            URLConnection conn = (HttpURLConnection)url.openConnection();
            conn.connect();

            try(BufferedOutputStream bout = new BufferedOutputStream(
                    new FileOutputStream("src/file01/image.jpg"));
            BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
            ){
                byte[] buf = new byte[1024*1024];
                int len;
                while((len = bin.read(buf)) != -1){
                    bout.write(buf,0,len);
                }
                bout.flush();
                System.out.println("Download Finish");

            }catch(Exception e){
                System.out.println(e.toString());
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
