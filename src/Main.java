import java.util.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    static Integer findCountOfUniquePairs(ArrayList<String>s, int total){
        int count = 0;
        Set<String> st = new HashSet<String>();
        int prev_size = 0;
        for(int i=0; i<total; i++){
            st.add(s.get(i));
            if(st.size()!=prev_size){
                count++;
            }
            prev_size = st.size();
        }
        return count;

    }
    static String findDuplicates(String s){
        StringBuilder result_string = new StringBuilder();
        int sz = s.length();
        Set<Character> st = new HashSet<Character>();
        int prev_size = 0;
        for(int i=0; i<sz; i++){
            st.add(s.charAt(i));
            if(prev_size==st.size()){
                result_string.append(s.charAt(i));
            }
            prev_size = st.size();

        }
        return result_string.toString();
    }
    static ArrayList<Integer> add(ArrayList<ArrayList<Integer>> a, Integer index, ArrayList<Integer>result){
        int size_of_a = a.size();

        for(int i=0; i<size_of_a; i++){
            if(a.get(i).size()>index){
                    int res = result.get(index);
                    result.set(index, res + a.get(i).get(index));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> lol = new ArrayList<ArrayList<Integer>>();

      /* int num;

        // Input the integer
        System.out.println("Enter the size_of_lol: ");

        // Create Scanner object
        Scanner s = new Scanner(System.in);

        // Read the next integer from the screen
        num = s.nextInt();

        int max_size = 0;

        for(int i=0; i<num; i++){
            int n;
            System.out.println("Enter the size of new array : ");
            Scanner ss = new Scanner(System.in);
            n = ss.nextInt();
            if(n>max_size){
                max_size = n;
            }
            ArrayList<Integer> a = new ArrayList<>();
            System.out.println("Enter the numbers in the array : ");
            for(int j=0; j<n; j++){
                int x;
                Scanner temp = new Scanner(System.in);
                x = temp.nextInt();
                a.add(x);
            }
            lol.add(a);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0; i<max_size; i++){
            result.add(0);
        }

        for(int i=0; i<max_size; i++) {
            result = add(lol,i,result);
        }
        System.out.println(result);
        System.out.println(lol);

        String s1 = "abcdsabretsee";
        String res = findDuplicates(s1);

        System.out.println(res);


        int n;
        System.out.println("Enter total number of pairs : ");
        Scanner temp = new Scanner(System.in);
        n = temp.nextInt();

        ArrayList<String> s = new ArrayList<>();
        for(int i=0; i<n; i++){
            String s1,s2;
            Scanner sc= new Scanner(System.in);
            s1 = sc.nextLine();
            Scanner sc2= new Scanner(System.in);
            s2 = sc2.nextLine();
            String ss = s1+s2;
            System.out.println(ss);
            s.add(ss);
        }
        int count = findCountOfUniquePairs(s,n);
        System.out.println(count);



        HashMap<Character, Integer> uni = new HashMap<>();
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        int sz = s.length();

        for (int i = 0; i < sz; i++) {
            if (uni.containsKey(s.charAt(i))) {
                uni.put(s.charAt(i), uni.get(s.charAt(i)) + 1);
            }
            else {
                uni.put(s.charAt(i), 1);
            }
        }
        String res = "";
        for (Map.Entry<Character, Integer> characterIntegerEntry : uni.entrySet()) {
            res+=(((Map.Entry<?, ?>) characterIntegerEntry).getKey());
        }
        System.out.println(res);

       */

        int num,sum;
        System.out.println("enter the number of elements : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println("Enter the sum required : ");
        sum = sc.nextInt();

        HashMap<Integer, Integer> a = new HashMap<>();
        System.out.println("Enter the elements of the array : ");

        for(int i=0; i<num; i++){
            int temp;
            Scanner scc = new Scanner(System.in);
            temp = scc.nextInt();
            if (a.containsKey((sum-temp))) {
                System.out.println(temp+ " " + (sum-temp));
            }
            else {
                a.put(temp, 1);
            }
        }
    }
}