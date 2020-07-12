package stream.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciseMain {

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student(0, "김건희", "컴퓨터공학과", 100, 30, "남자"));
        students.add(new Student(1, "강지수", "토목공학과", 99, 24, "여자"));
        students.add(new Student(2, "남지선", "정보통신공학과", 90, 24, "여자"));
        students.add(new Student(3, "심수연", "전자공학과", 89, 24, "여자"));
        students.add(new Student(4, "고정민", "전기공학과", 50, 23, "여자"));
        students.add(new Student(5, "강보윤", "컴퓨터공학과", 95, 23, "여자"));
        students.add(new Student(6, "곽지원", "컴퓨터공학과", 43, 23, "남자"));
        students.add(new Student(7, "안도영", "전기공학과", 50, 28, "남자"));
        students.add(new Student(8, "이진승", "토목공학과", 10, 25, "남자"));
        return students;
    }

    public static void solveAnswer() {
        List<Student> students = getStudents();
        // 1. 남자들의 이름을 출력
        System.out.println("1. 남자들의 이름을 출력");
        students.stream()
                .filter(std -> std.getGender().equals("남자"))
                .map(student -> student.getName())
                .forEach(name -> System.out.println(name));

        // 2. 여자들의 이름을 출력
        System.out.println("\n\n2. 여자들의 이름을 출력");
        students.stream()
                .filter(std -> std.getGender().equals("여자"))
                .map(student -> student.getName())
                .forEach(name -> System.out.println(name));

        // 3. 나이 순으로 출력
        System.out.println("\n\n3. 나이 순으로 출력");
        students.stream()
                .sorted((std1, std2) -> {
                    return std2.getAge() - std1.getAge();
                })
                .forEach(std -> System.out.println(std.getName() + " " + std.getAge()));

        // 4. 51점 이상인 사람의 이름을 출력
        System.out.println("\n\n4. 51점 이상인 사람의 이름을 출력");
        students.stream()
                .filter(std -> std.getScore() >= 51)
                .forEach(std -> System.out.println(std.getName() + " " + std.getScore()));


        // 5. 남자들을 성적순으로 출력
        System.out.println("\n\n5. 남자들을 성적순으로 출력");
        students.stream()
                .filter(std -> std.getGender().equals("남자"))
                .sorted((std1, std2) -> {
                    return std2.getScore() - std1.getScore();
                })
                .map(student -> student.getName() + " " + student.getScore())
                .forEach(result -> System.out.println(result));

        // 6. 전기공학과 학생 숫자를 출력
        System.out.println("\n\n6. 전기공학과 학생 숫자를 출력");
        long count = students.stream()
                .filter(std -> std.getMajor().equals("전기공학과"))
                .count();
        System.out.println(count);

        // 7. 컴퓨터공학과인 남자들의 점수 총합을 출력
        System.out.println("\n\n7. 컴퓨터공학과인 남자들의 점수 총합을 출력");
        int sum = students.stream()
                .filter(std -> std.getGender().equals("남자"))
                .filter(std -> std.getMajor().equals("컴퓨터공학과"))
                .mapToInt(std -> std.getScore())
                .sum();
        System.out.println(sum);

        // 8. 컴퓨터 공학과 학생들의 평균 나이를 출력
        System.out.println("\n\n8. 컴퓨터 공학과 학생들의 평균 나이를 출력");
        students.stream()
                .filter(std -> std.getMajor().equals("컴퓨터공학과"))
                .mapToInt(std -> std.getAge())
                .average()
                .ifPresent(avg -> System.out.println(avg));

        // 9. 이름과 점수만 갖는 Map으로 생성
        System.out.println("\n\n9. 이름과 점수만 갖는 Map으로 생성");
        Map<String, Object> result = students.stream()
                .collect(Collectors.toMap(Student::getName, Student::getScore));
        System.out.println(result);

        // 10. 여자들의 성적 평균을 소수 1째 자리에서 반올림해서 정수 부분만 출력
        System.out.println("\n\n10. 여자들의 성적 평균을 소수 1째 자리에서 반올림해서 정수 부분만 출력");
        students.stream()
                .filter(std -> std.getGender().equals("여자"))
                .mapToInt(std -> std.getScore())
                .average()
                .ifPresent(avg -> System.out.println(Math.round(avg)));
    }

    public static void solveShortedAnswer() {
        List<Student> students = getStudents();
        // 1. 남자들의 이름을 출력
        System.out.println("1. 남자들의 이름을 출력");
        students.stream()
                .filter(std -> std.getGender().equals("남자"))
                .map(Student::getName)
                .forEach(System.out::println);

        // 2. 여자들의 이름을 출력
        System.out.println("\n\n2. 여자들의 이름을 출력");
        students.stream()
                .filter(std -> std.getGender().equals("여자"))
                .map(Student::getName)
                .forEach(System.out::println);

        // 3. 나이 순으로 출력
        System.out.println("\n\n3. 나이 순으로 출력");
        students.stream()
                .sorted((std1, std2) -> std2.getAge() - std1.getAge())
                .forEach(std -> System.out.println(std.getName() + " " + std.getAge()));

        // 4. 51점 이상인 사람의 이름을 출력
        System.out.println("\n\n4. 51점 이상인 사람의 이름을 출력");
        students.stream()
                .filter(std -> std.getScore() >= 51)
                .forEach(std -> System.out.println(std.getName() + " " + std.getScore()));


        // 5. 남자들을 성적순으로 출력
        System.out.println("\n\n5. 남자들을 성적순으로 출력");
        students.stream()
                .filter(std -> std.getGender().equals("남자"))
                .sorted((std1, std2) -> {
                    return std2.getScore() - std1.getScore();
                })
                .map(student -> student.getName() + " " + student.getScore())
                .forEach(System.out::println);

        // 6. 전기공학과 학생 숫자를 출력
        System.out.println("\n\n6. 전기공학과 학생 숫자를 출력");
        long count = students.stream()
                .filter(std -> std.getMajor().equals("전기공학과"))
                .count();
        System.out.println(count);

        // 7. 컴퓨터공학과인 남자들의 점수 총합을 출력
        System.out.println("\n\n7. 컴퓨터공학과인 남자들의 점수 총합을 출력");
        int sum = students.stream()
                .filter(std -> std.getGender().equals("남자"))
                .filter(std -> std.getMajor().equals("컴퓨터공학과"))
                .mapToInt(Student::getScore)
                .sum();
        System.out.println(sum);

        // 8. 컴퓨터 공학과 학생들의 평균 나이를 출력
        System.out.println("\n\n8. 컴퓨터 공학과 학생들의 평균 나이를 출력");
        students.stream()
                .filter(std -> std.getMajor().equals("컴퓨터공학과"))
                .mapToInt(Student::getAge)
                .average()
                .ifPresent(System.out::println);

        // 9. 이름과 점수만 갖는 Map으로 생성
        System.out.println("\n\n9. 이름과 점수만 갖는 Map으로 생성");
        Map<String, Object> result = students.stream()
                .collect(Collectors.toMap(Student::getName, Student::getScore));
        System.out.println(result);

        // 10. 여자들의 성적 평균을 소수 1째 자리에서 반올림해서 정수 부분만 출력
        System.out.println("\n\n10. 여자들의 성적 평균을 소수 1째 자리에서 반올림해서 정수 부분만 출력");
        students.stream()
                .filter(std -> std.getGender().equals("여자"))
                .mapToInt(Student::getScore)
                .average()
                .ifPresent(avg -> System.out.println(Math.round(avg)));
    }

    public static void main(String[] args) {
        solveAnswer();
        solveShortedAnswer();
    }
}
