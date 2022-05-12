import org.scalatest._
import flatspec._
import matchers._
import org.apache.spark.sql.SparkSession

class SparkReadHdfsTest extends AnyFlatSpec with should.Matchers {

  "SparkReadHdfs" should "execute main" in {
    implicit val spark: SparkSession = SparkSession
      .builder()
      .master("local[*]")
      .appName("Spark read CSV from HDFS")
      .getOrCreate()

    import spark.implicits._

    val actual = SparkReadHdfs.loadFile("src/test/resources/input.txt").as[String].collect()
    val expected = Seq("HELLO WORLD")

    actual should contain theSameElementsAs expected
  }

}
