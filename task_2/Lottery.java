import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;

public class Lottery {
    private List<Toy> listToys = new ArrayList<>();
    private int toy_count;

    public List<Toy> getToys() {
        return listToys;
    }

    public int getToy_count() {
        System.out.println("Игрушек осталось = " + toy_count);
        return toy_count;
    }

    // добавить игрушку в розыгрыш
    public List<Toy> add_toy_in_listToy(Toy name) {
        listToys.add(name);
        toy_count++;
        return listToys;
    }

    // удалить игрушку из списка по имени
    private List<Toy> delete_toy_in_listToy(Toy name) {
        listToys.remove(name);
        toy_count--;
        return listToys;
    }

    // запись выигрышных игрушек в файл ".txt"
    private void saveInFile() {
        try (FileWriter writer = new FileWriter("win_toys.txt", true)) {
            String text = listToys.get(0).getToy_name();
            writer.write(text + "\n");
            writer.close();
        } catch (Exception ex) {
            System.out.println("Ошибка записи файла");
        }
    }

    // чтение файла с выигранными игрушками
    public void readFile() {
        try {
            FileReader fr = new FileReader("win_toys.txt");
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (Exception ex) {
            // System.out.println("Ошибка чтения файла");
        }
    }

    // Розыгрыш игрушек
    public void lottteryToy() {
        Scanner scanner = new Scanner(System.in);
        int edit = 50;
        System.out.println("");
        System.out.println(
                "------------------------------------------ Розыгрыш игрушек ------------------------------------------");
        System.out.println(
                "Выигрыш по умолчанию 50%, для увеличения шанса, нажмите 1, чтобы оставить по умолчанию, нажмите 2.");
        String editСhance = scanner.nextLine();
        if (editСhance.equals("1")) {
            System.out.println("Введите число от 1 до 100!");
            edit = scanner.nextInt();
        }
        if (edit >= 0 && edit <= 100) {

        } else {
            System.out.println("Вы ввели не верное значение! Попробуйте снова..");
        }
        Random rnd = new Random();
        int num = rnd.nextInt(100);
        if (num > edit) {
            System.out.println("Вы проиграли, попробуйте cнова");
        } else {
            System.out.println("Поздравляю, вы выиграли!!!");
            saveInFile();
            delete_toy_in_listToy(listToys.get(0));
        }

    }
}
