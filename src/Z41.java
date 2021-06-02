import java.util.Scanner;

class Number{
    int value;
    Number next;

    public Number(int value, Number next) {
        this.value = value;
        this.next = next;
    }

    @Override

    public String toString(){
        return "Number{ " +
                "value = " + value +
                ", next = " + next +
                " }";
    }
}

public class Z41 {
    static Scanner sc;

    public static Number CreateHead(int n){
        Number head = null;
        for (; n>=1;n--){
            System.out.println("number: ");
            int value = sc.nextInt();
            head = new Number(value, head);
        }
        return head;
    }
    public static int [] findSum(Number head){
        int sum = 0;
        int count = 0;
        Number ref = head;
        while (ref!=null){
            if(ref.value%3==0) {
                sum = sum + ref.value;
                count++;
            }
            ref = ref.next;
        }
        return new int[] {sum, count};
    }
    public static int []findMaxIndexandValue(Number head){
        Number ref = head;
        int n = 1;
        int IndexMax;
        IndexMax = n;
        int valueMax = ref.value;
        while (ref!=null){
            if (ref.value%3==0 && (valueMax<ref.value)){
                valueMax = ref.value;
                IndexMax++;
            }
            ref = ref.next;
        }
        return new int[]{IndexMax, valueMax};
    }

    public static int []findMinIndexandValue(Number head){
        Number ref = head;
        int n = 1;
        int IndexMin;
        IndexMin = n;
        int valueMin = ref.value;
        while (ref!=null){
            if (ref.value%3==0 && (ref.value<valueMin)){
                valueMin = ref.value;
                IndexMin++;
            }
            ref = ref.next;
        }
        return new int[]{IndexMin, valueMin};
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("n: ");
        int n = sc.nextInt();
        Number head = CreateHead(n);
        System.out.println(head);
        int sum = findSum(head)[0];
        int count = findSum(head)[1];
        System.out.println("Sum = " + sum);
        System.out.println("Count = " + count);
        System.out.println("AVG = " + (double)sum/count);
        int IndexMax = findMaxIndexandValue(head)[0];
        int valueMax = findMaxIndexandValue(head)[1];
        System.out.println("max index: " + IndexMax + ", and value: " + valueMax);
        int IndexMin = findMinIndexandValue(head)[0];
        int valueMin = findMinIndexandValue(head)[1];
        System.out.println("min index: " + IndexMin + ", and value: " + valueMin);
    }
}
