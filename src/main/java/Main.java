import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File estrellas=new File(System.getProperty("user.dir")+"/src/main/java/sterne.jpg");
        File newImg=new File(System.getProperty("user.dir")+"/src/main/java/imaxenova.jpg");

        BufferedInputStream leer=new BufferedInputStream(new FileInputStream(estrellas));
        BufferedOutputStream escribir=new BufferedOutputStream(new FileOutputStream(newImg)); //if true añadir

        int byteToByte;

        while ((byteToByte=leer.read())!=-1){
            escribir.write(byteToByte);
        }

        escribir.close();
        leer.close();
    }
}
