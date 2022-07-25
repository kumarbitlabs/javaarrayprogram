//program that reads data from keyboard and write to a file

import java.io.*;  
public class FileOutput2
{  
    public static void main(String args[])
    {    
      
           try
           {    
             
             DataInputStream dis = new DataInputStream(System.in);
             FileOutputStream fout=new FileOutputStream("./testout2.txt",true);    
             System.out.println("enter some text (@at the end):");   
             char ch;
             //read character into ch using dis then write into file using fout
             //repeat this procedure as long as read character is not equal to @
             while((ch=(char)dis.read())!='@')
               {
                  fout.write(ch); 
               }
                
             fout.close();    
             System.out.println("success...");    
            }
            catch(Exception e)
            {
               System.out.println(e);
            }    
      }    
}  

//note: if you want to append data then use following statement
// FileOutputStream fout=new FileOutputStream("./testout2.txt", true);