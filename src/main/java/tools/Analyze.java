package tools;

import java.util.ArrayList;
import java.util.List;

public class Analyze {
    private  List data = new ArrayList<Integer>();
    private  int[] result = new int[2];
    private int aux;
    private String aux2;
    private int cont = 0;
    private int res = 0;

    public  int[] analyze(int min, int max, int sum) {
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

    private  int getSum() {
        for(int i = 0; i < data.size(); i++){
            res += (int)data.get(i);
        }
        return res;
    }

    private  void saveData(int j) {
        data.add(j);
    }


}
