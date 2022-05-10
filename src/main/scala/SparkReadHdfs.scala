object SparkReadHdfs extends App {

  import org.apache.spark.sql.SparkSession

  val spark = SparkSession
    .builder()
    .appName("Spark read CSV from HDFS")
    .master("local[*]")
    .getOrCreate()

  val people = spark
    .read
    .option("header", value = true)
    .option("inferSchema", value = true)
    .csv("hdfs://localhost:9000/output")

  people.show()

}
