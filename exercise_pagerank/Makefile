all: myjar.jar

PageRank.class: PageRank.java
	javac -cp /usr/local/giraph/giraph-examples/target/giraph-examples-1.1.0-SNAPSHOT-for-hadoop-2.4.1-jar-with-dependencies.jar:$(shell ${HADOOP_HOME}/bin/hadoop classpath) PageRank.java

myjar.jar: PageRank.class
	cp /usr/local/giraph/giraph-examples/target/giraph-examples-1.1.0-SNAPSHOT-for-hadoop-2.4.1-jar-with-dependencies.jar ./myjar.jar
	jar uf myjar.jar PageRank*class


tidy:
	rm -f *class

clean: tidy
	rm -f *.jar
