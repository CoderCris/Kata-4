
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

    public static void main(String[] args) throws IOException {
        String filename = "emails.txt";
        List<Mail> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();
    }
    
}
