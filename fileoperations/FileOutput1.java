import java.io.FileOutputStream;  
public class FileOutput1
{  
    public static void main(String args[])
    {    
           try
           {    
             FileOutputStream fout=new FileOutputStream("./testout.txt");    
             String s="Welcome to bitlabs java learning.";    
             byte b[]=s.getBytes();//converting string into byte array    
             fout.write(b);    
             fout.close();    
             System.out.println("success...");    
            }
            catch(Exception e)
            {
               System.out.println(e);
            }    
      }    
}  