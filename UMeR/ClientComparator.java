import java.util.Comparator;
/**
 * Write a description of class ClientComparator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClientComparator implements Comparator<Client>
{
    public int compare(Client c1, Client c2){
      if(c1.getMoneySpent() > c2.getMoneySpent())
        return 1;
      if(c1.getMoneySpent() == c2.getMoneySpent())
        return 0;
      else return -1;
    }
}