
package ejemplojasper.pkg2;

import javax.swing.WindowConstants;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;


public class EjemploJasper2 {

    public  EjemploJasper2(){
    
    try{
        
            JasperReport report = (JasperReport) JRLoader.loadObject(getClass().getResource("/reports/practica_personas.jasper"));
            JasperPrint jprint = JasperFillManager.fillReport(report, null, PaisesDataSource.getDataSource());
            
            JasperViewer view = new JasperViewer(jprint, false);
            view.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
            view.setVisible(true);
            
            
        }catch(JRException ex){
            ex.getMessage();
        }
    
    
    
    }
 
    public static void main(String[] args) {
        
        EjemploJasper2 jasper = new EjemploJasper2();
  
    }
    
}
