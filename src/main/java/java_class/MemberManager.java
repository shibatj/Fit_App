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
        for (int i = 0; i < mem.size(); i++) { // ใช้ 'mem' แทน 'members'
            if (mem.get(i).getID() == updatedMember.getID()) { // ใช้ '==' แทน '.equals()' เพราะ getID() คืนค่าประเภท int
                mem.set(i, updatedMember); // ใช้ 'mem' แทน 'members'
                saveMembers(); // บันทึกข้อมูลลงไฟล์/ฐานข้อมูล
                return true;
            }
        }
        return false;
    }

    private void saveMembers() {
        // คุณสามารถเขียนโค้ดเพื่อบันทึกข้อมูลที่แก้ไขลงไฟล์ หรือฐานข้อมูล
    }
}
