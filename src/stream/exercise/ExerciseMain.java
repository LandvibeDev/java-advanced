package stream.exercise;

import java.util.ArrayList;
import java.util.List;

public class ExerciseMain {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(0,"김건희", "컴퓨터공학과", 100, 30, "남자"));
        students.add(new Student(1,"강지수", "토목공학과", 99, 24, "여자"));
        students.add(new Student(2,"남지선", "정보통신공학과", 90, 24, "여자"));
        students.add(new Student(3,"심수연", "전자공학과", 89, 24, "여자"));
        students.add(new Student(4,"고정민", "전기공학과", 50, 23, "여자"));
        students.add(new Student(5,"강보윤", "컴퓨터공학과", 95, 23, "여자"));
        students.add(new Student(6,"곽지원", "컴퓨터공학과", 43, 23, "남자"));
        students.add(new Student(7,"안도영", "전기공학과", 50, 28, "남자"));
        students.add(new Student(8,"이진승", "토목공학과", 10, 25, "남자"));
        return students;
    }

    public static void main(String[] args) {
        List<Student> students = getStudents();
        // 1. 남자들의 이름을 출력

        // 2. 여자들의 이름을 출력

        // 3. 나이 순으로 출력

        // 4. 51점 이상인 사람의 이름을 출력

        // 5. 남자들을 성적순으로 출력

        // 6. 전기공학과 학생 숫자를 출력

        // 7. 컴퓨터공학과인 남자들의 점수 총합을 출력

        // 8. 컴퓨터 공학과 학생들의 평균 나이를 출력

        // 9. 이름과 점수만 갖는 Map으로 생성

        // 10. 여자들의 성적 평균을 소수 1째 자리에서 반올림해서 정수 부분만 출력
    }
}
