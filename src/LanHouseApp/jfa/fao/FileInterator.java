/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LanHouseApp.jfa.fao;

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
    
    public FileInterator(String filePath, boolean append){
        this.filePath = filePath.isEmpty() ? new File("temp.txt") : new File(filePath);
        
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
        try{
            bfw.write(word);
            bfw.flush();
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public String fileRead(){
        String line;
        String word = new String();
        try{
            while((line = bfr.readLine()) != null){
                word += line;
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        
        return word;
    }
    
    public void writeStackTrace(Exception k){
        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);
        k.printStackTrace(pw);
        
        fileWrite(sw.toString());
    }
}
