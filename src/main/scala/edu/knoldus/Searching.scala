package edu.knoldus

class Searching {

  def middleElementIndex(arrayLength: Int): Int = {
    arrayLength / 2
  }

  def binarySearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic
    val left = 0
    val right = array.length - 1
    if (left <= right) {
      val midElementIndex = middleElementIndex(array.length)
      val middleElement = array(midElementIndex)
      if(middleElement == elem) {
        true
      }
      else if(middleElement > elem) {
        binarySearch(array.slice(0, midElementIndex), elem)
      }
      else {
        binarySearch(array.slice(midElementIndex + 1, array.length), elem)
      }
    } else {
      false
    }
  }

  def linearSearch(array: Array[Int], elem: Int): Boolean = {
    //todo: Add Logic
    if(array(0) == elem) true else {
      if(array.length == 1) false else linearSearch(array.slice(1, array.length), elem)
    }
  }

}
