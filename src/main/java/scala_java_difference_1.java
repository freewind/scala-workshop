import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class scala_java_difference_1 {

    static class Member {
        public String name;
        public int age;
        public boolean male;
        public String hobby;

        public Member(String name, int age, boolean male, String hobby) {
            this.name = name;
            this.age = age;
            this.male = male;
            this.hobby = hobby;
        }
    }

    private static List<Member> members = Arrays.asList(
            new Member("Juan", 18, false, "looking for true love"),
            new Member("Xinyu", 40, true, "acting as a young boy"),
            new Member("Tong", 25, false, "buying houses"),
            new Member("SunChen", 18, false, "me me da"),
            new Member("Jinwen", 20, true, "meng")
    );

    public static void main(String[] args) {

        // find members whose name has length 4
        List<Member> name4List = new ArrayList<Member>();
        for (Member member : members) {
            if (member.name.length() == 4) {
                name4List.add(member);
            }
        }
        System.out.println(name4List);


        // find young females
        List<String> youngFemaleNames = new ArrayList<String>();
        for (Member member : members) {
            if (member.age < 25 && !member.male) {
                youngFemaleNames.add(member.name + "*");
            }
        }
        System.out.println(youngFemaleNames);

    }


}
