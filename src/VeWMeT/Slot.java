
package VeWMeT;


public class Slot {
    String data;
    Id[] IdData =new Id[10];

    public String toString(int m,int n) {
        return "{" +(m+5)+"~"+(n+6) + '}';
    }

    public void setData(int i,int j){
        String x=toString(i,j);
        this.data = x;
    }
  
    
}
