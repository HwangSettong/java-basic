package static2.ex;

public class MathArrayUtils {
    private MathArrayUtils() {
        //private 인스턴스 생성을 막는다.
    }

    public static int sum(int[] values) {
        int total = 0;
        for(int i : values){
            total += i;
        }
        return total;
    }
    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }
    public static int min(int[] values) {
        int minValue = values[0];
        for(int i = 1; i < values.length; i++){
            if(minValue > values[i]){
                minValue = values[i];
            }
        }
        return minValue;
    }
    public static int max(int[] values) {
        int maxValue = values[0];
        for(int i = 1; i < values.length; i++){
            if(maxValue < values[i]){
                maxValue = values[i];
            }
        }
        return maxValue;
    }
}
