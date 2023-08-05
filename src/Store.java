import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Store {
    private  List<Toy> allToys;
    private List <Toy> prizeToys;
    private int amount;
    private String[] toysNames;

    public Store(int amount, String[] toysNames) {
        this.allToys = new ArrayList<>();
        this.prizeToys = new ArrayList<>();
        this.amount = amount;
        this.toysNames = toysNames;

        this.fillToysLIst();
    }

    public void add(String toyName, float frequency){
       allToys.add(new Toy(toyName, frequency));
    }

    public void show(){
        for (Toy toy : this.allToys) {
            System.out.println(toy);
        }
    }
    private void fillToysLIst(){
        Random rnd = new Random();
        for(int i = 0; i < this.amount; i++){
            int rndIndex = rnd.nextInt(this.toysNames.length);
            this.add(this.toysNames[rndIndex], 10);
        }
    }


    public void choosePrizeToy(){
        Random rnd = new Random();
        int rndIndex = rnd.nextInt(this.amount);
        this.prizeToys.add(this.allToys.get(rndIndex));
    }

    public void getPrizeToy(){
        if(this.prizeToys.size() != 0){
            Toy prizeToy = this.prizeToys.get(0);
            /*
            * Пишем название в файл
            * */
            try {
                Output.writeData(prizeToy.getName() + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            this.prizeToys.remove(prizeToy);
        }
        else {
            System.out.println("Больше нет игрушек");
        }
    }
}
