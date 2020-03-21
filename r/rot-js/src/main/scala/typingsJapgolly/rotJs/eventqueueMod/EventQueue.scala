package typingsJapgolly.rotJs.eventqueueMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventQueue[T] extends js.Object {
  var _eventTimes: js.Array[Double]
  var _events: js.Array[T]
  var _time: Double
  /**
    * Remove an event from the queue
    * @param {int} index
    */
  def _remove(index: Double): Unit
  /**
    * @param {?} event
    * @param {number} time
    */
  def add(event: T, time: Double): Unit
  /**
    * Clear all scheduled events
    */
  def clear(): this.type
  /**
    * Locates the nearest event, advances time if necessary. Returns that event and removes it from the queue.
    * @returns {? || null} The event previously added by addEvent, null if no event available
    */
  def get(): T | Null
  /**
    * Get the time associated with the given event
    * @param {?} event
    * @returns {number} time
    */
  def getEventTime(event: T): js.UndefOr[Double]
  /**
    * @returns {number} Elapsed time
    */
  def getTime(): Double
  /**
    * Remove an event from the queue
    * @param {?} event
    * @returns {bool} success?
    */
  def remove(event: T): Boolean
}

object EventQueue {
  @scala.inline
  def apply[T](
    _eventTimes: js.Array[Double],
    _events: js.Array[T],
    _remove: Double => Callback,
    _time: Double,
    add: (T, Double) => Callback,
    clear: CallbackTo[EventQueue[T]],
    get: CallbackTo[T | Null],
    getEventTime: T => CallbackTo[js.UndefOr[Double]],
    getTime: CallbackTo[Double],
    remove: T => CallbackTo[Boolean]
  ): EventQueue[T] = {
    val __obj = js.Dynamic.literal(_eventTimes = _eventTimes.asInstanceOf[js.Any], _events = _events.asInstanceOf[js.Any], _time = _time.asInstanceOf[js.Any])
    __obj.updateDynamic("_remove")(js.Any.fromFunction1((t0: scala.Double) => _remove(t0).runNow()))
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: T, t1: scala.Double) => add(t0, t1).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("get")(get.toJsFn)
    __obj.updateDynamic("getEventTime")(js.Any.fromFunction1((t0: T) => getEventTime(t0).runNow()))
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: T) => remove(t0).runNow()))
    __obj.asInstanceOf[EventQueue[T]]
  }
}

