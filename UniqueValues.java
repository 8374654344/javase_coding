import java.util.*;
import java.util.stream.Collectors;

public class UniqueValues {

    public static void main(String[] args){
        List<String> ov = List.of("ramesh","gongura","kamala","tanshu","tharunika","ramesh","gongura");
        List<String> uv = ov.stream().distinct().toList();
        System.out.println(uv);

    }
}
