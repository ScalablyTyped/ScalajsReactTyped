package typingsJapgolly.rotJs.schedulerSchedulerMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Scheduler[T] extends js.Object {
  var _current: js.Any
  var _queue: typingsJapgolly.rotJs.eventqueueMod.default[T]
  var _repeat: js.Array[T]
  /**
    * @param {?} item
    * @param {bool} repeat
    */
  def add(item: T, repeat: Boolean): this.type
  /**
    * Clear all items
    */
  def clear(): this.type
  /**
    * @see ROT.EventQueue#getTime
    */
  def getTime(): Double
  /**
    * Get the time the given item is scheduled for
    * @param {?} item
    * @returns {number} time
    */
  def getTimeOf(item: T): js.UndefOr[Double]
  /**
    * Schedule next item
    * @returns {?}
    */
  def next(): js.Any
  /**
    * Remove a previously added item
    * @param {?} item
    * @returns {bool} successful?
    */
  def remove(item: js.Any): Boolean
}

object Scheduler {
  @scala.inline
  def apply[T](
    _current: js.Any,
    _queue: typingsJapgolly.rotJs.eventqueueMod.default[T],
    _repeat: js.Array[T],
    add: (T, Boolean) => CallbackTo[Scheduler[T]],
    clear: CallbackTo[Scheduler[T]],
    getTime: CallbackTo[Double],
    getTimeOf: T => CallbackTo[js.UndefOr[Double]],
    next: CallbackTo[js.Any],
    remove: js.Any => CallbackTo[Boolean]
  ): Scheduler[T] = {
    val __obj = js.Dynamic.literal(_current = _current.asInstanceOf[js.Any], _queue = _queue.asInstanceOf[js.Any], _repeat = _repeat.asInstanceOf[js.Any])
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: T, t1: scala.Boolean) => add(t0, t1).runNow()))
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.updateDynamic("getTime")(getTime.toJsFn)
    __obj.updateDynamic("getTimeOf")(js.Any.fromFunction1((t0: T) => getTimeOf(t0).runNow()))
    __obj.updateDynamic("next")(next.toJsFn)
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: js.Any) => remove(t0).runNow()))
    __obj.asInstanceOf[Scheduler[T]]
  }
}

