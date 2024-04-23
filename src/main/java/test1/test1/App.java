package test1.test1;

import java.io.File;
import java.io.FileInputStream;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
        System.out.println("Hello World!");

        File file = new File("C:\\Users\\Luiz Guilherme\\Documents\\Projetos\\projetointegrador\\data\\p21.pdf");

        try (PDDocument doc = Loader.loadPDF(file)) { 
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(doc);
            System.out.println(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
