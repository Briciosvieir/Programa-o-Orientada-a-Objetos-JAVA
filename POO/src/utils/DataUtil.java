package src.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {

    public static String converterDataEHora(Date data){
        SimpleDateFormat formatadorDatas = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        return formatadorDatas.format(data);
    }
    public static String converterData(Date data){
        SimpleDateFormat formatadorDatas = new SimpleDateFormat("dd/MM/YYYY ");
        return formatadorDatas.format(data);
    }
    public static String converterHora(Date data){
        SimpleDateFormat formatadorDatas = new SimpleDateFormat("HH:mm");
        return formatadorDatas.format(data);
    }

}
