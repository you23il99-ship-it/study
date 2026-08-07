import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapQuiz {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        map.put("자바", 80);
        map.put("DB", 90);
        map.put("HTML", 70);

        // ① "자바"의 점수를 가져오세요.
        Integer score = map.get("자바");

        System.out.println("자바 : " + score);


        // ② 모든 key를 가져오세요.
        Set<String> keySet = map.keySet();


        // ③ keySet을 순회할 Iterator를 만드세요.
        Iterator<String> iterator = keySet.iterator();


        // ④ 다음 key가 있는 동안 반복하세요.
        while(iterator.hasNext()) {

            // ⑤ 다음 key 하나를 꺼내세요.
            String key = iterator.();

            System.out.println(key + " : " + map.get(key));
        }
    }
}