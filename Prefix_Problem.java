package Trie;
import java.util.*;
public class Prefix_Problem {
    static class Node{
        Node [] childern = new Node[26];
        boolean eow = false;
        int frequency;
       public  Node(){
            for(int i = 0; i<childern.length; i++){
                childern[i]=null;
            }
            frequency = 1;
        }
    }
    public static Node root = new Node();
    public static void Insert(String str){
        Node curr = root;
        for(int i = 0; i<str.length(); i++){
            int idx = str.charAt(i)-'a';
            if(curr.childern[idx]==null){
                curr.childern[idx]= new Node();
            }else{
                curr.childern[idx].frequency++;
            }
            curr.childern[idx]= curr;
        }
        curr.eow = true;

    }
    public static void main(String args []){
        String arr[] = {"Zebra","Dog","Dove","duck"};

    }
}
