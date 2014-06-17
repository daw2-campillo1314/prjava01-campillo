/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prj01.campillo.html;
 import java.awt.Desktop;

import java.io.*;

/**
 *
 * @author ubu64
 */
public class Prj01CampilloHtml {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

File f = new File("fitxer.html");

try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) {

bw.write("<html>");bw.newLine();

bw.write(" <head>");bw.newLine();

bw.write(" <title>");bw.newLine();

bw.write(" Nova p&agrave;gina web");bw.newLine();

bw.write(" </title>");bw.newLine();

bw.write(" </head>");bw.newLine();

bw.write(" <body>");bw.newLine();

bw.write(" Nova p&agrave;gina web de l'Albert Campillo");bw.newLine();

bw.write(" </body>");bw.newLine();

bw.write("</html>");bw.newLine();

bw.close();

}

}

}
