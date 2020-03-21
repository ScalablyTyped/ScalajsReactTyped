package typingsJapgolly.jsPriorityQueue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractPriorityQueue[T] extends js.Object {
  /**
    * Returns the number of elements in the queue
    */
  var length: Double
  /**
    * Removes all values from the queue
    */
  def clear(): Unit
  /**
    * Returns the smallest item in the queue and removes it from the queue
    */
  def dequeue(): T
  /**
    * Returns the smallest item in the queue and leaves the queue unchanged
    */
  def peek(): T
  /**
    * Inserts a new value in the queue
    */
  def queue(value: T): Unit
}

object AbstractPriorityQueue {
  @scala.inline
  def apply[T](clear: Callback, dequeue: CallbackTo[T], length: Double, peek: CallbackTo[T], queue: T => Callback): AbstractPriorityQueue[T] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("dequeue")(dequeue.toJsFn)
    __obj.updateDynamic("peek")(peek.toJsFn)
    __obj.updateDynamic("queue")(js.Any.fromFunction1((t0: T) => queue(t0).runNow()))
    __obj.asInstanceOf[AbstractPriorityQueue[T]]
  }
}

