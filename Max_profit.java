package javatestcoding;

import java.util.ArrayList;
import java.util.Comparator;

public class Max_profit {
	ArrayList<Long> incomes = new ArrayList<Long>();

	public long max_profit() {
		
		incomes.sort(new Comparator<Long>() {

			@Override
			public int compare(Long o1, Long o2) {

				long first = (long) o1;
				long second = (long) o2;
				return (int) (-1*(first - second));
			}
		});
        System.out.println(incomes);
        long appcost=incomes.get(0);
        long  current_max_profit=incomes.get(0);
        long max_profit=current_max_profit;
        long current_app_cost=appcost;
        for (int i = 1; i < incomes.size(); i++) {
        	appcost=incomes.get(i);
        	current_max_profit=appcost*(i+1);
        	if(current_max_profit>=max_profit) {
        		max_profit=current_max_profit;
        	    current_app_cost=appcost;
        	}
			
		}
        
        System.out.println("current app price is "+current_app_cost);
        System.out.println("max profit is "+max_profit);
    
 
		return max_profit;
	}

	public static void main(String[] args) {
              Max_profit profitcompute=new Max_profit();
              profitcompute.incomes.add((long) 125);
              profitcompute.incomes.add((long) 12);
              profitcompute.incomes.add((long) 12);
              profitcompute.incomes.add((long) 12);
              profitcompute.incomes.add((long) 113);
              profitcompute.incomes.add((long)74);
              System.out.println(profitcompute.max_profit());
              
	}

}
