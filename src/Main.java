import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("AYI BOGAN RECO24");
        q.add("RESUL24");
        q.add("YAHYA24");

        System.out.println(q.peek());
        System.out.println("---------------");
        System.out.println(q.poll());
        /*Iterator<String> ıtr = q.iterator();
        while (ıtr.hasNext()){
            System.out.println(ıtr.next());
        }*/

        /*for(String stu:q){
            System.out.println(stu);
        }*/
    }
}
