package Column_access;

import java.io.IOException;
//import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class MyMap extends Mapper<LongWritable, Text, Text, Text>{
	
		public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
	
			String line = value.toString();
			String lineParts[] = line.split(",");
			//dex2 = lineParts[2];
			//dex3 = lineParts[3];
		
				String my_id = lineParts[2];
				String my_expense = lineParts[3];
				//xt OutKey = new Text(SingleWord);
				//tWritable One = new IntWritable(1);
				context.write(new Text(my_id),new Text(my_expense));
		}
	}
