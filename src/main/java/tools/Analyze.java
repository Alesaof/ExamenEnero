package tools;

import java.util.ArrayList;
import java.util.List;

public class Analyze {
    private static List data = new ArrayList<Integer>();
    private static int[] result = new int[2];



    public static int[] analyze(int min, int max, int sum) {
        int aux;
        String aux2;
        int cont = 0;

        for(int j = min; j <= max; j++){
            aux2 = j+"";
            aux = aux2.charAt(0) - '0' + aux2.charAt(1) - '0' + aux2.charAt(2) - '0' + aux2.charAt(3) - '0';
            if(aux <= sum) {
                cont++;
                saveData(j);
            }
        }

        result[0] = cont;
        result[1] = getSum();

        return result;
    }

    private static int getSum() {
        int res = 0;
        for(int i = 0; i < data.size(); i++){
            res += (int)data.get(i);
        }
        return res;
    }

    private static void saveData(int j) {
        data.add(j);
    }


}
