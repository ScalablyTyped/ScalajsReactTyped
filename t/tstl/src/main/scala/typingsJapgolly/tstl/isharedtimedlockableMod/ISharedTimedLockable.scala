package typingsJapgolly.tstl.isharedtimedlockableMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.tstl.isharedlockableMod.ISharedLockable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISharedTimedLockable extends ISharedLockable {
  /**
    * Try lock shared until timeout.
    *
    * @param ms The maximum miliseconds for waiting.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_for(ms: Double): js.Promise[Boolean]
  /**
    * Try lock shared until time expiration.
    *
    * @param at The maximum time point to wait.
    * @return Whether succeded to lock or not.
    */
  def try_lock_shared_until(at: js.Date): js.Promise[Boolean]
}

object ISharedTimedLockable {
  @scala.inline
  def apply(
    lock_shared: CallbackTo[js.Promise[Unit]],
    try_lock_shared: CallbackTo[js.Promise[Boolean]],
    try_lock_shared_for: Double => CallbackTo[js.Promise[Boolean]],
    try_lock_shared_until: js.Date => CallbackTo[js.Promise[Boolean]],
    unlock_shared: CallbackTo[js.Promise[Unit]]
  ): ISharedTimedLockable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("lock_shared")(lock_shared.toJsFn)
    __obj.updateDynamic("try_lock_shared")(try_lock_shared.toJsFn)
    __obj.updateDynamic("try_lock_shared_for")(js.Any.fromFunction1((t0: scala.Double) => try_lock_shared_for(t0).runNow()))
    __obj.updateDynamic("try_lock_shared_until")(js.Any.fromFunction1((t0: js.Date) => try_lock_shared_until(t0).runNow()))
    __obj.updateDynamic("unlock_shared")(unlock_shared.toJsFn)
    __obj.asInstanceOf[ISharedTimedLockable]
  }
}

