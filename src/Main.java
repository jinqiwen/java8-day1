import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {

      public static void main(String[] args) {
          long startTime=System.currentTimeMillis();

        List<String> names=new ArrayList<String>();
        names.add("hahah");
        names.add("kisai");
        names.add("bsacoa");
          List<Integer> ages=new ArrayList<Integer>();
          int time=100000;
         for(int i=0;i<time;i++){
             ages.add(i);
         }

       functionCollection compare=new functionCollection();
          compare.compareStrings(names);
          Stream a=ages.parallelStream().map(n-> n*2).sorted();

          a.forEach(n->System.out.println(n));
          long endTime=System.currentTimeMillis();
          System.out.print("程序运行时间："+(endTime-startTime)+"ms");
    }
}
