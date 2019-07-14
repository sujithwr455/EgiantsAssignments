package com.sujith.org;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Font;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

public class PdfGenerator {

    private static final String FILE_NAME = "/Users/sujit/FirstPdf.pdf";

    public static void main(String[] args) {
        writeUsingIText();
    }

    private static void writeUsingIText() {

        Document document = new Document();
        Font f = new Font();
        Paragraph p = new Paragraph();

        try {

            PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));

            //open
            document.open();
            

            
            p.add("Welcome");
            p.setAlignment(Element.ALIGN_CENTER);
            f.setStyle(Font.BOLDITALIC);
            f.setSize(12);
            

            document.add(p);

            Paragraph p2 = new Paragraph();
            p2.add("Line 1: Itext PDF"); //no alignment
            p.setAlignment(Element.ALIGN_CENTER);
            f.setStyle(Font.BOLD);
            f.setSize(12);

            document.add(p2);
            
            
           

            document.add(new Paragraph("Line 2: Itext PDF", f));
            p.setAlignment(Element.ALIGN_CENTER);
            f.setStyle(Font.BOLD);
            f.setSize(12);
            
            //close
            document.close();

            System.out.println("Done");
        } catch (FileNotFoundException | DocumentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}