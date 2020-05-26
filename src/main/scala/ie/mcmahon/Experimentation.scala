package ie.mcmahon
import com.typesafe.scalalogging.StrictLogging

object Strings extends App with StrictLogging {
  val life = 42
  println(s"The meaning of life $life")

  // immutable
  val donutsToBuy: Int = 5
  logger.info(s"To Buy 1: $donutsToBuy")

  // mutable
  var favouriteDonut: String = "Glazed Donut"
  logger.info(s"Favourite Donut 1: $favouriteDonut")
  favouriteDonut = "Jam Donut"
  logger.info(s"Favourite Donut 2: $favouriteDonut")

  // assigning null initially...
  var leastFavouriteDonut: String = _
  logger.debug(s"Least Favourite Donut 1: $leastFavouriteDonut")
  leastFavouriteDonut = "Plain Donut"
  logger.info(s"Least Favourite Donut 1: $leastFavouriteDonut")
}

object Types extends App with StrictLogging{
  val donutsBought: Int = 5
  val bigNumberOfDonuts: Long = 100000000L
  val smallNumberOfDonuts: Short = 1
  val priceOfDonut: Double = 2.50
  val donutPrice: Float = 2.50f
  val donutStoreName: String = "allaboutscala Donut Store"
  val donutByte: Byte = 0xa
  val donutFirstLetter: Char = 'D'
  val nothing: Unit = ()

  val types = List(
    donutsBought,
    bigNumberOfDonuts,
    smallNumberOfDonuts,
    priceOfDonut,
    donutPrice,
    donutStoreName,
    donutByte,
    donutFirstLetter,
    nothing
  )

  def output(values: List[Any]) {
    values.map(
      item =>
        logger.info(s" $item: ${item.getClass}")
    )
  }

  output(types)
}

object Maps extends App with StrictLogging {
  // Empty hash table whose keys are strings and values are integers:
  var A:Map[Char,Int] = Map()

  logger.info(s"Initial empty Map - $A: ${A.getClass}")

  // A map with keys and values.
  val  initialColors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF")
  logger.info(s"Logging Map: $initialColors")

  initialColors.map(
    color =>
      logger.info(s"Logging single map value: ${color}")
  )

  // Basic examples of common methods
  val colors = Map("red" -> "#FF0000", "azure" -> "#F0FFFF", "peru" -> "#CD853F")

  // Overall checks of entire map
  logger.info( "Keys in colors : " + colors.keys )
  logger.info( "Values in colors : " + colors.values )
  logger.info( "Check if colors is empty : " + colors.isEmpty )

  // key/value checks of map
  logger.info(s"Checking value of colors with key 'azure' - ${colors("azure")}")
  logger.info(s"Checking value of colors with key 'peru' - ${colors.get("peru")}")
  logger.info(s"Checking value of non-existing color - ${colors.getOrElse("burple", "no match found")}")
  logger.info(s"Checking key of map with value of '#CD853F' - ${colors.filter(_._2 == "#FF0000").map(_._1)}") // List(red)
  logger.info(s"Checking key of map with value of '#CD853F' keys specific - ${colors.filter(_._2 == "#FF0000").keys}") // Set(red)

  // empty check
  val nums: Map[Int, Int] = Map()
  println( "Check if nums is empty : " + nums.isEmpty )

}

object Loops extends App with StrictLogging {

  // for loop execution with a single range
  var a = 0
  for( a <- 1 to 10 ){
    logger.info("Value of loop: " + a )
  }

  // for loop execution with multiple ranges
  var b = 0
  for(
    a <- 1 to 3;
    b <- 4 to 6
  ){
    logger.info( "Value of a: " + a )
    logger.info( "Value of b: " + b )
  }

  // for loop execution with a collection
  val numList = List(3, 6, 9, 12, 15, 18)
  for( value <- numList ){
    logger.info( "Collection Value: " + value )
  }

  // for loop execution with multiple filters
  val numList2 = List(1,2,3,4,5,6,7,8,9,10)
  for( a <- numList2
       if a != 3; if a < 8 ){
    logger.info( "Filtered Value: " + a )
  }

  // while loop execution
  var c = 10
  while( c < 20 ){
    logger.info( "While value: " + c )
    c = c + 1
  }

}

object Matches extends App with StrictLogging {
  import scala.util.Random

  val check: Int = Random.nextInt(10)

  val output = check match {
    case 0 => "zero"
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  logger.info(s"output: $output")

  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case _ => "many"
  }

  val x = matchTest(3)
  val y = matchTest(1)

  logger.info(s"x: $x")
  logger.info(s"y: $y")
}

