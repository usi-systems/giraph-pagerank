Build docker image (run in parent dir with Dockerfile):

    cd giraph-pagerank
    docker build -t giraph-docker .

Start the container:

    docker run --volume $HOME:/myhome --rm --interactive --tty giraph-docker /etc/giraph-bootstrap.sh -bash

The following commands should all be run inside the container.

Compile our PageRank example:

    cd $GIRAPH_HOME/pagerank
    make

Copy the sample input into HDFS:

    $HADOOP_HOME/bin/hdfs dfs -put $GIRAPH_HOME/tiny-graph.txt /user/root/input/tiny-graph.txt

Run the example:

    $HADOOP_HOME/bin/hadoop jar myjar.jar org.apache.giraph.GiraphRunner PageRank --yarnjars myjar.jar --workers 1 --vertexInputFormat org.apache.giraph.io.formats.JsonLongDoubleFloatDoubleVertexInputFormat --vertexInputPath /user/root/input/tiny-graph.txt -vertexOutputFormat org.apache.giraph.io.formats.IdWithValueTextOutputFormat --outputPath /user/root/output

Check the output:

    $HADOOP_HOME/bin/hdfs dfs -cat /user/root/output/part-m-00001

To run it again, make sure the `output` dir is removed first:

    $HADOOP_HOME/bin/hdfs dfs -rm -r /user/root/output/


