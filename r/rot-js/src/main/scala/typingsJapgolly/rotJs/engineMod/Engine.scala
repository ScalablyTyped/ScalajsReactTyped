package typingsJapgolly.rotJs.engineMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Engine extends js.Object {
  var _lock: Double
  var _scheduler: typingsJapgolly.rotJs.schedulerSchedulerMod.default[_]
  /**
    * Interrupt the engine by an asynchronous action
    */
  def lock(): this.type
  /**
    * Start the main loop. When this call returns, the loop is locked.
    */
  def start(): this.type
  /**
    * Resume execution (paused by a previous lock)
    */
  def unlock(): this.type
}

object Engine {
  @scala.inline
  def apply(
    _lock: Double,
    _scheduler: typingsJapgolly.rotJs.schedulerSchedulerMod.default[_],
    lock: CallbackTo[Engine],
    start: CallbackTo[Engine],
    unlock: CallbackTo[Engine]
  ): Engine = {
    val __obj = js.Dynamic.literal(_lock = _lock.asInstanceOf[js.Any], _scheduler = _scheduler.asInstanceOf[js.Any])
    __obj.updateDynamic("lock")(lock.toJsFn)
    __obj.updateDynamic("start")(start.toJsFn)
    __obj.updateDynamic("unlock")(unlock.toJsFn)
    __obj.asInstanceOf[Engine]
  }
}

