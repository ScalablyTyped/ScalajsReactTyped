package typingsJapgolly.browserfs.mutexMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mutex extends js.Object {
  var _locked: js.Any
  var _waiters: js.Any
  def isLocked(): Boolean
  def lock(cb: js.Function): Unit
  def tryLock(): Boolean
  def unlock(): Unit
}

object Mutex {
  @scala.inline
  def apply(
    _locked: js.Any,
    _waiters: js.Any,
    isLocked: CallbackTo[Boolean],
    lock: js.Function => Callback,
    tryLock: CallbackTo[Boolean],
    unlock: Callback
  ): Mutex = {
    val __obj = js.Dynamic.literal(_locked = _locked.asInstanceOf[js.Any], _waiters = _waiters.asInstanceOf[js.Any])
    __obj.updateDynamic("isLocked")(isLocked.toJsFn)
    __obj.updateDynamic("lock")(js.Any.fromFunction1((t0: js.Function) => lock(t0).runNow()))
    __obj.updateDynamic("tryLock")(tryLock.toJsFn)
    __obj.updateDynamic("unlock")(unlock.toJsFn)
    __obj.asInstanceOf[Mutex]
  }
}

