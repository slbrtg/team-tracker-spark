import java.util.ArrayList;
import java.util.List;

public class Member {
  private String mName;
  private String mInterests;
  private static List<Member> instances = new ArrayList<Member>();
}

public Member(String name, String interests){
  mName = name;
  mInterests = interests;
}
