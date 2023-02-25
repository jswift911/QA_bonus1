public class BonusMilesService {
    public int calculate(int ticketPrice) {
        int bonusPrice = 20;
        return ticketPrice / bonusPrice;
    }
}
