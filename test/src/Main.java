
public class Main {
    public static void main(String[] args) {

        Person wilson = new Person();
        //原本是每項分開寫
//        wilson.setAge(25);
//        wilson.setGpa(3.95f);
//        wilson.setName("wilson");
//        wilson.setMajor("CS");

        //方法鍊
        wilson.setAge(25).setMajor("CS").setName("Wilson").setGpa(3.95f);
     }
}