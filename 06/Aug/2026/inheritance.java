class SuperClass 
{
    void show() 
    {
        System.out.println("I'm in the super class");
    }
}

class SubClass extends SuperClass {
    void display() {
        System.out.println("I'm in the subclass");
    }

    @Override
    void show() {
        System.out.println("show() overridden in subclass");
    }
}

class inheritance {
    public static void main(String[] args) {
        SubClass obj1 = new SubClass();
        obj1.show();    // inherited and overridden method
        obj1.display(); // subclass-specific method
    }
}
