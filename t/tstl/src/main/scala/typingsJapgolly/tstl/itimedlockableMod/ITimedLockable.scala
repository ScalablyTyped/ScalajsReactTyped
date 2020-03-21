package typingsJapgolly.tstl.itimedlockableMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.ilockableMod.ILockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimedLockable extends ILockable {
  /**
    * Try lock until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_for(ms: Double): js.Promise[Boolean]
  /**
    * Try lock until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_until(at: js.Date): js.Promise[Boolean]
}

object ITimedLockable {
  @scala.inline
  def apply(
    lock: CallbackTo[js.Promise[Unit]],
    try_lock: CallbackTo[js.Promise[Boolean]],
    try_lock_for: Double => CallbackTo[js.Promise[Boolean]],
    try_lock_until: js.Date => CallbackTo[js.Promise[Boolean]],
    unlock: CallbackTo[js.Promise[Unit]]
  ): ITimedLockable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lock")(lock.toJsFn)
    __obj.updateDynamic("try_lock")(try_lock.toJsFn)
    __obj.updateDynamic("try_lock_for")(js.Any.fromFunction1((t0: scala.Double) => try_lock_for(t0).runNow()))
    __obj.updateDynamic("try_lock_until")(js.Any.fromFunction1((t0: js.Date) => try_lock_until(t0).runNow()))
    __obj.updateDynamic("unlock")(unlock.toJsFn)
    __obj.asInstanceOf[ITimedLockable]
  }
}

