class Superclass {
    String name;

    void show() {
        System.out.println("Animal name is " + name);
    }
}

class Dog extends Superclass {
    void bark() {
        System.out.println("Mother dog barking...");
    }
}

class Babydog extends Dog {
    void weep() {
        System.out.println("Baby dog weeping...");
    }
}

class TestInheritance2 {
    public static void main(String[] args) {
        Babydog b = new Babydog();
        b.name = "Mother dog";
        b.show();
        b.bark();
        b.weep();
    }
}
