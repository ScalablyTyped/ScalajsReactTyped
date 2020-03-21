package typingsJapgolly.heap.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Heap[T] extends js.Object {
  def copy(): Heap[T]
  // Determine whether the heap is empty.
  def empty(): Boolean
  def front(): T
  // Rebuild the heap. This method may come handy when the priority of the internal data is being modified.
  def heapify(): Unit
  def insert(item: T): Unit
  // Return the smallest item of the heap.
  def peek(): T
  // Pop the smallest item off the heap and return it.
  def pop(): T
  // Instance Methods
  // Push item onto heap.
  def push(item: T): Unit
  // Fast version of a push followed by a pop.
  def pushpop(item: T): T
  // Pop and return the current smallest value, and add the new item.
  // This is more efficient than pop() followed by push(), and can be more appropriate when using a fixed size heap.
  // Note that the value returned may be larger than item!
  def replace(item: T): T
  // Get the number of elements stored in the heap.
  def size(): Double
  // Return the array representation of the heap. (note: the array is a shallow copy of the heap's internal nodes)
  def toArray(): js.Array[T]
  def top(): T
  // Update the position of the given item in the heap. This function should be called every time the item is being modified.
  def updateItem(item: T): Unit
}

object Heap {
  @scala.inline
  def apply[T](
    copy: CallbackTo[Heap[T]],
    empty: CallbackTo[Boolean],
    front: CallbackTo[T],
    heapify: Callback,
    insert: T => Callback,
    peek: CallbackTo[T],
    pop: CallbackTo[T],
    push: T => Callback,
    pushpop: T => CallbackTo[T],
    replace: T => CallbackTo[T],
    size: CallbackTo[Double],
    toArray: CallbackTo[js.Array[T]],
    top: CallbackTo[T],
    updateItem: T => Callback
  ): Heap[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("copy")(copy.toJsFn)
    __obj.updateDynamic("empty")(empty.toJsFn)
    __obj.updateDynamic("front")(front.toJsFn)
    __obj.updateDynamic("heapify")(heapify.toJsFn)
    __obj.updateDynamic("insert")(js.Any.fromFunction1((t0: T) => insert(t0).runNow()))
    __obj.updateDynamic("peek")(peek.toJsFn)
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: T) => push(t0).runNow()))
    __obj.updateDynamic("pushpop")(js.Any.fromFunction1((t0: T) => pushpop(t0).runNow()))
    __obj.updateDynamic("replace")(js.Any.fromFunction1((t0: T) => replace(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("top")(top.toJsFn)
    __obj.updateDynamic("updateItem")(js.Any.fromFunction1((t0: T) => updateItem(t0).runNow()))
    __obj.asInstanceOf[Heap[T]]
  }
}

