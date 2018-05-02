import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2018/5/1.
 */
public class functionCollection {
    //对集合进行字符串比较
    public void compareStrings(List<String> collections){
      Collections.sort(collections,(s1,s2)-> s1.compareTo(s2));
    }
    //循环打印
    public void printlnCollection(List<String> collections){
        collections.forEach(n->System.out.println(n));
    }
}
