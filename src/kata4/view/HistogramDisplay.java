/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4.view;

import kata4.model.Histogram;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.ui.ApplicationFrame;

public class HistogramDisplay extends ApplicationFrame {
    
    private final Histogram<String> histogram; 
    
    public HistogramDisplay(Histogram<String> histogram){
        
        super("HISTOGRAMA");
        this.histogram = histogram;
        setContentPane(createPanel());
        pack();
        
    }

    private JPanel createPanel() {
        ChartPanel chartPanel =  new ChartPanel(createChart(createDataset()));
        setPreferredSize(new Dimension(500,400));
        return chartPanel;
    }
    
    public void execute (){
        setVisible(true);
    }
    
    private JFreeChart createChart(DefaultCategoryDataset dataSet){
        JFreeChart chart;
        chart = ChartFactory.createBarChart(
                "HistogramaJFreeChart",
                "Dominios email",
                "Nº emails",
                dataSet,
                PlotOrientation.VERTICAL,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled,
                rootPaneCheckingEnabled);
        
        return chart;
    }
    
    private DefaultCategoryDataset createDataset(){
        
        DefaultCategoryDataset dataSet = new DefaultCategoryDataset();
        
        for (String key : histogram.keySet()) {       
            dataSet.addValue(histogram.get(key), "",key);
        }
        
        
        return dataSet;        
    }
    
    
}
