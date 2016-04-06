/**
  * Created by yiyitan on 3/23/2016.
  */
object Test extends App {

  // declare multiple different types of vars
  var (x, y, c) = (1,2, true)

  // pass a function with specific params
  def doWithTwoAndThree (f: (Int, Int) => Int) = { // define a function (Int, Int) = > Int, then param1 is 2, param2 is 3
    f (2,3)
  }
  val multiResult = doWithTwoAndThree((x, y) => x * y); // pass function (x, y) => (x * y) to it
  val addResult = doWithTwoAndThree((x , y) => x + y);
  val call = doWithTwoAndThree(_ + _);
  println(multiResult);
  println(addResult);
  println(call);

  // pass params
  // def method
  def funcAdd(x: Int, y: Int) = x + y

  // use anoy function  (x: Int, y: Int) => x + y
  // var can be assigned as a function
  // val can be assigned as a function
  var funcAddVar = (x : Int,  y: Int) => x + y
  val funcAddVal = (x : Int,  y: Int) => x + y

  println("function add: " + funcAdd(3,4))
  println("val function add:" + funcAddVal(3,4))
  println("var function add:" + funcAddVar(3,4))


  def add(x: Int, y: Int) = x + y
  def add2(x : Int, y : Int) : Int = {
    return x + y
  }

  // return keyword is optional
  // non-recursive method do not need to declare return
  def add3(x: Int, y: Int) : Int = {
    x + y
  }

  def add4(x : Int, y : Int) : Int = x + y // if just one line, do not need {}

  // anonymous function
  (x : Int,  y : Int) => x + y

  // ????
  val add3:(Int,Int)=>Int = _ + _ //alternate way
  val add4 = (_ + _):(Int,Int)=>Int //alternate way, rare

  // return multiple varaibles
  def swap(x: String,  y: String) = (y, x)
  val (a, b) = swap("hello", "world")
  println(a, b)

  // declare tuple
  var tuple = (1, "hello", 3.4) // type: [Int, String, double]
  // to access, can use method: tuple._1
  println(tuple._1)

  // while
  var j = 0
  var sum_1 = 0
  while (j < 10) {
    sum_1 = sum_1 + j;
    j = j + 1
  }
  // for loop
  var sum = 0
  for (i <- 0 until 10) // for (int i = 0 ; i <= 10 ; )
    sum = sum + i

  // loop without while nor for
  (1 until 10).sum

  // Arrays
  val array1 = Array(1,2,3)
  val array2 = Array("a", 2, true)
  // access array
  val itemAtIndex0 = array1(0)
  // find index
  val index = array1.indexOf(1)
  // concat array
  val concatenated = "prepend" +: (array1 ++ array2) :+ "append"
  // diff array
  val diffArray = Array(1,2,3,4).diff(Array(2,3)) // output: Array(1,4)

  // case
  val selection = 1
  selection match {
    case 1 => println("select number 1")
    case 2 => println("select number 2")
    case 3 => println("select number 3")
  }

  // list
  var list = List(1, "hello", 2)
  var firstItem = list(0)
  // prepend a element before list
  0 :: list 
  0 +: list
  // append a element after list
  list :+ 4


  // concate list
  var list_2 = List(3, 4)
  var concate_list = list ++ list_2
  var concate_list_2 = list ::: list_2
  var personList = List(("Alicia", 3), ("Bob", 5))
  // getOrElse: can not find. print out ("David", 4)
  def findByName(name: String) = personList.find(_._1 == name).getOrElse(("David",4))

  println(findByName("Alicia")._2)

  // set
  //immutable set
  val setInt = Set(1, 2, 3) // Type : Set[Int]
  val setany = Set("a", 2, true)  // Type: Set[Any]
  val mset = mutable.Hashset("a", "b", "c")



}
