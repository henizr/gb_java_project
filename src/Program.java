public class Program {
    public static void main(String[] args) {
        Store store = new Store(10, new String[]{"кукла","фигурка","машинка","домино","пазл"});
        store.choosePrizeToy();
        store.choosePrizeToy();
        store.choosePrizeToy();
        store.choosePrizeToy();
        store.getPrizeToy();
        store.getPrizeToy();
        store.getPrizeToy();
    }
}
