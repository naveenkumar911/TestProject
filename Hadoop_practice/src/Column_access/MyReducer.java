package Column_access;

import java.io.IOException;

import org.apache.hadoop.io.DoubleWritable;
//import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class MyReducer extends Reducer<Text,Text,Text,DoubleWritable> {

	public void reduce(Text key, Iterable<Text> values,Context context) throws IOException, InterruptedException {
		double sum = 0.0;
		for (Text value : values) {
			// converting Text value into String
			String val_str= value.toString();
			
			// converting string into double value and adding it into sum variable
			sum += Double.parseDouble(val_str);
			
		}
	//	String mykey = key.toString().toUpperCase();
		
		
		context.write(key, new DoubleWritable(sum)); 
	}
}
     