package ClassesLogic;

import java.util.*;
public class PremiumUser extends User {
    private List<Stock> subscribedStocks;
    
    public PremiumUser(String username, String password, String fullName, String email, double balance) {
        super(username, password, fullName, email, balance);
        this.subscribedStocks = new ArrayList<>();
    }

    public void subscribeToStock(Stock stock) {
        subscribedStocks.add(stock);
        System.out.println(getUsername() + " subscribed to stock: " + stock.getSymbol());
    }
    
 public void showLineChartForStock(Stock stock) {
        System.out.println("Displaying line chart for stock: " + stock.getSymbol());
        // Code to display line chart for the specific stock
    }
}
