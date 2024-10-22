class Furniture {
    private String material;

    public Furniture(String material) {
        this.material = material;
    }

    public void display() {
        System.out.println("Материал: " + material);
    }
}

class Chair extends Furniture {
    private int legs;

    public Chair(String material, int legs) {
        super(material);
        this.legs = legs;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Количество ножек: " + legs);
    }
}

class Table extends Furniture {
    private int legs;

    public Table(String material, int legs) {
        super(material);
        this.legs = legs;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Количество ножек: " + legs);
    }
}

class Sofa extends Furniture {
    private int seats;

    public Sofa(String material, int seats) {
        super(material);
        this.seats = seats;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Количество мест: " + seats);
    }
}

class FurnitureStore {
    private Furniture[] furnitureItems;
    private int count;

    public FurnitureStore(int capacity) {
        furnitureItems = new Furniture[capacity];
        count = 0;
    }

    public void addFurniture(Furniture furniture) {
        if (count < furnitureItems.length) {
            furnitureItems[count++] = furniture;
        } else {
            System.out.println("Магазин переполнен.");
        }
    }

    public void displayAllFurniture() {
        for (int i = 0; i < count; i++) {
            furnitureItems[i].display();
            System.out.println("-" + "-".repeat(20));
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Chair chair1 = new Chair("Дерево", 4);
        Table table1 = new Table("Металл", 3);
        Sofa sofa1 = new Sofa("Кожа", 3);
        FurnitureStore store = new FurnitureStore(3);

        store.addFurniture(chair1);
        store.addFurniture(table1);
        store.addFurniture(sofa1);
        store.displayAllFurniture();
    }
}

