package java_class;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Comparator;

public class MemberManager {

    static LinkedList<Member> mem = new LinkedList<>();
    
    public void input(Member m) {
        mem.add(m);
    }
    
    public LinkedList<Member> getMember() {
        return mem;
    }
    
    public int getIndex() {
        return mem.size();
    }
    
    public Member search(int id) {
        Collections.sort(mem, Comparator.comparingInt(Member::getID));

        int left = 0;
        int right = mem.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int midID = mem.get(mid).getID();

            if (midID == id) {
                return mem.get(mid);
            } else if (midID < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }

    public boolean updateMember(Member updatedMember) {
        for (int i = 0; i < mem.size(); i++) {
            if (mem.get(i).getID() == updatedMember.getID()) {
                mem.set(i, updatedMember);
                return true;
            }
        }
        return false;
    }

    public boolean deleteMember(int id) {
        for (int i = 0; i < mem.size(); i++) {
            if (mem.get(i).getID() == id) {
                System.out.println("Found member with ID: " + id);
                mem.remove(i);
                return true;
            }
        }
        System.out.println("Failed to delete member. Member with ID " + id + " not found.");
        return false;
    }

}
