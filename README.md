# Spark SQL and HDFS

## Notes:

1. Copy the input files into the distributed filesystem:

```
bin/hdfs dfs -mkdir /input

bin/hdfs dfs -put people.csv /input
```

```
➜  hadoop bin/hdfs dfs -ls /input

Found 1 items
-rw-r--r--   1 szczepanja supergroup         45 2022-05-09 16:29 /input/people.csv
```

1. Create JAR in project directory:

```
sbt package
```

1. Build spark application with path to JAR file

```
bin/spark-submit /mnt/c/Users/user/sandbox/spark-and-hdfs/target/scala-2.12/spark-and-hdfs_2.12-0.1.0-SNAPSHOT.jar
```

Output:
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