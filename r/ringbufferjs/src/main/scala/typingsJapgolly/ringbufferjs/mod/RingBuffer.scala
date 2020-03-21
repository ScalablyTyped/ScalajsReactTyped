package typingsJapgolly.ringbufferjs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RingBuffer[T] extends js.Object {
  var _elements: js.Array[T]
  var _first: Double
  var _last: Double
  var _size: Double
  def _evictedCb(element: T): js.Any
  def capacity(): Double
  def deq(): T
  def deqN(count: Double): js.Array[T]
  def enq(element: T): Double
  def isEmpty(): Boolean
  def isFull(): Boolean
  def peek(): T
  def peekN(count: Double): js.Array[T]
  def size(): Double
}

object RingBuffer {
  @scala.inline
  def apply[T](
    _elements: js.Array[T],
    _evictedCb: T => CallbackTo[js.Any],
    _first: Double,
    _last: Double,
    _size: Double,
    capacity: CallbackTo[Double],
    deq: CallbackTo[T],
    deqN: Double => CallbackTo[js.Array[T]],
    enq: T => CallbackTo[Double],
    isEmpty: CallbackTo[Boolean],
    isFull: CallbackTo[Boolean],
    peek: CallbackTo[T],
    peekN: Double => CallbackTo[js.Array[T]],
    size: CallbackTo[Double]
  ): RingBuffer[T] = {
    val __obj = js.Dynamic.literal(_elements = _elements.asInstanceOf[js.Any], _first = _first.asInstanceOf[js.Any], _last = _last.asInstanceOf[js.Any], _size = _size.asInstanceOf[js.Any])
    __obj.updateDynamic("_evictedCb")(js.Any.fromFunction1((t0: T) => _evictedCb(t0).runNow()))
    __obj.updateDynamic("capacity")(capacity.toJsFn)
    __obj.updateDynamic("deq")(deq.toJsFn)
    __obj.updateDynamic("deqN")(js.Any.fromFunction1((t0: scala.Double) => deqN(t0).runNow()))
    __obj.updateDynamic("enq")(js.Any.fromFunction1((t0: T) => enq(t0).runNow()))
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isFull")(isFull.toJsFn)
    __obj.updateDynamic("peek")(peek.toJsFn)
    __obj.updateDynamic("peekN")(js.Any.fromFunction1((t0: scala.Double) => peekN(t0).runNow()))
    __obj.updateDynamic("size")(size.toJsFn)
    __obj.asInstanceOf[RingBuffer[T]]
  }
}

