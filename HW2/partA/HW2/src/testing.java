import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class testing{

    private static int currentFileCount = 1;

    public static void main(String [] args){

        Employee e = new Employee("testing");

        e.setA("testing1");
        e.setB("testing2");
        e.setC("testing3");



        Employee f = new Employee("testing");

//        f.a = "tesg1";
//        f.b = "testg2";
//        f.c = "teg3";



        try {
            String tempFileOut = "tempOut/Employee.ser";
            FileOutputStream fileOut = new FileOutputStream(tempFileOut);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.println("Serialized Data saved in " + tempFileOut);
            currentFileCount++; //used in repeated runs

        } catch (IOException exception){
            currentFileCount--; //used in repeated runs
            exception.printStackTrace();
        }



    }





//    public static void doingNotTheThing(Employeee)




}




