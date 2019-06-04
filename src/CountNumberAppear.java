import java.util.Scanner;

public class CountNumberAppear {
    public static void main(String[] args) {
        String str="Dao Van Dat";
//        char[] charArr=str.toCharArray();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a char that want count: ");
        char c=scanner.next().charAt(0);
        int count=0;
        int i=0;
        while (i<str.length()){
            if (str.charAt(i)== c){
                count++;
            }
            i++;
        }
        //print numberAppear
        System.out.println("Numbers appear of "+c+" is "+count);

    }
}
