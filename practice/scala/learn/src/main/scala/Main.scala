import scala.util.Random
object Main extends App {
  var a: Int = 1
  a = 2

  // immutable variable
  val b: Int = 1
  var c = 2

  var d: Long = 1
  var e: Float = 1.4f
  var f: Double = 2.5

  var g: BigInt = 100
  var h: BigDecimal = 200

  var i: Boolean = true

  a += 1
  println(a)
  a -= 100
  println(a)

  val a1, a2, a3: Int = 300
  println(a1)
  println(a2)
  println(a3)

  var string1: String = "Hello"
  var string2 = ", world"

  println(string1 + string2)
  println(string1.charAt(0))

  var coordinates = (5.6, 7.8)
  println(coordinates)

  var another = ("Hello", 5, true)
  println(another)

  var person = ("James", 25)
  var (name, age) = person

  println("name" + name, "age" + age)

  val firstName = "James"
  val lastName = "Bond"

  println(s"My name is $firstName $lastName")

  println(s"Random number is ${Random.nextInt(100)}")

  val const = {
    1337
  }

  // println(const)

}
