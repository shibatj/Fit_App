package java_class;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MemberManager {
    
    static Member[] mem = new Member[100];
    static int index = 0;
    
//    public static void addMember(String name, String email, String phone, String location, String Mem_pac, String membership, int totalPrice) {
//        Member newMember = new Member(name, email, phone, location, Mem_pac, membership, totalPrice);
//        mem.add(newMember);
//        System.out.println("Member added: " + newMember.getID() + " - " + newMember.getName());
//    }
    
//    public static void showAllMembers() {
//        if (members.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No members found.");
//        } else {
//            StringBuilder memberInfo = new StringBuilder();
//            for (Member member : members) {
//                memberInfo.append("\nID : ").append(member.getID())
//                          .append("\nName : ").append(member.getName())
//                          .append("\nLockerID : ").append(member.getLockerID())
//                          .append("\nPackage : ").append(member.getPackage())
//                          .append("\nMemberShip : ").append(member.getMembership())
//                          .append("\nTotal Price : ").append(member.getTotalPrice())
//                          .append("\n--------------------------");
//            }
//            JOptionPane.showMessageDialog(null, memberInfo.toString(), "All Members", JOptionPane.INFORMATION_MESSAGE);
//        }
//    }
    
    public void input(Member m){
        mem[index++] = m;
    }
    public Member[] getMember(){
        return mem;
    }
    public int getIndex(){
        return index;
    }
    
    public Member search(int id){
        boolean check = false;
        int i = 0;
        while((i<index)&&(!check)){
            if(mem[i].getID() == id){
                check = true;
            }else{
                i++;
            }
        }
        if(check){
            return mem[i];
        }else{
            return null;
        }
    }
}