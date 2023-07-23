package KotlinBingo.src

import kotlin.random.Random
import KotlinBingo.src.Piece 

class Board {

    var board_num = 0
    var rotation = 0
    // constructor(board_num_: Int, rotation_: UByte) {
    //     val board_num: Int = board_num_
    //     val rotation: UByte = rotation_
    // }
    var numbers = Array(5) { Array(5) { Piece() } }
    // var total_called = 1

    fun setBoardNum(num: Int) {
        board_num = num
    }

    fun setRot(num: Int) {
        rotation = num
    }

    fun find_dup(array: Array<UByte>, new_entry: UByte): Boolean {

        var i = 0
        while (true) {
            try {
                if (array[i] == new_entry) {
                    return true
                } 
                i = i + 1
            } catch (e: IndexOutOfBoundsException) {
                return false
            }
        }
    }

    fun generate_random_numbers() {

        var cache = Array<UByte>(75) { _ -> 0u }
        
        for (row in 0..4) {
            for (col in 0..4) {

                var random_number = (Random.nextInt(0, 15) + (col * 15) + 1).toUByte()
                while (find_dup(cache, random_number) == true) {
                    random_number = (Random.nextInt(0, 15) + (col * 15) + 1).toUByte()
                }
                numbers[row][col].space_value = random_number
                cache[(row * 5) + col] = random_number
            }
        }
    }

    fun bingofy() {

        for (row in 0..4) {
            for (col in 0..4) {
                if (col != 2) {
                    // if (board_num  )
                    numbers[row][col].space_value = ((15 * col) + row + 1 + board_num).toUByte()
                    print(numbers[row][col].space_value.toString() + " ")
                } else {
                    if (row < 2) {
                        numbers[row][col].space_value = ((15 * col) + row + 1).toUByte()
                    } else if (row == 2) {
                        numbers[row][col].space_value = 100.toUByte() 
                    } else if (row > 2) {
                        numbers[row][col].space_value = ((15 * col) + row).toUByte()
                    }
                    print(numbers[row][col].space_value.toString() + " ")
                }
            }
            println()
        }
        println()
    }
}