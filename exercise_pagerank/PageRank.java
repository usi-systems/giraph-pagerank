import org.apache.giraph.graph.BasicComputation;
import org.apache.giraph.conf.LongConfOption;
import org.apache.giraph.edge.Edge;
import org.apache.giraph.graph.Vertex;
import org.apache.hadoop.io.DoubleWritable;
import org.apache.hadoop.io.FloatWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.log4j.Logger;
 
import java.io.IOException;
 
public class PageRank extends BasicComputation<
    LongWritable, DoubleWritable, FloatWritable, DoubleWritable> {
 
  @Override
  public void compute(Vertex<LongWritable, DoubleWritable, FloatWritable> vertex, 
      Iterable<DoubleWritable> messages) throws IOException {
   
      // TODO: implement me!
  }
}
