import java.util.*;

public class Team {
  private String mName;
  private List<Member> mTeamMembers = new ArrayList<Member>();
  private int mId;
  private static ArrayList<Team> instances = new ArrayList<Team>();

  public Team(String name){
    mName = name;
    mId = instances.size();
    instances.add(this);
  }

  public String getName(){
    return mName;
  }

  public int getId(){
    return mId;
  }

  public static ArrayList<Team> getAll() {
   return instances;
  }

  public void addToTeam(Member newMember){
    mTeamMembers.add(newMember);
  }

  public List<Member> getMembers(){
    return mTeamMembers;
  }

}
