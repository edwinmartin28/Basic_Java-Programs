/*Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class*/
class parent{
    void printparent(){
        System.out.println("This is parent class");
    }
}
class child extends parent{
    void printchild(){
        System.out.println("This is child class");
    }
}
class Example_parent_class_extend_child{
    public static void main(String[] args){
        parent p =new parent();
        child c = new child();
        p.printparent();
        c.printchild();
        c.printparent();
    }
}
