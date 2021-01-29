package tools;

import java.util.ArrayList;
import java.util.List;

public class Analyze {
    private  List data = new ArrayList<Integer>();
    private  int[] result = new int[2];
    int aux;
    String aux2;
    int cont = 0;
    int res = 0;

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
        int res = 0;
        for(int i = 0; i < data.size(); i++){
            res += (int)data.get(i);
        }
        return res;
    }

    private  void saveData(int j) {
        data.add(j);
    }


}
