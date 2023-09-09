import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void findDuplicatesfrom() {
        List<String> str = new ArrayList<>();
        str.add("ramesh");
        str.add("gongura");
        str.add("ramesh");
        str.add("swetha");
        str.add("tanshu");
        str.add("kamala");
        List<String> dv = str.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .entrySet().stream().filter(k->k.getValue()==1)
                .map(Map.Entry::getKey)
                .toList();
        System.out.println(dv);
    }
    public static void main(String[] args){
  findDuplicatesfrom();
    }
}
