
package util;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Format {

    public static Date converterParaSqlDate(String dataTexto) {
        DateTimeFormatter formatoBrasil = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate data = LocalDate.parse(dataTexto, formatoBrasil);

        return Date.valueOf(data);
    }
    
    
    

}
