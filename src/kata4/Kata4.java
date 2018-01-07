
package kata4;

import java.io.IOException;
import java.util.List;
import kata4.model.Histogram;
import kata4.model.Mail;
import kata4.view.HistogramDisplay;
import kata4.view.MailHistogramBuilder;
import kata4.view.MailListReader;

/**
 *
 * @author geekyman
 */
public class Kata4 {
    
    private String filename;
    private static List<Mail> mailList;
    
    public static void main(String[] args) throws IOException{
        
        new Kata4().exe();
    }
    
    private void exe() throws IOException{
        mainControl();
        mainModel();
    }

    private void mainModel() throws IOException {
        mailList = MailListReader.read(filename);
        
    }

    private void mainControl() {
        filename = "emails.txt";
    }
    
    private static void mainView() {
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();
        
    }




    
}
