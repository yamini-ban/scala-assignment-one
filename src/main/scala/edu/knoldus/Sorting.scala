package edu.knoldus

class Sorting {

  def insertionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
    for (currentElementIndex <- 1 until array.length) {
      val temp = array(currentElementIndex)
      for (partiallySortedElement <- (currentElementIndex-1) to 0 by -1) {
        if(array(currentElementIndex) < array(partiallySortedElement)) {
          array(partiallySortedElement + 1) =  array(partiallySortedElement)
        }
        else {
          array(partiallySortedElement + 1) = temp
//          partiallySortedElement = -1
        }
      }

    }
    array
  }

  def selectionSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic

    array
  }

  def swap(array: Array[Int], leftIndex: Int, rightIndex: Int): Array[Int] ={
    val temp = array(leftIndex)
    array(leftIndex) = array(rightIndex)
    array(rightIndex) = temp
    array
  }

  def sortInBubble(array: Array[Int], startFromIndex: Int, flagSwapped: Boolean): Array[Int]= {
    if (array.length - startFromIndex < 2) {
      array
    }
    else {
      if (array(startFromIndex) > array(startFromIndex + 1)) {
        sortInBubble(swap(array, startFromIndex, startFromIndex + 1), startFromIndex + 1, true)
      } else if (array.length - startFromIndex < 2) {
        if (flagSwapped) sortInBubble(array, 0, false) else array
      }
      else sortInBubble(array, startFromIndex + 1, flagSwapped)
    }
  }


  def bubbleSort(array: Array[Int]): Array[Int] = {
    //todo: Add Logic
//    for (noOfPasses <- 0 to array.length - 2) {
//      for (currentElementIndex <- 0 until array.length - noOfPasses - 1) {
//        if (array(currentElementIndex) > array(currentElementIndex + 1)) {
//          val temp = array(currentElementIndex)
//          array(currentElementIndex) = array(currentElementIndex + 1)
//          array(currentElementIndex + 1) = temp
//        }
//      }
//    }
//    array
    if(array.length <= 1) array else sortInBubble(array, 0, false)

  }

}
