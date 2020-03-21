package typingsJapgolly.priorityqueuejs.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueue[T] extends js.Object {
  /**
    * Dequeues the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def deq(): T
  /**
    * Enqueues the element at the priority queue and returns its new size.
    * @param element The element to add
    */
  def enq(element: T): Double
  /**
    * Executes fn on each element.
    * Just be careful to not modify the priorities, since the queue won't reorder itself.
    * @param fn The value to pass to an Array.forEach call
    */
  def forEach(fn: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit]): Unit
  /**
    * Returns whether the priority queue is empty or not.
    */
  def isEmpty(): Boolean
  /**
    * Peeks at the top element of the priority queue.
    * Throws an Error when the queue is empty.
    */
  def peek(): T
  /**
    * Returns the size of the priority queue.
    */
  def size(): Double
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    deq: CallbackTo[T],
    enq: T => CallbackTo[Double],
    forEach: js.Function3[/* value */ T, /* index */ Double, /* array */ js.Array[T], Unit] => Callback,
    isEmpty: CallbackTo[Boolean],
    peek: CallbackTo[T],
    size: CallbackTo[Double]
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deq")(deq.toJsFn)
    __obj.updateDynamic("enq")(js.Any.fromFunction1((t0: T) => enq(t0).runNow()))
    __obj.updateDynamic("forEach")(js.Any.fromFunction1((t0: js.Function3[/* value */ T, /* index */ scala.Double, /* array */ js.Array[T], scala.Unit]) => forEach(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("peek")(peek.toJsFn)
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[PriorityQueue[T]]
  }
}

