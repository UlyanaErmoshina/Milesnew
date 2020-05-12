public class BonusMilesService {
public int calculate (int cost) {
    int price = 1500;
    int PriceOnemile = 20;

    int miles = cost / PriceOnemile;
    return miles;
}
}

