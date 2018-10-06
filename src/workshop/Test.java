package workshop;


import java.util.*;

public class Test {

    public static void main(String[] args) {
        ArrayList <Integer> a1 = new ArrayList();
        ArrayList <Integer> a2 = new ArrayList();
        generateList(a1,6);
        removeDupl(a1);
        sort(a1);
        generate(a2);
    }

    public static void removeDupl(ArrayList<Integer> a1) {
        Set<Integer> s1 = new HashSet();
        s1.addAll(a1);
        a1.clear();
        a1.addAll(s1);
        for(int i = 0; i < a1.size();i++) {
            System.out.println(a1.get(i));
        }
        System.out.println();
    }

    public static void sort(ArrayList<Integer> a1) {
        Collections.sort(a1);
        for(int i = 0; i < a1.size();i++) {
            System.out.println(a1.get(i));
        }
        System.out.println();
    }

    public static void generate(ArrayList<Integer> a2) {
        boolean valid = false;
        int N=0;
        while (!valid) {
            System.out.println("Enter the size of the bet: ");
            Scanner s1 = new Scanner(System.in);
            N = s1.nextInt();
            s1.close();
            if(N >= 1) {
                valid = true;
            }
            else
                System.out.println("Invalid number!");
        }
        generateList(a2,N);
        removeDupl(a2);
        sort(a2);
    }

    public static void generateList(ArrayList<Integer> a1,int N) {
        int num;
        for (int i = 0; i<N; i++) {
            num = (int) (Math.random() * 48 +1);
            System.out.println(num);
            a1.add(i,num);
        }
        System.out.println();
    }
}
