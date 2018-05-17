/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileInteration;

import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 *
 * @author juanvmr
 */
public class FileInterator {
    
    private File filePath;
    private FileWriter fw;
    private FileReader fr;
    private BufferedWriter bfw;
    private BufferedReader bfr;
    
    //private int magicalTries = 0;
    
    public FileInterator(String filePath, boolean append){
        if(filePath.isEmpty()){
            this.filePath = new File("temp.txt");
        }
        else{
            this.filePath = new File(filePath);
        }
        
        try{
            fw = new FileWriter(this.filePath, append);
            fr = new FileReader(this.filePath);
            
            bfw = new BufferedWriter(fw);
            bfr = new BufferedReader(fr);
        }
        catch(java.io.IOException e){
            e.printStackTrace();
        }
    }
    
    public void fileWrite(String word){
        System.out.println("Entrou na escrita");
        System.out.println("Escrita: " + word);
        try{
            bfw.write(word);
            bfw.flush();
        }
        catch(IOException e){
            e.printStackTrace();
            /*if(magicalTries < 5){
                fileWrite(word);
                magicalTries++;
            }
            else{
                magicalTries = 0;
            }*/
        }
    }
    
    public String fileRead(){
        String line;
        String word = new String();
        System.out.println("Entrou na leitura");
        try{
            while((line = bfr.readLine()) != null){
                System.out.println("Linha: " + line);
                word += line;
            }
            System.out.println("Leitura: " + word);
        }
        catch(IOException e){
            e.printStackTrace();
            /*if(magicalTries < 5){
                word = fileRead();
                magicalTries++;
            }
            else{
                magicalTries = 0;
            }*/
        }
        
        return word;
    }
    
    public void writeStackTrace(Exception k){
        System.out.println("Entrou na exception");
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        k.printStackTrace(pw);
        
        fileWrite(sw.toString());
    }
}
