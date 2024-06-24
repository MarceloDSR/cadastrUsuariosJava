
package cadastroclientes;

import java.text.ParseException;
import javax.swing.JFormattedTextField;
import javax.swing.text.MaskFormatter;

public class FormatarCampos {
    
        public void formataCampoNomeFornecedor(JFormattedTextField field) throws ParseException{
    MaskFormatter mask = new MaskFormatter();
    mask.setMask("AAAAAAAAAAAAAAAAAAAAAAAAA");
    mask.install(field);
}
       public void formataCampoCPF(JFormattedTextField field) throws ParseException{
    MaskFormatter mask = new MaskFormatter();
    mask.setMask("###.###.###-##");
    mask.install(field);
    }
       
        public void formataCampoPrincipalProdutoFornecido(JFormattedTextField field) throws ParseException{
    MaskFormatter mask = new MaskFormatter();
    mask.setMask("AAAAAAAAAAAAAAAAAAAAAAAAA");
    mask.install(field);
}
}
