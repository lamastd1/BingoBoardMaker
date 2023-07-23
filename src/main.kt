// package KotlinBingo.src.packageName

// import KotlinBingo.src.Board 
// //import KotlinBingo.src.Piece 

// fun find_dup(array: UByteArray): Boolean {

//   for (i in 0..4) {
//     for (j in 0..4) {
//       if (array[i] == array[j] && i != j) {
//         return true
//       }
//     }
//   }
//   return false
// }

// fun exhauster(array: UByteArray) {
//   print(array)
// }

// fun main() {

//   val runtime = Runtime.getRuntime()
  

  
//   // Creating an instance of MyClass
//   var board_id = 0
//   var rotation = 0

//   // val myObject = Board((board_id), ((board_id) % 5).toUByte())
//   var Boards = Array(15) { Board() }
//   // Accessing properties and calling methods of the object
//   // myObject.numbers 
//   // myObject.generate_random_numbers()
//   // println(myObject.numbers[0][0].space_value)
//   // for (index in Boards.indices) {
//   //   Boards[index].setBoardNum(board_id)
//   //   Boards[index].setRot(rotation % 5)
//   //   Boards[index].bingofy()
//     // print(Boards[index].numbers.space_value)

//     // board_id = board_id + 1
//     // rotation = rotation + 1
//   // } 
//   //myObject.bingofy()

//   val column1set = mutableSetOf<UByteArray>()
//   val column2set = mutableSetOf<UByteArray>()
//   val column3set = mutableSetOf<UByteArray>()
//   val column4set = mutableSetOf<UByteArray>()
//   val column5set = mutableSetOf<UByteArray>()

//   var count = 0
//   for (one in 1..15) {
//     for (two in 1..15) {
//       for (three in 1..15) {
//         for (four in 1..15) {
//           var column3nums: UByteArray = ubyteArrayOf((one + 30).toUByte(), (two + 30).toUByte(), 100u, (three + 30).toUByte(), (four + 30).toUByte())
//           if (find_dup(column3nums) == false) {
//             column3set.add(column3nums)
//           }
//           for (five in 1..15) {
//             var column1nums: UByteArray = ubyteArrayOf(one.toUByte(), two.toUByte(), three.toUByte(), four.toUByte(), five.toUByte())
//             var column2nums: UByteArray = ubyteArrayOf((one + 15).toUByte(), (two + 15).toUByte(), (three + 15).toUByte(), (four + 15).toUByte(), (five + 15).toUByte())
//             var column4nums: UByteArray = ubyteArrayOf((one + 45).toUByte(), (two + 45).toUByte(), (three + 45).toUByte(), (four + 45).toUByte(), (five + 45).toUByte())
//             var column5nums: UByteArray = ubyteArrayOf((one + 60).toUByte(), (two + 60).toUByte(), (three + 60).toUByte(), (four + 60).toUByte(), (five + 60).toUByte())

//             if (find_dup(column1nums) == false) {
//               column1set.add(column1nums)
//             }
//             if (find_dup(column2nums) == false) {
//               column2set.add(column2nums)
//             }
//             if (find_dup(column4nums) == false) {
//               column4set.add(column4nums)
//             }
//             if (find_dup(column5nums) == false) {
//               column5set.add(column5nums)
//             }
//           }
//         }
//       }
//     }
//   }

//   // for (array in column1set) {
//   //   for (element in array) {
//   //     print(element.toString() + " ")
//   //   }
//   //   println()
//   // }
//   // println(column1set.size)

//   val totalMemory = runtime.totalMemory()
//   val freeMemory = runtime.freeMemory()
//   val usedMemory = totalMemory - freeMemory

//   println("Total Memory: $totalMemory bytes")
//   println("Free Memory: $freeMemory bytes")
//   println("Used Memory: $usedMemory bytes")


//   // val memoryUsage = measureMemoryUsage {
//   //   column1set
//   // }
// }

package KotlinBingo.src.packageName

import KotlinBingo.src.Board 
//import KotlinBingo.src.Piece 

fun find_dup(array: IntArray): Boolean {

  for (i in 0..4) {
    for (j in 0..4) {
      if (array[i] == array[j] && i != j) {
        return true
      }
    }
  }
  return false
}

fun exhauster(array: IntArray) {
  print(array)
}

fun main() {

  val runtime = Runtime.getRuntime()
  

  
  // Creating an instance of MyClass
  var board_id = 0
  var rotation = 0

  // val myObject = Board((board_id), ((board_id) % 5).toUByte())
  var Boards = Array(15) { Board() }
  // Accessing properties and calling methods of the object
  // myObject.numbers 
  // myObject.generate_random_numbers()
  // println(myObject.numbers[0][0].space_value)
  // for (index in Boards.indices) {
  //   Boards[index].setBoardNum(board_id)
  //   Boards[index].setRot(rotation % 5)
  //   Boards[index].bingofy()
    // print(Boards[index].numbers.space_value)

    // board_id = board_id + 1
    // rotation = rotation + 1
  // } 
  //myObject.bingofy()

  var column1set: HashSet<IntArray> = HashSet()
  var column2set: HashSet<IntArray> = HashSet()
  var column3set: HashSet<IntArray> = HashSet()
  var column4set: HashSet<IntArray> = HashSet()
  var column5set: HashSet<IntArray> = HashSet()

  for (one in 1..15) {
    for (two in 1..15) {
      for (three in 1..15) {
        for (four in 1..15) {
          var column3nums: IntArray = intArrayOf((one + 30), (two + 30), 100, (three + 30), (four + 30))
          if (find_dup(column3nums) == false) {
            column3set.add(column3nums)
          }
          for (five in 1..15) {
            var column1nums: IntArray = intArrayOf(one, two, three, four, five)
            var column2nums: IntArray = intArrayOf((one + 15), (two + 15), (three + 15), (four + 15), (five + 15))
            var column4nums: IntArray = intArrayOf((one + 45), (two + 45), (three + 45), (four + 45), (five + 45))
            var column5nums: IntArray = intArrayOf((one + 60), (two + 60), (three + 60), (four + 60), (five + 60))

            if (find_dup(column1nums) == false) {
              column1set.add(column1nums)
            }
            if (find_dup(column2nums) == false) {
              column2set.add(column2nums)
            }
            if (find_dup(column4nums) == false) {
              column4set.add(column4nums)
            }
            if (find_dup(column5nums) == false) {
              column5set.add(column5nums)
            }
          }
        }
      }
    }
  }

  // for (array in column1set) {
  //   for (element in array) {
  //     print(element.toString() + " ")
  //   }
  //   println()
  // }
  // println(column1set.size)

  val column1list = column1set.toList()
  column1set.clear()

  val column2list = column2set.toList()
  column2set.clear()

  val column3list = column3set.toList()
  column3set.clear()

  val column4list = column4set.toList()
  column4set.clear()

  val column5list = column5set.toList()
  column5set.clear()

  val totalMemory = runtime.totalMemory()
  val freeMemory = runtime.freeMemory()
  val usedMemory = totalMemory - freeMemory
  
  println("Total Memory: $totalMemory bytes")
  println("Free Memory: $freeMemory bytes")
  println("Used Memory: $usedMemory bytes")

  val size1 = column1list.size
  val size2 = column2list.size
  val size3 = column3list.size
  val size4 = column4list.size
  val size5 = column5list.size

  println("Size of list: $size1")
  println("Size of list: $size2")
  println("Size of list: $size3")
  println("Size of list: $size4")
  println("Size of list: $size5")


  // val memoryUsage = measureMemoryUsage {
  //   column1set
  // }
}

