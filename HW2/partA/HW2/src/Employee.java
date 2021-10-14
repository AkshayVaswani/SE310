public class Employee implements java.io.Serializable{
    String a;
    String b;
    String c;

    public Employee(String aa){
        this.a = aa;

    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getA() {
        return a;
    }
    public String getB() {
        return b;
    }
    public String getC() {
        return c;
    }

}

