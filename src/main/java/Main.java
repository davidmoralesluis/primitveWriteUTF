import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        String cadea="o tempo está xélido";
        File newText=new File(System.getProperty("user.dir")+"/src/main/java/text3.txt");


        DataOutputStream escribir=new DataOutputStream(new FileOutputStream(newText)); //if true añadir
        DataInputStream leer=new DataInputStream(new FileInputStream(newText));


        for (int i = 0; i < 3; i++) {
            escribir.writeUTF(cadea);
            //System.out.println("cadea: "+leer.readUTF());
            System.out.println("escribiendo a cadea: "+cadea);
            System.out.println("tamańo do fichero: "+escribir.size()+" bytes");
        }

        System.out.println("tamaño final do fichero: "+escribir.size()+" bytes");
        System.out.println();
        while (leer.available()!=0){
            System.out.println("quedan "+leer.available()+" bytes");
            System.out.println("cadea: "+leer.readUTF());
        }

        escribir.close();
        leer.close();


    }
}
