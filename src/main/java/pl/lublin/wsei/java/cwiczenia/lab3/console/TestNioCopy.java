package pl.lublin.wsei.java.cwiczenia.lab3.console;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class TestNioCopy {
    public static void main(String[] args) throws IOException {
        //long startTime = System.currentTimeMillis();
        long startTime = System.nanoTime();
//      Path oryginal = Paths.get("sample_1920×1280.tiff");
//      Path kopia = Paths.get("img_copy2.tiff");
//      Files.copy(oryginal, kopia, StandardCopyOption.REPLACE_EXISTING);
        File oryginal = new File("sample_1920×1280.tiff");
        File kopia = new File("img_copy2.tiff");
        Files.copy(oryginal.toPath(), kopia.toPath());
        System.out.println("Czas kopiowania: " + (float)(System.nanoTime()-startTime)/1000000 + " ms");
    }
}
