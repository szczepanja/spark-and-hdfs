import org.apache.spark.sql.SparkSession
import org.apache.spark.sql.DataFrame

object SparkReadHdfs {
  def main(args: Array[String]): Unit = {

    val path = "hdfs://localhost:9000/data"

    implicit val spark: SparkSession = SparkSession
      .builder()
      .appName("Spark read CSV from HDFS")
      .getOrCreate()

    val output = loadFile(path)

    output.show
  }

  def loadFile(path: String)(implicit spark: SparkSession): DataFrame = {
    spark
      .read
      .text(path)
  }
}
