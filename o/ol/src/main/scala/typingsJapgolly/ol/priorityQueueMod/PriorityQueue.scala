package typingsJapgolly.ol.priorityQueueMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PriorityQueue[T] extends js.Object {
  def clear(): Unit
  def dequeue(): T
  def enqueue(element: T): Boolean
  def getCount(): Double
  def isEmpty(): Boolean
  def isKeyQueued(key: String): Boolean
  def isQueued(element: T): Boolean
  def reprioritize(): Unit
}

object PriorityQueue {
  @scala.inline
  def apply[T](
    clear: Callback,
    dequeue: CallbackTo[T],
    enqueue: T => CallbackTo[Boolean],
    getCount: CallbackTo[Double],
    isEmpty: CallbackTo[Boolean],
    isKeyQueued: String => CallbackTo[Boolean],
    isQueued: T => CallbackTo[Boolean],
    reprioritize: Callback
  ): PriorityQueue[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("dequeue")(dequeue.toJsFn)
    __obj.updateDynamic("enqueue")(js.Any.fromFunction1((t0: T) => enqueue(t0).runNow()))
    __obj.updateDynamic("getCount")(getCount.toJsFn)
    __obj.updateDynamic("isEmpty")(isEmpty.toJsFn)
    __obj.updateDynamic("isKeyQueued")(js.Any.fromFunction1((t0: java.lang.String) => isKeyQueued(t0).runNow()))
    __obj.updateDynamic("isQueued")(js.Any.fromFunction1((t0: T) => isQueued(t0).runNow()))
    __obj.updateDynamic("reprioritize")(reprioritize.toJsFn)
    __obj.asInstanceOf[PriorityQueue[T]]
  }
}

