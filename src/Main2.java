public class Main2 {
    public static void main(String[] args) {
        Pies2 burek = new Pies2("Puszek", 2);

        System.out.println(burek.name);
        System.out.println(burek.age);
    }
}
class Pies2 {
    public String name;
    public int age;
    public Pies2(String name, int age) {
        this.name = name;
        this.age = age;
    }

}
