package typingsJapgolly.doubleEndedQueue.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deque[Item] extends js.Object {
  /**
    * Amount of items currently in the queue.
    */
  val length: Double
  /**
    * Remove all items from this queue. Does not change the queue's capacity.
    */
  def clear(): Unit
  /** @see Deque#shift */
  def dequeue(): js.UndefOr[Item]
  /** @see Deque#push */
  def enqueue(items: Item*): Double
  /**
    * Returns the item that is at the given `index` of this queue without removing it.
    *
    * The index is zero-based, so `.get(0)` will return the item that is at the front, `.get(1)` will return the item that comes after and so on.
    *
    * The index can be negative to read items at the back of the queue.
    * `.get(-1)` returns the item that is at the back of the queue, `.get(-2)` will return the item that comes before and so on.
    *
    * Returns `undefined` if `index` is not a valid index into the queue.
    *
    * **Note**: Even though indexed accessor (e.g. `queue[0]`) could *appear* to return a correct value *sometimes*, this is completely unreliable.
    * The numeric slots of the deque object are internally used as an optimization and have no meaningful order or meaning to outside.
    * Always use `.get()`.
    *
    * **Note**: The implementation has O(1) random access using `.get()`.
    */
  def get(index: Double): js.UndefOr[Item]
  /** @see Deque#push */
  def insertBack(items: Item*): Double
  /** @see Deque#unshift */
  def insertFront(items: Item*): Double
  /**
    * Return `true` if this queue is empty, `false` otherwise.
    */
  def isEmpty(): Boolean
  /**
    * Returns the item that is at the back of this queue without removing it.
    * If the queue is empty, `undefined` is returned.
    */
  def peekBack(): js.UndefOr[Item]
  /**
    * Returns the item that is at the front of this queue without removing it.
    * If the queue is empty, `undefined` is returned.
    */
  def peekFront(): js.UndefOr[Item]
  /**
    * Pop off the item at the back of this queue.
    *
    * Note: The item will be removed from the queue.
    * If you simply want to see what's at the back of the queue use `peekBack()` or `.get(-1)`.
    *
    * If the queue is empty, `undefined` is returned.
    * If you need to differentiate between `undefined` values in the queue and `pop()` return value - check the queue `.length` before popping.
    *
    * **Aliases**: `removeBack`
    */
  def pop(): js.UndefOr[Item]
  /**
    * Push items to the back of this queue.
    * Returns the amount of items currently in the queue after the operation.
    *
    * **Aliases**: `enqueue`, `insertBack`
    */
  def push(items: Item*): Double
  /** @see Deque#pop */
  def removeBack(): js.UndefOr[Item]
  /** @see Deque#shift */
  def removeFront(): js.UndefOr[Item]
  /**
    * Shifts off the item at the front of this queue.
    *
    * Note: The item will be removed from the queue.
    * If you simply want to see what's at the front of the queue use `peekFront()` or `.get(0)`.
    *
    * If the queue is empty, `undefined` is returned.
    * If you need to differentiate between `undefined` values in the queue and `shift()` return value - check the queue `.length` before shifting.
    *
    * **Aliases**: `removeFront`, `dequeue`
    */
  def shift(): js.UndefOr[Item]
  /**
    * Returns the items in the queue as an array.
    * Starting from the item in the front of the queue and ending to the item at the back of the queue.
    *
    * **Aliases**: `toJSON`
    */
  def toArray(): js.Array[Item]
  /** @see Deque#toArray */
  def toJSON(): js.Array[Item]
  /**
    * Unshift items to the front of this queue.
    * Returns the amount of items currently in the queue after the operation.
    *
    * **Ailases**: `insertFront`
    */
  def unshift(items: Item*): Double
}

object Deque {
  @scala.inline
  def apply[Item](
    clear: Callback,
    dequeue: CallbackTo[js.UndefOr[Item]],
    enqueue: /* repeated */ Item => CallbackTo[Double],
    get: Double => CallbackTo[js.UndefOr[Item]],
    insertBack: /* repeated */ Item => CallbackTo[Double],
    insertFront: /* repeated */ Item => CallbackTo[Double],
    isEmpty: CallbackTo[Boolean],
    length: Double,
    peekBack: CallbackTo[js.UndefOr[Item]],
    peekFront: CallbackTo[js.UndefOr[Item]],
    pop: CallbackTo[js.UndefOr[Item]],
    push: /* repeated */ Item => CallbackTo[Double],
    removeBack: CallbackTo[js.UndefOr[Item]],
    removeFront: CallbackTo[js.UndefOr[Item]],
    shift: CallbackTo[js.UndefOr[Item]],
    toArray: CallbackTo[js.Array[Item]],
    toJSON: CallbackTo[js.Array[Item]],
    unshift: /* repeated */ Item => CallbackTo[Double]
  ): Deque[Item] = {
    val __obj = js.Dynamic.literal(length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("dequeue")(dequeue.toJsFn)
    __obj.updateDynamic("enqueue")(js.Any.fromFunction1((t0: /* repeated */ Item) => enqueue(t0).runNow()))
    __obj.updateDynamic("get")(js.Any.fromFunction1((t0: scala.Double) => get(t0).runNow()))
    __obj.updateDynamic("insertBack")(js.Any.fromFunction1((t0: /* repeated */ Item) => insertBack(t0).runNow()))
    __obj.updateDynamic("insertFront")(js.Any.fromFunction1((t0: /* repeated */ Item) => insertFront(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("peekBack")(peekBack.toJsFn)
    __obj.updateDynamic("peekFront")(peekFront.toJsFn)
    __obj.updateDynamic("pop")(pop.toJsFn)
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: /* repeated */ Item) => push(t0).runNow()))
    __obj.updateDynamic("removeBack")(removeBack.toJsFn)
    __obj.updateDynamic("removeFront")(removeFront.toJsFn)
    __obj.updateDynamic("shift")(shift.toJsFn)
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("unshift")(js.Any.fromFunction1((t0: /* repeated */ Item) => unshift(t0).runNow()))
    __obj.asInstanceOf[Deque[Item]]
  }
}

