public class Main {
    public static void main(String[] args) {

        Toy doll = new Toy(1, "Doll");
        Toy ball = new Toy(2, "Ball");
        Toy bear = new Toy(3, "Bear");
        Toy cubes = new Toy(4, "Cubes");
        Toy bunny = new Toy(5, "Bunny");
        Toy mosaic = new Toy(6, "Mosaic");
        Toy pyramids = new Toy(7, "Pyramids");
        Toy labyrinth = new Toy(8, "Labyrinth");
        Toy constructors = new Toy(9, "Constructors");

        Lottery lottery = new Lottery();
        lottery.add_toy_in_listToy(doll);
        lottery.add_toy_in_listToy(ball);
        lottery.add_toy_in_listToy(bear);
        lottery.add_toy_in_listToy(cubes);
        lottery.add_toy_in_listToy(bunny);
        lottery.add_toy_in_listToy(mosaic);
        lottery.add_toy_in_listToy(pyramids);
        lottery.add_toy_in_listToy(labyrinth);
        lottery.add_toy_in_listToy(constructors);

        lottery.lottteryToy();
        lottery.readFile();

        // lottery.getToys();

        // lottery.getToy_count();
    }
}