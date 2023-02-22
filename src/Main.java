public class Main {
    public static void main(String[] args) {
        //Стоимость билета
        int ticketPrice = 13676;
        //Количество рублей для одной бонусной мили
        int bonusPrice = 20;

        int bonusCount = ticketPrice / bonusPrice;

        System.out.println("Вым начислен бонус в " + bonusCount + " миль.");
    }
}