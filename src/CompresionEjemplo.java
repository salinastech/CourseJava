import java.io.*;
import java.util.zip.*;

public class CompresionEjemplo {
    public static void main(String[] args) throws IOException {
        // --------- Crear ZIP ----------
        try (ZipOutputStream zos = new ZipOutputStream(
                new FileOutputStream("ejemplo.zip"))) {
            ZipEntry entry = new ZipEntry("hola.txt");
            zos.putNextEntry(entry);
            zos.write("¡Hola desde ZIP!".getBytes());
            zos.closeEntry();
        }

        // --------- Leer ZIP ----------
        try (ZipInputStream zis = new ZipInputStream(
                new FileInputStream("ejemplo.zip"))) {
            ZipEntry entry;
            while ((entry = zis.getNextEntry()) != null) {
                System.out.println("Archivo dentro del ZIP: " + entry.getName());
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                byte[] buffer = new byte[1024];
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    baos.write(buffer, 0, len);
                }
                System.out.println("Contenido: " + baos.toString());
                zis.closeEntry();
            }
        }
    }
}
