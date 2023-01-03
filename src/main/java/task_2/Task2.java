package task_2;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,3};
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        Arrays.stream(arr)
                .forEach(e -> {
                    map.merge(e, 1, (i1, i2) -> i1 + i2);
                    if(map.values().stream().reduce((a,b) -> a + b).get() == arr.length){
                        try{
                            if(!map.containsValue(1)){
                                throw new MyException("There is no one of a number that occurs once.");
                            }
                            else{
                                map.forEach((key, val) ->{
                                    if(val == 1)
                                        list.add(key);
                                });
                            }
                        }
                        catch (MyException ex){
                            System.out.println(ex);
                        }
                    }
                });
        System.out.println(list);
    }
}
