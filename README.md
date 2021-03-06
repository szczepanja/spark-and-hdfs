# Spark SQL and HDFS

## Notes:

### Copy the input files into the distributed filesystem:

```
bin/hdfs dfs -mkdir /input

bin/hdfs dfs -put people.csv /input
```

```
➜  hadoop bin/hdfs dfs -ls /input

Found 1 items
-rw-r--r--   1 szczepanja supergroup         45 2022-05-09 16:29 /input/people.csv
```

### Create JAR in project directory EVERYTIME you do update in code:

```
sbt package
```

### Build app with Spark Submit

```
bin/spark-submit \
--class SparkReadHdfs \
/mnt/c/projects/spark-and-hdfs_2.12-0.1.0-SNAPSHOT.jar
```

- Output:

```
+---+-----+
| id| name|
+---+-----+
|0.0| Anja|
|1.0|Pawel|
|2.0|Janek|
|3.0| Asia|
+---+-----+
```

### Build Spark on YARN

```
./bin/spark-submit \
--master yarn \
/mnt/c/projects/spark-and-hdfs_2.12-0.1.0-SNAPSHOT.jar \
hdfs://localhost:9000/output
```
