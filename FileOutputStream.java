package mypackage;

public class FileOutputStream {
    public static void main(String []args)
    {
        try{
            FileOutputStream fout=new FileOuputStream("D:\\arya.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}





