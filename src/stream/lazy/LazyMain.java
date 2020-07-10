package stream.lazy;

import java.util.Arrays;
import java.util.stream.Stream;

public class LazyMain {
    public static void main(String[] args) {
        Stream<Integer> square = Arrays.asList(3, 8, 9, 10, 20, 11, 22)
                .stream()
                .map(it -> {
                    int result = it * it;
                    System.out.println(result);
                    return result;
                });
        System.out.println("내가 제일 먼저 출력됨");
        int total = square
                .mapToInt(a -> a)
                .sum(); // 종료 연산자가 실행 되면 중간 연산자가 실행됨(평가됨)
        System.out.println("total: " + total);
    }
}
