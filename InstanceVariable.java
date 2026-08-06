public class InstanceVariable
 {
    int x = 100;
    public void show()
    {
        System.out.println("inside show method, x = " +x); x = x + 100;
    }
    public void display()
    {
        System.out.println("inside display method, x = " +x);

    }
       public static void main(String args[])
    {
        InstanceVariable obj = new InstanceVariable();
    obj.show();
    obj.display();
}

}