public class Main {
    public static void main(String[] args) {
        Pies burek = new Pies();
        burek.planet = "Merkury";
        System.out.println(burek.planet);
    }
}
class Pies extends Animals {
    public static String voice(String voice) {
        return voice;
    }
}
class Animals extends Planet {
    public String name;
    public int age;
    private String zoo;
}

class Planet {
   public String planet;
}