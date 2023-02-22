public class Main {
    public static void main(String[] args) {
        //Стоимость билета
        int ticket_price = 13676;
        //Количество рублей для одной бонусной мили
        int bonus_price = 20;

        int bonus_count = ticket_price / bonus_price;

        System.out.println("Вым начислен бонус в " + bonus_count + " миль.");
    }
}