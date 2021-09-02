public class Main {
    public static void main(String[] args) {
        String str = new String();
        StringBuilder stringBuilder = new StringBuilder("Java");
        stringBuilder.deleteCharAt(1);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
    }
}