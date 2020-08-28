package android.example.com.mychart;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.formatter.IndexAxisValueFormatter;
import com.github.mikephil.charting.interfaces.datasets.IBarDataSet;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        barChart= (BarChart)findViewById(R.id.bar_chart);
        Legend l = barChart.getLegend();
        ArrayList<BarEntry> barEntries =new ArrayList<>();
        barEntries.add(new BarEntry(0,10f));
        barEntries.add(new BarEntry(1,23f));
        barEntries.add(new BarEntry(2,26.55f));
        barEntries.add(new BarEntry(3,60.47f));
        barEntries.add(new BarEntry(4,44.555f));
        barEntries.add(new BarEntry(5,55.55f));
        barEntries.add(new BarEntry(6,44.555f));
        barEntries.add(new BarEntry(7,90.55f));
        barEntries.add(new BarEntry(8,70f));
        barEntries.add(new BarEntry(9,80.66f));
        barEntries.add(new BarEntry(10,87.66f));
        barEntries.add(new BarEntry(11,77.65f));




        BarDataSet barDataSet= new BarDataSet(barEntries,"mohamed");

        ArrayList<String> arrayList =new ArrayList<>();
        arrayList.add("Jan");
        arrayList.add("Feb");
        arrayList.add("Mar");
        arrayList.add("Apr");
        arrayList.add("May");
        arrayList.add("Jun");
        arrayList.add("Jul");
        arrayList.add("Aug");
        arrayList.add("Sep");
        arrayList.add("Oct");
        arrayList.add("Nov");
        arrayList.add("Dec");



        barChart.setDragXEnabled(true);
        barChart.animateY(4000);
        barDataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        XAxis xAxis = barChart.getXAxis();
        xAxis.setValueFormatter(new IndexAxisValueFormatter(arrayList));

//        xAxis.setGranularity(1);
//        xAxis.setGranularityEnabled(true);
        BarData barData = new BarData(barDataSet);

        barChart.setData(barData);
        barChart.setDragEnabled(true);
        barChart.setTouchEnabled(true);
        barChart.setScaleEnabled(true);
        barChart.setPinchZoom(true);
        barChart.setDoubleTapToZoomEnabled(true);
        barChart.setFitBars(true); // make the x-axis fit exactly all bars
        barChart.setVisibleXRangeMaximum(5.5f);
        barChart.invalidate();
    }
}