public class Main {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("Hello");
        String value = box.get();
        System.out.println(value);
    }

}
