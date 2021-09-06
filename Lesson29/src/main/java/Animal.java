public class Animal {
    private int id;

    public Animal (int id) {
        this.id = id;
    }

    public Animal() {

    }

    public void eat(){
        System.out.println("Animal is eating...");
    }

    public String toString(){
        return String.valueOf(id);
        }
    }
